package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImOpenRequest(
    /** Authentication token. Requires scope: `im:write` */
    override var token: String?,
    /** User to open a direct message channel with. */
    var user: String?,
    /** Boolean, indicates you want the full IM channel definition in the response. */
    var isReturnIm: Boolean,
    /** Set this to `true` to receive the locale for this im. Defaults to `false` */
    var isIncludeLocale: Boolean
) : SlackApiRequest