package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsSetTopicRequest(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * The new topic
     */
    var channel: String?,
    /**
     * Private channel to set the topic of
     */
    var topic: String?
) : SlackApiRequest {
    class GroupsSetTopicRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null
        private var topic: String? = null

        fun token(token: String?): GroupsSetTopicRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsSetTopicRequestBuilder {
            this.channel = channel
            return this
        }

        fun topic(topic: String?): GroupsSetTopicRequestBuilder {
            this.topic = topic
            return this
        }

        fun build(): GroupsSetTopicRequest {
            return GroupsSetTopicRequest(token, channel, topic)
        }

        override fun toString(): String {
            return "GroupsSetTopicRequest.GroupsSetTopicRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", topic=" + this.topic + ")"
        }
    }

    companion object {
        fun builder(): GroupsSetTopicRequestBuilder {
            return GroupsSetTopicRequestBuilder()
        }
    }
}