package work.socialhub.kslack

import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson
import java.io.File
import kotlin.test.BeforeTest

open class AbstractTest {
    protected lateinit var clientId: String
    protected lateinit var clientSecret: String
    protected lateinit var redirectUri: String
    protected var userToken: String? = null

    @BeforeTest
    fun setupTest() {
        try {
            // Get account handle and password.
            val json = readFile("../secrets.json")
            val props = fromJson<Map<String, String>>(json!!)

            clientId = checkNotNull(props["client_id"]) { "missing client id." }
            clientSecret = checkNotNull(props["client_secret"]) { "missing client secret." }
            redirectUri = checkNotNull(props["redirect_uri"]) { "missing redirect uri." }
            userToken = props["user_token"]

        } catch (e: Exception) {
            println(
                """
                !!!
                No credentials exist for testing. 
                Please copy the following file and describe its contents.
                `cp secrets.json.default secrets.json`
                !!!
            """.trimIndent()
            )
            e.printStackTrace()
        }
    }

    /**
     * Read File
     */
    private fun readFile(file: String): String? {
        return try {
            File(file).readText()
        } catch (e: Exception) {
            null
        }
    }

    /**
     * Save File
     */
    private fun saveFile(str: String?, file: String) {
        try {
            File(file).writeText(str!!)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
