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
public class JzmWishUser implements Serializable {

    private static final long serialVersionUID = -6484923;

    private String authcode;
    private String state;
    private String id;
    private String accesstoken;
    private String version;
    private String account;
    private String authorizeurl;
    private String merchantid;
    private String storemanagername;

    public JzmWishUser() {}

    public JzmWishUser(JzmWishUser value) {
        this.authcode = value.authcode;
        this.state = value.state;
        this.id = value.id;
        this.accesstoken = value.accesstoken;
        this.version = value.version;
        this.account = value.account;
        this.authorizeurl = value.authorizeurl;
        this.merchantid = value.merchantid;
        this.storemanagername = value.storemanagername;
    }

    public JzmWishUser(
        String authcode,
        String state,
        String id,
        String accesstoken,
        String version,
        String account,
        String authorizeurl,
        String merchantid,
        String storemanagername
    ) {
        this.authcode = authcode;
        this.state = state;
        this.id = id;
        this.accesstoken = accesstoken;
        this.version = version;
        this.account = account;
        this.authorizeurl = authorizeurl;
        this.merchantid = merchantid;
        this.storemanagername = storemanagername;
    }

    public String getAuthcode() {
        return this.authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccesstoken() {
        return this.accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAuthorizeurl() {
        return this.authorizeurl;
    }

    public void setAuthorizeurl(String authorizeurl) {
        this.authorizeurl = authorizeurl;
    }

    public String getMerchantid() {
        return this.merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getStoremanagername() {
        return this.storemanagername;
    }

    public void setStoremanagername(String storemanagername) {
        this.storemanagername = storemanagername;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JzmWishUser (");

        sb.append(authcode);
        sb.append(", ").append(state);
        sb.append(", ").append(id);
        sb.append(", ").append(accesstoken);
        sb.append(", ").append(version);
        sb.append(", ").append(account);
        sb.append(", ").append(authorizeurl);
        sb.append(", ").append(merchantid);
        sb.append(", ").append(storemanagername);

        sb.append(")");
        return sb.toString();
    }
}