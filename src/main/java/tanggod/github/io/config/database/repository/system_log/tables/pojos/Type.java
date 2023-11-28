/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.system_log.tables.pojos;


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
public class Type implements Serializable {

    private static final long serialVersionUID = 606819736;

    private String id;
    private String name;
    private String method;

    public Type() {}

    public Type(Type value) {
        this.id = value.id;
        this.name = value.name;
        this.method = value.method;
    }

    public Type(
        String id,
        String name,
        String method
    ) {
        this.id = id;
        this.name = name;
        this.method = method;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Type (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(method);

        sb.append(")");
        return sb.toString();
    }
}