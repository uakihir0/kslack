package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock

class ChatScheduleMessageRequest(
    /** Authentication token. Requires scope: `chat:write` */
    override var token: String?,
    /** Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See below for more details. */
    var channel: String?,
    /** Unix EPOCH timestamp of time in future to send the message. */
    var postAt: Int?,

    /**
     * Text of the message to send. See below for an explanation of formatting.
     * This field is usually required, unless you're providing only attachments instead.
     * Provide no more than 40,000 characters or risk truncation.
     */
    var text: String?,

    /** Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See authorship below. */
    var isAsUser: Boolean?,

    /** A JSON-based array of structured attachments, presented as a URL-encoded string. */
    var attachments: Array<Attachment>?,
    /** A JSON-based array of structured attachments, presented as a URL-encoded string. */
    var attachmentsAsString: String?,
    /** A JSON-based array of structured blocks, presented as a URL-encoded string. */
    var blocks: Array<LayoutBlock>?,
    /** A JSON-based array of structured blocks as a String, presented as a URL-encoded string. */
    var blocksAsString: String?,

    /** Find and link channel names and usernames. */
    var isLinkNames: Boolean,
    /** Change how messages are treated. Defaults to none. See below. */
    var parse: String?,

    /**
     * Used in conjunction with thread_ts and indicates whether reply should be made visible to everyone
     * in the channel or conversation. Defaults to false.
     */
    var isReplyBroadcast: Boolean,

    /**
     * Provide another message's ts value to make this message a reply.
     * Avoid using a reply's ts value; use its parent instead.
     */
    var threadTs: String?,

    /** Pass true to enable unfurling of primarily text-based content. */
    var isUnfurlLinks: Boolean,
    /** Pass false to disable unfurling of media content. */
    var isUnfurlMedia: Boolean,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("post_at", postAt)
            it.addParam("text", text)
            it.addParam("as_user", isAsUser)

            if (blocksAsString != null) {
                it.addParam("blocks", blocksAsString)
            } else if (blocks != null) {
                val json = JsonHelper.toJson(blocks)
                it.addParam("blocks", json)
            }
            if (blocksAsString != null && blocks != null) {
                TODO("Although you set both blocksAsString and blocks, only blocksAsString was used.")
            }

            if (attachmentsAsString != null) {
                it.addParam("attachments", attachmentsAsString)
            } else if (attachments != null) {
                val json = JsonHelper.toJson(attachments)
                it.addParam("attachments", json)
            }

            it.addParam("link_names", isLinkNames)
            it.addParam("parse", parse)
            it.addParam("reply_broadcast", isReplyBroadcast)
            it.addParam("thread_ts", threadTs)
            it.addParam("unfurl_links", isUnfurlLinks)
            it.addParam("unfurl_media", isUnfurlMedia)
        }
    }
}