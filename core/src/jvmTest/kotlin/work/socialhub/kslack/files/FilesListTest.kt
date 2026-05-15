package work.socialhub.kslack.files

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.files.FilesListRequest
import kotlin.test.Test
import kotlin.test.assertTrue

class FilesListTest : AbstractTest() {

    @Test
    fun testFilesList() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.files().filesListBlocking(
            FilesListRequest(
                token = null,
                user = null,
                channel = null,
                tsFrom = null,
                tsTo = null,
                types = null,
                count = null,
                page = null,
                isShowFilesHiddenByLimit = false,
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        println("files count: ${response.files?.size}")
    }
}
