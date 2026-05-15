package work.socialhub.kslack.team

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.team.TeamInfoRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class TeamInfoTest : AbstractTest() {

    @Test
    fun testTeamInfo() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.team().teamInfoBlocking(
            TeamInfoRequest(token = null)
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.team)
        println("team: ${response.team?.name} id=${response.team?.id}")
    }
}
