package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.block.composition.TextObject
import com.github.seratch.jslack.api.model.block.element.ImageElement

/**
 * Specific interface to make context layout blocks' [ elements][ContextBlock] type-safe, because ContextBlock can only contain
 * [ImageElement] and [TextObject] elements.
 *
 *
 * Slack Block Kit Reference: [Context
 * Block's elements](https://api.slack.com/reference/messaging/blocks#context)
 */
interface ContextBlockElement 
