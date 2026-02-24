package work.socialhub.kslack.stream

import kotlin.js.JsExport

@JsExport
interface SlackStream {

    fun token(): String
}
