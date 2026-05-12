package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsCancelRequest
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsCompleteRequest
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsSkipRequest
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsCancelResponse
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsCompleteResponse
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsSkipResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `workflows.*steps.*` API methods.
 *
 * Provides methods for interacting with Steps in Slack Workflow Builder integrations.
 * These methods allow external services to complete, skip, or cancel workflow steps
 * during an integration flow.
 *
 * These APIs are used by third-party integrations that are part of a Slack Workflow.
 * Normal workspace users do not interact with these methods directly.
 *
 * # Step Lifecycle
 * 1. **Complete** - Mark the step as successfully finished (`workflowsStepsComplete`)
 * 2. **Skip** - Skip the step and proceed to the next one (`workflowsStepsSkip`)
 * 3. **Cancel** - Abort the entire workflow from this step (`workflowsStepsCancel`)
 *
 * Each method requires a `step_token` and `step_id` provided by Slack during the
 * workflow integration callback.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/workflows.steps.complete">workflows.steps.complete</a>
 * @see <a href="https://docs.slack.dev/reference/methods/workflows.steps.skip">workflows.steps.skip</a>
 * @see <a href="https://docs.slack.dev/reference/methods/workflows.steps.cancel">workflows.steps.cancel</a>
 */
@JsExport
interface WorkflowsResource {

    /**
     * Completes a workflow step, signaling that the external action has finished successfully.
     *
     * When completing a step, you can provide `step_results` with key-value pairs that
     * get passed to subsequent workflow steps.
     *
     * @param req Request containing the step token, step ID, and optional completion results
     * @return Response indicating whether the step was completed successfully
     * @see <a href="https://docs.slack.dev/reference/methods/workflows.steps.complete">workflows.steps.complete</a>
     */
    suspend fun workflowsStepsComplete(
        req: WorkflowsStepsCompleteRequest
    ): WorkflowsStepsCompleteResponse

    @JsExport.Ignore
    fun workflowsStepsCompleteBlocking(
        req: WorkflowsStepsCompleteRequest
    ): WorkflowsStepsCompleteResponse

    suspend fun workflowsStepsSkip(
        req: WorkflowsStepsSkipRequest
    ): WorkflowsStepsSkipResponse

    @JsExport.Ignore
    fun workflowsStepsSkipBlocking(
        req: WorkflowsStepsSkipRequest
    ): WorkflowsStepsSkipResponse

    suspend fun workflowsStepsCancel(
        req: WorkflowsStepsCancelRequest
    ): WorkflowsStepsCancelResponse

    @JsExport.Ignore
    fun workflowsStepsCancelBlocking(
        req: WorkflowsStepsCancelRequest
    ): WorkflowsStepsCancelResponse
}
