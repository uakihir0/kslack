package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

/**
 * https://api.slack.com/methods/files.comments.add
 */
class FileComment {
    var id: String? = null
    var created: Int? = null
    var timestamp: Int? = null
    var user: String? = null
    var comment: String? = null
    var channel: String? = null

    @SerializedName("is_intro")
    var isIntro: Boolean = false

    constructor(
        id: String?,
        created: Int?,
        timestamp: Int?,
        user: String?,
        comment: String?,
        channel: String?,
        intro: Boolean
    ) {
        this.id = id
        this.created = created
        this.timestamp = timestamp
        this.user = user
        this.comment = comment
        this.channel = channel
        this.isIntro = intro
    }

    constructor()

    class FileCommentBuilder internal constructor() {
        private var id: String? = null
        private var created: Int? = null
        private var timestamp: Int? = null
        private var user: String? = null
        private var comment: String? = null
        private var channel: String? = null
        private var intro = false

        fun id(id: String?): FileCommentBuilder {
            this.id = id
            return this
        }

        fun created(created: Int?): FileCommentBuilder {
            this.created = created
            return this
        }

        fun timestamp(timestamp: Int?): FileCommentBuilder {
            this.timestamp = timestamp
            return this
        }

        fun user(user: String?): FileCommentBuilder {
            this.user = user
            return this
        }

        fun comment(comment: String?): FileCommentBuilder {
            this.comment = comment
            return this
        }

        fun channel(channel: String?): FileCommentBuilder {
            this.channel = channel
            return this
        }

        fun intro(intro: Boolean): FileCommentBuilder {
            this.intro = intro
            return this
        }

        fun build(): FileComment {
            return FileComment(id, created, timestamp, user, comment, channel, intro)
        }

        override fun toString(): String {
            return "FileComment.FileCommentBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", user=" + this.user + ", comment=" + this.comment + ", channel=" + this.channel + ", intro=" + this.intro + ")"
        }
    }

    companion object {
        fun builder(): FileCommentBuilder {
            return FileCommentBuilder()
        }
    }
}