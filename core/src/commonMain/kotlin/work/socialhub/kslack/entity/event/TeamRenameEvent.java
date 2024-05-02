package work.socialhub.kslack.entity.event;

/**
 * The team_rename event is sent to all connections for a workspace when an admin changes the workspace name.
 * <p>
 * Clients can use this to update the display of the workspace name as soon as it changes.
 * If they don't the client will receive the new name the next time it calls rtm.start.
 * <p>
 * https://api.slack.com/events/team_rename
 */
public class TeamRenameEvent implements Event {

    public static final String TYPE_NAME = "team_rename";

    private final String type = TYPE_NAME;
    private String name;

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}