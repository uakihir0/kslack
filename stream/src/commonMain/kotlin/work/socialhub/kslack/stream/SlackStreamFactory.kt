package work.socialhub.kslack.stream

import work.socialhub.kslack.stream.internal.SlackStreamImpl
import kotlin.js.JsExport

@JsExport
object SlackStreamFactory {

    /**
     * get SlackStream instance
     */
    fun instance(
        token: String = "",
    ): SlackStream {
        return SlackStreamImpl(token)
    }
}
