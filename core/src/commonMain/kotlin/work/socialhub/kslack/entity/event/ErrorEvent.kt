package work.socialhub.kslack.entity.event

/**
 * If there was a problem connecting an error will be returned,
 * including a descriptive error message:
 *
 * <pre>
 * {
 * "type": "error",
 * "error": {
 * "code": 1,
 * "msg": "Socket URL has expired"
 * }
 * }
</pre> *
 *
 *
 * https://api.slack.com/rtm
 */
class ErrorEvent : Event {
    override val type: String = TYPE_NAME
    var error: Error? = null

    class Error {
        var code: Int? = null
        var msg: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "error"
    }
}