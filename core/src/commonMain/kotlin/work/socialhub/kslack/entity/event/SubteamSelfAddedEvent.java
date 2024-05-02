package work.socialhub.kslack.entity.event;

/**
 * The subteam_self_added event is sent to you when you have been added to an existing User Group.
 * Clients can use this to update their local list of User Groups.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/subteam_self_added
 */
public class SubteamSelfAddedEvent implements Event {

    public static final String TYPE_NAME = "subteam_self_added";

    private final String type = TYPE_NAME;
    private String subteamId;

    public String getType() {
        return this.type;
    }

    public String getSubteamId() {
        return this.subteamId;
    }

    public void setSubteamId(String subteamId) {
        this.subteamId = subteamId;
    }
}