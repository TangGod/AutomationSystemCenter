/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.pojos;


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
public class WishUser implements Serializable {

    private static final long serialVersionUID = -427398338;

    private String id;
    private String accessToken;
    private String username;
    private String actualname;
    private String dianxiaomiusername;

    public WishUser() {}

    public WishUser(WishUser value) {
        this.id = value.id;
        this.accessToken = value.accessToken;
        this.username = value.username;
        this.actualname = value.actualname;
        this.dianxiaomiusername = value.dianxiaomiusername;
    }

    public WishUser(
        String id,
        String accessToken,
        String username,
        String actualname,
        String dianxiaomiusername
    ) {
        this.id = id;
        this.accessToken = accessToken;
        this.username = username;
        this.actualname = actualname;
        this.dianxiaomiusername = dianxiaomiusername;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getActualname() {
        return this.actualname;
    }

    public void setActualname(String actualname) {
        this.actualname = actualname;
    }

    public String getDianxiaomiusername() {
        return this.dianxiaomiusername;
    }

    public void setDianxiaomiusername(String dianxiaomiusername) {
        this.dianxiaomiusername = dianxiaomiusername;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WishUser (");

        sb.append(id);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(username);
        sb.append(", ").append(actualname);
        sb.append(", ").append(dianxiaomiusername);

        sb.append(")");
        return sb.toString();
    }
}
