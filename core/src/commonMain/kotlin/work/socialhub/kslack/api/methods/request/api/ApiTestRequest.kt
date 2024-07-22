package work.socialhub.kslack.api.methods.request.api

import work.socialhub.kslack.api.methods.SlackApiRequest

class ApiTestRequest(
    /** Authentication token bearing required scopes. */
    override var token: String? = null,
    /** example property to return */
    var foo: String?,
    /** Error response to return */
    var error: String?
) : SlackApiRequest