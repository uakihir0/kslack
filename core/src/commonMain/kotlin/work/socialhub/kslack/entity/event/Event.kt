package work.socialhub.kslack.entity.event

interface Event : java.io.Serializable {
    val type: String?

    val subtype: String?
        get() = null
}
