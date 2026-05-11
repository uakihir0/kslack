package work.socialhub.kslack.stream.internal

import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.event.*
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

object SlackEventParser {

    fun parseEvent(jsonString: String): EventWrapper? {
        return try {
            val (type, payloadJson) = extractEventType(jsonString)
                ?: return null
            val eventClass = resolveEventType(type, payloadJson)
            EventWrapper(type, eventClass, jsonString)
        } catch (e: Exception) {
            null
        }
    }

    private fun extractEventType(jsonString: String): Pair<String, String>? {
        val jsonObject = JsonHelper.json.parseToJsonElement(jsonString).jsonObject

        val payload = jsonObject["payload"]?.jsonObject ?: return null
        val eventType = payload["type"]?.jsonPrimitive?.content ?: return null

        return eventType to payload.toString()
    }

    private fun resolveEventType(type: String, jsonString: String): Any? {
        return when (type) {
            AppMentionEvent.TYPE_NAME -> JsonHelper.fromJson<AppMentionEvent>(jsonString)
            AppRateLimitedEvent.TYPE_NAME -> JsonHelper.fromJson<AppRateLimitedEvent>(jsonString)
            ChannelCreatedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelCreatedEvent>(jsonString)
            ChannelDeletedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelDeletedEvent>(jsonString)
            ChannelRenameEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelRenameEvent>(jsonString)
            ChannelArchiveEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelArchiveEvent>(jsonString)
            ChannelUnarchiveEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelUnarchiveEvent>(jsonString)
            ChannelHistoryChangedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelHistoryChangedEvent>(jsonString)
            ChannelJoinedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelJoinedEvent>(jsonString)
            ChannelLeftEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelLeftEvent>(jsonString)
            ChannelMarkedEvent.TYPE_NAME -> JsonHelper.fromJson<ChannelMarkedEvent>(jsonString)
            MemberJoinedChannelEvent.TYPE_NAME -> JsonHelper.fromJson<MemberJoinedChannelEvent>(jsonString)
            MemberLeftChannelEvent.TYPE_NAME -> JsonHelper.fromJson<MemberLeftChannelEvent>(jsonString)
            ReactionAddedEvent.TYPE_NAME -> JsonHelper.fromJson<ReactionAddedEvent>(jsonString)
            ReactionRemovedEvent.TYPE_NAME -> JsonHelper.fromJson<ReactionRemovedEvent>(jsonString)
            FileSharedEvent.TYPE_NAME -> JsonHelper.fromJson<FileSharedEvent>(jsonString)
            FileDeletedEvent.TYPE_NAME -> JsonHelper.fromJson<FileDeletedEvent>(jsonString)
            FileChangeEvent.TYPE_NAME -> JsonHelper.fromJson<FileChangeEvent>(jsonString)
            FileCreatedEvent.TYPE_NAME -> JsonHelper.fromJson<FileCreatedEvent>(jsonString)
            FileUnsharedEvent.TYPE_NAME -> JsonHelper.fromJson<FileUnsharedEvent>(jsonString)
            MessageChangedEvent.TYPE_NAME -> JsonHelper.fromJson<MessageChangedEvent>(jsonString)
            MessageDeletedEvent.TYPE_NAME -> JsonHelper.fromJson<MessageDeletedEvent>(jsonString)
            MessageEvent.TYPE_NAME -> JsonHelper.fromJson<MessageEvent>(jsonString)
            MessageMeEvent.TYPE_NAME -> JsonHelper.fromJson<MessageMeEvent>(jsonString)
            AppHomeOpenedEvent.TYPE_NAME -> JsonHelper.fromJson<AppHomeOpenedEvent>(jsonString)
            BotAddedEvent.TYPE_NAME -> JsonHelper.fromJson<BotAddedEvent>(jsonString)
            BotChangedEvent.TYPE_NAME -> JsonHelper.fromJson<BotChangedEvent>(jsonString)
            AppUninstalledEvent.TYPE_NAME -> JsonHelper.fromJson<AppUninstalledEvent>(jsonString)
            else -> null
        }
    }
}

data class EventWrapper(
    val type: String,
    val event: Any?,
    val rawJson: String,
)
