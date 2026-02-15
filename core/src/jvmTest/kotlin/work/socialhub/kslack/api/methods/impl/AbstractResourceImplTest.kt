package work.socialhub.kslack.api.methods.impl

import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AbstractResourceImplTest {

    @Test
    fun getTokenUsesRequestTokenWhenProvided() {
        val resource = TestResource(token = "factory-token")

        val token = resource.resolveToken(AuthTestRequest(token = "request-token"))

        assertEquals("request-token", token)
    }

    @Test
    fun getTokenUsesFactoryTokenWhenRequestTokenIsMissing() {
        val resource = TestResource(token = "factory-token")

        val token = resource.resolveToken(AuthTestRequest(token = null))

        assertEquals("factory-token", token)
    }

    @Test
    fun getTokenThrowsClearMessageWhenNoTokenExists() {
        val resource = TestResource(token = null)

        val exception = assertFailsWith<IllegalStateException> {
            resource.resolveToken(AuthTestRequest(token = null))
        }

        assertEquals(
            "This API requires an access token. Provide it via SlackFactory.instance(token) or request.token.",
            exception.message
        )
    }

    private class TestResource(token: String?) : AbstractResourceImpl(token) {
        fun resolveToken(request: AuthTestRequest): String = getToken(request)
    }
}
