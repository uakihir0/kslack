package work.socialhub.kslack.api.methods.response.admin.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class AdminUsersRemoveResponse : SlackApiResponse() {
    var responseMetadata: ResponseMetadata? = null

    @Serializable
    class ResponseMetadata {
        var messages: Array<String>? = null
    }
}