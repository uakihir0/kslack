package work.socialhub.kslack.api

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
import kotlin.js.JsExport

@JsExport
interface ViewsResource {

    suspend fun viewsOpen(
        req: ViewsOpenRequest
    ): ViewsOpenResponse

    @JsExport.Ignore
    fun viewsOpenBlocking(
        req: ViewsOpenRequest
    ): ViewsOpenResponse

    suspend fun viewsPush(
        req: ViewsPushRequest
    ): ViewsPushResponse

    @JsExport.Ignore
    fun viewsPushBlocking(
        req: ViewsPushRequest
    ): ViewsPushResponse

    suspend fun viewsUpdate(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse

    @JsExport.Ignore
    fun viewsUpdateBlocking(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse

    suspend fun viewsPublish(
        req: ViewsPublishRequest
    ): ViewsPublishResponse

    @JsExport.Ignore
    fun viewsPublishBlocking(
        req: ViewsPublishRequest
    ): ViewsPublishResponse

    suspend fun viewsHomeUpdate(
        req: ViewsHomeUpdateRequest
    ): ViewsHomeUpdateResponse

    @JsExport.Ignore
    fun viewsHomeUpdateBlocking(
        req: ViewsHomeUpdateRequest
    ): ViewsHomeUpdateResponse
}
