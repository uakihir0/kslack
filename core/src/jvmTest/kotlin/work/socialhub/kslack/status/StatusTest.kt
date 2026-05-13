package work.socialhub.kslack.status

import work.socialhub.kslack.SlackFactory
import kotlin.test.Test
import kotlin.test.assertNotNull

class StatusTest {

    @Test
    fun testCurrentStatus() {
        val slack = SlackFactory.instance()
        val status = slack.status().currentBlocking()
        assertNotNull(status)
        assertNotNull(status.status)
        println("Slack status: ${status.status}")
    }

    @Test
    fun testStatusHistory() {
        val slack = SlackFactory.instance()
        val history = slack.status().historyBlocking()
        assertNotNull(history)
        println("Slack history incidents: ${history.size}")
    }
}
