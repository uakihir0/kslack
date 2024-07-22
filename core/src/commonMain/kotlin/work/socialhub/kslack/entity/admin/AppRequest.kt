package work.socialhub.kslack.entity.admin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/admin/AppRequest.java
 */
@JsExport
@Serializable
class AppRequest {

    var id: String? = null
    var app: App? = null
    var user: User? = null
    var team: Team? = null
    var scopes: Array<Scope>? = null

    @SerialName("previous_resolution")
    var previousResolution: PreviousResolution? = null

    @SerialName("is_user_app_collaborator")
    var isUserAppCollaborator: Boolean? = null

    var message: String? = null

    @SerialName("date_created")
    var dateCreated: Int? = null
}