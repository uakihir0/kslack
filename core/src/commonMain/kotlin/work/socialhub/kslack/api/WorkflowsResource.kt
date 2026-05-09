package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsCancelRequest
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsCompleteRequest
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsSkipRequest
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsCancelResponse
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsCompleteResponse
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsSkipResponse
import kotlin.js.JsExport

@JsExport
interface WorkflowsResource {

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
