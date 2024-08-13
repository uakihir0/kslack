package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock

class ChatPostEphemeralRequest(
    /** Authentication token. Requires scope: `chat:write` */
    override var token: String?,
    /** Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. */
    var channel: String?,

    /**
     * Text of the message to send.
     * See below for an explanation of [formatting](#formatting).
     * This field is usually required, unless you're providing only `attachments` instead.
     */
    var text: String?,

    /** `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument. */
    var user: String?,
    /** Pass true to post the message as the authed bot. Defaults to false. */
    var isAsUser: Boolean,

    // TODO: おそらく修正が必要
    /** A JSON-based array of structured blocks, presented as a URL-encoded string. */
    var blocks: Array<LayoutBlock>?,
    /** A JSON-based array of structured blocks as a String, presented as a URL-encoded string. */
    var blocksAsString: String?,
    /** A JSON-based array of structured attachments, presented as a URL-encoded string. */
    var attachments: Array<Attachment>?,
    /** A JSON-based array of structured attachments, presented as a URL-encoded string. */
    var attachmentsAsString: String?,

    /** Find and link channel names and usernames. */
    var isLinkNames: Boolean,
    /** Change how messages are treated. Defaults to `none`. See [below](#formatting). */
    var parse: String?,
) : SlackApiRequest
