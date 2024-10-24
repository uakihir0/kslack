package work.socialhub.kslack.api.methods.request.files.comments

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesCommentsEditRequest(
    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** File containing the comment to edit. */
    var file: String?,
    /** The comment to edit. */
    var id: String?,
    /** Text of the comment to edit. */
    var comment: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("file", file)
            it.addParam("comment", comment)
            it.addParam("id", id)
        }
    }
}