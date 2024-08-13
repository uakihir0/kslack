package work.socialhub.kmastodon.internal

import work.socialhub.khttpclient.HttpRequest
import work.socialhub.kmastodon.api.ListsResource
import work.socialhub.kmastodon.api.request.lists.*
import work.socialhub.kmastodon.api.response.Response
import work.socialhub.kmastodon.api.response.ResponseUnit
import work.socialhub.kmastodon.api.response.lists.*
import work.socialhub.kmastodon.util.Headers.AUTHORIZATION
import work.socialhub.kmastodon.util.MediaType

class ListsResourceImpl(
    uri: String,
    accessToken: String,
) : AbstractAuthResourceImpl(uri, accessToken),
    ListsResource {

    /**
     * {@inheritDoc}
     */
    override fun lists(
        request: ListsListsRequest
    ): Response<Array<ListsListsResponse>> = exec {
        HttpRequest()
            .url("${uri}/api/v1/accounts/${request.id}/lists")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .get()
    }

    /**
     * {@inheritDoc}
     */
    override fun listAccounts(
        request: ListsListAccountsRequest
    ): Response<Array<ListsListAccountsResponse>> = exec {
        HttpRequest()
            .url("${uri}/api/v1/lists/${request.id}/accounts")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .query("limit", request.limit ?: 40)
            .get()
    }

    /**
     * {@inheritDoc}
     */
    override fun list(
        request: ListsListRequest
    ): Response<ListsListResponse> = exec {
        HttpRequest()
            .url("${uri}/api/v1/lists/${request.id}")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .get()
    }

    /**
     * {@inheritDoc}
     */
    override fun createList(
        request: ListsCreateListRequest
    ): Response<ListsCreateListResponse> = exec {
        HttpRequest()
            .url("${uri}/api/v1/lists")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .pwn("title", request.title)
            .post()
    }

    /**
     * {@inheritDoc}
     */
    override fun updateList(
        request: ListsUpdateListRequest
    ): Response<ListsUpdateListResponse> = exec {
        HttpRequest()
            .url("${uri}/api/v1/lists/${request.id}")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .pwn("title", request.title)
            .put()
    }

    /**
     * {@inheritDoc}
     */
    override fun deleteList(
        request: ListsDeleteListRequest
    ): ResponseUnit = unit {
        HttpRequest()
            .url("${uri}/api/v1/lists/${request.id}")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .delete()
    }

    /**
     * {@inheritDoc}
     */
    override fun addAccountsToList(
        request: ListsAddAccountsToListRequest
    ): ResponseUnit = unit {
        HttpRequest()
            .url("${uri}/api/v1/lists/${request.id}/accounts")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .pwns("accountIds", request.accountIds)
            .post()
    }

    /**
     * {@inheritDoc}
     */
    override fun deleteAccountsToList(
        request: ListsDeleteAccountsToListRequest
    ): ResponseUnit = unit {
        HttpRequest()
            .url("${uri}/api/v1/lists/${request.id}/accounts")
            .header(AUTHORIZATION, bearerToken())
            .accept(MediaType.JSON)
            .pwns("accountIds", request.accountIds)
            .delete()
    }
}
