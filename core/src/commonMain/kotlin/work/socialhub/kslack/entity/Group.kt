package work.socialhub.kslack.entity

import com.google.gson.annotations.SerialName

/**
 * https://api.slack.com/types/group
 */
class Group {
    var id: String? = null
    var name: String? = null
    var nameNormalized: String? = null

    @SerialName("is_group")
    var isGroup: Boolean = false
    var created: Int? = null
    var creator: String? = null

    @SerialName("is_archived")
    var isArchived: Boolean = false

    @SerialName("is_mpim")
    var isMpim: Boolean = false

    @SerialName("is_open")
    var isOpen: Boolean = false

    @SerialName("is_read_only")
    var isReadOnly: Boolean = false

    @SerialName("is_thread_only")
    var isThreadOnly: Boolean = false

    var members: Array<String>? = null
    var parentGroup: String? = null // group id
    var topic: Topic? = null
    var purpose: Purpose? = null
    var lastRead: String? = null
    var latest: Latest? = null
    var unreadCount: Int? = null
    var unreadCountDisplay: Int? = null
    var priority: Double? = null

    constructor(
        id: String?,
        name: String?,
        nameNormalized: String?,
        group: Boolean,
        created: Int?,
        creator: String?,
        archived: Boolean,
        mpim: Boolean,
        open: Boolean,
        readOnly: Boolean,
        threadOnly: Boolean,
        members: Array<String>?,
        parentGroup: String?,
        topic: Topic?,
        purpose: Purpose?,
        lastRead: String?,
        latest: Latest?,
        unreadCount: Int?,
        unreadCountDisplay: Int?,
        priority: Double?
    ) {
        this.id = id
        this.name = name
        this.nameNormalized = nameNormalized
        this.isGroup = group
        this.created = created
        this.creator = creator
        this.isArchived = archived
        this.isMpim = mpim
        this.isOpen = open
        this.isReadOnly = readOnly
        this.isThreadOnly = threadOnly
        this.members = members
        this.parentGroup = parentGroup
        this.topic = topic
        this.purpose = purpose
        this.lastRead = lastRead
        this.latest = latest
        this.unreadCount = unreadCount
        this.unreadCountDisplay = unreadCountDisplay
        this.priority = priority
    }

    constructor()

    class GroupBuilder internal constructor() {
        private var id: String? = null
        private var name: String? = null
        private var nameNormalized: String? = null
        private var group = false
        private var created: Int? = null
        private var creator: String? = null
        private var archived = false
        private var mpim = false
        private var open = false
        private var readOnly = false
        private var threadOnly = false
        private var members: Array<String>? = null
        private var parentGroup: String? = null
        private var topic: Topic? = null
        private var purpose: Purpose? = null
        private var lastRead: String? = null
        private var latest: Latest? = null
        private var unreadCount: Int? = null
        private var unreadCountDisplay: Int? = null
        private var priority: Double? = null

        fun id(id: String?): GroupBuilder {
            this.id = id
            return this
        }

        fun name(name: String?): GroupBuilder {
            this.name = name
            return this
        }

        fun nameNormalized(nameNormalized: String?): GroupBuilder {
            this.nameNormalized = nameNormalized
            return this
        }

        fun group(group: Boolean): GroupBuilder {
            this.group = group
            return this
        }

        fun created(created: Int?): GroupBuilder {
            this.created = created
            return this
        }

        fun creator(creator: String?): GroupBuilder {
            this.creator = creator
            return this
        }

        fun archived(archived: Boolean): GroupBuilder {
            this.archived = archived
            return this
        }

        fun mpim(mpim: Boolean): GroupBuilder {
            this.mpim = mpim
            return this
        }

        fun open(open: Boolean): GroupBuilder {
            this.open = open
            return this
        }

        fun readOnly(readOnly: Boolean): GroupBuilder {
            this.readOnly = readOnly
            return this
        }

        fun threadOnly(threadOnly: Boolean): GroupBuilder {
            this.threadOnly = threadOnly
            return this
        }

        fun members(members: Array<String>?): GroupBuilder {
            this.members = members
            return this
        }

        fun parentGroup(parentGroup: String?): GroupBuilder {
            this.parentGroup = parentGroup
            return this
        }

        fun topic(topic: Topic?): GroupBuilder {
            this.topic = topic
            return this
        }

        fun purpose(purpose: Purpose?): GroupBuilder {
            this.purpose = purpose
            return this
        }

        fun lastRead(lastRead: String?): GroupBuilder {
            this.lastRead = lastRead
            return this
        }

        fun latest(latest: Latest?): GroupBuilder {
            this.latest = latest
            return this
        }

        fun unreadCount(unreadCount: Int?): GroupBuilder {
            this.unreadCount = unreadCount
            return this
        }

        fun unreadCountDisplay(unreadCountDisplay: Int?): GroupBuilder {
            this.unreadCountDisplay = unreadCountDisplay
            return this
        }

        fun priority(priority: Double?): GroupBuilder {
            this.priority = priority
            return this
        }

        fun build(): Group {
            return Group(
                id,
                name,
                nameNormalized,
                group,
                created,
                creator,
                archived,
                mpim,
                open,
                readOnly,
                threadOnly,
                members,
                parentGroup,
                topic,
                purpose,
                lastRead,
                latest,
                unreadCount,
                unreadCountDisplay,
                priority
            )
        }

        override fun toString(): String {
            return "Group.GroupBuilder(id=" + this.id + ", name=" + this.name + ", nameNormalized=" + this.nameNormalized + ", group=" + this.group + ", created=" + this.created + ", creator=" + this.creator + ", archived=" + this.archived + ", mpim=" + this.mpim + ", open=" + this.open + ", readOnly=" + this.readOnly + ", threadOnly=" + this.threadOnly + ", members=" + this.members + ", parentGroup=" + this.parentGroup + ", topic=" + this.topic + ", purpose=" + this.purpose + ", lastRead=" + this.lastRead + ", latest=" + this.latest + ", unreadCount=" + this.unreadCount + ", unreadCountDisplay=" + this.unreadCountDisplay + ", priority=" + this.priority + ")"
        }
    }

    companion object {
        fun builder(): GroupBuilder {
            return GroupBuilder()
        }
    }
}