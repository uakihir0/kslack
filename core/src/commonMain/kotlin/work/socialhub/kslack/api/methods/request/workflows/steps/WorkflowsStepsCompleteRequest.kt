package work.socialhub.kslack.api.methods.request.workflows.steps

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/workflows.steps.complete
 */
@JsExport
class WorkflowsStepsCompleteRequest(
    override var token: String?,
    /** The workflow_step_invoke_id of the step to complete. */
    var workflowStepInvokeId: String,
    /** A JSON-formatted object describing the outputs of the completed step. */
    var outputs: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("workflow_step_invoke_id", workflowStepInvokeId)
            it.addParam("outputs", outputs)
        }
    }
}
