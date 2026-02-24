package work.socialhub.kslack.stream.internal

import work.socialhub.kslack.stream.SlackStream

class SlackStreamImpl(
    private val token: String,
) : SlackStream {

    override fun token() = token
}
