package work.socialhub.kslack.entity.team

import kotlinx.serialization.SerialName

class TeamIcon {
    var imageOriginal: String? = null

    @SerialName("image_34")
    var image34: String? = null

    @SerialName("image_44")
    var image44: String? = null

    @SerialName("image_68")
    var image68: String? = null

    @SerialName("image_88")
    var image88: String? = null

    @SerialName("image_102")
    var image102: String? = null

    @SerialName("image_132")
    var image132: String? = null

    @SerialName("image_230")
    var image230: String? = null

    var isImageDefault: Boolean = false
}
