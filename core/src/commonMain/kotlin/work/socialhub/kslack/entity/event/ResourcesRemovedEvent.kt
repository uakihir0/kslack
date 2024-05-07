package work.socialhub.kslack.entity.event

/**
 * Subscribe to this event to receive deliveries as users uninstall your Slack app
 * and remove your app to channels &amp; conversations.
 *
 *
 * See Permissions API for further detail.
 *
 *
 * https://api.slack.com/events/resources_removed
 */
class ResourcesRemovedEvent : Event {
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
        const val TYPE_NAME: String = "resources_removed"
    }
}