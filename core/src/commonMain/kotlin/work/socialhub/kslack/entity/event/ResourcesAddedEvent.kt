package work.socialhub.kslack.entity.event

/**
 * Subscribe to this event to receive deliveries as users install your Slack app,
 * add your app to channels and conversations, or approve your app for additional permissions and resources.
 *
 *
 * See Permissions API for further detail.
 *
 *
 * https://api.slack.com/events/resources_added
 */
class ResourcesAddedEvent : Event {
    override val type: String = TYPE_NAME
    var resources: Array<ResourceItem>? = null

    class ResourceItem {
        var resource: Resource? = null
        var scopes: Array<String>? = null
    }

    class Resource {
        var type: String? = null
        var grant: Grant? = null
    }

    class Grant {
        var type: String? = null
        var resourceId: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "resources_added"
    }
}