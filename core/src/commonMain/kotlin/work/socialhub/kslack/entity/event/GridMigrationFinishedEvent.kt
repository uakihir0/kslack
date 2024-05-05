package work.socialhub.kslack.entity.event

/**
 * This Events API-only event is sent via subscription whenever your app is installed by completes migration to Enterprise Grid.
 *
 *
 * The example above details the complete Events API payload, including the event wrapper.
 * The team_id indicates which workspace is migrating.
 *
 *
 * By also subscribing to the grid_migration_started event, you'll receive notice when the migration began.
 *
 *
 * It's best to cease API and platform operations for a workspace during migration.
 * While duration varies workspace-to-workspace, expect an extended period of unavailability.
 *
 *
 * https://api.slack.com/events/grid_migration_finished
 */
class GridMigrationFinishedEvent : Event {
    override val type: String = TYPE_NAME
    var enterpriseId: String? = null

    companion object {
        const val TYPE_NAME: String = "grid_migration_finished"
    }
}