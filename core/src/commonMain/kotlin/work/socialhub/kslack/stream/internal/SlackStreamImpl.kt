package work.socialhub.kslack.stream.internal

import work.socialhub.kslack.stream.SlackStream
import work.socialhub.kslack.stream.SlackStreamListener

class SlackStreamImpl(
    private val token: String?,
) : SlackStream, SlackStreamListener {

    private val client = SocketModeClient(token ?: "", this)
    private val listeners = mutableListOf<SlackStreamListener>()

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
        listeners.add(listener)
    }

    override fun removeEventListener(listener: SlackStreamListener) {
        listeners.remove(listener)
    }

    override fun onAppMention(event: work.socialhub.kslack.entity.event.AppMentionEvent) {
        listeners.forEach { it.onAppMention(event) }
    }

    override fun onAppRateLimited(event: work.socialhub.kslack.entity.event.AppRateLimitedEvent) {
        listeners.forEach { it.onAppRateLimited(event) }
    }

    override fun onChannelArchive(event: work.socialhub.kslack.entity.event.ChannelArchiveEvent) {
        listeners.forEach { it.onChannelArchive(event) }
    }

    override fun onChannelCreated(event: work.socialhub.kslack.entity.event.ChannelCreatedEvent) {
        listeners.forEach { it.onChannelCreated(event) }
    }

    override fun onChannelDeleted(event: work.socialhub.kslack.entity.event.ChannelDeletedEvent) {
        listeners.forEach { it.onChannelDeleted(event) }
    }

    override fun onChannelHistoryChanged(event: work.socialhub.kslack.entity.event.ChannelHistoryChangedEvent) {
        listeners.forEach { it.onChannelHistoryChanged(event) }
    }

    override fun onChannelJoined(event: work.socialhub.kslack.entity.event.ChannelJoinedEvent) {
        listeners.forEach { it.onChannelJoined(event) }
    }

    override fun onChannelLeft(event: work.socialhub.kslack.entity.event.ChannelLeftEvent) {
        listeners.forEach { it.onChannelLeft(event) }
    }

    override fun onChannelMarked(event: work.socialhub.kslack.entity.event.ChannelMarkedEvent) {
        listeners.forEach { it.onChannelMarked(event) }
    }

    override fun onChannelRename(event: work.socialhub.kslack.entity.event.ChannelRenameEvent) {
        listeners.forEach { it.onChannelRename(event) }
    }

    override fun onChannelUnarchive(event: work.socialhub.kslack.entity.event.ChannelUnarchiveEvent) {
        listeners.forEach { it.onChannelUnarchive(event) }
    }

    override fun onFileChanged(event: work.socialhub.kslack.entity.event.FileChangeEvent) {
        listeners.forEach { it.onFileChanged(event) }
    }

    override fun onFileCreated(event: work.socialhub.kslack.entity.event.FileCreatedEvent) {
        listeners.forEach { it.onFileCreated(event) }
    }

    override fun onFileDeleted(event: work.socialhub.kslack.entity.event.FileDeletedEvent) {
        listeners.forEach { it.onFileDeleted(event) }
    }

    override fun onFileShared(event: work.socialhub.kslack.entity.event.FileSharedEvent) {
        listeners.forEach { it.onFileShared(event) }
    }

    override fun onFileUnshared(event: work.socialhub.kslack.entity.event.FileUnsharedEvent) {
        listeners.forEach { it.onFileUnshared(event) }
    }

    override fun onMemberJoinedChannel(event: work.socialhub.kslack.entity.event.MemberJoinedChannelEvent) {
        listeners.forEach { it.onMemberJoinedChannel(event) }
    }

    override fun onMemberLeftChannel(event: work.socialhub.kslack.entity.event.MemberLeftChannelEvent) {
        listeners.forEach { it.onMemberLeftChannel(event) }
    }

    override fun onMessageChanged(event: work.socialhub.kslack.entity.event.MessageChangedEvent) {
        listeners.forEach { it.onMessageChanged(event) }
    }

    override fun onMessageDeleted(event: work.socialhub.kslack.entity.event.MessageDeletedEvent) {
        listeners.forEach { it.onMessageDeleted(event) }
    }

    override fun onMessage(event: work.socialhub.kslack.entity.event.MessageEvent) {
        listeners.forEach { it.onMessage(event) }
    }

    override fun onMeMessage(event: work.socialhub.kslack.entity.event.MessageMeEvent) {
        listeners.forEach { it.onMeMessage(event) }
    }

    override fun onReactionAdded(event: work.socialhub.kslack.entity.event.ReactionAddedEvent) {
        listeners.forEach { it.onReactionAdded(event) }
    }

    override fun onReactionRemoved(event: work.socialhub.kslack.entity.event.ReactionRemovedEvent) {
        listeners.forEach { it.onReactionRemoved(event) }
    }

    override fun onAppHomeOpened(event: work.socialhub.kslack.entity.event.AppHomeOpenedEvent) {
        listeners.forEach { it.onAppHomeOpened(event) }
    }

    override fun onBotAdded(event: work.socialhub.kslack.entity.event.BotAddedEvent) {
        listeners.forEach { it.onBotAdded(event) }
    }

    override fun onBotChanged(event: work.socialhub.kslack.entity.event.BotChangedEvent) {
        listeners.forEach { it.onBotChanged(event) }
    }

    override fun onAppUninstalled(event: work.socialhub.kslack.entity.event.AppUninstalledEvent) {
        listeners.forEach { it.onAppUninstalled(event) }
    }

    override fun onError(error: Exception) {
        listeners.forEach { it.onError(error) }
    }

    override fun onOpen() {
        listeners.forEach { it.onOpen() }
    }

    override fun onClose() {
        listeners.forEach { it.onClose() }
    }
}
