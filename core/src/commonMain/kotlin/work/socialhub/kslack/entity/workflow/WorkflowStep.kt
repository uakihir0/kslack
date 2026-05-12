package work.socialhub.kslack.entity.workflow

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class WorkflowStep {
    var stepUuid: String? = null
    var appId: String? = null
    var callbackId: String? = null
    var version: Int? = null
}
