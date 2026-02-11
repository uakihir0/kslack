package work.socialhub.kslack

import work.socialhub.kslack.internal.SlackImpl
import kotlin.js.JsExport

@JsExport
object SlackFactory {

    fun instance(): Slack {
        return SlackImpl()
    }

    fun instance(
        token: String,
    ): Slack {
        return SlackImpl(token)
    }
}
