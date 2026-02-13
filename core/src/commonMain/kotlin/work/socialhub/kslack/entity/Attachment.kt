package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.LayoutBlock
import kotlin.js.JsExport

/**
 * https://api.slack.com/docs/message-attachments
 */
@JsExport
@Serializable
class Attachment {

    var msgSubtype: String? = null // "bot_message"

    /**
     * A plain-text summary of the attachment. This text will be used in clients that don't show formatted text
     * (eg. IRC, mobile notifications) and should not contain any markup.
     */
    var fallback: String? = null

    /**
     * This is optional value that specifies callback id when there are buttons.
     */
    var callbackId: String? = null

    /**
     * Like traffic signals, color-coding messages can quickly communicate intent
     * and help separate them from the flow of other messages in the timeline.
     *
     *
     * An optional value that can either be one of good, warning, danger, or any hex color code (eg. #439FE0).
     * This value is used to color the border along the left side of the message attachment.
     */
    var color: String? = null

    /**
     * This is optional text that appears above the message attachment block.
     */
    var pretext: String? = null

    var serviceUrl: String? = null

    var serviceName: String? = null

    var serviceIcon: String? = null

    // -----------------------------------------
    // The author parameters will display a small section at the top of a message attachment that can contain the following fields:
    /**
     * Small text used to display the author's name.
     */
    var authorName: String? = null

    /**
     * A valid URL that will hyperlink the author_name text mentioned above. Will only work if author_name is present.
     */
    var authorLink: String? = null

    /**
     * A valid URL that displays a small 16x16px image to the left of the author_name text. Will only work if author_name is present.
     */
    var authorIcon: String? = null

    // -----------------------------------------
    // Attributes for reply_broadcast message (showing a posted message as an attachment)
    // https://api.slack.com/events/message/reply_broadcast
    // "from_url": "https://lost-generation-authors.slack.com/archives/general/p1482960137003543",
    var fromUrl: String? = null

    var originalUrl: String? = null

    // "author_subname": "confused",
    var authorSubname: String? = null

    // "channel_id": "C061EG9SL",
    var channelId: String? = null

    // "channel_name": "general",
    var channelName: String? = null

    //"id": 1,
    var id: Int? = null

    var botId: String? = null

    var isIndent: Boolean? = null


    // # already exists > "fallback": "[December 28th, 2016 1:22 PM] confused: what was there?",
    // # already exists > "ts": "1482960137.003543",
    // # already exists > "author_link": "https://lost-generation-authors.slack.com/team/confused",
    // # already exists > "author_icon": "https://...png",
    // # already exists > "mrkdwn_in": ["text"],
    // # already exists > "text": "island",
    // # already exists > "footer": "5 replies"
    /**
     * NOTE: The the following Booleans (is_msg_unfurl, is_reply_unfurl, is_thread_root_unfurl,
     * is_app_unfurl) default to null intentionally to support block attachments.
     */
    @SerialName("is_msg_unfurl")
    var isMsgUnfurl: Boolean? = null

    @SerialName("is_reply_unfurl")
    var isReplyUnfurl: Boolean? = null

    @SerialName("is_thread_root_unfurl")
    var isThreadRootUnfurl: Boolean? = null

    @SerialName("is_app_unfurl")
    var isAppUnfurl: Boolean? = null

    var appUnfurlUrl: String? = null

    /**
     * The title is displayed as larger, bold text near the top of a message attachment.
     * By passing a valid URL in the title_link parameter (optional), the title text will be hyperlinked.
     */
    var title: String? = null

    /**
     * The title is displayed as larger, bold text near the top of a message attachment.
     * By passing a valid URL in the title_link parameter (optional), the title text will be hyperlinked.
     */
    var titleLink: String? = null

    /**
     * This is the main text in a message attachment, and can contain standard message markup (see details below).
     * The content will automatically collapse if it contains 700+ characters or 5+ linebreaks,
     * and will display a "Show more..." link to expand the content.
     *
     *
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    var text: String? = null

    /**
     * Fields are defined as an array, and hashes contained within it will be displayed in a table inside the message attachment.
     */
    var fields: Array<Field>? = null

    /**
     * A valid URL to an image file that will be displayed inside a message attachment.
     * We currently support the following formats: GIF, JPEG, PNG, and BMP.
     *
     *
     * Large images will be resized to a maximum width of 400px or a maximum height of 500px,
     * while still maintaining the original aspect ratio.
     */
    var imageUrl: String? = null

    var imageWidth: Int? = null
    var imageHeight: Int? = null
    var imageBytes: Int? = null

    /**
     * A valid URL to an image file that will be displayed as a thumbnail on the right side of a message attachment.
     * We currently support the following formats: GIF, JPEG, PNG, and BMP.
     *
     *
     * The thumbnail's longest dimension will be scaled down to 75px while maintaining the aspect ratio of the image.
     * The filesize of the image must also be less than 500 KB.
     *
     *
     * For best results, please use images that are already 75px by 75px.
     */
    var thumbUrl: String? = null

    var thumbWidth: Int? = null
    var thumbHeight: Int? = null

    var videoHtml: String? = null

    var videoHtmlWidth: Int? = null
    var videoHtmlHeight: Int? = null

    // Your message attachments may also contain a subtle footer,
    // which is especially useful when citing content in conjunction with author parameters.
    /**
     * Add some brief text to help contextualize and identify an attachment.
     * Limited to 300 characters, and may be truncated further when displayed to users in environments with limited screen real estate.
     */
    var footer: String? = null

    /**
     * To render a small icon beside your footer text, provide a publicly accessible URL string in the footer_icon field.
     * You must also provide a footer for the field to be recognized.
     *
     *
     * We'll render what you provide at 16px by 16px. It's best to use an image that is similarly sized.
     */
    var footerIcon: String? = null

    /**
     * ts (timestamp)
     * Does your attachment relate to something happening at a specific time?
     *
     *
     * By providing the ts field with an integer value in "epoch time",
     * the attachment will display an additional timestamp value as part of the attachment's footer.
     *
     *
     * Use ts when referencing articles or happenings. Your message will have its own timestamp when published.
     */
    var ts: String? = null

    /**
     * By default,
     * [message text
 * in attachments](https://api.slack.com/docs/message-formatting#message_formatting) are not formatted. To enable formatting on attachment fields, add the
     * name of the field (as defined in the API) in this list.
     */
    var mrkdwnIn: Array<String>? = null

    /**
     * Actions are defined as an array, and hashes contained within it will be displayed in as buttons in the message attachment.
     */
    var actions: Array<Action>? = null

     var blocks: Array<LayoutBlock>? = null

    // --------------------------
    // Files
    var filename: String? = null
    var size: Int? = null
    var mimetype: String? = null
    var url: String? = null
    var metadata: AttachmentMetadata? = null


}

@JsExport
@Serializable
class AttachmentMetadata {
    @SerialName("thumb_64")
    var thumb64: Boolean? = null

    @SerialName("thumb_80")
    var thumb80: Boolean? = null

    @SerialName("thumb_160")
    var thumb160: Boolean? = null

    @SerialName("original_w")
    var originalWidth: Int? = null

    @SerialName("original_h")
    var originalHeight: Int? = null

    @SerialName("thumb_360_w")
    var thumb360Width: Int? = null

    @SerialName("thumb_360_h")
    var thumb360Height: Int? = null

    var format: String? = null
    var extension: String? = null
    var rotation: Int? = null
    var thumbTiny: String? = null
}