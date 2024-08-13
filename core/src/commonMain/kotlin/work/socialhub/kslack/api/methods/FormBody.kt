package work.socialhub.kslack.api.methods

import net.socialhub.http.HttpParameter
import kotlin.jvm.JvmOverloads

class FormBody(private val names: Array<String>, private val values: Array<Any>) {
    fun size(): Int {
        return names.size
    }

    val params: Array<Any?>
        get() {
            val result: Array<HttpParameter?> = arrayOfNulls<HttpParameter>(size())

            for (i in 0 until size()) {
                if (values[i] is String) {
                    result[i] = HttpParameter(names[i], values[i] as String)
                }
                if (values[i] is java.io.File) {
                    result[i] = HttpParameter(names[i], values[i] as java.io.File)
                }

                if (values[i] is StreamFile) {
                    result[i] = HttpParameter(
                        names[i],
                        (values[i] as StreamFile).name,
                        (values[i] as StreamFile).stream
                    )
                }
            }
            return result
        }

    class StreamFile {
        var stream: java.io.InputStream? = null
        var name: String? = null
    }

    class Builder @JvmOverloads constructor(charset: java.nio.charset.Charset? = null as java.nio.charset.Charset?) {
        private val names: MutableArray<String> = java.util.ArrayArray<String>()
        private val values: MutableArray<Any> = java.util.ArrayArray<Any>()
        private val charset: java.nio.charset.Charset? = charset
        private var includeFile = false

        fun add(name: String, value: Any): Builder {
            names.add(name)
            values.add(value)
            return this
        }

        fun addFile(name: String, file: java.io.File): Builder {
            this.includeFile = true
            names.add(name)
            values.add(file)
            return this
        }

        fun addFile(name: String, fileBody: java.io.InputStream?, fileName: String?): Builder {
            this.includeFile = true
            names.add(name)
            val file = StreamFile()
            file.stream = fileBody
            file.name = fileName
            values.add(file)
            return this
        }

        fun build(): FormBody {
            return FormBody(this.names, this.values)
        }
    }
}
