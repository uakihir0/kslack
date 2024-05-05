package work.socialhub.kslack.entity.block.element

import com.github.seratch.jslack.api.model.block.ContextBlockElement

/**
 * https://api.slack.com/reference/messaging/block-elements#image
 */
class ImageElement : BlockElement, ContextBlockElement {
    val type: String = TYPE
    var fallback: String? = null
    var imageUrl: String? = null
    var imageWidth: Int? = null
    var imageHeight: Int? = null
    var imageBytes: Int? = null
    var altText: String? = null

    constructor(
        fallback: String?,
        imageUrl: String?,
        imageWidth: Int?,
        imageHeight: Int?,
        imageBytes: Int?,
        altText: String?
    ) {
        this.fallback = fallback
        this.imageUrl = imageUrl
        this.imageWidth = imageWidth
        this.imageHeight = imageHeight
        this.imageBytes = imageBytes
        this.altText = altText
    }

    constructor()

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is ImageElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$fallback`: Any? = this.fallback
        val `other$fallback`: Any? = other.fallback
        if (if (`this$fallback` == null) `other$fallback` != null else `this$fallback` != `other$fallback`) return false
        val `this$imageUrl`: Any? = this.imageUrl
        val `other$imageUrl`: Any? = other.imageUrl
        if (if (`this$imageUrl` == null) `other$imageUrl` != null else `this$imageUrl` != `other$imageUrl`) return false
        val `this$imageWidth`: Any? = this.imageWidth
        val `other$imageWidth`: Any? = other.imageWidth
        if (if (`this$imageWidth` == null) `other$imageWidth` != null else `this$imageWidth` != `other$imageWidth`) return false
        val `this$imageHeight`: Any? = this.imageHeight
        val `other$imageHeight`: Any? = other.imageHeight
        if (if (`this$imageHeight` == null) `other$imageHeight` != null else `this$imageHeight` != `other$imageHeight`) return false
        val `this$imageBytes`: Any? = this.imageBytes
        val `other$imageBytes`: Any? = other.imageBytes
        if (if (`this$imageBytes` == null) `other$imageBytes` != null else `this$imageBytes` != `other$imageBytes`) return false
        val `this$altText`: Any? = this.altText
        val `other$altText`: Any? = other.altText
        if (if (`this$altText` == null) `other$altText` != null else `this$altText` != `other$altText`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is ImageElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$fallback`: Any? = this.fallback
        result = result * PRIME + (`$fallback`?.hashCode() ?: 43)
        val `$imageUrl`: Any? = this.imageUrl
        result = result * PRIME + (`$imageUrl`?.hashCode() ?: 43)
        val `$imageWidth`: Any? = this.imageWidth
        result = result * PRIME + (`$imageWidth`?.hashCode() ?: 43)
        val `$imageHeight`: Any? = this.imageHeight
        result = result * PRIME + (`$imageHeight`?.hashCode() ?: 43)
        val `$imageBytes`: Any? = this.imageBytes
        result = result * PRIME + (`$imageBytes`?.hashCode() ?: 43)
        val `$altText`: Any? = this.altText
        result = result * PRIME + (`$altText`?.hashCode() ?: 43)
        return result
    }

    class ImageElementBuilder internal constructor() {
        private var fallback: String? = null
        private var imageUrl: String? = null
        private var imageWidth: Int? = null
        private var imageHeight: Int? = null
        private var imageBytes: Int? = null
        private var altText: String? = null

        fun fallback(fallback: String?): ImageElementBuilder {
            this.fallback = fallback
            return this
        }

        fun imageUrl(imageUrl: String?): ImageElementBuilder {
            this.imageUrl = imageUrl
            return this
        }

        fun imageWidth(imageWidth: Int?): ImageElementBuilder {
            this.imageWidth = imageWidth
            return this
        }

        fun imageHeight(imageHeight: Int?): ImageElementBuilder {
            this.imageHeight = imageHeight
            return this
        }

        fun imageBytes(imageBytes: Int?): ImageElementBuilder {
            this.imageBytes = imageBytes
            return this
        }

        fun altText(altText: String?): ImageElementBuilder {
            this.altText = altText
            return this
        }

        fun build(): ImageElement {
            return ImageElement(fallback, imageUrl, imageWidth, imageHeight, imageBytes, altText)
        }

        override fun toString(): String {
            return "ImageElement.ImageElementBuilder(fallback=" + this.fallback + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageBytes=" + this.imageBytes + ", altText=" + this.altText + ")"
        }
    }

    companion object {
        const val TYPE: String = "image"
        fun builder(): ImageElementBuilder {
            return ImageElementBuilder()
        }
    }
}
