package work.socialhub.kslack.entity.block.composition

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.ContextBlockElement
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
@JsExport
@Serializable
abstract class TextObject : ContextBlockElement
