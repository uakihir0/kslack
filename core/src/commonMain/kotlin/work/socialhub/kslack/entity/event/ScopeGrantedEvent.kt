package work.socialhub.kslack.entity.event

/**
 *
 */
class ScopeGrantedEvent : Event {
    override val type: String = TYPE_NAME
    var scopes: Array<String>? = null
    var triggerId: String? = null

    companion object {
        const val TYPE_NAME: String = "scope_granted"
    }
}