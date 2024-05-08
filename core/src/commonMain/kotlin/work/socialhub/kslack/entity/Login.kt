package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/Login.java
 */
@JsExport
@Serializable
class Login {
    var userId: String? = null
    var username: String? = null
    var dateFirst: Int? = null
    var dateLast: Int? = null
    var count: Int? = null
    var ip: String? = null
    var userAgent: String? = null
    var isp: String? = null
    var country: String? = null
    var region: String? = null
}
