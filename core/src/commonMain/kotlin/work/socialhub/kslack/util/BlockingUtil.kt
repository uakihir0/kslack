package work.socialhub.kslack.util

import kotlinx.coroutines.CoroutineScope

expect fun <T> toBlocking(block: suspend CoroutineScope.() -> T): T
