package work.socialhub.kslack.entity.event

/**
 * The team_domain_change event is sent to all connections for a workspace when the workspace domain changes.
 *
 *
 * Since the existing domain will continue to work (causing a redirect) until it is claimed by another workspace,
 * clients don't need to do anything special with this event. It is sent for the benefit of our web client,
 * which needs to reload when the domain changes.
 *
 *
 * https://api.slack.com/events/team_domain_change
 */
class TeamDomainChangeEvent : Event {
    override val type: String = TYPE_NAME
    var url: String? = null
    var domain: String? = null

    companion object {
        const val TYPE_NAME: String = "team_domain_change"
    }
}