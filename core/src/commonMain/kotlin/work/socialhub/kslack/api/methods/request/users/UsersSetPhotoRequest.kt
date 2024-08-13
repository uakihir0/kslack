package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * Set the user profile photo
 */
class UsersSetPhotoRequest(
    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    override var token: String?, image: java.io.File?, imageData: ByteArray, cropX: Int?, cropY: Int?, cropW: Int?
) : SlackApiRequest {
    /**
     * File contents via `multipart/form-data`.
     */
    private var image: java.io.File?
    var imageData: ByteArray

    /**
     * X coordinate of top-left corner of crop box
     */
    var cropX: Int?

    /**
     * Y coordinate of top-left corner of crop box
     */
    var cropY: Int?

    /**
     * Width/height of crop box (always square)
     */
    var cropW: Int?

    init {
        this.image = image
        this.imageData = imageData
        this.cropX = cropX
        this.cropY = cropY
        this.cropW = cropW
    }

    fun getImage(): java.io.File? {
        return this.image
    }

    fun setImage(image: java.io.File?) {
        this.image = image
    }

    class UsersSetPhotoRequestBuilder() {
        private var token: String? = null
        private var image: java.io.File? = null
        private var imageData: ByteArray
        private var cropX: Int? = null
        private var cropY: Int? = null
        private var cropW: Int? = null

        fun token(token: String?): UsersSetPhotoRequestBuilder {
            this.token = token
            return this
        }

        fun image(image: java.io.File?): UsersSetPhotoRequestBuilder {
            this.image = image
            return this
        }

        fun imageData(imageData: ByteArray): UsersSetPhotoRequestBuilder {
            this.imageData = imageData
            return this
        }

        fun cropX(cropX: Int?): UsersSetPhotoRequestBuilder {
            this.cropX = cropX
            return this
        }

        fun cropY(cropY: Int?): UsersSetPhotoRequestBuilder {
            this.cropY = cropY
            return this
        }

        fun cropW(cropW: Int?): UsersSetPhotoRequestBuilder {
            this.cropW = cropW
            return this
        }

        fun build(): UsersSetPhotoRequest {
            return UsersSetPhotoRequest(token, image, imageData, cropX, cropY, cropW)
        }

        override fun toString(): String {
            return "UsersSetPhotoRequest.UsersSetPhotoRequestBuilder(token=" + this.token + ", image=" + this.image + ", imageData=" + imageData.contentToString() + ", cropX=" + this.cropX + ", cropY=" + this.cropY + ", cropW=" + this.cropW + ")"
        }
    }

    companion object {
        fun builder(): UsersSetPhotoRequestBuilder {
            return UsersSetPhotoRequestBuilder()
        }
    }
}
