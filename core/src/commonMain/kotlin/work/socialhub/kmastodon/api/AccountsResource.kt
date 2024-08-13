package work.socialhub.kmastodon.api

import work.socialhub.kmastodon.api.request.accounts.*
import work.socialhub.kmastodon.api.response.Response
import work.socialhub.kmastodon.api.response.accounts.*
import kotlin.js.JsExport

@JsExport
interface AccountsResource {

    /**
     * Getting the current user.
     */
    fun verifyCredentials(
    ): Response<AccountsVerifyCredentialsResponse>

    /**
     * Updating the current user.
     */
    fun updateCredentials(
        request: AccountsUpdateCredentialsRequest
    ): Response<AccountsUpdateCredentialsResponse>

    /**
     * Fetching an account.
     */
    fun account(
        request: AccountsAccountRequest
    ): Response<AccountsAccountResponse>

    /**
     * Getting an account's followers.
     */
    fun followers(
        request: AccountsFollowersRequest
    ): Response<Array<AccountsFollowersResponse>>

    /**
     * Getting who account is following.
     */
    fun following(
        request: AccountsFollowingRequest
    ): Response<Array<AccountsFollowingResponse>>

    /**
     * Getting an account's statuses.
     */
    fun statuses(
        request: AccountsStatusesRequest
    ): Response<Array<AccountsStatusesResponse>>

    /**
     * Following an account.
     */
    fun follow(
        request: AccountsFollowRequest
    ): Response<AccountsFollowResponse>

    /**
     * Unfollowing an account.
     */
    fun unfollow(
        request: AccountsUnfollowRequest
    ): Response<AccountsUnfollowResponse>

    /**
     * Blocking an account.
     */
    fun block(
        request: AccountsBlockRequest
    ): Response<AccountsBlockResponse>

    /**
     * Unblocking an account.
     */
    fun unblock(
        request: AccountsUnblockRequest
    ): Response<AccountsUnblockResponse>

    /**
     * Muting an account.
     */
    fun mute(
        request: AccountsMuteRequest
    ): Response<AccountsMuteResponse>

    /**
     * Unmuting an account.
     */
    fun unmute(
        request: AccountsUnmuteRequest
    ): Response<AccountsUnmuteResponse>

    /**
     * Getting an account's relationships.
     */
    fun relationships(
        request: AccountsRelationshipsRequest
    ): Response<Array<AccountsRelationshipsResponse>>

    /**
     * Searching for accounts.
     */
    fun search(
        request: AccountsSearchRequest
    ): Response<Array<AccountsSearchResponse>>
}
