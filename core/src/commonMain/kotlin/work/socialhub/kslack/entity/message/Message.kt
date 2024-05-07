package work.socialhub.kslack.entity.message

import com.github.seratch.jslack.api.model.block.LayoutBlock
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.BotProfile
import work.socialhub.kslack.entity.File
import work.socialhub.kslack.entity.Reaction

class Message {
    var type: String? = null
    var subtype: String? = null

    var team: String? = null // team id
    var channel: String? = null

    var user: String? = null
    var username: String? = null

    var text: String? = null
    var blocks: Array<LayoutBlock>? = null
    var attachments: Array<Attachment>? = null

    var ts: String? = null
    var threadTs: String? = null

    @SerialName("is_intro")
    var isIntro: Boolean = false

    @SerialName("is_starred")
    var isStarred: Boolean = false
    var isWibblr: Boolean = false
    var pinnedTo: Array<String>? = null
    var reactions: Array<Reaction>? = null

    var botId: String? = null
    var botLink: String? = null
    var isDisplayAsBot: Boolean = false

    var botProfile: BotProfile? = null

    var icons: Icons? = null

    var file: File? = null
    var files: Array<File>? = null
    var isUpload: Boolean = false

    var parentUserId: String? = null
    var inviter: String? = null
    var clientMsgId: String? = null

    var comment: MessageItem? = null
    var topic: String? = null // "subtype":"channel_topic"
    var purpose: String? = null // "subtype":"channel_topic"

    // field exists only if the message was edited
    var edited: Edited? = null

    // https://api.slack.com/docs/message-link-unfurling
    var isUnfurlLinks: Boolean = false
    var isUnfurlMedia: Boolean = false

    @SerialName("is_thread_broadcast")
    var isThreadBroadcast: Boolean = false

    // https://api.slack.com/messaging/retrieving#threading
    // Parent messages in a thread will no longer explicitly list their replies.
    // Instead of a large replies array containing threaded message replies,
    // we'll provide a lighter-weight list of reply_users,
    // plus a reply_users_count and the latest_reply message.
    // These new fields are already available. We'll remove the replies array on October 18, 2019.
    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("")
    var replies: Array<MessageRootReply>? = null
    var replyCount: Int? = null

    var replyUsers: Array<String>? = null
    var replyUsersCount: Int? = null

    var latestReply: String? = null // ts

    var isSubscribed: Boolean = false

    var xFiles: Array<String>? = null // remote file ids

    var lastRead: String? = null

    // this field exists only when posting the message with "reply_broadcast": true
    var root: MessageRoot? = null

    var itemType: String? = null
    var item: MessageItem? = null

    class Edited {
        var user: String? = null
        var ts: String? = null
    }

    /**
     * The root message information of a "thread_broadcast" message.
     */
    class MessageRoot {
        var text: String? = null
        var username: String? = null
        var botId: String? = null
        var isMrkdwn: Boolean = false
        var type: String? = null
        var subtype: String? = null
        var threadTs: String? = null

        // https://api.slack.com/messaging/retrieving#threading
        // Parent messages in a thread will no longer explicitly list their replies.
        // Instead of a large replies array containing threaded message replies,
        // we'll provide a lighter-weight list of reply_users,
        // plus a reply_users_count and the latest_reply message.
        // These new fields are already available. We'll remove the replies array on October 18, 2019.
        @get:Deprecated("")
        @set:Deprecated("")
        @Deprecated("")
        var replies: Array<MessageRootReply>? = null
        var replyCount: Int? = null
        var replyUsers: Array<String>? = null
        var replyUsersCount: Int? = null
        var latestReply: String? = null // ts

        var isSubscribed: Boolean = false
        var lastRead: String? = null
        var unreadCount: Int? = null
        var ts: String? = null
    }

    /**
     * A reply message information in a MessageRoot.
     */
    class MessageRootReply {
        var user: String? = null
        var ts: String? = null
    }

    // https://raw.githubusercontent.com/slackapi/slack-api-specs/master/web-api/slack_web_openapi_v2.json
    // TODO: confirm the actual behavior
    class Icons {
        var emoji: String? = null

        @SerialName("image_36")
        var image36: String? = null

        @SerialName("image_48")
        var image48: String? = null

        @SerialName("image_64")
        var image64: String? = null

        @SerialName("image_72")
        var image72: String? = null
    }

    class MessageItem {
        var id: String? = null
        var name: String? = null
        var title: String? = null
        var created: String? = null
        var timestamp: String? = null
        var user: String? = null
        var username: String? = null

        @SerialName("is_intro")
        var isIntro: Boolean = false

        @SerialName("is_public")
        var isPublic: Boolean = false

        @SerialName("is_starred")
        var isStarred: Boolean = false

        var isPublicUrlShared: Boolean = false
        var urlPrivate: String? = null
        var isUrlPrivateDownload: Boolean = false

        var permalink: String? = null
        var isPermalinkPublic: Boolean = false

        var editLink: String? = null
        var preview: String? = null
        var previewHighlight: String? = null

        var lines: Int? = null
        var linesMore: Int? = null

        @SerialName("preview_is_truncated")
        var isPreviewTruncated: Boolean = false
        var isHasRichPreview: Boolean = false

        var mimetype: String? = null
        var filetype: String? = null
        var prettyType: String? = null // "Plain Text"

        @SerialName("is_external")
        var isExternal: Boolean = false
        var externalType: String? = null
        var isEditable: Boolean = false
        var isDisplayAsBot: Boolean = false
        var size: Int? = null
        var mode: String? = null
        var comment: String? = null

        fun is_public(): Boolean {
            return this.isPublic
        }

        fun set_public(_public: Boolean) {
            this.isPublic = _public
        }
    }
}
