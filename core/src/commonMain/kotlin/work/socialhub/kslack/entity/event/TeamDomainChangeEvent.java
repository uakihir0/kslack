package work.socialhub.kslack.entity.event;

/**
 * The team_domain_change event is sent to all connections for a workspace when the workspace domain changes.
 * <p>
 * Since the existing domain will continue to work (causing a redirect) until it is claimed by another workspace,
 * clients don't need to do anything special with this event. It is sent for the benefit of our web client,
 * which needs to reload when the domain changes.
 * <p>
 * https://api.slack.com/events/team_domain_change
 */
public class TeamDomainChangeEvent implements Event {

    public static final String TYPE_NAME = "team_domain_change";

    private final String type = TYPE_NAME;
    private String url;
    private String domain;

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}