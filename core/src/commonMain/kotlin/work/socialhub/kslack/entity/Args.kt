package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents argument results from an API method response.
 *
 * Used to capture parsed arguments and any associated errors
 * returned by Slack API methods.
 */
@JsExport
@Serializable
class Args {
    var foo: String? = null
    var error: String? = null
}
