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
public class PlatformUser implements Serializable {

    private static final long serialVersionUID = -985279810;

    private String id;
    private String account;
    private String password;
    private String platformName;
    private String platformLoginUrl;

    public PlatformUser() {}

    public PlatformUser(PlatformUser value) {
        this.id = value.id;
        this.account = value.account;
        this.password = value.password;
        this.platformName = value.platformName;
        this.platformLoginUrl = value.platformLoginUrl;
    }

    public PlatformUser(
        String id,
        String account,
        String password,
        String platformName,
        String platformLoginUrl
    ) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.platformName = platformName;
        this.platformLoginUrl = platformLoginUrl;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlatformName() {
        return this.platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformLoginUrl() {
        return this.platformLoginUrl;
    }

    public void setPlatformLoginUrl(String platformLoginUrl) {
        this.platformLoginUrl = platformLoginUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PlatformUser (");

        sb.append(id);
        sb.append(", ").append(account);
        sb.append(", ").append(password);
        sb.append(", ").append(platformName);
        sb.append(", ").append(platformLoginUrl);

        sb.append(")");
        return sb.toString();
    }
}
