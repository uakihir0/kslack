package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock

/**
 * https://api.slack.com/methods/chat.postMessage
 */
class ChatPostMessageRequest(
    /** Authentication token. Requires scope: `chat:write` */
    override var token: String?,
    /**
     * aSet your bot's user name.
     * Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    var username: String?,

    /** Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead. */
    var threadTs: String?,

    /**
     * Channel, private group, or IM channel to send message to.
     * Can be an encoded ID, or a name. See [below](#channels) for more details.
     */
    var channel: String?,

    /**
     * Text of the message to send. See below for an explanation of [formatting](#formatting).
     * This field is usually required, unless you're providing only `attachments` instead.
     */
    var text: String?,

    /** Change how messages are treated. Defaults to `none`. See [below](#formatting). */
    var parse: String?,
    /** Find and link channel names and usernames.*/
    var isLinkNames: Boolean,

    /** A JSON-based array of structured blocks, presented as a URL-encoded string. */
    var blocks: Array<LayoutBlock>?,
    /** A JSON-based array of structured blocks as a String, presented as a URL-encoded string. */
    var blocksAsString: String?,
    /** A JSON-based array of structured attachments, presented as a URL-encoded string. */
    private var attachments: Array<Attachment>?,
    /** A JSON-based array of structured attachments, presented as a URL-encoded string. */
    var attachmentsAsString: String?,

    /** Pass true to enable unfurling of primarily text-based content. */
    var isUnfurlLinks: Boolean,
    /** Pass false to disable unfurling of media content. */
    var isUnfurlMedia: Boolean,

    /**
     * Pass true to post the message as the authed user, instead of as a bot.
     * Defaults to false. See [authorship](#authorship) below.
     * NOTE: The default value is intentionally null to support workplace apps.
     */
    var isAsUser: Boolean?,

    /** Disable Slack markup parsing by setting to `false`. Enabled by default. */
    var isMrkdwn: Boolean = true,

    /**
     * URL to an image to use as the icon for this message.
     * Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    var iconUrl: String?,

    /**
     * Emoji to use as the icon for this message. Overrides `icon_url`.
     * Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
     */
    var iconEmoji: String?,

    /**
     * Used in conjunction with `thread_ts` and indicates whether reply should be made visible to
     * everyone in the channel or conversation. Defaults to `false`.
     */
    var isReplyBroadcast: Boolean,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("thread_ts", threadTs)
            it.addParam("text", text)
            it.addParam("parse", parse)
            it.addParam("link_names", isLinkNames)
            it.addParam("mrkdwn", isMrkdwn)

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

            it.addParam("unfurl_links", isUnfurlLinks)
            it.addParam("unfurl_media", isUnfurlMedia)
            it.addParam("username", username)
            it.addParam("as_user", isAsUser)
            it.addParam("icon_url", iconUrl)
            it.addParam("icon_emoji", iconEmoji)
            it.addParam("thread_ts", threadTs)
            it.addParam("reply_broadcast", isReplyBroadcast)
        }
    }
}


