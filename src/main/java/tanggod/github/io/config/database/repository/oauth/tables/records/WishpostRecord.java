/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.oauth.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.oauth.tables.Wishpost;


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
public class WishpostRecord extends UpdatableRecordImpl<WishpostRecord> implements Record9<String, String, String, String, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 139309949;

    /**
     * Setter for <code>OAuth.wishpost.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>OAuth.wishpost.client_id</code>.
     */
    public void setClientId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.client_id</code>.
     */
    public String getClientId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>OAuth.wishpost.client_secret</code>.
     */
    public void setClientSecret(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.client_secret</code>.
     */
    public String getClientSecret() {
        return (String) get(2);
    }

    /**
     * Setter for <code>OAuth.wishpost.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>OAuth.wishpost.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>OAuth.wishpost.refresh_token</code>.
     */
    public void setRefreshToken(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.refresh_token</code>.
     */
    public String getRefreshToken() {
        return (String) get(5);
    }

    /**
     * Setter for <code>OAuth.wishpost.access_token_expiry_time</code>.
     */
    public void setAccessTokenExpiryTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.access_token_expiry_time</code>.
     */
    public Timestamp getAccessTokenExpiryTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>OAuth.wishpost.refresh_token_expiry_time</code>.
     */
    public void setRefreshTokenExpiryTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.refresh_token_expiry_time</code>.
     */
    public Timestamp getRefreshTokenExpiryTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>OAuth.wishpost.scope</code>.
     */
    public void setScope(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>OAuth.wishpost.scope</code>.
     */
    public String getScope() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Wishpost.WISHPOST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Wishpost.WISHPOST.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Wishpost.WISHPOST.CLIENT_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Wishpost.WISHPOST.ACCESS_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Wishpost.WISHPOST.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Wishpost.WISHPOST.REFRESH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Wishpost.WISHPOST.ACCESS_TOKEN_EXPIRY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Wishpost.WISHPOST.REFRESH_TOKEN_EXPIRY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Wishpost.WISHPOST.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getClientSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getAccessTokenExpiryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getRefreshTokenExpiryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClientSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getAccessTokenExpiryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getRefreshTokenExpiryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value2(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value3(String value) {
        setClientSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value4(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value5(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value6(String value) {
        setRefreshToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value7(Timestamp value) {
        setAccessTokenExpiryTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value8(Timestamp value) {
        setRefreshTokenExpiryTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord value9(String value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishpostRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Timestamp value7, Timestamp value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WishpostRecord
     */
    public WishpostRecord() {
        super(Wishpost.WISHPOST);
    }

    /**
     * Create a detached, initialised WishpostRecord
     */
    public WishpostRecord(String id, String clientId, String clientSecret, String accessToken, String authCode, String refreshToken, Timestamp accessTokenExpiryTime, Timestamp refreshTokenExpiryTime, String scope) {
        super(Wishpost.WISHPOST);

        set(0, id);
        set(1, clientId);
        set(2, clientSecret);
        set(3, accessToken);
        set(4, authCode);
        set(5, refreshToken);
        set(6, accessTokenExpiryTime);
        set(7, refreshTokenExpiryTime);
        set(8, scope);
    }
}