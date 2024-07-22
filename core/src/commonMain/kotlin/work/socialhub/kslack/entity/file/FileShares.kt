package work.socialhub.kslack.entity.file

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class FileShares {

    /** The key of the Map: channel ID */
    @SerialName("public")
    var publicChannels: Map<String, Array<FileShareDetail>>? = null

    /** The key of the Map: channel ID */
    @SerialName("private")
    var privateChannels: Map<String, Array<FileShareDetail>>? = null
}