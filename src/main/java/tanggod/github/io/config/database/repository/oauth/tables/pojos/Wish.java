/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.oauth.tables.pojos;


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
public class Wish implements Serializable {

    private static final long serialVersionUID = -774051436;

    private String    id;
    private String    clientId;
    private String    clientSecret;
    private String    accessToken;
    private String    merchantId;
    private Timestamp expiryTime;
    private String    refreshToken;
    private String    authCode;
    private Boolean   enableMailNotify;
    private String    wishpostAuthCode;

    public Wish() {}

    public Wish(Wish value) {
        this.id = value.id;
        this.clientId = value.clientId;
        this.clientSecret = value.clientSecret;
        this.accessToken = value.accessToken;
        this.merchantId = value.merchantId;
        this.expiryTime = value.expiryTime;
        this.refreshToken = value.refreshToken;
        this.authCode = value.authCode;
        this.enableMailNotify = value.enableMailNotify;
        this.wishpostAuthCode = value.wishpostAuthCode;
    }

    public Wish(
        String    id,
        String    clientId,
        String    clientSecret,
        String    accessToken,
        String    merchantId,
        Timestamp expiryTime,
        String    refreshToken,
        String    authCode,
        Boolean   enableMailNotify,
        String    wishpostAuthCode
    ) {
        this.id = id;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessToken = accessToken;
        this.merchantId = merchantId;
        this.expiryTime = expiryTime;
        this.refreshToken = refreshToken;
        this.authCode = authCode;
        this.enableMailNotify = enableMailNotify;
        this.wishpostAuthCode = wishpostAuthCode;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Timestamp getExpiryTime() {
        return this.expiryTime;
    }

    public void setExpiryTime(Timestamp expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Boolean getEnableMailNotify() {
        return this.enableMailNotify;
    }

    public void setEnableMailNotify(Boolean enableMailNotify) {
        this.enableMailNotify = enableMailNotify;
    }

    public String getWishpostAuthCode() {
        return this.wishpostAuthCode;
    }

    public void setWishpostAuthCode(String wishpostAuthCode) {
        this.wishpostAuthCode = wishpostAuthCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Wish (");

        sb.append(id);
        sb.append(", ").append(clientId);
        sb.append(", ").append(clientSecret);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(merchantId);
        sb.append(", ").append(expiryTime);
        sb.append(", ").append(refreshToken);
        sb.append(", ").append(authCode);
        sb.append(", ").append(enableMailNotify);
        sb.append(", ").append(wishpostAuthCode);

        sb.append(")");
        return sb.toString();
    }
}
