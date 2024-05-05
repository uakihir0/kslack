package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

class TeamIcon {
    var imageOriginal: String? = null

    @SerializedName("image_34")
    var image34: String? = null

    @SerializedName("image_44")
    var image44: String? = null

    @SerializedName("image_68")
    var image68: String? = null

    @SerializedName("image_88")
    var image88: String? = null

    @SerializedName("image_102")
    var image102: String? = null

    @SerializedName("image_132")
    var image132: String? = null

    @SerializedName("image_230")
    var image230: String? = null

    var isImageDefault: Boolean = false
}
