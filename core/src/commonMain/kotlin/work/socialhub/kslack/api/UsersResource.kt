package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.users.*
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileGetRequest
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileSetRequest
import work.socialhub.kslack.api.methods.response.channels.UsersLookupByEmailResponse
import work.socialhub.kslack.api.methods.response.users.*
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileGetResponse
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileSetResponse
import kotlin.js.JsExport

@JsExport
interface UsersResource {

    suspend fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse

    @JsExport.Ignore
    fun usersConversationsBlocking(
        req: UsersConversationsRequest
    ): UsersConversationsResponse

    suspend fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse

    @JsExport.Ignore
    fun usersDeletePhotoBlocking(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse

    suspend fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse

    @JsExport.Ignore
    fun usersGetPresenceBlocking(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse

    suspend fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse

    @JsExport.Ignore
    fun usersIdentityBlocking(
        req: UsersIdentityRequest
    ): UsersIdentityResponse

    suspend fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse

    @JsExport.Ignore
    fun usersInfoBlocking(
        req: UsersInfoRequest
    ): UsersInfoResponse

    suspend fun usersList(
        req: UsersListRequest
    ): UsersListResponse

    @JsExport.Ignore
    fun usersListBlocking(
        req: UsersListRequest
    ): UsersListResponse

    suspend fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse

    @JsExport.Ignore
    fun usersLookupByEmailBlocking(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse

    suspend fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse

    @JsExport.Ignore
    fun usersSetActiveBlocking(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse

    suspend fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse

    @JsExport.Ignore
    fun usersSetPhotoBlocking(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse

    suspend fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse

    @JsExport.Ignore
    fun usersSetPresenceBlocking(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse

    suspend fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse

    @JsExport.Ignore
    fun usersProfileGetBlocking(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse

    suspend fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse

    @JsExport.Ignore
    fun usersProfileSetBlocking(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse
}
