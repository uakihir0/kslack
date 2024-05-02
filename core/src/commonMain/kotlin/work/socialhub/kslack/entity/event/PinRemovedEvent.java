package work.socialhub.kslack.entity.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * When an item is un-pinned from a channel, the pin_removed event is sent to all members of that channel.
 * <p>
 * The has_pins property indicates that there are other pinned items in that channel.
 * <p>
 * https://api.slack.com/events/pin_removed
 */
public class PinRemovedEvent implements Event {

    public static final String TYPE_NAME = "pin_removed";

    private final String type = TYPE_NAME;
    private String user;
    private String channelId;
    private Item item;
    private boolean hasPins;
    private String eventTs;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public Item getItem() {
        return this.item;
    }

    public boolean isHasPins() {
        return this.hasPins;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setHasPins(boolean hasPins) {
        this.hasPins = hasPins;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public static class Item {
        private String type;
        private String channel;
        private String createdBy; // user id
        private Integer created;

        private Message message;
        private File file; // TODO: correct definition
        private FileComment comment; // TODO: correct definition

        public String getType() {
            return this.type;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getCreatedBy() {
            return this.createdBy;
        }

        public Integer getCreated() {
            return this.created;
        }

        public Message getMessage() {
            return this.message;
        }

        public File getFile() {
            return this.file;
        }

        public FileComment getComment() {
            return this.comment;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setComment(FileComment comment) {
            this.comment = comment;
        }
    }

    public static class Message {
        private String clientMsgId;
        private String type;
        private String user;
        private String text;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;
        private String ts;
        private List<String> pinnedTo;
        private String permalink;

        public String getClientMsgId() {
            return this.clientMsgId;
        }

        public String getType() {
            return this.type;
        }

        public String getUser() {
            return this.user;
        }

        public String getText() {
            return this.text;
        }

        public List<LayoutBlock> getBlocks() {
            return this.blocks;
        }

        public List<Attachment> getAttachments() {
            return this.attachments;
        }

        public String getTs() {
            return this.ts;
        }

        public List<String> getPinnedTo() {
            return this.pinnedTo;
        }

        public String getPermalink() {
            return this.permalink;
        }

        public void setClientMsgId(String clientMsgId) {
            this.clientMsgId = clientMsgId;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setBlocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
        }

        public void setAttachments(List<Attachment> attachments) {
            this.attachments = attachments;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public void setPinnedTo(List<String> pinnedTo) {
            this.pinnedTo = pinnedTo;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }
    }
}