package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

class BotProfile {
    var id: String? = null // B00000000
    var isDeleted: Boolean = false
    var name: String? = null
    var updated: Int? = null
    var appId: String? = null // A00000000
    var icons: Icons? = null
    var teamId: String? = null

    class Icons {
        @SerializedName("image_36")
        var image36: String? = null

        @SerializedName("image_48")
        var image48: String? = null

        @SerializedName("image_72")
        var image72: String? = null
    }
}
