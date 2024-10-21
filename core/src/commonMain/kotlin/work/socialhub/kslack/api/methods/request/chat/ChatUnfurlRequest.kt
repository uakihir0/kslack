package work.socialhub.kslack.api.methods.request.chat

import kotlinx.serialization.json.Json
import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.Action
import work.socialhub.kslack.entity.block.LayoutBlock

/**
 * Provide custom unfurl behavior for user-posted URLs
 */
class ChatUnfurlRequest(
    /** Authentication token. Requires scope: `links:write`*/
    override var token: String?,

    /**
     * Provide a simply-formatted string to send as an ephemeral message to the user
     * as invitation to authenticate further and enable full unfurling behavior
     */
    var userAuthMessage: String?,

    /** Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain */
    var isUserAuthRequired: Boolean,
    /** URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl message attachments.*/
    var rawUnfurls: String?,

    var unfurls: Map<String, UnfurlDetail>?,

    /** Timestamp of the message to add unfurl behavior to. */
    var ts: String?,

    /**
     * Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling.
     * Value should be properly URL-encoded.
     */
    var userAuthUrl: String?,

    /** Channel ID of the message */
    var channel: String?

) : SlackApiRequest, FormRequest {

    // https://api.slack.com/docs/message-link-unfurling#unfurls_parameter
    class UnfurlDetail {
        var title: String? = null
        var text: String? = null
        var callbackId: String? = null
        var attachmentType: String? = null
        var fallback: String? = null
        var actions: Array<Action>? = null
        var blocks: Array<LayoutBlock>? = null
    }

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("ts", ts)
            it.addParam("channel", channel)

            if (rawUnfurls != null) {
                it.addParam("unfurls", rawUnfurls)
            } else {
                val json = JsonHelper.toJson(unfurls)
                it.addParam("unfurls", json)
            }

            it.addParam("user_auth_required", isUserAuthRequired)
            it.addParam("user_auth_message", userAuthMessage)
            it.addParam("user_auth_url", userAuthUrl)
        }
    }
}
