package work.socialhub.kslack.stream

import work.socialhub.kslack.entity.event.AppMentionEvent
import work.socialhub.kslack.entity.event.AppRateLimitedEvent
import work.socialhub.kslack.entity.event.ChannelArchiveEvent
import work.socialhub.kslack.entity.event.ChannelCreatedEvent
import work.socialhub.kslack.entity.event.ChannelDeletedEvent
import work.socialhub.kslack.entity.event.ChannelHistoryChangedEvent
import work.socialhub.kslack.entity.event.ChannelJoinedEvent
import work.socialhub.kslack.entity.event.ChannelLeftEvent
import work.socialhub.kslack.entity.event.ChannelMarkedEvent
import work.socialhub.kslack.entity.event.ChannelRenameEvent
import work.socialhub.kslack.entity.event.ChannelUnarchiveEvent
import work.socialhub.kslack.entity.event.FileChangedEvent
import work.socialhub.kslack.entity.event.FileCreatedEvent
import work.socialhub.kslack.entity.event.FileDeletedEvent
import work.socialhub.kslack.entity.event.FileSharedEvent
import work.socialhub.kslack.entity.event.FileUnsharedEvent
import work.socialhub.kslack.entity.event.MemberJoinedChannelEvent
import work.socialhub.kslack.entity.event.MemberLeftChannelEvent
import work.socialhub.kslack.entity.event.MessageChangedEvent
import work.socialhub.kslack.entity.event.MessageDeletedEvent
import work.socialhub.kslack.entity.event.MessageEvent
import work.socialhub.kslack.entity.event.MessageMeEvent
import work.socialhub.kslack.entity.event.ReactionAddedEvent
import work.socialhub.kslack.entity.event.ReactionRemovedEvent
import kotlin.js.JsExport

@JsExport
interface SlackStreamListener {

    fun onAppMention(event: AppMentionEvent) {}

    fun onAppRateLimited(event: AppRateLimitedEvent) {}

    fun onChannelArchive(event: ChannelArchiveEvent) {}

    fun onChannelCreated(event: ChannelCreatedEvent) {}

    fun onChannelDeleted(event: ChannelDeletedEvent) {}

    fun onChannelHistoryChanged(event: ChannelHistoryChangedEvent) {}

    fun onChannelJoined(event: ChannelJoinedEvent) {}

    fun onChannelLeft(event: ChannelLeftEvent) {}

    fun onChannelMarked(event: ChannelMarkedEvent) {}

    fun onChannelRename(event: ChannelRenameEvent) {}

    fun onChannelUnarchive(event: ChannelUnarchiveEvent) {}

    fun onFileChanged(event: FileChangedEvent) {}

    fun onFileCreated(event: FileCreatedEvent) {}

    fun onFileDeleted(event: FileDeletedEvent) {}

    fun onFileShared(event: FileSharedEvent) {}

    fun onFileUnshared(event: FileUnsharedEvent) {}

    fun onMemberJoinedChannel(event: MemberJoinedChannelEvent) {}

    fun onMemberLeftChannel(event: MemberLeftChannelEvent) {}

    fun onMessageChanged(event: MessageChangedEvent) {}

    fun onMessageDeleted(event: MessageDeletedEvent) {}

    fun onMessage(event: MessageEvent) {}

    fun onMeMessage(event: MessageMeEvent) {}

    fun onReactionAdded(event: ReactionAddedEvent) {}

    fun onReactionRemoved(event: ReactionRemovedEvent) {}

    fun onError(error: Exception) {}

    fun onOpen() {}

    fun onClose() {}
}
