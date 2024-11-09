package work.socialhub.kslack.entity.dnd

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class DndTeamMemberInfo {
    var isDndEnabled: Boolean = false
    var nextDndStartTs: Int? = null
    var nextDndEndTs: Int? = null
}