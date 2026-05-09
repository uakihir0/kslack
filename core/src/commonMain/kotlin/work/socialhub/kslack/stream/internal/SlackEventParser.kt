package work.socialhub.kslack.stream.internal

import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.event.*

object SlackEventParser {

    fun parseEvent(jsonString: String): EventWrapper? {
        return try {
            val type = extractType(jsonString) ?: return null
            val (eventClass, rawJson) = resolveEventType(type, jsonString)
            EventWrapper(type, eventClass, rawJson)
        } catch (e: Exception) {
            null
        }
    }

    private fun extractType(jsonString: String): String? {
        val idx = jsonString.indexOf("\"type\"")
        if (idx < 0) return null
        val start = jsonString.indexOf(':', idx + 6)
        if (start < 0) return null
        val quoted = jsonString.indexOf('"', start)
        if (quoted < 0) return null
        val end = jsonString.indexOf('"', quoted + 1)
        if (end < 0) return null
        return jsonString.substring(quoted + 1, end)
    }

    private fun resolveEventType(type: String, jsonString: String): Pair<Any?, String> {
        return when (type) {
            AppMentionEvent.TYPE_NAME -> JsonHelper.fromJson<AppMentionEvent>(jsonString) to jsonString
            AppRateLimitedEvent.TYPE_NAME -> JsonHelper.fromJson<AppRateLimitedEvent>(jsonString) to jsonString
            ChannelCreatedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelCreatedEvent>(jsonString) to jsonString
            ChannelDeletedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelDeletedEvent>(jsonString) to jsonString
            ChannelRenameEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelRenameEvent>(jsonString) to jsonString
            ChannelArchiveEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelArchiveEvent>(jsonString) to jsonString
            ChannelUnarchiveEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelUnarchiveEvent>(jsonString) to jsonString
            ChannelHistoryChangedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelHistoryChangedEvent>(jsonString) to jsonString
            ChannelJoinedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelJoinedEvent>(jsonString) to jsonString
            ChannelLeftEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelLeftEvent>(jsonString) to jsonString
            ChannelMarkedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelMarkedEvent>(jsonString) to jsonString
            MemberJoinedChannelEvent.TYPE_NAME -> JsonHelper.fromJson<MemberJoinedChannelEvent>(jsonString) to jsonString
            MemberLeftChannelEvent.TYPE_NAME -> JsonHelper.fromJson<MemberLeftChannelEvent>(jsonString) to jsonString
            ReactionAddedEvent.TYPE_NAME -> JsonHelper.fromJson<ReactionAddedEvent>(jsonString) to jsonString
            ReactionRemovedEvent.TYPE_NAME -> JsonHelper.fromJson<ReactionRemovedEvent>(jsonString) to jsonString
            FileSharedEvent.TYPE_NAME -> JsonHelper.fromJson<FileSharedEvent>(jsonString) to jsonString
            FileDeletedEvent.TYPE_NAME -> JsonHelper.fromJson<FileDeletedEvent>(jsonString) to jsonString
            FileChangeEvent.TYPE_NAME -> JsonHelper.fromJson<FileChangeEvent>(jsonString) to jsonString
            FileCreatedEvent.TYPE_NAME -> JsonHelper.fromJson<FileCreatedEvent>(jsonString) to jsonString
            FileUnsharedEvent.TYPE_NAME -> JsonHelper.fromJson<FileUnsharedEvent>(jsonString) to jsonString
            MessageChangedEvent.TYPE_NAME -> JsonHelper.fromJson<MessageChangedEvent>(jsonString) to jsonString
            MessageDeletedEvent.TYPE_NAME -> JsonHelper.fromJson<MessageDeletedEvent>(jsonString) to jsonString
            MessageEvent.TYPE_NAME -> JsonHelper.fromJson<MessageEvent>(jsonString) to jsonString
            MessageMeEvent.TYPE_NAME -> JsonHelper.fromJson<MessageMeEvent>(jsonString) to jsonString
            else -> null to jsonString
        }
    }
}

data class EventWrapper(
    val type: String,
    val event: Any?,
    val rawJson: String,
)
