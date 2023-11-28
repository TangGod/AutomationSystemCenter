/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class DesktopApplication implements Serializable {

    private static final long serialVersionUID = -1434606256;

    private String    id;
    private String    username;
    private String    permission;
    private Timestamp createDate;

    public DesktopApplication() {}

    public DesktopApplication(DesktopApplication value) {
        this.id = value.id;
        this.username = value.username;
        this.permission = value.permission;
        this.createDate = value.createDate;
    }

    public DesktopApplication(
        String    id,
        String    username,
        String    permission,
        Timestamp createDate
    ) {
        this.id = id;
        this.username = username;
        this.permission = permission;
        this.createDate = createDate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DesktopApplication (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(permission);
        sb.append(", ").append(createDate);

        sb.append(")");
        return sb.toString();
    }
}