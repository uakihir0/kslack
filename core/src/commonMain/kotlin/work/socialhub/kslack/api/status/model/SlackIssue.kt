package work.socialhub.kslack.api.status.model

class SlackIssue {
    var id: Int? = null
    var dateCreated: String? = null
    var dateUpdated: String? = null
    var title: String? = null
    var type: String? = null
    var status: String? = null
    var url: String? = null
    var services: Array<String>? = null
    var notes: Array<Note>? = null

    class Note {
        var dateCreated: String? = null
        var body: String? = null
    }
}
