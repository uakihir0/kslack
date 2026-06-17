package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.ViewsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.views.ViewsHomeUpdateRequest
import work.socialhub.kslack.api.methods.request.views.ViewsOpenRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPublishRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPushRequest
import work.socialhub.kslack.api.methods.request.views.ViewsUpdateRequest
import work.socialhub.kslack.api.methods.response.views.ViewsHomeUpdateResponse
import work.socialhub.kslack.api.methods.response.views.ViewsOpenResponse
import work.socialhub.kslack.api.methods.response.views.ViewsPublishResponse
import work.socialhub.kslack.api.methods.response.views.ViewsPushResponse
import work.socialhub.kslack.api.methods.response.views.ViewsUpdateResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [ViewsResource] for Slack's `views.*` API methods.
 *
 * Handles HTTP POST requests for managing Block Kit views (modals, home tabs,
 * and message attachments). All methods use form-encoded request bodies.
 *
 * @param token Optional default token provided at factory initialization
 */
class ViewsResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), ViewsResource {

    override suspend fun viewsOpen(req: ViewsOpenRequest): ViewsOpenResponse {
        return postFormWithToken(req.toParams(), Methods.VIEWS_OPEN, getToken(req))
    }

    override fun viewsOpenBlocking(req: ViewsOpenRequest): ViewsOpenResponse {
        return toBlocking { viewsOpen(req) }
    }

    override suspend fun viewsPush(req: ViewsPushRequest): ViewsPushResponse {
        return postFormWithToken(req.toParams(), Methods.VIEWS_PUSH, getToken(req))
    }

    override fun viewsPushBlocking(req: ViewsPushRequest): ViewsPushResponse {
        return toBlocking { viewsPush(req) }
    }

    override suspend fun viewsUpdate(req: ViewsUpdateRequest): ViewsUpdateResponse {
        return postFormWithToken(req.toParams(), Methods.VIEWS_UPDATE, getToken(req))
    }

    override fun viewsUpdateBlocking(req: ViewsUpdateRequest): ViewsUpdateResponse {
        return toBlocking { viewsUpdate(req) }
    }

    override suspend fun viewsPublish(req: ViewsPublishRequest): ViewsPublishResponse {
        return postFormWithToken(req.toParams(), Methods.VIEWS_PUBLISH, getToken(req))
    }

    override fun viewsPublishBlocking(req: ViewsPublishRequest): ViewsPublishResponse {
        return toBlocking { viewsPublish(req) }
    }

    override suspend fun viewsHomeUpdate(req: ViewsHomeUpdateRequest): ViewsHomeUpdateResponse {
        return postFormWithToken(req.toParams(), Methods.VIEWS_HOME_UPDATE, getToken(req))
    }

    override fun viewsHomeUpdateBlocking(req: ViewsHomeUpdateRequest): ViewsHomeUpdateResponse {
        return toBlocking { viewsHomeUpdate(req) }
    }
}
