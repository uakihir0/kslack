package work.socialhub.kslack.entity.team

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Profile {

    var id: String? = null

    @SerialName("section_id")
    var sectionId: String? = null

    @SerialName("field_name")
    var fieldName: String? = null

    var ordering: Int? = null
    var label: String? = null
    var hint: String? = null
    var type: String? = null

    @SerialName("possible_values")
    var possibleValues: Array<String>? = null

    var options: ProfileOptions? = null

    @SerialName("is_hidden")
    var isHidden: Boolean = false

    @SerialName("is_inverse")
    var inverse: Boolean? = false

    var permissions: ProfilePermissions? = null
}