package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

/**
 * https://api.slack.com/types/usergroup
 */
class Usergroup {
    var id: String? = null
    var teamId: String? = null
    var enterpriseSubteamId: String? = null

    @SerializedName("is_usergroup")
    var isUsergroup: Boolean = false

    @SerializedName("is_subteam")
    var isSubteam: Boolean = false
    var name: String? = null
    var description: String? = null
    var handle: String? = null

    @SerializedName("is_external")
    var isExternal: Boolean = false
    var isAutoProvision: Boolean = false
    var dateCreate: Int? = null
    var dateUpdate: Int? = null
    var dateDelete: Int? = null
    var autoType: String? = null
    var createdBy: String? = null
    var updatedBy: String? = null
    var deletedBy: String? = null
    var prefs: Prefs? = null
    var users: List<String>? = null
    var userCount: Int? = null

    constructor(
        id: String?,
        teamId: String?,
        enterpriseSubteamId: String?,
        usergroup: Boolean,
        subteam: Boolean,
        name: String?,
        description: String?,
        handle: String?,
        external: Boolean,
        autoProvision: Boolean,
        dateCreate: Int?,
        dateUpdate: Int?,
        dateDelete: Int?,
        autoType: String?,
        createdBy: String?,
        updatedBy: String?,
        deletedBy: String?,
        prefs: Prefs?,
        users: List<String>?,
        userCount: Int?
    ) {
        this.id = id
        this.teamId = teamId
        this.enterpriseSubteamId = enterpriseSubteamId
        this.isUsergroup = usergroup
        this.isSubteam = subteam
        this.name = name
        this.description = description
        this.handle = handle
        this.isExternal = external
        this.isAutoProvision = autoProvision
        this.dateCreate = dateCreate
        this.dateUpdate = dateUpdate
        this.dateDelete = dateDelete
        this.autoType = autoType
        this.createdBy = createdBy
        this.updatedBy = updatedBy
        this.deletedBy = deletedBy
        this.prefs = prefs
        this.users = users
        this.userCount = userCount
    }

    constructor()

    class Prefs {
        var channels: List<String>? = null
        var groups: List<String>? = null
    }

    class UsergroupBuilder internal constructor() {
        private var id: String? = null
        private var teamId: String? = null
        private var enterpriseSubteamId: String? = null
        private var usergroup = false
        private var subteam = false
        private var name: String? = null
        private var description: String? = null
        private var handle: String? = null
        private var external = false
        private var autoProvision = false
        private var dateCreate: Int? = null
        private var dateUpdate: Int? = null
        private var dateDelete: Int? = null
        private var autoType: String? = null
        private var createdBy: String? = null
        private var updatedBy: String? = null
        private var deletedBy: String? = null
        private var prefs: Prefs? = null
        private var users: List<String>? = null
        private var userCount: Int? = null

        fun id(id: String?): UsergroupBuilder {
            this.id = id
            return this
        }

        fun teamId(teamId: String?): UsergroupBuilder {
            this.teamId = teamId
            return this
        }

        fun enterpriseSubteamId(enterpriseSubteamId: String?): UsergroupBuilder {
            this.enterpriseSubteamId = enterpriseSubteamId
            return this
        }

        fun usergroup(usergroup: Boolean): UsergroupBuilder {
            this.usergroup = usergroup
            return this
        }

        fun subteam(subteam: Boolean): UsergroupBuilder {
            this.subteam = subteam
            return this
        }

        fun name(name: String?): UsergroupBuilder {
            this.name = name
            return this
        }

        fun description(description: String?): UsergroupBuilder {
            this.description = description
            return this
        }

        fun handle(handle: String?): UsergroupBuilder {
            this.handle = handle
            return this
        }

        fun external(external: Boolean): UsergroupBuilder {
            this.external = external
            return this
        }

        fun autoProvision(autoProvision: Boolean): UsergroupBuilder {
            this.autoProvision = autoProvision
            return this
        }

        fun dateCreate(dateCreate: Int?): UsergroupBuilder {
            this.dateCreate = dateCreate
            return this
        }

        fun dateUpdate(dateUpdate: Int?): UsergroupBuilder {
            this.dateUpdate = dateUpdate
            return this
        }

        fun dateDelete(dateDelete: Int?): UsergroupBuilder {
            this.dateDelete = dateDelete
            return this
        }

        fun autoType(autoType: String?): UsergroupBuilder {
            this.autoType = autoType
            return this
        }

        fun createdBy(createdBy: String?): UsergroupBuilder {
            this.createdBy = createdBy
            return this
        }

        fun updatedBy(updatedBy: String?): UsergroupBuilder {
            this.updatedBy = updatedBy
            return this
        }

        fun deletedBy(deletedBy: String?): UsergroupBuilder {
            this.deletedBy = deletedBy
            return this
        }

        fun prefs(prefs: Prefs?): UsergroupBuilder {
            this.prefs = prefs
            return this
        }

        fun users(users: List<String>?): UsergroupBuilder {
            this.users = users
            return this
        }

        fun userCount(userCount: Int?): UsergroupBuilder {
            this.userCount = userCount
            return this
        }

        fun build(): Usergroup {
            return Usergroup(
                id,
                teamId,
                enterpriseSubteamId,
                usergroup,
                subteam,
                name,
                description,
                handle,
                external,
                autoProvision,
                dateCreate,
                dateUpdate,
                dateDelete,
                autoType,
                createdBy,
                updatedBy,
                deletedBy,
                prefs,
                users,
                userCount
            )
        }

        override fun toString(): String {
            return "Usergroup.UsergroupBuilder(id=" + this.id + ", teamId=" + this.teamId + ", enterpriseSubteamId=" + this.enterpriseSubteamId + ", usergroup=" + this.usergroup + ", subteam=" + this.subteam + ", name=" + this.name + ", description=" + this.description + ", handle=" + this.handle + ", external=" + this.external + ", autoProvision=" + this.autoProvision + ", dateCreate=" + this.dateCreate + ", dateUpdate=" + this.dateUpdate + ", dateDelete=" + this.dateDelete + ", autoType=" + this.autoType + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", deletedBy=" + this.deletedBy + ", prefs=" + this.prefs + ", users=" + this.users + ", userCount=" + this.userCount + ")"
        }
    }

    companion object {
        fun builder(): UsergroupBuilder {
            return UsergroupBuilder()
        }
    }
}