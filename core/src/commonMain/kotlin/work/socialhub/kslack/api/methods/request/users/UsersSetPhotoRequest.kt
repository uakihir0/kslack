package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * Set the user profile photo
 */
class UsersSetPhotoRequest(
    /** Authentication token. Requires scope: `users.profile:write` */
    override var token: String?,
    /** File contents via `multipart/form-data`. */
    var imageData: ByteArray,

    /** X coordinate of top-left corner of crop box */
    var cropX: Int?,
    /** Y coordinate of top-left corner of crop box */
    var cropY: Int?,
    /** Width/height of crop box (always square) */
    var cropW: Int?,
) : SlackApiRequest