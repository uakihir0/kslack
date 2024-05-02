package work.socialhub.kslack.entity.event;

/**
 * The im_close event is sent to all connections for a user when a direct message channel is closed by that user.
 * <p>
 * https://api.slack.com/events/im_close
 */
public class ImCloseEvent implements Event {

    public static final String TYPE_NAME = "im_close";

    private final String type = TYPE_NAME;
    private String user;
    private String channel;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}