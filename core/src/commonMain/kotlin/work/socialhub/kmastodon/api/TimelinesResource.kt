package work.socialhub.kmastodon.api

import work.socialhub.kmastodon.api.request.timelines.*
import work.socialhub.kmastodon.api.response.Response
import work.socialhub.kmastodon.api.response.timelines.*
import kotlin.js.JsExport

@JsExport
interface TimelinesResource {

    /**
     * Retrieving a home timeline.
     */
    fun homeTimeline(
        request: TimelinesHomeTimelineRequest
    ): Response<Array<TimelinesHomeTimelineResponse>>

    /**
     * Retrieving a public timeline.
     */
    fun publicTimeline(
        request: TimelinesPublicTimelineRequest
    ): Response<Array<TimelinesPublicTimelineResponse>>

    /**
     * Retrieving a tag timeline.
     */
    fun hashtagTimeline(
        request: TimelinesHashTagTimelineRequest
    ): Response<Array<TimelinesHashTagTimelineResponse>>

    /**
     * Retrieving a list timeline.
     */
    fun listTimeline(
        request: TimelinesListTimelineRequest
    ): Response<Array<TimelinesListTimelineResponse>>

    /**
     * Retrieving a conversations.
     */
    fun conversations(
        request: TimelinesConversationsRequest
    ): Response<Array<TimelinesConversationsResponse>>
}
