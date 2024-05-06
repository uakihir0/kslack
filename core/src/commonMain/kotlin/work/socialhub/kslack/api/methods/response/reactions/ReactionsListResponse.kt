package com.github.seratch.jslack.api.methods.response.reactions

import com.github.seratch.jslack.api.model.Attachment

class ReactionsListResponse : SlackApiResponse {
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

        class Message {
            var type: String? = null
            var subtype: String? = null
            var text: String? = null
            var attachments: List<Attachment>? = null
            var blocks: List<LayoutBlock>? = null
            var ts: String? = null
            var team: String? = null
            var user: String? = null
            var username: String? = null
            var botId: String? = null
            var permalink: String? = null
            var reactions: List<Reaction>? = null
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

            /**
             * A reply message information in a MessageRoot.
             */
            class MessageRootReply {
                var user: String? = null
                var ts: String? = null
            }

            var isSubscribed: Boolean = false
            var lastRead: String? = null
            var clientMsgId: String? = null
            var inviter: String? = null
            var userTeam: String? = null
            var sourceTeam: String? = null
            var icons: Icons? = null
            var userProfile: UserProfile? = null
            var botProfile: BotProfile? = null

            class Icons {
                @SerializedName("image_36")
                var image36: String? = null

                @SerializedName("image_48")
                var image48: String? = null

                @SerializedName("image_64")
                var image64: String? = null

                @SerializedName("image_72")
                var image72: String? = null
            }

            class UserProfile {
                var avatarHash: String? = null

                @SerializedName("image_72")
                var image72: String? = null
                var firstName: String? = null
                var realName: String? = null
                var displayName: String? = null
                var team: String? = null
                var name: String? = null

                /**
                 * is_restricted indicates the user is a multi-channel guest.
                 * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
                 */
                @SerializedName("is_restricted")
                var isRestricted: Boolean = false

                /**
                 * is_ultra_restricted indicates they are a single channel guest.
                 * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
                 */
                @SerializedName("is_ultra_restricted")
                var isUltraRestricted: Boolean = false
            }
        }
    }
}