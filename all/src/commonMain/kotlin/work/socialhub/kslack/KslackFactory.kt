package work.socialhub.kslack

import kotlin.js.JsExport

@JsExport
object KslackFactory {

    fun instance(): Slack {
        return SlackFactory.instance()
    }
}