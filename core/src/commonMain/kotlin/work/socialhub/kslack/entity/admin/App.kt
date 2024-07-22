package work.socialhub.kslack.entity.admin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class App {

    var id: String? = null
    var name: String? = null
    var description: String? = null

    @SerialName("help_url")
    var helpUrl: String? = null

    @SerialName("privacy_policy_url")
    var privacyPolicyUrl: String? = null

    @SerialName("app_homepage_url")
    var appHomepageUrl: String? = null

    @SerialName("app_directory_url")
    var appDirectoryUrl: String? = null

    @SerialName("is_app_directory_approved")
    var isAppDirectoryApproved = false

    @SerialName("is_internal")
    var isInternal = false

    @SerialName("additional_info")
    var additionalInfo: String? = null

    var icons: AppIcons? = null
}