package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsCreateRequest(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Name of private channel to create
     */
    var name: String?,
    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    var isValidate: Boolean
) : SlackApiRequest {
    class GroupsCreateRequestBuilder() {
        private var token: String? = null
        private var name: String? = null
        private var validate = false

        fun token(token: String?): GroupsCreateRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): GroupsCreateRequestBuilder {
            this.name = name
            return this
        }

        fun validate(validate: Boolean): GroupsCreateRequestBuilder {
            this.validate = validate
            return this
        }

        fun build(): GroupsCreateRequest {
            return GroupsCreateRequest(token, name, validate)
        }

        override fun toString(): String {
            return "GroupsCreateRequest.GroupsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", validate=" + this.validate + ")"
        }
    }

    companion object {
        fun builder(): GroupsCreateRequestBuilder {
            return GroupsCreateRequestBuilder()
        }
    }
}