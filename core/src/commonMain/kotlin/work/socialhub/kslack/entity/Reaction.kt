package work.socialhub.kslack.entity

/**
 * https://api.slack.com/methods/reactions.get
 */
class Reaction {
    var name: String? = null
    var count: Int? = null
    var users: List<String>? = null
    var url: String? = null

    constructor(name: String?, count: Int?, users: List<String>?, url: String?) {
        this.name = name
        this.count = count
        this.users = users
        this.url = url
    }

    constructor()

    class ReactionBuilder internal constructor() {
        private var name: String? = null
        private var count: Int? = null
        private var users: List<String>? = null
        private var url: String? = null

        fun name(name: String?): ReactionBuilder {
            this.name = name
            return this
        }

        fun count(count: Int?): ReactionBuilder {
            this.count = count
            return this
        }

        fun users(users: List<String>?): ReactionBuilder {
            this.users = users
            return this
        }

        fun url(url: String?): ReactionBuilder {
            this.url = url
            return this
        }

        fun build(): Reaction {
            return Reaction(name, count, users, url)
        }

        override fun toString(): String {
            return "Reaction.ReactionBuilder(name=" + this.name + ", count=" + this.count + ", users=" + this.users + ", url=" + this.url + ")"
        }
    }

    companion object {
        fun builder(): ReactionBuilder {
            return ReactionBuilder()
        }
    }
}