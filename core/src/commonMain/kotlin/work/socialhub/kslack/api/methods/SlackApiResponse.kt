package work.socialhub.kslack.api.methods

interface SlackApiResponse {
    var isOk: Boolean
    var warning: String?
    var error: String?
    // only when having a permission error
    var needed: String?
    var provided: String?
}
