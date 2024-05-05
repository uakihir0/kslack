package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

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
        var possibleValues: List<String>? = null
        var options: ProfileOptions? = null

        @SerializedName("is_hidden")
        var isHidden: Boolean = false
    }

    class ProfileOptions {
        @SerializedName("is_protected")
        var isProtected: Boolean = false

        fun is_protected(): Boolean {
            return this.isProtected
        }

        fun set_protected(_protected: Boolean) {
            this.isProtected = _protected
        }
    }
}
