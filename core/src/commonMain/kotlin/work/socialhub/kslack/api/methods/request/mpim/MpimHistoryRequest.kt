package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class MpimHistoryRequest(
    /** Authentication token. Requires scope: `mpim:history` */
    override var token: String?,
    /** Multiparty direct message to fetch history for. */
    var channel: String?,
    /** Start of time range of messages to include in results. */
    var oldest: String?,
    /** End of time range of messages to include in results. */
    var latest: String?,
    /** Number of messages to return, between 1 and 1000. */
    var count: Int?,
    /** Include messages with latest or oldest timestamp in results. */
    var isInclusive: Boolean,
    /** Include `unread_count_display` in the output? */
    var isUnreads: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("latest", latest)
            it.addParam("oldest", oldest)
            it.addParam("inclusive", isInclusive)
            it.addParam("count", count)
            it.addParam("unreads", isUnreads)
        }
    }
}