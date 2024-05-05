package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

/**
 * Represents a [conversation](https://api.slack.com/types/conversation)
 * as used with the `conversations` API
 *
 * @see "https://api.slack.com/docs/conversations-api"
 */
class Conversation {
    var enterpriseId: String? = null
    var id: String? = null
    var name: String? = null
    var created: String? = null
    var creator: String? = null
    var unlinked: Int? = null

    @SerializedName("name_normalized")
    var nameNormalized: String? = null

    @SerializedName("pending_shared")
    var pendingShared: List<String>? = null

    @SerializedName("last_read")
    var lastRead: String? = null
    var topic: Topic? = null
    var purpose: Purpose? = null

    @SerializedName("previous_names")
    var previousNames: List<String>? = null

    @SerializedName("num_members")
    var numOfMembers: Int? = null
    var members: List<String>? = null
    var latest: Latest? = null
    var locale: String? = null

    @SerializedName("unread_count")
    var unreadCount: Int? = null

    @SerializedName("unread_count_display")
    var unreadCountDisplay: Int? = null
    var user: String? = null // conversations.open
    var priority: Double? = null

    var sharedTeamIds: List<String>? = null

    var parentConversation: String? = null
    var pendingConnectedTeamIds: List<String>? = null

    // shared channels
    var conversationHostId: String? = null
    var internalTeamIds: List<String>? = null
    var connectedTeamIds: List<String>? = null

    @SerializedName("is_channel")
    var isChannel: Boolean = false

    @SerializedName("is_group")
    var isGroup: Boolean = false

    @SerializedName("is_im")
    var isIm: Boolean = false

    @SerializedName("is_archived")
    var isArchived: Boolean = false

    @SerializedName("is_general")
    var isGeneral: Boolean = false

    @SerializedName("is_read_only")
    var isReadOnly: Boolean = false

    @SerializedName("is_thread_only")
    var isThreadOnly: Boolean = false

    @SerializedName("is_non_threadable")
    var isNonThreadable: Boolean = false

    @SerializedName("is_shared")
    var isShared: Boolean = false

    @SerializedName("is_ext_shared")
    var isExtShared: Boolean = false

    @SerializedName("is_org_shared")
    var isOrgShared: Boolean = false

    @SerializedName("is_pending_ext_shared")
    var isPendingExtShared: Boolean = false

    @SerializedName("is_global_shared")
    var isGlobalShared: Boolean = false

    @SerializedName("is_org_default")
    var isOrgDefault: Boolean = false

    @SerializedName("is_org_mandatory")
    var isOrgMandatory: Boolean = false

    @SerializedName("is_moved")
    var isMoved: Int? = null

    @SerializedName("is_member")
    var isMember: Boolean = false

    @SerializedName("is_open")
    var isOpen: Boolean = false

    @SerializedName("is_private")
    var isPrivate: Boolean = false

    @SerializedName("is_mpim")
    var isMpim: Boolean = false

    constructor(
        enterpriseId: String?,
        id: String?,
        name: String?,
        created: String?,
        creator: String?,
        unlinked: Int?,
        nameNormalized: String?,
        pendingShared: List<String>?,
        lastRead: String?,
        topic: Topic?,
        purpose: Purpose?,
        previousNames: List<String>?,
        numOfMembers: Int?,
        members: List<String>?,
        latest: Latest?,
        locale: String?,
        unreadCount: Int?,
        unreadCountDisplay: Int?,
        user: String?,
        priority: Double?,
        sharedTeamIds: List<String>?,
        parentConversation: String?,
        pendingConnectedTeamIds: List<String>?,
        conversationHostId: String?,
        internalTeamIds: List<String>?,
        connectedTeamIds: List<String>?,
        isChannel: Boolean,
        isGroup: Boolean,
        isIm: Boolean,
        isArchived: Boolean,
        isGeneral: Boolean,
        isReadOnly: Boolean,
        isThreadOnly: Boolean,
        isNonThreadable: Boolean,
        isShared: Boolean,
        isExtShared: Boolean,
        isOrgShared: Boolean,
        isPendingExtShared: Boolean,
        globalShared: Boolean,
        orgDefault: Boolean,
        orgMandatory: Boolean,
        isMoved: Int?,
        isMember: Boolean,
        open: Boolean,
        isPrivate: Boolean,
        isMpim: Boolean
    ) {
        this.enterpriseId = enterpriseId
        this.id = id
        this.name = name
        this.created = created
        this.creator = creator
        this.unlinked = unlinked
        this.nameNormalized = nameNormalized
        this.pendingShared = pendingShared
        this.lastRead = lastRead
        this.topic = topic
        this.purpose = purpose
        this.previousNames = previousNames
        this.numOfMembers = numOfMembers
        this.members = members
        this.latest = latest
        this.locale = locale
        this.unreadCount = unreadCount
        this.unreadCountDisplay = unreadCountDisplay
        this.user = user
        this.priority = priority
        this.sharedTeamIds = sharedTeamIds
        this.parentConversation = parentConversation
        this.pendingConnectedTeamIds = pendingConnectedTeamIds
        this.conversationHostId = conversationHostId
        this.internalTeamIds = internalTeamIds
        this.connectedTeamIds = connectedTeamIds
        this.isChannel = isChannel
        this.isGroup = isGroup
        this.isIm = isIm
        this.isArchived = isArchived
        this.isGeneral = isGeneral
        this.isReadOnly = isReadOnly
        this.isThreadOnly = isThreadOnly
        this.isNonThreadable = isNonThreadable
        this.isShared = isShared
        this.isExtShared = isExtShared
        this.isOrgShared = isOrgShared
        this.isPendingExtShared = isPendingExtShared
        this.isGlobalShared = globalShared
        this.isOrgDefault = orgDefault
        this.isOrgMandatory = orgMandatory
        this.isMoved = isMoved
        this.isMember = isMember
        this.isOpen = open
        this.isPrivate = isPrivate
        this.isMpim = isMpim
    }

    constructor()

    class ConversationBuilder internal constructor() {
        private var enterpriseId: String? = null
        private var id: String? = null
        private var name: String? = null
        private var created: String? = null
        private var creator: String? = null
        private var unlinked: Int? = null
        private var nameNormalized: String? = null
        private var pendingShared: List<String>? = null
        private var lastRead: String? = null
        private var topic: Topic? = null
        private var purpose: Purpose? = null
        private var previousNames: List<String>? = null
        private var numOfMembers: Int? = null
        private var members: List<String>? = null
        private var latest: Latest? = null
        private var locale: String? = null
        private var unreadCount: Int? = null
        private var unreadCountDisplay: Int? = null
        private var user: String? = null
        private var priority: Double? = null
        private var sharedTeamIds: List<String>? = null
        private var parentConversation: String? = null
        private var pendingConnectedTeamIds: List<String>? = null
        private var conversationHostId: String? = null
        private var internalTeamIds: List<String>? = null
        private var connectedTeamIds: List<String>? = null
        private var isChannel = false
        private var isGroup = false
        private var isIm = false
        private var isArchived = false
        private var isGeneral = false
        private var isReadOnly = false
        private var isThreadOnly = false
        private var isNonThreadable = false
        private var isShared = false
        private var isExtShared = false
        private var isOrgShared = false
        private var isPendingExtShared = false
        private var globalShared = false
        private var orgDefault = false
        private var orgMandatory = false
        private var isMoved: Int? = null
        private var isMember = false
        private var open = false
        private var isPrivate = false
        private var isMpim = false

        fun enterpriseId(enterpriseId: String?): ConversationBuilder {
            this.enterpriseId = enterpriseId
            return this
        }

        fun id(id: String?): ConversationBuilder {
            this.id = id
            return this
        }

        fun name(name: String?): ConversationBuilder {
            this.name = name
            return this
        }

        fun created(created: String?): ConversationBuilder {
            this.created = created
            return this
        }

        fun creator(creator: String?): ConversationBuilder {
            this.creator = creator
            return this
        }

        fun unlinked(unlinked: Int?): ConversationBuilder {
            this.unlinked = unlinked
            return this
        }

        fun nameNormalized(nameNormalized: String?): ConversationBuilder {
            this.nameNormalized = nameNormalized
            return this
        }

        fun pendingShared(pendingShared: List<String>?): ConversationBuilder {
            this.pendingShared = pendingShared
            return this
        }

        fun lastRead(lastRead: String?): ConversationBuilder {
            this.lastRead = lastRead
            return this
        }

        fun topic(topic: Topic?): ConversationBuilder {
            this.topic = topic
            return this
        }

        fun purpose(purpose: Purpose?): ConversationBuilder {
            this.purpose = purpose
            return this
        }

        fun previousNames(previousNames: List<String>?): ConversationBuilder {
            this.previousNames = previousNames
            return this
        }

        fun numOfMembers(numOfMembers: Int?): ConversationBuilder {
            this.numOfMembers = numOfMembers
            return this
        }

        fun members(members: List<String>?): ConversationBuilder {
            this.members = members
            return this
        }

        fun latest(latest: Latest?): ConversationBuilder {
            this.latest = latest
            return this
        }

        fun locale(locale: String?): ConversationBuilder {
            this.locale = locale
            return this
        }

        fun unreadCount(unreadCount: Int?): ConversationBuilder {
            this.unreadCount = unreadCount
            return this
        }

        fun unreadCountDisplay(unreadCountDisplay: Int?): ConversationBuilder {
            this.unreadCountDisplay = unreadCountDisplay
            return this
        }

        fun user(user: String?): ConversationBuilder {
            this.user = user
            return this
        }

        fun priority(priority: Double?): ConversationBuilder {
            this.priority = priority
            return this
        }

        fun sharedTeamIds(sharedTeamIds: List<String>?): ConversationBuilder {
            this.sharedTeamIds = sharedTeamIds
            return this
        }

        fun parentConversation(parentConversation: String?): ConversationBuilder {
            this.parentConversation = parentConversation
            return this
        }

        fun pendingConnectedTeamIds(pendingConnectedTeamIds: List<String>?): ConversationBuilder {
            this.pendingConnectedTeamIds = pendingConnectedTeamIds
            return this
        }

        fun conversationHostId(conversationHostId: String?): ConversationBuilder {
            this.conversationHostId = conversationHostId
            return this
        }

        fun internalTeamIds(internalTeamIds: List<String>?): ConversationBuilder {
            this.internalTeamIds = internalTeamIds
            return this
        }

        fun connectedTeamIds(connectedTeamIds: List<String>?): ConversationBuilder {
            this.connectedTeamIds = connectedTeamIds
            return this
        }

        fun isChannel(isChannel: Boolean): ConversationBuilder {
            this.isChannel = isChannel
            return this
        }

        fun isGroup(isGroup: Boolean): ConversationBuilder {
            this.isGroup = isGroup
            return this
        }

        fun isIm(isIm: Boolean): ConversationBuilder {
            this.isIm = isIm
            return this
        }

        fun isArchived(isArchived: Boolean): ConversationBuilder {
            this.isArchived = isArchived
            return this
        }

        fun isGeneral(isGeneral: Boolean): ConversationBuilder {
            this.isGeneral = isGeneral
            return this
        }

        fun isReadOnly(isReadOnly: Boolean): ConversationBuilder {
            this.isReadOnly = isReadOnly
            return this
        }

        fun isThreadOnly(isThreadOnly: Boolean): ConversationBuilder {
            this.isThreadOnly = isThreadOnly
            return this
        }

        fun isNonThreadable(isNonThreadable: Boolean): ConversationBuilder {
            this.isNonThreadable = isNonThreadable
            return this
        }

        fun isShared(isShared: Boolean): ConversationBuilder {
            this.isShared = isShared
            return this
        }

        fun isExtShared(isExtShared: Boolean): ConversationBuilder {
            this.isExtShared = isExtShared
            return this
        }

        fun isOrgShared(isOrgShared: Boolean): ConversationBuilder {
            this.isOrgShared = isOrgShared
            return this
        }

        fun isPendingExtShared(isPendingExtShared: Boolean): ConversationBuilder {
            this.isPendingExtShared = isPendingExtShared
            return this
        }

        fun globalShared(globalShared: Boolean): ConversationBuilder {
            this.globalShared = globalShared
            return this
        }

        fun orgDefault(orgDefault: Boolean): ConversationBuilder {
            this.orgDefault = orgDefault
            return this
        }

        fun orgMandatory(orgMandatory: Boolean): ConversationBuilder {
            this.orgMandatory = orgMandatory
            return this
        }

        fun isMoved(isMoved: Int?): ConversationBuilder {
            this.isMoved = isMoved
            return this
        }

        fun isMember(isMember: Boolean): ConversationBuilder {
            this.isMember = isMember
            return this
        }

        fun open(open: Boolean): ConversationBuilder {
            this.open = open
            return this
        }

        fun isPrivate(isPrivate: Boolean): ConversationBuilder {
            this.isPrivate = isPrivate
            return this
        }

        fun isMpim(isMpim: Boolean): ConversationBuilder {
            this.isMpim = isMpim
            return this
        }

        fun build(): Conversation {
            return Conversation(
                enterpriseId,
                id,
                name,
                created,
                creator,
                unlinked,
                nameNormalized,
                pendingShared,
                lastRead,
                topic,
                purpose,
                previousNames,
                numOfMembers,
                members,
                latest,
                locale,
                unreadCount,
                unreadCountDisplay,
                user,
                priority,
                sharedTeamIds,
                parentConversation,
                pendingConnectedTeamIds,
                conversationHostId,
                internalTeamIds,
                connectedTeamIds,
                isChannel,
                isGroup,
                isIm,
                isArchived,
                isGeneral,
                isReadOnly,
                isThreadOnly,
                isNonThreadable,
                isShared,
                isExtShared,
                isOrgShared,
                isPendingExtShared,
                globalShared,
                orgDefault,
                orgMandatory,
                isMoved,
                isMember,
                open,
                isPrivate,
                isMpim
            )
        }

        override fun toString(): String {
            return "Conversation.ConversationBuilder(enterpriseId=" + this.enterpriseId + ", id=" + this.id + ", name=" + this.name + ", created=" + this.created + ", creator=" + this.creator + ", unlinked=" + this.unlinked + ", nameNormalized=" + this.nameNormalized + ", pendingShared=" + this.pendingShared + ", lastRead=" + this.lastRead + ", topic=" + this.topic + ", purpose=" + this.purpose + ", previousNames=" + this.previousNames + ", numOfMembers=" + this.numOfMembers + ", members=" + this.members + ", latest=" + this.latest + ", locale=" + this.locale + ", unreadCount=" + this.unreadCount + ", unreadCountDisplay=" + this.unreadCountDisplay + ", user=" + this.user + ", priority=" + this.priority + ", sharedTeamIds=" + this.sharedTeamIds + ", parentConversation=" + this.parentConversation + ", pendingConnectedTeamIds=" + this.pendingConnectedTeamIds + ", conversationHostId=" + this.conversationHostId + ", internalTeamIds=" + this.internalTeamIds + ", connectedTeamIds=" + this.connectedTeamIds + ", isChannel=" + this.isChannel + ", isGroup=" + this.isGroup + ", isIm=" + this.isIm + ", isArchived=" + this.isArchived + ", isGeneral=" + this.isGeneral + ", isReadOnly=" + this.isReadOnly + ", isThreadOnly=" + this.isThreadOnly + ", isNonThreadable=" + this.isNonThreadable + ", isShared=" + this.isShared + ", isExtShared=" + this.isExtShared + ", isOrgShared=" + this.isOrgShared + ", isPendingExtShared=" + this.isPendingExtShared + ", globalShared=" + this.globalShared + ", orgDefault=" + this.orgDefault + ", orgMandatory=" + this.orgMandatory + ", isMoved=" + this.isMoved + ", isMember=" + this.isMember + ", open=" + this.open + ", isPrivate=" + this.isPrivate + ", isMpim=" + this.isMpim + ")"
        }
    }

    companion object {
        fun builder(): ConversationBuilder {
            return ConversationBuilder()
        }
    }
}
