package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject

/**
 * https://api.slack.com/reference/messaging/blocks#image
 */
class ImageBlock : LayoutBlock {
    override val type: String = TYPE
    var fallback: String? = null

    var imageUrl: String? = null
    var imageWidth: Int? = null
    var imageHeight: Int? = null
    var imageBytes: Int? = null

    var altText: String? = null
    private var title: PlainTextObject? = null
    var blockId: String? = null

    constructor(
        fallback: String?,
        imageUrl: String?,
        imageWidth: Int?,
        imageHeight: Int?,
        imageBytes: Int?,
        altText: String?,
        title: PlainTextObject?,
        blockId: String?
    ) {
        this.fallback = fallback
        this.imageUrl = imageUrl
        this.imageWidth = imageWidth
        this.imageHeight = imageHeight
        this.imageBytes = imageBytes
        this.altText = altText
        this.title = title
        this.blockId = blockId
    }

    constructor()

    fun getTitle(): PlainTextObject? {
        return this.title
    }

    fun setTitle(title: PlainTextObject?) {
        this.title = title
    }

    class ImageBlockBuilder internal constructor() {
        private var fallback: String? = null
        private var imageUrl: String? = null
        private var imageWidth: Int? = null
        private var imageHeight: Int? = null
        private var imageBytes: Int? = null
        private var altText: String? = null
        private var title: PlainTextObject? = null
        private var blockId: String? = null

        fun fallback(fallback: String?): ImageBlockBuilder {
            this.fallback = fallback
            return this
        }

        fun imageUrl(imageUrl: String?): ImageBlockBuilder {
            this.imageUrl = imageUrl
            return this
        }

        fun imageWidth(imageWidth: Int?): ImageBlockBuilder {
            this.imageWidth = imageWidth
            return this
        }

        fun imageHeight(imageHeight: Int?): ImageBlockBuilder {
            this.imageHeight = imageHeight
            return this
        }

        fun imageBytes(imageBytes: Int?): ImageBlockBuilder {
            this.imageBytes = imageBytes
            return this
        }

        fun altText(altText: String?): ImageBlockBuilder {
            this.altText = altText
            return this
        }

        fun title(title: PlainTextObject?): ImageBlockBuilder {
            this.title = title
            return this
        }

        fun blockId(blockId: String?): ImageBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun build(): ImageBlock {
            return ImageBlock(fallback, imageUrl, imageWidth, imageHeight, imageBytes, altText, title, blockId)
        }

        override fun toString(): String {
            return "ImageBlock.ImageBlockBuilder(fallback=" + this.fallback + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageBytes=" + this.imageBytes + ", altText=" + this.altText + ", title=" + this.title + ", blockId=" + this.blockId + ")"
        }
    }

    companion object {
        const val TYPE: String = "image"
        fun builder(): ImageBlockBuilder {
            return ImageBlockBuilder()
        }
    }
}
