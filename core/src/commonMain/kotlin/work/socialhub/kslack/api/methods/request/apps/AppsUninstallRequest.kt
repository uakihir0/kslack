package work.socialhub.kslack.api.methods.request.apps

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * This method uninstalls an app. Unlike auth.revoke, which revokes a single token,
 * this method revokes all tokens associated with a single installation of an app.
 */
class AppsUninstallRequest (
    override var token: String?,
    /** Issued when you created your application. */
    var clientId: String?,
    /** Issued when you created your application. */
    var clientSecret: String?
) : SlackApiRequest