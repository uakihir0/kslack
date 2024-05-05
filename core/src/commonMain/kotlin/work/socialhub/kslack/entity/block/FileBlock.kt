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

    constructor(blockId: String?, externalId: String?, source: String?) {
        this.blockId = blockId
        this.externalId = externalId
        this.source = source
    }

    constructor()

    class FileBlockBuilder internal constructor() {
        private var blockId: String? = null
        private var externalId: String? = null
        private var source: String? = null

        fun blockId(blockId: String?): FileBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun externalId(externalId: String?): FileBlockBuilder {
            this.externalId = externalId
            return this
        }

        fun source(source: String?): FileBlockBuilder {
            this.source = source
            return this
        }

        fun build(): FileBlock {
            return FileBlock(blockId, externalId, source)
        }

        override fun toString(): String {
            return "FileBlock.FileBlockBuilder(blockId=" + this.blockId + ", externalId=" + this.externalId + ", source=" + this.source + ")"
        }
    }

    companion object {
        const val TYPE: String = "file"
        fun builder(): FileBlockBuilder {
            return FileBlockBuilder()
        }
    }
}
