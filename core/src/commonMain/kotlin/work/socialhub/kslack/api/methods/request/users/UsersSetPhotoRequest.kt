package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * Set the user profile photo
 */
@JsExport
class UsersSetPhotoRequest(
    /** Authentication token. Requires scope: `users.profile:write` */
    override var token: String?,
    /** File contents via `multipart/form-data`. */
    var imageData: ByteArray,

    /** X coordinate of top-left corner of crop box */
    var cropX: Int?,
    /** Y coordinate of top-left corner of crop box */
    var cropY: Int?,
    /** Width/height of crop box (always square) */
    var cropW: Int?,
) : SlackApiRequest, FormRequest {
    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {

//            MultipartBody.Builder form = new MultipartBody.Builder();
//            if (ImageData() != null) {
//                RequestBody image = RequestBody.create(MediaType.parse("imageData/*"), ImageData);
//                form.addFormDataPart("image", "image", image);
//            } else if (Image() != null) {
//                RequestBody image = RequestBody.create(MediaType.parse("imageData/*"), Image);
//                form.addFormDataPart("image", "image", image);
//            }
//            it.addParam("crop_x", CropX);
//            it.addParam("crop_y", CropY);
//            it.addParam("crop_w", CropW);
//            return form;
        }
    }
}