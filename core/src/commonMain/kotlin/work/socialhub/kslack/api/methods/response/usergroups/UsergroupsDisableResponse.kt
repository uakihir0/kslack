package work.socialhub.kslack.api.methods.response.usergroups

import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.user.UserGroup

class UsergroupsDisableResponse : SlackApiResponse() {
    var usergroup: UserGroup? = null
}