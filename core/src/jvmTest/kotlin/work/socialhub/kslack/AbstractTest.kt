package work.socialhub.kslack

import kotlinx.serialization.json.Json
import java.io.File
import kotlin.test.BeforeTest

open class AbstractTest {

    protected val json = Json {
        ignoreUnknownKeys = true
    }

    protected var clientId: String? = null
    protected var clientSecret: String? = null
    protected var redirectUri: String? = null
    protected var userToken: String? = null

    @BeforeTest
    fun setupTest() {

        try {
            // Get credentials from environment variables.
            clientId = System.getenv("SLACK_CLIENT_ID")
                ?: System.getProperty("SLACK_CLIENT_ID")
            clientSecret = System.getenv("SLACK_CLIENT_SECRET")
                ?: System.getProperty("SLACK_CLIENT_SECRET")
            redirectUri = System.getenv("SLACK_REDIRECT_URI")
                ?: System.getProperty("SLACK_REDIRECT_URI")
            userToken = System.getenv("SLACK_USER_TOKEN")
                ?: System.getProperty("SLACK_USER_TOKEN")
        } catch (_: Exception) {
        }

        if (clientId == null || clientSecret == null || redirectUri == null) {
            try {
                // Get credentials from secrets.json file.
                readTestProps()?.get("slack")?.let {
                    clientId = checkNotNull(it["SLACK_CLIENT_ID"])
                    clientSecret = checkNotNull(it["SLACK_CLIENT_SECRET"])
                    redirectUri = checkNotNull(it["SLACK_REDIRECT_URI"])
                    userToken = it["SLACK_USER_TOKEN"]
                }
            } catch (_: Exception) {
            }
        }

        if (clientId == null || clientSecret == null || redirectUri == null) {
            throw IllegalStateException(
                """!!!
                No credentials exist for testing.
                Set the environment variables SLACK_CLIENT_ID, SLACK_CLIENT_SECRET and SLACK_REDIRECT_URI
                or copy the following file and describe its contents.
                `cp secrets.json.default secrets.json`
                !!!""".trimIndent()
            )
        }
    }

    /**
     * Read Test Properties
     */
    private fun readTestProps(): Map<String, Map<String, String>>? {
        return try {
            val jsonStr = File("../secrets.json").readText()
            json.decodeFromString<Map<String, Map<String, String>>>(jsonStr)
        } catch (e: Exception) {
            null
        }
    }
}
