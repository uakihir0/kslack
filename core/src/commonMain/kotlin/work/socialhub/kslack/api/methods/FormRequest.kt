package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpParameter

interface FormRequest {

    fun toMap(): Map<String, Any>

    fun toParams(): List<HttpParameter> {
        return mutableListOf<HttpParameter>().also {
            toMap().forEach { (k, v) ->
                if (v is String) {
                    it.add(HttpParameter.param(k, v))
                }
            }
        }
    }

    fun MutableMap<String, Any>.addParam(key: String, value: Any?) {
        if (value != null) {
            if (value is Boolean) {
                this[key] = if (value) "1" else "0"
            } else {
                this[key] = value.toString()
            }
        }
    }
}