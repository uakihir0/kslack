package com.github.seratch.jslack.api.methods.response.users

import com.google.gson.annotations.SerializedName

class UsersIdentityResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var user: User? = null
    var team: Team? = null

    class User {
        var name: String? = null
        var id: String? = null
        var email: String? = null

        @SerializedName("image_24")
        var image24: String? = null

        @SerializedName("image_32")
        var image32: String? = null

        @SerializedName("image_48")
        var image48: String? = null

        @SerializedName("image_72")
        var image72: String? = null

        @SerializedName("image_192")
        var image192: String? = null

        @SerializedName("image_512")
        var image512: String? = null
    }

    class Team {
        var name: String? = null
        var id: String? = null
    }
}
