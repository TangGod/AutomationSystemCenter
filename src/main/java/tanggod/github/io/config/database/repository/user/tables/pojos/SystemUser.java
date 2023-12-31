/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.user.tables.pojos;


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
public class SystemUser implements Serializable {

    private static final long serialVersionUID = -657229071;

    private String  userId;
    private String  userName;
    private String  password;
    private Boolean permission;
    private String  shopAuthCode;

    public SystemUser() {}

    public SystemUser(SystemUser value) {
        this.userId = value.userId;
        this.userName = value.userName;
        this.password = value.password;
        this.permission = value.permission;
        this.shopAuthCode = value.shopAuthCode;
    }

    public SystemUser(
        String  userId,
        String  userName,
        String  password,
        Boolean permission,
        String  shopAuthCode
    ) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.permission = permission;
        this.shopAuthCode = shopAuthCode;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getPermission() {
        return this.permission;
    }

    public void setPermission(Boolean permission) {
        this.permission = permission;
    }

    public String getShopAuthCode() {
        return this.shopAuthCode;
    }

    public void setShopAuthCode(String shopAuthCode) {
        this.shopAuthCode = shopAuthCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemUser (");

        sb.append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(password);
        sb.append(", ").append(permission);
        sb.append(", ").append(shopAuthCode);

        sb.append(")");
        return sb.toString();
    }
}
