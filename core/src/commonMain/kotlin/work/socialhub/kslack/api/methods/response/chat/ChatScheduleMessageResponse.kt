package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.bot.BotProfile

@Serializable
class ChatScheduleMessageResponse : SlackApiResponse() {

    var scheduledMessageId: String? = null
    var channel: String? = null
    var postAt: Int? = null
    var message: ScheduledMessage? = null

    @Serializable
    class ScheduledMessage {
        var botId: String? = null
        var botProfile: BotProfile? = null

        var type: String? = null
        var team: String? = null
        var user: String? = null

        var text: String? = null
        var attachments: Array<Attachment>? = null
        var blocks: Array<LayoutBlock>? = null
    }
}