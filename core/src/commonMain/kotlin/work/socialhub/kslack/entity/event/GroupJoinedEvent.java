package work.socialhub.kslack.entity.event;

/**
 * The group_joined event is sent to all connections for a user when that user joins a private channel.
 * <p>
 * The channel value is the string identifier for the private channel.
 * <p>
 * https://api.slack.com/events/group_joined
 */
public class GroupJoinedEvent implements Event {

    public static final String TYPE_NAME = "group_joined";

    private final String type = TYPE_NAME;
    private Channel channel;

    public String getType() {
        return this.type;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public static class Channel {
        // TODO
    }

}