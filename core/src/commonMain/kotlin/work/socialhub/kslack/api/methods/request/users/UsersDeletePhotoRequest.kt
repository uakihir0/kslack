package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * Delete the user profile photo
 */
class UsersDeletePhotoRequest(
    /** Authentication token. Requires scope: `users.profile:write` */
    override var token: String?
) : SlackApiRequest