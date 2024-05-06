package com.github.seratch.jslack.api.methods.response.stars

import com.github.seratch.jslack.api.model.Attachment

class StarsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var items: List<Item>? = null
    var paging: Paging? = null

    class Item {
        var type: String? = null
        var channel: String? = null
        var message: Message? = null
        var dateCreate: Int? = null
        var file: File? = null
        var comment: Comment? = null
    }

    class Message {
        var type: String? = null
        var subtype: String? = null
        var text: String? = null
        var ts: String? = null
        var botId: String? = null
        var team: String? = null

        var attachments: List<Attachment>? = null
        var blocks: List<LayoutBlock>? = null

        var permalink: String? = null

        @SerializedName("is_starred")
        var isStarred: Boolean = false

        var clientMsgId: String? = null
        var user: String? = null
        var username: String? = null
        var threadTs: String? = null
        var replyCount: Int? = null
        var replyUsersCount: Int? = null
        var latestReply: String? = null
        var replyUsers: List<String>? = null

        // https://api.slack.com/messaging/retrieving#threading
        // Parent messages in a thread will no longer explicitly list their replies.
        // Instead of a large replies array containing threaded message replies,
        // we'll provide a lighter-weight list of reply_users,
        // plus a reply_users_count and the latest_reply message.
        // These new fields are already available. We'll remove the replies array on October 18, 2019.
        @get:Deprecated("")
        @set:Deprecated("")
        @Deprecated("")
        var replies: List<MessageRootReply>? = null
        var isSubscribed: Boolean = false
        var lastRead: String? = null
        var reactions: List<Reaction>? = null

        /**
         * A reply message information in a MessageRoot.
         */
        class MessageRootReply {
            var user: String? = null
            var ts: String? = null
        }
    }

    class Comment {
        var id: String? = null
        var created: Int? = null
        var timestamp: Int? = null
        var user: String? = null

        @SerializedName("is_intro")
        var isIntro: Boolean = false
        var comment: String? = null
        var numStars: Int? = null

        @SerializedName("is_starred")
        var isStarred: Boolean = false
    }
}
