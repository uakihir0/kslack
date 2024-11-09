package work.socialhub.kslack.entity.view

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.LayoutBlock
import kotlin.js.JsExport

/**
 * Represents a Slack Modal View
 *
 * @see [Modals](https://api.slack.com/block-kit/surfaces/modals)
 */
@JsExport
@Serializable
class View {
    var id: String? = null
    var teamId: String? = null
    var type: String? = null // modal, home
    private var title: ViewTitle? = null
    private var submit: ViewSubmit? = null
    private var close: ViewClose? = null
    private var blocks: Array<LayoutBlock>? = null
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
}
