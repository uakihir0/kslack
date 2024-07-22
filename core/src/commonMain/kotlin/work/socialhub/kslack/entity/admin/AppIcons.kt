package work.socialhub.kslack.entity.admin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class AppIcons {

    @SerialName("image_32")
    var image32: String? = null

    @SerialName("image_36")
    var image36: String? = null

    @SerialName("image_48")
    var image48: String? = null

    @SerialName("image_64")
    var image64: String? = null

    @SerialName("image_72")
    var image72: String? = null

    @SerialName("image_96")
    var image96: String? = null

    @SerialName("image_128")
    var image128: String? = null

    @SerialName("image_192")
    var image192: String? = null

    @SerialName("image_512")
    var image512: String? = null

    @SerialName("image_1024")
    var image1024: String? = null

    @SerialName("image_original")
    var imageOriginal: String? = null
}