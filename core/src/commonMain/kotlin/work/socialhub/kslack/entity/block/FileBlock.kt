package work.socialhub.kslack.entity.block

/**
 * https://api.slack.com/reference/messaging/blocks#file
 */
class FileBlock : LayoutBlock {
    // The type of block. For a context block, type is always file.
    override val type: String = TYPE

    // A string acting as a unique identifier for a block.
    // You can use this block_id when you receive an interaction payload to identify the source of the action.
    // If not specified, a block_id will be generated. Maximum length for this field is 255 characters.
    var blockId: String? = null

    // 	The external unique ID for this file.
    var externalId: String? = null

    // 	At the moment, source will always be remote for a remote file.
    var source: String? = null // "remote"
}
