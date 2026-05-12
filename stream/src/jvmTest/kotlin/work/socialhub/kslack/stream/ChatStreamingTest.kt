package work.socialhub.kslack.stream

import work.socialhub.kslack.entity.event.MessageEvent
import work.socialhub.kslack.stream.internal.SlackStreamImpl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ChatStreamingTest {

    private val testToken = "xapp-test-token-12345"

    @Test
    fun createStreamInstance() {
        val stream = SlackStreamImpl(testToken)
        assertEquals(testToken, stream.token())
        assertFalse(stream.isConnected())
    }

    @Test
    fun addAndRemoveEventListener() {
        val stream = SlackStreamImpl(testToken)
        val listener = object : SlackStreamListener {}

        stream.addEventListener(listener)
        stream.removeEventListener(listener)
    }

    @Test
    fun broadcastToMultipleListeners() {
        var capturedEvent1: MessageEvent? = null
        var capturedEvent2: MessageEvent? = null

        val stream = SlackStreamImpl(testToken)

        val listener1 = object : SlackStreamListener {
            override fun onMessage(event: MessageEvent) {
                capturedEvent1 = event
            }
        }

        val listener2 = object : SlackStreamListener {
            override fun onMessage(event: MessageEvent) {
                capturedEvent2 = event
            }
        }

        stream.addEventListener(listener1)
        stream.addEventListener(listener2)

        val testEvent = MessageEvent().apply {
            user = "U123"
            text = "test message"
            ts = "1234567890.123456"
        }

        listener1.onMessage(testEvent)
        listener2.onMessage(testEvent)

        assertNotNull(capturedEvent1)
        assertNotNull(capturedEvent2)
        assertEquals("U123", capturedEvent1!!.user)
        assertEquals("U123", capturedEvent2!!.user)
    }

    @Test
    fun isConnectedReturnsFalseWithoutStart() {
        val stream = SlackStreamImpl(testToken)
        assertFalse(stream.isConnected())
    }

    @Test
    fun stopWithoutStart() {
        val stream = SlackStreamImpl(testToken)
        stream.stop()
        assertFalse(stream.isConnected())
    }
}
