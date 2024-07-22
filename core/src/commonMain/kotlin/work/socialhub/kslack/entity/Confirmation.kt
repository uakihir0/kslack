package work.socialhub.kslack.entity

class Confirmation {
    companion object {
        const val OKAY: String = "Okay"
        const val DISMISS: String = "Cancel"
    }

    var title: String? = null
    var text: String? = null
    var okText: String? = OKAY
    var dismissText: String? = DISMISS
}
