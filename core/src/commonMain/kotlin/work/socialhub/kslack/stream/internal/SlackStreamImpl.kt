package work.socialhub.kslack.stream.internal

import kotlin.concurrent.atomics.AtomicReference
import kotlin.concurrent.atomics.ExperimentalAtomicApi
import work.socialhub.kslack.stream.SlackStream
import work.socialhub.kslack.stream.SlackStreamListener

@OptIn(ExperimentalAtomicApi::class)
class SlackStreamImpl(
    private val token: String?,
) : SlackStream, SlackStreamListener {

    private val client = SocketModeClient(token ?: "", this)
    private val listenersRef = AtomicReference(emptyList<SlackStreamListener>())

    override fun token(): String {
        return token ?: ""
    }

    override suspend fun start() {
        client.start()
    }

    override fun stop() {
        client.stop()
    }

    override fun isConnected(): Boolean {
        return client.isConnected()
    }

    override fun addEventListener(listener: SlackStreamListener) {
        while (true) {
            val current = listenersRef.load()
            if (listenersRef.compareAndSet(current, current + listener)) break
        }
    }

    override fun removeEventListener(listener: SlackStreamListener) {
        while (true) {
            val current = listenersRef.load()
            if (listenersRef.compareAndSet(current, current - listener)) break
        }
    }

    private fun forEachListener(action: (SlackStreamListener) -> Unit) {
        listenersRef.load().forEach { listener ->
            try {
                action(listener)
            } catch (_: Exception) {
            }
        }
    }

    override fun onAppMention(event: work.socialhub.kslack.entity.event.AppMentionEvent) {
        forEachListener { it.onAppMention(event) }
    }

    override fun onAppRateLimited(event: work.socialhub.kslack.entity.event.AppRateLimitedEvent) {
        forEachListener { it.onAppRateLimited(event) }
    }

    override fun onChannelArchive(event: work.socialhub.kslack.entity.event.ChannelArchiveEvent) {
        forEachListener { it.onChannelArchive(event) }
    }

    override fun onChannelCreated(event: work.socialhub.kslack.entity.event.ChannelCreatedEvent) {
        forEachListener { it.onChannelCreated(event) }
    }

    override fun onChannelDeleted(event: work.socialhub.kslack.entity.event.ChannelDeletedEvent) {
        forEachListener { it.onChannelDeleted(event) }
    }

    override fun onChannelHistoryChanged(event: work.socialhub.kslack.entity.event.ChannelHistoryChangedEvent) {
        forEachListener { it.onChannelHistoryChanged(event) }
    }

    override fun onChannelJoined(event: work.socialhub.kslack.entity.event.ChannelJoinedEvent) {
        forEachListener { it.onChannelJoined(event) }
    }

    override fun onChannelLeft(event: work.socialhub.kslack.entity.event.ChannelLeftEvent) {
        forEachListener { it.onChannelLeft(event) }
    }

    override fun onChannelMarked(event: work.socialhub.kslack.entity.event.ChannelMarkedEvent) {
        forEachListener { it.onChannelMarked(event) }
    }

    override fun onChannelRename(event: work.socialhub.kslack.entity.event.ChannelRenameEvent) {
        forEachListener { it.onChannelRename(event) }
    }

    override fun onChannelUnarchive(event: work.socialhub.kslack.entity.event.ChannelUnarchiveEvent) {
        forEachListener { it.onChannelUnarchive(event) }
    }

    override fun onFileChanged(event: work.socialhub.kslack.entity.event.FileChangeEvent) {
        forEachListener { it.onFileChanged(event) }
    }

    override fun onFileCreated(event: work.socialhub.kslack.entity.event.FileCreatedEvent) {
        forEachListener { it.onFileCreated(event) }
    }

    override fun onFileDeleted(event: work.socialhub.kslack.entity.event.FileDeletedEvent) {
        forEachListener { it.onFileDeleted(event) }
    }

    override fun onFileShared(event: work.socialhub.kslack.entity.event.FileSharedEvent) {
        forEachListener { it.onFileShared(event) }
    }

    override fun onFileUnshared(event: work.socialhub.kslack.entity.event.FileUnsharedEvent) {
        forEachListener { it.onFileUnshared(event) }
    }

    override fun onMemberJoinedChannel(event: work.socialhub.kslack.entity.event.MemberJoinedChannelEvent) {
        forEachListener { it.onMemberJoinedChannel(event) }
    }

    override fun onMemberLeftChannel(event: work.socialhub.kslack.entity.event.MemberLeftChannelEvent) {
        forEachListener { it.onMemberLeftChannel(event) }
    }

    override fun onMessageChanged(event: work.socialhub.kslack.entity.event.MessageChangedEvent) {
        forEachListener { it.onMessageChanged(event) }
    }

    override fun onMessageDeleted(event: work.socialhub.kslack.entity.event.MessageDeletedEvent) {
        forEachListener { it.onMessageDeleted(event) }
    }

    override fun onMessage(event: work.socialhub.kslack.entity.event.MessageEvent) {
        forEachListener { it.onMessage(event) }
    }

    override fun onMeMessage(event: work.socialhub.kslack.entity.event.MessageMeEvent) {
        forEachListener { it.onMeMessage(event) }
    }

    override fun onReactionAdded(event: work.socialhub.kslack.entity.event.ReactionAddedEvent) {
        forEachListener { it.onReactionAdded(event) }
    }

    override fun onReactionRemoved(event: work.socialhub.kslack.entity.event.ReactionRemovedEvent) {
        forEachListener { it.onReactionRemoved(event) }
    }

    override fun onAppHomeOpened(event: work.socialhub.kslack.entity.event.AppHomeOpenedEvent) {
        forEachListener { it.onAppHomeOpened(event) }
    }

    override fun onBotAdded(event: work.socialhub.kslack.entity.event.BotAddedEvent) {
        forEachListener { it.onBotAdded(event) }
    }

    override fun onBotChanged(event: work.socialhub.kslack.entity.event.BotChangedEvent) {
        forEachListener { it.onBotChanged(event) }
    }

    override fun onAppUninstalled(event: work.socialhub.kslack.entity.event.AppUninstalledEvent) {
        forEachListener { it.onAppUninstalled(event) }
    }

    override fun onError(error: Exception) {
        forEachListener { it.onError(error) }
    }

    override fun onOpen() {
        forEachListener { it.onOpen() }
    }

    override fun onClose() {
        forEachListener { it.onClose() }
    }
}
