package work.socialhub.kmastodon.api

import work.socialhub.kmastodon.api.request.statuses.*
import work.socialhub.kmastodon.api.response.Response
import work.socialhub.kmastodon.api.response.ResponseUnit
import work.socialhub.kmastodon.api.response.statuses.*
import kotlin.js.JsExport

@JsExport
interface StatusesResource {

    /**
     * Fetching a status.
     */
    fun status(
        request: StatusesStatusRequest
    ): Response<StatusesStatusResponse>

    /**
     * Getting status context.
     */
    fun context(
        request: StatusesContextRequest
    ): Response<StatusesContextResponse>

    /**
     * Getting a card associated with a status.
     */
    fun card(
        request: StatusesCardRequest
    ): Response<StatusesCardResponse>

    /**
     * Getting who reblogged a status.
     */
    fun rebloggedBy(
        request: StatusesRebloggedByRequest
    ): Response<Array<StatusesRebloggedByResponse>>

    /**
     * Getting who favourited a status.
     */
    fun favouritedBy(
        request: StatusesFavouritedByRequest
    ): Response<Array<StatusesFavouritedByResponse>>


    /**
     * Posting a new status.
     */
    fun postStatus(
        request: StatusesPostStatusRequest
    ): Response<StatusesPostStatusResponse>

    /**
     * Deleting a status.
     */
    fun deleteStatus(
        request: StatusesDeleteStatusRequest
    ): ResponseUnit

    /**
     * Reblogging a status.
     */
    fun reblog(
        request: StatusesReblogRequest
    ): Response<StatusesReblogResponse>

    /**
     * Unreblogging a status.
     */
    fun unreblog(
        request: StatusesUnreblogRequest
    ): Response<StatusesUnreblogResponse>

    /**
     * Favouriting a status.
     */
    fun favourite(
        request: StatusesFavouriteRequest
    ): Response<StatusesFavouriteResponse>

    /**
     * Unfavouriting a status.
     */
    fun unfavourite(
        request: StatusesUnfavouriteRequest
    ): Response<StatusesUnfavouriteResponse>
}
