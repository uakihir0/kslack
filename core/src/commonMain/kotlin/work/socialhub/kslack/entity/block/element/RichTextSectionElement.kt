package work.socialhub.kslack.entity.block.element

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
class RichTextSectionElement : BlockElement, RichTextElement {
    override val type: String = TYPE
    private var elements: List<RichTextElement>? = java.util.ArrayList<RichTextElement>()

    constructor(elements: List<RichTextElement>?) {
        this.elements = elements
    }

    constructor()

    fun getElements(): List<RichTextElement>? {
        return this.elements
    }

    fun setElements(elements: List<RichTextElement>?) {
        this.elements = elements
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is RichTextSectionElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$elements`: Any? = this.getElements()
        val `other$elements`: Any? = other.getElements()
        if (if (`this$elements` == null) `other$elements` != null else `this$elements` != `other$elements`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is RichTextSectionElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$elements`: Any? = this.getElements()
        result = result * PRIME + (`$elements`?.hashCode() ?: 43)
        return result
    }

    // -------------------------------
    // Elements
    // -------------------------------
    class Text : RichTextElement {
        override val type: String = TYPE
        var text: String? = null
        var style: TextStyle? = null

        constructor(text: String?, style: TextStyle?) {
            this.text = text
            this.style = style
        }

        constructor()

        class TextBuilder internal constructor() {
            private var text: String? = null
            private var style: TextStyle? = null

            fun text(text: String?): TextBuilder {
                this.text = text
                return this
            }

            fun style(style: TextStyle?): TextBuilder {
                this.style = style
                return this
            }

            fun build(): Text {
                return Text(text, style)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Text.TextBuilder(text=" + this.text + ", style=" + this.style + ")"
            }
        }

        companion object {
            const val TYPE: String = "text"
            fun builder(): TextBuilder {
                return TextBuilder()
            }
        }
    }

    class Channel : RichTextElement {
        override val type: String = TYPE
        var channelId: String? = null // C12345678
        var style: TextStyle? = null

        constructor(channelId: String?, style: TextStyle?) {
            this.channelId = channelId
            this.style = style
        }

        constructor()

        class ChannelBuilder internal constructor() {
            private var channelId: String? = null
            private var style: TextStyle? = null

            fun channelId(channelId: String?): ChannelBuilder {
                this.channelId = channelId
                return this
            }

            fun style(style: TextStyle?): ChannelBuilder {
                this.style = style
                return this
            }

            fun build(): Channel {
                return Channel(channelId, style)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Channel.ChannelBuilder(channelId=" + this.channelId + ", style=" + this.style + ")"
            }
        }

        companion object {
            const val TYPE: String = "channel"
            fun builder(): ChannelBuilder {
                return ChannelBuilder()
            }
        }
    }

    class User : RichTextElement {
        override val type: String = TYPE
        var userId: String? = null // W12345678
        var style: TextStyle? = null

        constructor(userId: String?, style: TextStyle?) {
            this.userId = userId
            this.style = style
        }

        constructor()

        class UserBuilder internal constructor() {
            private var userId: String? = null
            private var style: TextStyle? = null

            fun userId(userId: String?): UserBuilder {
                this.userId = userId
                return this
            }

            fun style(style: TextStyle?): UserBuilder {
                this.style = style
                return this
            }

            fun build(): User {
                return User(userId, style)
            }

            override fun toString(): String {
                return "RichTextSectionElement.User.UserBuilder(userId=" + this.userId + ", style=" + this.style + ")"
            }
        }

        companion object {
            const val TYPE: String = "user"
            fun builder(): UserBuilder {
                return UserBuilder()
            }
        }
    }

    class Emoji : RichTextElement {
        override val type: String = TYPE
        var name: String? = null

        constructor(name: String?) {
            this.name = name
        }

        constructor()

        class EmojiBuilder internal constructor() {
            private var name: String? = null

            fun name(name: String?): EmojiBuilder {
                this.name = name
                return this
            }

            fun build(): Emoji {
                return Emoji(name)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Emoji.EmojiBuilder(name=" + this.name + ")"
            }
        }

        companion object {
            const val TYPE: String = "emoji"
            fun builder(): EmojiBuilder {
                return EmojiBuilder()
            }
        }
    }

    class Link : RichTextElement {
        override val type: String = TYPE
        var url: String? = null
        var text: String? = null
        var style: TextStyle? = null

        constructor(url: String?, text: String?, style: TextStyle?) {
            this.url = url
            this.text = text
            this.style = style
        }

        constructor()

        class LinkBuilder internal constructor() {
            private var url: String? = null
            private var text: String? = null
            private var style: TextStyle? = null

            fun url(url: String?): LinkBuilder {
                this.url = url
                return this
            }

            fun text(text: String?): LinkBuilder {
                this.text = text
                return this
            }

            fun style(style: TextStyle?): LinkBuilder {
                this.style = style
                return this
            }

            fun build(): Link {
                return Link(url, text, style)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Link.LinkBuilder(url=" + this.url + ", text=" + this.text + ", style=" + this.style + ")"
            }
        }

        companion object {
            const val TYPE: String = "link"
            fun builder(): LinkBuilder {
                return LinkBuilder()
            }
        }
    }

    class Team : RichTextElement {
        override val type: String = TYPE
        var teamId: String? = null
        var style: TextStyle? = null

        constructor(teamId: String?, style: TextStyle?) {
            this.teamId = teamId
            this.style = style
        }

        constructor()

        class TeamBuilder internal constructor() {
            private var teamId: String? = null
            private var style: TextStyle? = null

            fun teamId(teamId: String?): TeamBuilder {
                this.teamId = teamId
                return this
            }

            fun style(style: TextStyle?): TeamBuilder {
                this.style = style
                return this
            }

            fun build(): Team {
                return Team(teamId, style)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Team.TeamBuilder(teamId=" + this.teamId + ", style=" + this.style + ")"
            }
        }

        companion object {
            const val TYPE: String = "team"
            fun builder(): TeamBuilder {
                return TeamBuilder()
            }
        }
    }

    class UserGroup : RichTextElement {
        override val type: String = TYPE
        var usergroupId: String? = null

        constructor(usergroupId: String?) {
            this.usergroupId = usergroupId
        }

        constructor()

        class UserGroupBuilder internal constructor() {
            private var usergroupId: String? = null

            fun usergroupId(usergroupId: String?): UserGroupBuilder {
                this.usergroupId = usergroupId
                return this
            }

            fun build(): UserGroup {
                return UserGroup(usergroupId)
            }

            override fun toString(): String {
                return "RichTextSectionElement.UserGroup.UserGroupBuilder(usergroupId=" + this.usergroupId + ")"
            }
        }

        companion object {
            const val TYPE: String = "usergroup"
            fun builder(): UserGroupBuilder {
                return UserGroupBuilder()
            }
        }
    }

    class Date : RichTextElement {
        override val type: String = TYPE
        var timestamp: String? = null

        constructor(timestamp: String?) {
            this.timestamp = timestamp
        }

        constructor()

        class DateBuilder internal constructor() {
            private var timestamp: String? = null

            fun timestamp(timestamp: String?): DateBuilder {
                this.timestamp = timestamp
                return this
            }

            fun build(): Date {
                return Date(timestamp)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Date.DateBuilder(timestamp=" + this.timestamp + ")"
            }
        }

        companion object {
            const val TYPE: String = "date"
            fun builder(): DateBuilder {
                return DateBuilder()
            }
        }
    }

    class Broadcast : RichTextElement {
        override val type: String = TYPE
        var range: String? = null // channel, here, ..

        constructor(range: String?) {
            this.range = range
        }

        constructor()

        class BroadcastBuilder internal constructor() {
            private var range: String? = null

            fun range(range: String?): BroadcastBuilder {
                this.range = range
                return this
            }

            fun build(): Broadcast {
                return Broadcast(range)
            }

            override fun toString(): String {
                return "RichTextSectionElement.Broadcast.BroadcastBuilder(range=" + this.range + ")"
            }
        }

        companion object {
            const val TYPE: String = "broadcast"
            fun builder(): BroadcastBuilder {
                return BroadcastBuilder()
            }
        }
    }

    // -------------------------------
    class TextStyle {
        var isBold: Boolean = false
        var isItalic: Boolean = false
        var isStrike: Boolean = false

        constructor(bold: Boolean, italic: Boolean, strike: Boolean) {
            this.isBold = bold
            this.isItalic = italic
            this.isStrike = strike
        }

        constructor()

        class TextStyleBuilder internal constructor() {
            private var bold = false
            private var italic = false
            private var strike = false

            fun bold(bold: Boolean): TextStyleBuilder {
                this.bold = bold
                return this
            }

            fun italic(italic: Boolean): TextStyleBuilder {
                this.italic = italic
                return this
            }

            fun strike(strike: Boolean): TextStyleBuilder {
                this.strike = strike
                return this
            }

            fun build(): TextStyle {
                return TextStyle(bold, italic, strike)
            }

            override fun toString(): String {
                return "RichTextSectionElement.TextStyle.TextStyleBuilder(bold=" + this.bold + ", italic=" + this.italic + ", strike=" + this.strike + ")"
            }
        }

        companion object {
            fun builder(): TextStyleBuilder {
                return TextStyleBuilder()
            }
        }
    }

    class RichTextSectionElementBuilder internal constructor() {
        private var elements: List<RichTextElement>? = null

        fun elements(elements: List<RichTextElement>?): RichTextSectionElementBuilder {
            this.elements = elements
            return this
        }

        fun build(): RichTextSectionElement {
            return RichTextSectionElement(elements)
        }

        override fun toString(): String {
            return "RichTextSectionElement.RichTextSectionElementBuilder(elements=" + this.elements + ")"
        }
    }

    companion object {
        const val TYPE: String = "rich_text_section"
        fun builder(): RichTextSectionElementBuilder {
            return RichTextSectionElementBuilder()
        }
    }
}