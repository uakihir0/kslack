package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

class Action {
    constructor(
        id: String?,
        name: String?,
        text: String?,
        style: String?,
        type: Type?,
        value: String?,
        confirm: Confirmation?,
        options: List<Option>?,
        selectedOptions: List<Option>?,
        dataSource: String?,
        minQueryLength: Int?,
        optionGroups: List<OptionGroup>?,
        url: String?
    ) {
        this.id = id
        this.name = name
        this.text = text
        this.style = style
        this.type = type
        this.value = value
        this.confirm = confirm
        this.options = options
        this.selectedOptions = selectedOptions
        this.dataSource = dataSource
        this.minQueryLength = minQueryLength
        this.optionGroups = optionGroups
        this.url = url
    }

    constructor()

    fun getConfirm(): Confirmation? {
        return this.confirm
    }

    fun setConfirm(confirm: Confirmation?) {
        this.confirm = confirm
    }

    /**
     * Represents the type of action (e.g Message button or message menu)
     *
     * @see [Interaction Types](https://api.slack.com/interactive-messages.interaction_types)
     */
    enum class Type(private val value: String) {
        /**
         * @see [Message button](https://api.slack.com/docs/message-buttons)
         */
        @SerializedName("button")
        BUTTON("button"),

        /**
         * @see [Message menus](https://api.slack.com/docs/message-menus)
         */
        @SerializedName("select")
        SELECT("select");

        fun value(): String {
            return value
        }
    }

    var id: String? = null
    var name: String? = null
    var text: String? = null
    var style: String? = null
    var type: Type? = Type.BUTTON
    var value: String? = null
    private var confirm: Confirmation? = null
    var options: List<Option>? = java.util.ArrayList<Option>()
    var selectedOptions: List<Option>? = java.util.ArrayList<Option>()
    var dataSource: String? = null
    var minQueryLength: Int? = null
    var optionGroups: List<OptionGroup>? = null
    var url: String? = null

    class OptionGroup {
        var text: String? = null
        var options: List<Option>? = null

        constructor(text: String?, options: List<Option>?) {
            this.text = text
            this.options = options
        }

        constructor()

        class OptionGroupBuilder internal constructor() {
            private var text: String? = null
            private var options: List<Option>? = null

            fun text(text: String?): OptionGroupBuilder {
                this.text = text
                return this
            }

            fun options(options: List<Option>?): OptionGroupBuilder {
                this.options = options
                return this
            }

            fun build(): OptionGroup {
                return OptionGroup(text, options)
            }

            override fun toString(): String {
                return "Action.OptionGroup.OptionGroupBuilder(text=" + this.text + ", options=" + this.options + ")"
            }
        }

        companion object {
            fun builder(): OptionGroupBuilder {
                return OptionGroupBuilder()
            }
        }
    }

    class Option {
        var text: String? = null
        var value: String? = null

        constructor(text: String?, value: String?) {
            this.text = text
            this.value = value
        }

        constructor()

        class OptionBuilder internal constructor() {
            private var text: String? = null
            private var value: String? = null

            fun text(text: String?): OptionBuilder {
                this.text = text
                return this
            }

            fun value(value: String?): OptionBuilder {
                this.value = value
                return this
            }

            fun build(): Option {
                return Option(text, value)
            }

            override fun toString(): String {
                return "Action.Option.OptionBuilder(text=" + this.text + ", value=" + this.value + ")"
            }
        }

        companion object {
            fun builder(): OptionBuilder {
                return OptionBuilder()
            }
        }
    }

    class ActionBuilder internal constructor() {
        private var id: String? = null
        private var name: String? = null
        private var text: String? = null
        private var style: String? = null
        private var type: Type? = null
        private var value: String? = null
        private var confirm: Confirmation? = null
        private var options: List<Option>? = null
        private var selectedOptions: List<Option>? = null
        private var dataSource: String? = null
        private var minQueryLength: Int? = null
        private var optionGroups: List<OptionGroup>? = null
        private var url: String? = null

        fun id(id: String?): ActionBuilder {
            this.id = id
            return this
        }

        fun name(name: String?): ActionBuilder {
            this.name = name
            return this
        }

        fun text(text: String?): ActionBuilder {
            this.text = text
            return this
        }

        fun style(style: String?): ActionBuilder {
            this.style = style
            return this
        }

        fun type(type: Type?): ActionBuilder {
            this.type = type
            return this
        }

        fun value(value: String?): ActionBuilder {
            this.value = value
            return this
        }

        fun confirm(confirm: Confirmation?): ActionBuilder {
            this.confirm = confirm
            return this
        }

        fun options(options: List<Option>?): ActionBuilder {
            this.options = options
            return this
        }

        fun selectedOptions(selectedOptions: List<Option>?): ActionBuilder {
            this.selectedOptions = selectedOptions
            return this
        }

        fun dataSource(dataSource: String?): ActionBuilder {
            this.dataSource = dataSource
            return this
        }

        fun minQueryLength(minQueryLength: Int?): ActionBuilder {
            this.minQueryLength = minQueryLength
            return this
        }

        fun optionGroups(optionGroups: List<OptionGroup>?): ActionBuilder {
            this.optionGroups = optionGroups
            return this
        }

        fun url(url: String?): ActionBuilder {
            this.url = url
            return this
        }

        fun build(): Action {
            return Action(
                id,
                name,
                text,
                style,
                type,
                value,
                confirm,
                options,
                selectedOptions,
                dataSource,
                minQueryLength,
                optionGroups,
                url
            )
        }

        override fun toString(): String {
            return "Action.ActionBuilder(id=" + this.id + ", name=" + this.name + ", text=" + this.text + ", style=" + this.style + ", type=" + this.type + ", value=" + this.value + ", confirm=" + this.confirm + ", options=" + this.options + ", selectedOptions=" + this.selectedOptions + ", dataSource=" + this.dataSource + ", minQueryLength=" + this.minQueryLength + ", optionGroups=" + this.optionGroups + ", url=" + this.url + ")"
        }
    }

    companion object {
        fun builder(): ActionBuilder {
            return ActionBuilder()
        }
    }
}
