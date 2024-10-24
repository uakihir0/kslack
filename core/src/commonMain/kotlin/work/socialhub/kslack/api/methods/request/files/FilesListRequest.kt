package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesListRequest(

    /** Authentication token. Requires scope: `files:read` */
    override var token: String?,
    /** Filter files created by a single user. */
    var user: String?,
    /** Filter files appearing in a specific channel, indicated by its ID. */
    var channel: String?,
    /** Filter files created after this timestamp (inclusive). */
    var tsFrom: String?,
    /** Filter files created before this timestamp (inclusive). */
    var tsTo: String?,

    /**
     * Filter files by type:\n\n* `all` - All files
     *
     * `spaces` - Posts\n* `snippets` - Snippets
     * `images` - Image files
     * `gdocs` - Google docs
     * `zips` - Zip files
     * `pdfs` - PDF files
     *
     * You can pass multiple values in the types argument, like `types=spaces,snippets`.
     * The default value is `all`, which does not filter the list.
     */
    var types: Array<String>?,
    var count: Int?,
    var page: Int?,

    /**
     * https://api.slack.com/changelog/2019-03-wild-west-for-files-no-more
     *
     * In order to gather information on tombstoned files in Free workspaces,
     * so that you can delete or revoke them, pass the show_files_hidden_by_limit parameter.
     * While the yielded files will still be redacted,
     * you'll gain the id of the files so that you can delete or revoke them.
     */
    var isShowFilesHiddenByLimit: Boolean

) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
            it.addParam("channel", channel)
            it.addParam("ts_from", tsFrom)
            it.addParam("ts_to", tsTo)
            if (types != null) {
                it.addParam("types", types!!.joinToString(","))
            }
            it.addParam("count", count)
            it.addParam("page", page)
            it.addParam("show_files_hidden_by_limit", isShowFilesHiddenByLimit)
        }
    }
}