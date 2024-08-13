package work.socialhub.kmastodon.api

import work.socialhub.kmastodon.api.request.lists.*
import work.socialhub.kmastodon.api.response.Response
import work.socialhub.kmastodon.api.response.ResponseUnit
import work.socialhub.kmastodon.api.response.lists.*
import kotlin.js.JsExport

@JsExport
interface ListsResource {

    /**
     * Fetching the user's lists that a given account is part of.
     */
    fun lists(
        request: ListsListsRequest
    ): Response<Array<ListsListsResponse>>

    /**
     * Fetching accounts that are in a given list.
     */
    fun listAccounts(
        request: ListsListAccountsRequest
    ): Response<Array<ListsListAccountsResponse>>

    /**
     * Fetching list.
     */
    fun list(
        request: ListsListRequest
    ): Response<ListsListResponse>

    /**
     * Create list.
     */
    fun createList(
        request: ListsCreateListRequest
    ): Response<ListsCreateListResponse>

    /**
     * Update list.
     */
    fun updateList(
        request: ListsUpdateListRequest
    ): Response<ListsUpdateListResponse>

    /**
     * Delete list.
     */
    fun deleteList(
        request: ListsDeleteListRequest
    ): ResponseUnit

    /**
     * Add account to list.
     */
    fun addAccountsToList(
        request: ListsAddAccountsToListRequest
    ): ResponseUnit

    /**
     * Delete account to list.
     */
    fun deleteAccountsToList(
        request: ListsDeleteAccountsToListRequest
    ): ResponseUnit
}
