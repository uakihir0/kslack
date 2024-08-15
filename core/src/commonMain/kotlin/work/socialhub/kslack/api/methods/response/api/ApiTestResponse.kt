package work.socialhub.kslack.api.methods.response.api

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class ApiTestResponse : SlackApiResponse() {
    var args: Args? = null

    @Serializable
    class Args {
        var foo: String? = null
        var error: String? = null
    }
}