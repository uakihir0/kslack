package work.socialhub.kslack.stream.internal

import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.event.*
import work.socialhub.kslack.stream.SlackStreamListener
import work.socialhub.khttpclient.HttpParameter
import work.socialhub.khttpclient.HttpRequest
import work.socialhub.khttpclient.HttpResponse
import work.socialhub.khttpclient.websocket.WebsocketRequest
import kotlinx.coroutines.*
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlin.js.JsExport

@JsExport
class SocketModeClient(
    private val token: String,
    private val listener: SlackStreamListener,
) {

    companion object {
        private const val INITIAL_RECONNECT_DELAY_MS = 1000L
        private const val MAX_RECONNECT_DELAY_MS = 30000L
        private const val SOCKET_MODE_ENDPOINT = "https://slack.com/api/apps.connections.open"
    }

    private var websocket: WebsocketRequest? = null
    private var isConnected: Boolean = false
    private var isIntentionallyClosed: Boolean = false
    private var currentReconnectDelay: Long = INITIAL_RECONNECT_DELAY_MS
    private var reconnectJob: Job? = null
    private var scope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    suspend fun start() {
        if (isConnected) return
        isIntentionallyClosed = false
        scope = CoroutineScope(Dispatchers.Default + SupervisorJob())
        currentReconnectDelay = INITIAL_RECONNECT_DELAY_MS
        connectWithRetry()
    }

    fun stop() {
        isIntentionallyClosed = true
        reconnectJob?.cancel()
        scope.cancel()
        try {
            websocket?.close()
        } catch (e: Exception) {
            // ignore
        }
        isConnected = false
        listener.onClose()
    }

    fun isConnected(): Boolean = isConnected

    private suspend fun connectWithRetry() {
        if (isIntentionallyClosed) return
        try {
            val wsUrl = fetchSocketModeUrl()
            openWebSocket(wsUrl)
        } catch (e: Exception) {
            listener.onError(e)
            scheduleReconnect()
        }
    }

    private suspend fun fetchSocketModeUrl(): String {
        val params = listOf(HttpParameter.param("token", token))
        val response = HttpRequest()
            .url(SOCKET_MODE_ENDPOINT)
            .also { it.params += params }
            .forceApplicationFormUrlEncoded(true)
            .post()
        return parseConnectionResponse(response)
    }

    private fun parseConnectionResponse(response: HttpResponse): String {
        val body = response.stringBody
        val resp = JsonHelper.fromJson<work.socialhub.kslack.api.methods.response.apps.connections.AppsConnectionsOpenResponse>(body)
        if (!resp.isOk) {
            throw IllegalStateException("Failed to get socket mode URL: ${resp.error}")
        }
        val url = resp.url ?: throw IllegalStateException("socket_mode_url is null in response")
        return url
    }

    private fun openWebSocket(wsUrl: String) {
        val ws = WebsocketRequest()
        ws.url(wsUrl)
        ws.textListener = { message -> onMessage(message) }
        ws.onOpenListener = {
            isConnected = true
            currentReconnectDelay = INITIAL_RECONNECT_DELAY_MS
            listener.onOpen()
        }
        ws.onCloseListener = {
            isConnected = false
            if (!isIntentionallyClosed) {
                scheduleReconnect()
            } else {
                listener.onClose()
            }
        }
        ws.onErrorListener = { error ->
            listener.onError(error)
            if (!isConnected) {
                scheduleReconnect()
            }
        }
        websocket = ws
        scope.launch {
            try {
                ws.open()
            } catch (e: Exception) {
                listener.onError(e)
                scheduleReconnect()
            }
        }
    }

    private fun onMessage(message: String) {
        try {
            val jsonElement = JsonHelper.json.parseToJsonElement(message)
            val envelopeId = jsonElement.jsonObject["envelope_id"]?.jsonPrimitive?.content ?: ""
            val type = jsonElement.jsonObject["type"]?.jsonPrimitive?.content

            if (type == "socket_mode_enqueue") {
                scope.launch { sendAck(envelopeId) }
                return
            }

            val wrapper = SlackEventParser.parseEvent(message)
            if (wrapper != null) {
                scope.launch { sendAck(envelopeId) }
                dispatchEvent(wrapper)
            } else if (type != null) {
                scope.launch { sendAck(envelopeId) }
            }
        } catch (e: Exception) {
            listener.onError(e)
        }
    }

    private suspend fun sendAck(envelopeId: String) {
        websocket?.sendText("""{"type":"ack","envelope_id":"$envelopeId"}""")
    }

    private fun dispatchEvent(wrapper: EventWrapper) {
        val event = wrapper.event
        when (event) {
            is AppMentionEvent -> listener.onAppMention(event)
            is AppRateLimitedEvent -> listener.onAppRateLimited(event)
            is ChannelCreatedEvent -> listener.onChannelCreated(event)
            is ChannelDeletedEvent -> listener.onChannelDeleted(event)
            is ChannelRenameEvent -> listener.onChannelRename(event)
            is ChannelArchiveEvent -> listener.onChannelArchive(event)
            is ChannelUnarchiveEvent -> listener.onChannelUnarchive(event)
            is ChannelHistoryChangedEvent -> listener.onChannelHistoryChanged(event)
            is ChannelJoinedEvent -> listener.onChannelJoined(event)
            is ChannelLeftEvent -> listener.onChannelLeft(event)
            is ChannelMarkedEvent -> listener.onChannelMarked(event)
            is MemberJoinedChannelEvent -> listener.onMemberJoinedChannel(event)
            is MemberLeftChannelEvent -> listener.onMemberLeftChannel(event)
            is ReactionAddedEvent -> listener.onReactionAdded(event)
            is ReactionRemovedEvent -> listener.onReactionRemoved(event)
            is FileSharedEvent -> listener.onFileShared(event)
            is FileDeletedEvent -> listener.onFileDeleted(event)
            is FileChangeEvent -> listener.onFileChanged(event)
            is FileCreatedEvent -> listener.onFileCreated(event)
            is FileUnsharedEvent -> listener.onFileUnshared(event)
            is MessageChangedEvent -> listener.onMessageChanged(event)
            is MessageDeletedEvent -> listener.onMessageDeleted(event)
            is MessageEvent -> listener.onMessage(event)
            is MessageMeEvent -> listener.onMeMessage(event)
            else -> {}
        }
    }

    private fun scheduleReconnect() {
        if (isIntentionallyClosed) return
        reconnectJob?.cancel()
        reconnectJob = scope.launch {
            delay(currentReconnectDelay)
            currentReconnectDelay = minOf(currentReconnectDelay * 2, MAX_RECONNECT_DELAY_MS)
            if (isIntentionallyClosed) return@launch
            try {
                val wsUrl = fetchSocketModeUrl()
                openWebSocket(wsUrl)
            } catch (e: Exception) {
                listener.onError(e)
                scheduleReconnect()
            }
        }
    }
}
