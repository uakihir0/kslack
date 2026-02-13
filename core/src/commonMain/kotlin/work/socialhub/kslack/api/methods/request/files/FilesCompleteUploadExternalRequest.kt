package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class FilesCompleteUploadExternalRequest(
    /** Authentication token. Requires scope: `files:write` */
    override var token: String?,
    /** JSON array of file id and title. e.g. [{"id":"F123","title":"My File"}] */
    var files: String?,
    /** Channel ID where the file will be shared. */
    var channelId: String? = null,
    /** The message text introducing the file in specified channel. */
    var initialComment: String? = null,
    /** Provide another message's ts value to upload this file as a reply. */
    var threadTs: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("files", files)
            it.addParam("channel_id", channelId)
            it.addParam("initial_comment", initialComment)
            it.addParam("thread_ts", threadTs)
        }
    }
}
