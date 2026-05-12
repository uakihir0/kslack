package work.socialhub.kslack.util

import kotlinx.coroutines.CoroutineScope

/**
 * Platform-agnostic utility for converting suspend (coroutine) functions to blocking calls.
 *
 * This is an `expect` declaration that resolves to platform-specific implementations:
 * - **JVM**: Uses `kotlinx.coroutines.runBlocking` to execute the suspend block
 *   on a new blocking thread.
 * - **JS**: Throws `UnsupportedOperationException` since JavaScript is inherently
 *   asynchronous; use suspend functions directly instead.
 * - **Native**: Uses `kotlinx.coroutines.runBlocking` similar to JVM.
 *
 * This enables a dual-API pattern where every resource method is available in both
 * async (suspend) and blocking variants:
 *
 * ```kotlin
 * // Async (JVM, Native, JS)
 * val response = slack.chat().chatPostMessage(request)
 *
 * // Blocking (JVM, Native only)
 * val response = slack.chat().chatPostMessageBlocking(request)
 * ```
 *
 * @param T The return type of the suspend block
 * @param block The suspend function to execute
 * @return The result of the suspend block
 * @throws UnsupportedOperationException on JS platform
 * @see kotlinx.coroutines.runBlocking
 */
expect fun <T> toBlocking(block: suspend CoroutineScope.() -> T): T
