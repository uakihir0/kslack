package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a permission resource with associated OAuth scopes.
 *
 * Used in API responses to describe which permissions are required
 * for specific operations, including resource ID, type, and scope list.
 */
@JsExport
@Serializable
class Resource {
    var id: String? = null
    var type: String? = null
    var scopes: Array<String>? = null
}