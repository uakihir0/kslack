package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.SlackApiRequest

class DndEndDndRequest(
    /** Authentication token. Requires scope: `dnd:write` */
    override var token: String?
) : SlackApiRequest