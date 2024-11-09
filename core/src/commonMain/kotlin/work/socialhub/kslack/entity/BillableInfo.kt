package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class BillableInfo {
    var isBillingActive: Boolean = false
}
