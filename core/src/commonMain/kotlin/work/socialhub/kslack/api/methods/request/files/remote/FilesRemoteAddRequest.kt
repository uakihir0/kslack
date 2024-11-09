package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/files.remote.add
 */
@JsExport
class FilesRemoteAddRequest(
    /** Authentication token. Requires scope: `remote_files:write` */
    override var token: String?,
    /** Creator defined GUID for the file. */
    var externalId: String?,
    /** URL of the remote file. */
    var externalUrl: String?,
    /** Title of the file being shared. */
    var title: String?,
    /** Type of file */
    var filetype: String?,
    /** File containing contents that can be used to improve searchability for the remote file. */
    var indexableFileContents: ByteArray,
    /** Preview of the document via multipart/form-data. */
    var previewImage: ByteArray
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {

            it.addParam("external_id", externalId)
            it.addParam("external_url", externalUrl)
            it.addParam("title", title)
            it.addParam("filetype", filetype)

            /*
            TODO
            if (IndexableFileContents() != null) {
                RequestBody indexableFileContents = RequestBody.create(Filetype() != null ? MediaType.parse(Filetype) : null, IndexableFileContents);
                form.addFormDataPart("indexable_file_contents", Title(), indexableFileContents);
            }
            if (PreviewImage() != null) {
                RequestBody previewImage = RequestBody.create(Filetype() != null ? MediaType.parse(Filetype) : null, PreviewImage);
                form.addFormDataPart("preview_image", Title(), previewImage);
            }
            */
        }
    }
}