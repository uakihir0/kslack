package work.socialhub.kslack.api.methods.response.admin.teams

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class AdminTeamsCreateResponse : SlackApiResponse() {

    var team: String? = null // created team id
    var responseMetadata: ResponseMetadata? = null

    @Serializable
    class ResponseMetadata {
        var messages: Array<String>? = null
    }
}