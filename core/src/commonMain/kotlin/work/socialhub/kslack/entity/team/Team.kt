package work.socialhub.kslack.entity.team

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Team {

    var id: String? = null
    var name: String? = null
    var domain: String? = null

    @SerialName("email_domain")
    var emailDomain: String? = null

    var icon: TeamIcon? = null
    var url: String? = null


    @SerialName("enterprise_id")
    var enterpriseId: String? = null

    @SerialName("enterprise_name")
    var enterpriseName: String? = null

    @SerialName("enterprise_domain")
    var enterpriseDomain: String? = null


    @SerialName("default_channels")
    var defaultChannels: Array<String>? = null

    @SerialName("is_verified")
    var isVerified: Boolean? = null

    @SerialName("discoverable")
    var discoverable: String? = null // "invite_only"

    @SerialName("avatar_base_url")
    var avatarBaseUrl: String? = null

    @SerialName("lob_sales_home_enabled")
    var lobSalesHomeEnabled: Boolean? = null


    class Profile {
        var id: String? = null
        var fieldName: String? = null
        var ordering: Int? = null
        var label: String? = null
        var hint: String? = null
        var type: String? = null
        var possibleValues: Array<String>? = null
        var options: ProfileOptions? = null

        @SerialName("is_hidden")
        var isHidden: Boolean = false
    }

    class ProfileOptions {
        @SerialName("is_protected")
        var isProtected: Boolean = false

        fun is_protected(): Boolean {
            return this.isProtected
        }

        fun set_protected(_protected: Boolean) {
            this.isProtected = _protected
        }
    }
}
