package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.WorkflowsResource
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsCancelRequest
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsCompleteRequest
import work.socialhub.kslack.api.methods.request.workflows.steps.WorkflowsStepsSkipRequest
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsCancelResponse
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsCompleteResponse
import work.socialhub.kslack.api.methods.response.workflows.steps.WorkflowsStepsSkipResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [WorkflowsResource] for Slack's `workflows.*steps.*` API methods.
 *
 * Handles HTTP POST requests for completing, skipping, and cancelling workflow steps.
 * These methods are used by third-party integrations in Slack Workflow Builder flows.
 *
 * @param token Optional default token provided at factory initialization
 */
class WorkflowsResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    WorkflowsResource {

    override suspend fun workflowsStepsComplete(
        req: WorkflowsStepsCompleteRequest
    ): WorkflowsStepsCompleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.WORKFLOWS_STEPS_COMPLETE,
            getToken(req),
        )
    }

    override fun workflowsStepsCompleteBlocking(
        req: WorkflowsStepsCompleteRequest
    ): WorkflowsStepsCompleteResponse {
        return toBlocking { workflowsStepsComplete(req) }
    }

    override suspend fun workflowsStepsSkip(
        req: WorkflowsStepsSkipRequest
    ): WorkflowsStepsSkipResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.WORKFLOWS_STEPS_SKIP,
            getToken(req),
        )
    }

    override fun workflowsStepsSkipBlocking(
        req: WorkflowsStepsSkipRequest
    ): WorkflowsStepsSkipResponse {
        return toBlocking { workflowsStepsSkip(req) }
    }

    override suspend fun workflowsStepsCancel(
        req: WorkflowsStepsCancelRequest
    ): WorkflowsStepsCancelResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.WORKFLOWS_STEPS_CANCEL,
            getToken(req),
        )
    }

    override fun workflowsStepsCancelBlocking(
        req: WorkflowsStepsCancelRequest
    ): WorkflowsStepsCancelResponse {
        return toBlocking { workflowsStepsCancel(req) }
    }
}
