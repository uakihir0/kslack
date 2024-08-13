package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsSetTopicRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** The new topic */
    var channel: String?,
    /** Private channel to set the topic of */
    var topic: String?
) : SlackApiRequest