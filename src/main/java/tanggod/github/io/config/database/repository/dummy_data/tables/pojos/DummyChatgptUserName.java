/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.dummy_data.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DummyChatgptUserName implements Serializable {

    private static final long serialVersionUID = -2077336737;

    private String id;
    private String russiaName;

    public DummyChatgptUserName() {}

    public DummyChatgptUserName(DummyChatgptUserName value) {
        this.id = value.id;
        this.russiaName = value.russiaName;
    }

    public DummyChatgptUserName(
        String id,
        String russiaName
    ) {
        this.id = id;
        this.russiaName = russiaName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRussiaName() {
        return this.russiaName;
    }

    public void setRussiaName(String russiaName) {
        this.russiaName = russiaName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DummyChatgptUserName (");

        sb.append(id);
        sb.append(", ").append(russiaName);

        sb.append(")");
        return sb.toString();
    }
}
