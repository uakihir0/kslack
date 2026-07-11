package work.socialhub.kslack.files

import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.file.File
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Regression test: Slack returns the thumbnail / original dimensions as JSON
 * numbers (e.g. `"thumb_360_w": 255`). They were modelled as String? which made
 * deserialization throw ("Expected quotation mark, but had '2'") and broke the
 * whole channel timeline. They are now Int?.
 */
class FileDeserializeTest {

    @Test
    fun testFileWithNumericThumbnailDimensions() {
        val json = """
            {
              "id": "F0BG7FVEB71",
              "mimetype": "image/png",
              "filetype": "png",
              "name": "image.png",
              "url_private": "https://files.slack.com/files-pri/T-F/image.png",
              "thumb_360": "https://files.slack.com/files-tmb/T-F/image_360.png",
              "thumb_360_w": 255,
              "thumb_360_h": 360,
              "thumb_480_w": 340,
              "thumb_480_h": 480,
              "thumb_pdf": "https://files.slack.com/files-tmb/T-F/doc_thumb_pdf.png",
              "thumb_pdf_w": 909,
              "thumb_pdf_h": 1286,
              "original_w": 1055,
              "original_h": 1491
            }
        """.trimIndent()

        val file = JsonHelper.json.decodeFromString(File.serializer(), json)

        assertEquals("F0BG7FVEB71", file.id)
        assertEquals(255, file.thumb360Width)
        assertEquals(360, file.thumb360Height)
        assertEquals(340, file.thumb480Width)
        assertEquals(480, file.thumb480Height)
        // PDF preview dimensions are also numeric in Slack's file object.
        assertEquals(909, file.thumbPdfWidth)
        assertEquals(1286, file.thumbPdfHeight)
        assertEquals(1055, file.originalWidth)
        assertEquals(1491, file.originalHeight)
    }
}
