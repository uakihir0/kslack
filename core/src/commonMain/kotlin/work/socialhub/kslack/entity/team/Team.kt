package work.socialhub.kslack.entity.team

import com.google.gson.annotations.SerialName

class Team {
    var id: String? = null
    var name: String? = null
    var domain: String? = null
    var emailDomain: String? = null
    var icon: TeamIcon? = null

    var enterpriseId: String? = null
    var enterpriseName: String? = null

    class Profile {
        var id: String? = null
        var fieldName: String? = null
        var ordering: Int? = null
        var label: String? = null
        var hint: String? = null
        var type: String? = null
        var possibleValues: Array<String>? = null
        var options: ProfileOptions? = null

        @SerialName("is_hidden")
        var isHidden: Boolean = false
    }

    class ProfileOptions {
        @SerialName("is_protected")
        var isProtected: Boolean = false

        fun is_protected(): Boolean {
            return this.isProtected
        }

        fun set_protected(_protected: Boolean) {
            this.isProtected = _protected
        }
    }
}
