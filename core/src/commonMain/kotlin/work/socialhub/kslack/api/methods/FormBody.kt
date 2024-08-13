package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpParameter

class FormBody(
    private val names: Array<String>,
    private val values: Array<Any>,
) {
    val size: Int
        get() = names.size

    val params: List<HttpParameter>
        get() {
            val result = mutableListOf<HttpParameter>()

            for (i in 0 until size) {
                if (values[i] is String) {
                    result.add(HttpParameter.param(
                        names[i],
                        values[i] as String)
                    )
                }
                if (values[i] is BytesFile) {
                    result.add(HttpParameter.file(
                        names[i],
                        (values[i] as BytesFile).name,
                        (values[i] as BytesFile).bytes
                    ))
                }
            }
            return result
        }

    class BytesFile (
        var bytes: ByteArray,
        var name: String,
    )
}
