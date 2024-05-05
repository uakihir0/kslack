package work.socialhub.kslack.entity.view

import com.github.seratch.jslack.api.model.block.LayoutBlock

/**
 * Represents a Slack Modal View
 *
 * @see [Modals](https://api.slack.com/block-kit/surfaces/modals)
 */
class View {
    var id: String? = null
    var teamId: String? = null
    var type: String? = null // modal, home
    private var title: ViewTitle? = null
    private var submit: ViewSubmit? = null
    private var close: ViewClose? = null
    private var blocks: List<LayoutBlock>? = null
    var privateMetadata: String? = null
    var callbackId: String? = null
    var externalId: String? = null
    private var state: ViewState? = null
    var hash: String? = null
    var clearOnClose: Boolean? = null // must be nullable for App Home
    var notifyOnClose: Boolean? = null // must be nullable for App Home
    var rootViewId: String? = null
    var previousViewId: String? = null // views.update
    var appId: String? = null
    var botId: String? = null

    constructor(
        id: String?,
        teamId: String?,
        type: String?,
        title: ViewTitle?,
        submit: ViewSubmit?,
        close: ViewClose?,
        blocks: List<LayoutBlock>?,
        privateMetadata: String?,
        callbackId: String?,
        externalId: String?,
        state: ViewState?,
        hash: String?,
        clearOnClose: Boolean?,
        notifyOnClose: Boolean?,
        rootViewId: String?,
        previousViewId: String?,
        appId: String?,
        botId: String?
    ) {
        this.id = id
        this.teamId = teamId
        this.type = type
        this.title = title
        this.submit = submit
        this.close = close
        this.blocks = blocks
        this.privateMetadata = privateMetadata
        this.callbackId = callbackId
        this.externalId = externalId
        this.state = state
        this.hash = hash
        this.clearOnClose = clearOnClose
        this.notifyOnClose = notifyOnClose
        this.rootViewId = rootViewId
        this.previousViewId = previousViewId
        this.appId = appId
        this.botId = botId
    }

    constructor()

    fun getTitle(): ViewTitle? {
        return this.title
    }

    fun getSubmit(): ViewSubmit? {
        return this.submit
    }

    fun getClose(): ViewClose? {
        return this.close
    }

    fun getBlocks(): List<LayoutBlock>? {
        return this.blocks
    }

    fun getState(): ViewState? {
        return this.state
    }

    fun setTitle(title: ViewTitle?) {
        this.title = title
    }

    fun setSubmit(submit: ViewSubmit?) {
        this.submit = submit
    }

    fun setClose(close: ViewClose?) {
        this.close = close
    }

    fun setBlocks(blocks: List<LayoutBlock>?) {
        this.blocks = blocks
    }

    fun setState(state: ViewState?) {
        this.state = state
    }

    class ViewBuilder internal constructor() {
        private var id: String? = null
        private var teamId: String? = null
        private var type: String? = null
        private var title: ViewTitle? = null
        private var submit: ViewSubmit? = null
        private var close: ViewClose? = null
        private var blocks: List<LayoutBlock>? = null
        private var privateMetadata: String? = null
        private var callbackId: String? = null
        private var externalId: String? = null
        private var state: ViewState? = null
        private var hash: String? = null
        private var clearOnClose: Boolean? = null
        private var notifyOnClose: Boolean? = null
        private var rootViewId: String? = null
        private var previousViewId: String? = null
        private var appId: String? = null
        private var botId: String? = null

        fun id(id: String?): ViewBuilder {
            this.id = id
            return this
        }

        fun teamId(teamId: String?): ViewBuilder {
            this.teamId = teamId
            return this
        }

        fun type(type: String?): ViewBuilder {
            this.type = type
            return this
        }

        fun title(title: ViewTitle?): ViewBuilder {
            this.title = title
            return this
        }

        fun submit(submit: ViewSubmit?): ViewBuilder {
            this.submit = submit
            return this
        }

        fun close(close: ViewClose?): ViewBuilder {
            this.close = close
            return this
        }

        fun blocks(blocks: List<LayoutBlock>?): ViewBuilder {
            this.blocks = blocks
            return this
        }

        fun privateMetadata(privateMetadata: String?): ViewBuilder {
            this.privateMetadata = privateMetadata
            return this
        }

        fun callbackId(callbackId: String?): ViewBuilder {
            this.callbackId = callbackId
            return this
        }

        fun externalId(externalId: String?): ViewBuilder {
            this.externalId = externalId
            return this
        }

        fun state(state: ViewState?): ViewBuilder {
            this.state = state
            return this
        }

        fun hash(hash: String?): ViewBuilder {
            this.hash = hash
            return this
        }

        fun clearOnClose(clearOnClose: Boolean?): ViewBuilder {
            this.clearOnClose = clearOnClose
            return this
        }

        fun notifyOnClose(notifyOnClose: Boolean?): ViewBuilder {
            this.notifyOnClose = notifyOnClose
            return this
        }

        fun rootViewId(rootViewId: String?): ViewBuilder {
            this.rootViewId = rootViewId
            return this
        }

        fun previousViewId(previousViewId: String?): ViewBuilder {
            this.previousViewId = previousViewId
            return this
        }

        fun appId(appId: String?): ViewBuilder {
            this.appId = appId
            return this
        }

        fun botId(botId: String?): ViewBuilder {
            this.botId = botId
            return this
        }

        fun build(): View {
            return View(
                id,
                teamId,
                type,
                title,
                submit,
                close,
                blocks,
                privateMetadata,
                callbackId,
                externalId,
                state,
                hash,
                clearOnClose,
                notifyOnClose,
                rootViewId,
                previousViewId,
                appId,
                botId
            )
        }

        override fun toString(): String {
            return "View.ViewBuilder(id=" + this.id + ", teamId=" + this.teamId + ", type=" + this.type + ", title=" + this.title + ", submit=" + this.submit + ", close=" + this.close + ", blocks=" + this.blocks + ", privateMetadata=" + this.privateMetadata + ", callbackId=" + this.callbackId + ", externalId=" + this.externalId + ", state=" + this.state + ", hash=" + this.hash + ", clearOnClose=" + this.clearOnClose + ", notifyOnClose=" + this.notifyOnClose + ", rootViewId=" + this.rootViewId + ", previousViewId=" + this.previousViewId + ", appId=" + this.appId + ", botId=" + this.botId + ")"
        }
    }

    companion object {
        fun builder(): ViewBuilder {
            return ViewBuilder()
        }
    }
}
