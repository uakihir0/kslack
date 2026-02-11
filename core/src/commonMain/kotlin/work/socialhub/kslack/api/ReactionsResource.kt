package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.reactions.ReactionsAddRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsGetRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsListRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsRemoveRequest
import work.socialhub.kslack.api.methods.response.reactions.ReactionsAddResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsGetResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsListResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsRemoveResponse
import kotlin.js.JsExport

@JsExport
interface ReactionsResource {

    suspend fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse

    @JsExport.Ignore
    fun reactionsAddBlocking(
        req: ReactionsAddRequest
    ): ReactionsAddResponse

    suspend fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse

    @JsExport.Ignore
    fun reactionsGetBlocking(
        req: ReactionsGetRequest
    ): ReactionsGetResponse

    suspend fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse

    @JsExport.Ignore
    fun reactionsListBlocking(
        req: ReactionsListRequest
    ): ReactionsListResponse

    suspend fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse

    @JsExport.Ignore
    fun reactionsRemoveBlocking(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse
}
