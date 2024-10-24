package work.socialhub.kslack

import work.socialhub.kslack.api.methods.MethodsClient
import work.socialhub.kslack.api.methods.impl.AdminResourceImpl
import work.socialhub.kslack.api.methods.impl.MethodsClientImpl
import work.socialhub.kslack.api.status.StatusClient
import work.socialhub.kslack.api.status.impl.StatusClientImpl

/**
 * Slack Integrations
 * https://{your team name}.slack.com/apps/manage/custom-integrations
 */
class Slack {

    fun status(): StatusClient {
        return StatusClientImpl()
    }

    fun methods(
        token: String? = null
    ): MethodsClient {
        return MethodsClientImpl(token)
    }

    fun admin(
        token: String? = null
    ): AdminResourceImpl {
        return AdminResourceImpl(token)
    }

    companion object {
        fun getInstance(): Slack {
            return Slack()
        }
    }
}
