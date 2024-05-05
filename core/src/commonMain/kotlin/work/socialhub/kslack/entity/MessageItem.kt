package work.socialhub.kslack.entity

@Deprecated("")
class MessageItem {
    var type: String? = null
    var channel: String? = null
    var message: Message? = null
    var file: File? = null
    var comment: FileComment? = null
    var created: Int? = null
}
