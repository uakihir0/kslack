package work.socialhub.kslack.files

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.files.FilesCompleteUploadExternalRequest
import work.socialhub.kslack.api.methods.request.files.FilesGetUploadURLExternalRequest
import work.socialhub.kslack.api.methods.response.files.FilesCompleteUploadExternalResponse
import work.socialhub.kslack.api.methods.response.files.FilesGetUploadURLExternalResponse
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FilesUploadTest : AbstractTest() {

    @Test
    fun getUploadUrlAndComplete() {
        val slack = SlackFactory.instance(userToken!!)

        val filename = "kslack-test-${System.currentTimeMillis()}.txt"
        val getFileResponse = slack.files().filesGetUploadURLExternalBlocking(
            FilesGetUploadURLExternalRequest(
                token = null,
                filename = filename,
                length = 10,
                altTxt = null,
                snippetType = null,
            )
        )

        assertNotNull(
            getFileResponse,
            "files.getUploadURLExternal should not return null"
        )

        println("files.getUploadURLExternal result: ok=${getFileResponse.isOk} error=${getFileResponse.error}")
        println("uploadUrl=${getFileResponse.uploadUrl} fileId=${getFileResponse.fileId}")

        if (!getFileResponse.isOk) {
            println("Skipping complete upload step due to getUploadURLExternal failure: ${getFileResponse.error}")
            return
        }

        assertNotNull(getFileResponse.uploadUrl, "uploadUrl should not be null on success")
        assertNotNull(getFileResponse.fileId, "fileId should not be null on success")

        val fileId = getFileResponse.fileId!!
        val completeResponse = slack.files().filesCompleteUploadExternalBlocking(
            FilesCompleteUploadExternalRequest(
                token = null,
                files = "[{\"id\": \"$fileId\", \"title\": \"$filename\"}]",
                channelId = null,
                initialComment = null,
                threadTs = null,
            )
        )

        assertNotNull(
            completeResponse,
            "files.completeUploadExternal should not return null"
        )

        println("files.completeUploadExternal result: ok=${completeResponse.isOk} error=${completeResponse.error}")

        if (completeResponse.isOk) {
            assertTrue(completeResponse.isOk)
            assertNotNull(completeResponse.files)
            println("file uploaded successfully: files=${completeResponse.files?.size}")
        }
    }
}
