package work.socialhub.kslack.entity.event

/**
 * The team_plan_change event is sent to all connections for a workspace when a the current billing plan is changed.
 * Currently possible values are: empty string, comp, std, plus.
 *
 *
 * https://api.slack.com/events/team_plan_change
 */
class TeamPlanChangeEvent : Event {
    override val type: String = TYPE_NAME
    var plan: String? = null // possible values are: empty string, comp, std, plus
    var isCanAddUra: Boolean = false
    var paidFeatures: Array<String>? = null

    companion object {
        const val TYPE_NAME: String = "team_plan_change"
    }
}