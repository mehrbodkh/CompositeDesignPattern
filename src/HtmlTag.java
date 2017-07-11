import java.util.List;

/**
 * Created by Mehrbod on 7/11/2017.
 */
public abstract class HtmlTag {
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not supported for the current object.");
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not supported for the current object.");
    }

    public void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not supported for the current object.");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Current operation is not supported for the current object.");
    }

    public abstract void generateHtml();

}
