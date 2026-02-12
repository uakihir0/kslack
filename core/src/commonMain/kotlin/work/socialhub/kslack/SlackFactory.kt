package work.socialhub.kslack

import work.socialhub.kslack.internal.SlackImpl
import kotlin.js.JsExport
import kotlin.js.JsName

@JsExport
object SlackFactory {

    @JsName("createInstance")
    fun instance(): Slack {
        return SlackImpl()
    }

    @JsName("createInstanceWithToken")
    fun instance(
        token: String,
    ): Slack {
        return SlackImpl(token)
    }
}
