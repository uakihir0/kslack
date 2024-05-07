package com.github.seratch.jslack.api.methods.request.files

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:read`
     */
    override var token: String?,
    /**
     * Filter files created by a single user.
     */
    var user: String?,
    /**
     * Filter files appearing in a specific channel, indicated by its ID.
     */
    var channel: String?,
    /**
     * Filter files created after this timestamp (inclusive).
     */
    var tsFrom: String?,
    /**
     * Filter files created before this timestamp (inclusive).
     */
    var tsTo: String?,
    /**
     * Filter files by type:\n\n* `all` - All files
     *
     *
     * `spaces` - Posts\n* `snippets` - Snippets
     * `images` - Image files
     * `gdocs` - Google docs
     * `zips` - Zip files
     * `pdfs` - PDF files
     *
     *
     * You can pass multiple values in the types argument, like `types=spaces,snippets`.
     * The default value is `all`, which does not filter the list.
     */
    var types: Array<String>?, var count: Int?, var page: Int?,
    /**
     * https://api.slack.com/changelog/2019-03-wild-west-for-files-no-more
     *
     *
     * In order to gather information on tombstoned files in Free workspaces,
     * so that you can delete or revoke them, pass the show_files_hidden_by_limit parameter.
     * While the yielded files will still be redacted,
     * you'll gain the id of the files so that you can delete or revoke them.
     */
    var isShowFilesHiddenByLimit: Boolean
) : SlackApiRequest {
    class FilesListRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null
        private var channel: String? = null
        private var tsFrom: String? = null
        private var tsTo: String? = null
        private var types: Array<String>? = null
        private var count: Int? = null
        private var page: Int? = null
        private var showFilesHiddenByLimit = false

        fun token(token: String?): FilesListRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): FilesListRequestBuilder {
            this.user = user
            return this
        }

        fun channel(channel: String?): FilesListRequestBuilder {
            this.channel = channel
            return this
        }

        fun tsFrom(tsFrom: String?): FilesListRequestBuilder {
            this.tsFrom = tsFrom
            return this
        }

        fun tsTo(tsTo: String?): FilesListRequestBuilder {
            this.tsTo = tsTo
            return this
        }

        fun types(types: Array<String>?): FilesListRequestBuilder {
            this.types = types
            return this
        }

        fun count(count: Int?): FilesListRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): FilesListRequestBuilder {
            this.page = page
            return this
        }

        fun showFilesHiddenByLimit(showFilesHiddenByLimit: Boolean): FilesListRequestBuilder {
            this.showFilesHiddenByLimit = showFilesHiddenByLimit
            return this
        }

        fun build(): FilesListRequest {
            return FilesListRequest(token, user, channel, tsFrom, tsTo, types, count, page, showFilesHiddenByLimit)
        }

        override fun toString(): String {
            return "FilesListRequest.FilesListRequestBuilder(token=" + this.token + ", user=" + this.user + ", channel=" + this.channel + ", tsFrom=" + this.tsFrom + ", tsTo=" + this.tsTo + ", types=" + this.types + ", count=" + this.count + ", page=" + this.page + ", showFilesHiddenByLimit=" + this.showFilesHiddenByLimit + ")"
        }
    }

    companion object {
        fun builder(): FilesListRequestBuilder {
            return FilesListRequestBuilder()
        }
    }
}