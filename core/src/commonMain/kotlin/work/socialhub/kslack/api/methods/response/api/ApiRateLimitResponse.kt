package work.socialhub.kslack.api.methods.response.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ApiRateLimitResponse : SlackApiResponse() {
    @SerialName("x-ratelimit-limit")
    var xRateLimitLimit: String? = null

    @SerialName("x-ratelimit-remaining")
    var xRateLimitRemaining: String? = null

    @SerialName("x-ratelimit-reset")
    var xRateLimitReset: String? = null

    @SerialName("x-ratelimit-primarylimit")
    var xRateLimitPrimaryLimit: String? = null

    @SerialName("x-ratelimit-secondarylimit")
    var xRateLimitSecondaryLimit: String? = null

    @SerialName("x-ratelimit-secondaryremaining")
    var xRateLimitSecondaryRemaining: String? = null
}
