package work.socialhub.kslack.block

import kotlinx.serialization.SerializationException
import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.api.methods.response.conversations.ConversationsHistoryResponse
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.block.SectionBlock
import work.socialhub.kslack.entity.block.RawLayoutBlock
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Regression test for the LayoutBlock polymorphic deserialization bug.
 *
 * Slack returns `rich_text` blocks in nearly every conversations.history
 * message. Previously no subclass was registered for the polymorphic
 * `LayoutBlock` scope, so decoding threw:
 *
 *   Serializer for subclass 'rich_text' is not found in the polymorphic scope of 'LayoutBlock'
 *
 * This is a pure (offline) serialization test — no Slack credentials needed.
 */
class LayoutBlockSerializationTest {

    /** A trimmed but realistic conversations.history payload with a rich_text block. */
    private val historyJson = """
        {
          "ok": true,
          "messages": [
            {
              "user": "U04PVFEJU",
              "type": "message",
              "ts": "1778658773.089679",
              "text": "kslack test message",
              "team": "T04QH7ECZ",
              "blocks": [
                {
                  "type": "rich_text",
                  "block_id": "sSyw",
                  "elements": [
                    {
                      "type": "rich_text_section",
                      "elements": [
                        { "type": "text", "text": "kslack test message" }
                      ]
                    }
                  ]
                }
              ]
            }
          ]
        }
    """.trimIndent()

    @Test
    fun testDeserializeRichTextBlock() {
        // Before the fix this line threw JsonDecodingException.
        val response = JsonHelper.fromJson<ConversationsHistoryResponse>(historyJson)

        assertTrue(response.isOk)
        val messages = assertNotNull(response.messages)
        assertEquals(1, messages.size)

        val blocks = assertNotNull(messages[0].blocks, "blocks should be parsed")
        assertEquals(1, blocks.size)

        val block = blocks[0]
        assertEquals("rich_text", block.type)
        assertTrue(block is RawLayoutBlock, "unknown block types fall back to RawLayoutBlock")
        assertEquals("sSyw", block.blockId)
        // The raw payload is captured verbatim for lossless round-tripping.
        val content = assertNotNull(block.content)
        assertNotNull(content["elements"])
    }

    @Test
    fun testRoundTripPreservesRichText() {
        val response = JsonHelper.fromJson<ConversationsHistoryResponse>(historyJson)
        val reEncoded = JsonHelper.toJson(response)

        // Re-encoding must keep the rich_text content rather than dropping it.
        assertTrue(reEncoded.contains("rich_text"), "round-trip lost the rich_text block")
        assertTrue(reEncoded.contains("rich_text_section"), "round-trip lost nested elements")

        // And it must decode again without error.
        val reDecoded = JsonHelper.fromJson<ConversationsHistoryResponse>(reEncoded)
        assertEquals("rich_text", reDecoded.messages!![0].blocks!![0].type)
    }

    @Test
    fun testSerializeTypedBlockFailsFast() {
        // Typed blocks are not @Serializable; encoding one would silently drop
        // every field but type/block_id, so the serializer must fail fast
        // rather than emit a corrupted Block Kit payload.
        val blocks: Array<LayoutBlock> = arrayOf(SectionBlock())
        assertFailsWith<SerializationException> {
            JsonHelper.toJson(blocks)
        }
    }
}
