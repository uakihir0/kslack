package work.socialhub.kslack.api.methods.request.emoji

import work.socialhub.kslack.api.methods.SlackApiRequest

class EmojiListRequest(
    /** Authentication token. Requires scope: `emoji:read` */
    override var token: String?
) : SlackApiRequest