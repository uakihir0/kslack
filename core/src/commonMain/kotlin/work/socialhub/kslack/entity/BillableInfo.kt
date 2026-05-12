package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents billing information for a user in a workspace.
 *
 * Used in responses from `team.billableInfo` to indicate whether
 * the user is actively billed on the workspace plan.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/team.billableInfo">team.billableInfo</a>
 */
@JsExport
@Serializable
class BillableInfo {
    var isBillingActive: Boolean = false
}
