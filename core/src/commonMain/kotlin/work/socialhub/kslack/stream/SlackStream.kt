package work.socialhub.kslack.stream

import kotlin.js.JsExport

@JsExport
interface SlackStream {

    fun token(): String

    suspend fun start()

    fun stop()

    fun isConnected(): Boolean

    fun addEventListener(listener: SlackStreamListener)

    fun removeEventListener(listener: SlackStreamListener)
}
