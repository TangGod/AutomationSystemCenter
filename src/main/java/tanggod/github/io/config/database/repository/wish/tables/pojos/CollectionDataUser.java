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
public class CollectionDataUser implements Serializable {

    private static final long serialVersionUID = 1006570779;

    private String  id;
    private String  userName;
    private String  password;
    private String  wishCategoryId;
    private Integer permission;

    public CollectionDataUser() {}

    public CollectionDataUser(CollectionDataUser value) {
        this.id = value.id;
        this.userName = value.userName;
        this.password = value.password;
        this.wishCategoryId = value.wishCategoryId;
        this.permission = value.permission;
    }

    public CollectionDataUser(
        String  id,
        String  userName,
        String  password,
        String  wishCategoryId,
        Integer permission
    ) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.wishCategoryId = wishCategoryId;
        this.permission = permission;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getWishCategoryId() {
        return this.wishCategoryId;
    }

    public void setWishCategoryId(String wishCategoryId) {
        this.wishCategoryId = wishCategoryId;
    }

    public Integer getPermission() {
        return this.permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CollectionDataUser (");

        sb.append(id);
        sb.append(", ").append(userName);
        sb.append(", ").append(password);
        sb.append(", ").append(wishCategoryId);
        sb.append(", ").append(permission);

        sb.append(")");
        return sb.toString();
    }
}
