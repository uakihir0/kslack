package work.socialhub.kslack.api.methods.request.workflows.steps

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/workflows.steps.cancel
 */
@JsExport
class WorkflowsStepsCancelRequest(
    override var token: String?,
    /** The workflow_step_invoke_id of the step to cancel. */
    var workflowStepInvokeId: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("workflow_step_invoke_id", workflowStepInvokeId)
        }
    }
}
