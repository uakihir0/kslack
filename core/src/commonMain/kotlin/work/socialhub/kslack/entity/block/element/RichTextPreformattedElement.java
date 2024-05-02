package work.socialhub.kslack.entity.block.element;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
public class RichTextPreformattedElement extends BlockElement implements RichTextElement {

    public static final String TYPE = "rich_text_preformatted";
    private final String type = TYPE;
    private List<RichTextElement> elements = new ArrayList<>();

    public RichTextPreformattedElement(List<RichTextElement> elements) {
        this.elements = elements;
    }

    public RichTextPreformattedElement() {
    }

    public static RichTextPreformattedElementBuilder builder() {
        return new RichTextPreformattedElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public List<RichTextElement> getElements() {
        return this.elements;
    }

    public void setElements(List<RichTextElement> elements) {
        this.elements = elements;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RichTextPreformattedElement)) return false;
        final RichTextPreformattedElement other = (RichTextPreformattedElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$elements = this.getElements();
        final Object other$elements = other.getElements();
        if (this$elements == null ? other$elements != null : !this$elements.equals(other$elements)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RichTextPreformattedElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $elements = this.getElements();
        result = result * PRIME + ($elements == null ? 43 : $elements.hashCode());
        return result;
    }

    public static class RichTextPreformattedElementBuilder {
        private List<RichTextElement> elements;

        RichTextPreformattedElementBuilder() {
        }

        public RichTextPreformattedElement.RichTextPreformattedElementBuilder elements(List<RichTextElement> elements) {
            this.elements = elements;
            return this;
        }

        public RichTextPreformattedElement build() {
            return new RichTextPreformattedElement(elements);
        }

        public String toString() {
            return "RichTextPreformattedElement.RichTextPreformattedElementBuilder(elements=" + this.elements + ")";
        }
    }
}