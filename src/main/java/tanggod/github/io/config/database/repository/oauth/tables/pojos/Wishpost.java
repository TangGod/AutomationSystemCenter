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
public class Wishpost implements Serializable {

    private static final long serialVersionUID = 2003486837;

    private String    id;
    private String    clientId;
    private String    clientSecret;
    private String    accessToken;
    private String    authCode;
    private String    refreshToken;
    private Timestamp accessTokenExpiryTime;
    private Timestamp refreshTokenExpiryTime;
    private String    scope;

    public Wishpost() {}

    public Wishpost(Wishpost value) {
        this.id = value.id;
        this.clientId = value.clientId;
        this.clientSecret = value.clientSecret;
        this.accessToken = value.accessToken;
        this.authCode = value.authCode;
        this.refreshToken = value.refreshToken;
        this.accessTokenExpiryTime = value.accessTokenExpiryTime;
        this.refreshTokenExpiryTime = value.refreshTokenExpiryTime;
        this.scope = value.scope;
    }

    public Wishpost(
        String    id,
        String    clientId,
        String    clientSecret,
        String    accessToken,
        String    authCode,
        String    refreshToken,
        Timestamp accessTokenExpiryTime,
        Timestamp refreshTokenExpiryTime,
        String    scope
    ) {
        this.id = id;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessToken = accessToken;
        this.authCode = authCode;
        this.refreshToken = refreshToken;
        this.accessTokenExpiryTime = accessTokenExpiryTime;
        this.refreshTokenExpiryTime = refreshTokenExpiryTime;
        this.scope = scope;
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

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Timestamp getAccessTokenExpiryTime() {
        return this.accessTokenExpiryTime;
    }

    public void setAccessTokenExpiryTime(Timestamp accessTokenExpiryTime) {
        this.accessTokenExpiryTime = accessTokenExpiryTime;
    }

    public Timestamp getRefreshTokenExpiryTime() {
        return this.refreshTokenExpiryTime;
    }

    public void setRefreshTokenExpiryTime(Timestamp refreshTokenExpiryTime) {
        this.refreshTokenExpiryTime = refreshTokenExpiryTime;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Wishpost (");

        sb.append(id);
        sb.append(", ").append(clientId);
        sb.append(", ").append(clientSecret);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(authCode);
        sb.append(", ").append(refreshToken);
        sb.append(", ").append(accessTokenExpiryTime);
        sb.append(", ").append(refreshTokenExpiryTime);
        sb.append(", ").append(scope);

        sb.append(")");
        return sb.toString();
    }
}