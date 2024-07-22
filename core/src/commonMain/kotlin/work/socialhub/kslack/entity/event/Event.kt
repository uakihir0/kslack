package work.socialhub.kslack.entity.event

interface Event {
    val type: String?

    val subtype: String?
        get() = null
}
