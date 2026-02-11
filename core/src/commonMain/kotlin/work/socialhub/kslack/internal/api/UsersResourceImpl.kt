package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.UsersResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.users.*
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileGetRequest
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileSetRequest
import work.socialhub.kslack.api.methods.response.users.*
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileGetResponse
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileSetResponse
import work.socialhub.kslack.util.toBlocking

class UsersResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    UsersResource {

    override suspend fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_CONVERSATIONS,
            getToken(req),
        )
    }

    override fun usersConversationsBlocking(
        req: UsersConversationsRequest
    ): UsersConversationsResponse {
        return toBlocking { usersConversations(req) }
    }

    override suspend fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_DELETE_PHOTO,
            getToken(req),
        )
    }

    override fun usersDeletePhotoBlocking(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse {
        return toBlocking { usersDeletePhoto(req) }
    }

    override suspend fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_GET_PRESENCE,
            getToken(req),
        )
    }

    override fun usersGetPresenceBlocking(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse {
        return toBlocking { usersGetPresence(req) }
    }

    override suspend fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_IDENTITY,
            getToken(req),
        )
    }

    override fun usersIdentityBlocking(
        req: UsersIdentityRequest
    ): UsersIdentityResponse {
        return toBlocking { usersIdentity(req) }
    }

    override suspend fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_INFO,
            getToken(req),
        )
    }

    override fun usersInfoBlocking(
        req: UsersInfoRequest
    ): UsersInfoResponse {
        return toBlocking { usersInfo(req) }
    }

    override suspend fun usersList(
        req: UsersListRequest
    ): UsersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_LIST,
            getToken(req),
        )
    }

    override fun usersListBlocking(
        req: UsersListRequest
    ): UsersListResponse {
        return toBlocking { usersList(req) }
    }

    override suspend fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_LOOKUP_BY_EMAIL,
            getToken(req),
        )
    }

    override fun usersLookupByEmailBlocking(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse {
        return toBlocking { usersLookupByEmail(req) }
    }

    @Deprecated("Deprecated by Slack.")
    override suspend fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_SET_ACTIVE,
            getToken(req),
        )
    }

    @Deprecated("Deprecated by Slack.")
    override fun usersSetActiveBlocking(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse {
        return toBlocking { usersSetActive(req) }
    }

    override suspend fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse {
        return postMultipartWithToken(
            req.toParams(),
            Methods.USERS_SET_PHOTO,
            getToken(req),
        )
    }

    override fun usersSetPhotoBlocking(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse {
        return toBlocking { usersSetPhoto(req) }
    }

    override suspend fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_SET_PRESENCE,
            getToken(req),
        )
    }

    override fun usersSetPresenceBlocking(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse {
        return toBlocking { usersSetPresence(req) }
    }

    override suspend fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_PROFILE_GET,
            getToken(req),
        )
    }

    override fun usersProfileGetBlocking(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse {
        return toBlocking { usersProfileGet(req) }
    }

    override suspend fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_PROFILE_SET,
            getToken(req),
        )
    }

    override fun usersProfileSetBlocking(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse {
        return toBlocking { usersProfileSet(req) }
    }
}
