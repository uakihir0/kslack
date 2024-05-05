package work.socialhub.kslack.entity

/**
 * https://api.slack.com/methods/reminders.add
 */
class Reminder {
    var id: String? = null
    var creator: String? = null
    var user: String? = null
    var text: String? = null
    var isRecurring: Boolean = false
    var time: Int? = null
    var completeTs: Int? = null

    constructor(
        id: String?,
        creator: String?,
        user: String?,
        text: String?,
        recurring: Boolean,
        time: Int?,
        completeTs: Int?
    ) {
        this.id = id
        this.creator = creator
        this.user = user
        this.text = text
        this.isRecurring = recurring
        this.time = time
        this.completeTs = completeTs
    }

    constructor()

    class ReminderBuilder internal constructor() {
        private var id: String? = null
        private var creator: String? = null
        private var user: String? = null
        private var text: String? = null
        private var recurring = false
        private var time: Int? = null
        private var completeTs: Int? = null

        fun id(id: String?): ReminderBuilder {
            this.id = id
            return this
        }

        fun creator(creator: String?): ReminderBuilder {
            this.creator = creator
            return this
        }

        fun user(user: String?): ReminderBuilder {
            this.user = user
            return this
        }

        fun text(text: String?): ReminderBuilder {
            this.text = text
            return this
        }

        fun recurring(recurring: Boolean): ReminderBuilder {
            this.recurring = recurring
            return this
        }

        fun time(time: Int?): ReminderBuilder {
            this.time = time
            return this
        }

        fun completeTs(completeTs: Int?): ReminderBuilder {
            this.completeTs = completeTs
            return this
        }

        fun build(): Reminder {
            return Reminder(id, creator, user, text, recurring, time, completeTs)
        }

        override fun toString(): String {
            return "Reminder.ReminderBuilder(id=" + this.id + ", creator=" + this.creator + ", user=" + this.user + ", text=" + this.text + ", recurring=" + this.recurring + ", time=" + this.time + ", completeTs=" + this.completeTs + ")"
        }
    }

    companion object {
        fun builder(): ReminderBuilder {
            return ReminderBuilder()
        }
    }
}