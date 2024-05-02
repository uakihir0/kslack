package work.socialhub.kslack.entity.event;

/**
 * The list of accounts a user is signed into has changed
 * <p>
 * The accounts_changed event is used by our web client
 * to maintain a list of logged-in accounts.
 * Other clients should ignore this event.
 * <p>
 * https://api.slack.com/events/accounts_changed
 */
public class AccountChangedEvent implements Event {

    public static final String TYPE_NAME = "accounts_changed";

    private final String type = TYPE_NAME;

    public String getType() {
        return this.type;
    }
}