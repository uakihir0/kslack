package work.socialhub.kslack.entity.event;

import java.io.Serializable;

public interface Event extends Serializable {

    String getType();

    default String getSubtype() {
        return null;
    }

}
