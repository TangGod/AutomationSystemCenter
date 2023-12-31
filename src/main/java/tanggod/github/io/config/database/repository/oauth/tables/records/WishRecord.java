/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.oauth.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.oauth.tables.Wish;


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
public class WishRecord extends UpdatableRecordImpl<WishRecord> implements Record10<String, String, String, String, String, Timestamp, String, String, Boolean, String> {

    private static final long serialVersionUID = -2060858398;

    /**
     * Setter for <code>OAuth.wish.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>OAuth.wish.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>OAuth.wish.client_id</code>.
     */
    public void setClientId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>OAuth.wish.client_id</code>.
     */
    public String getClientId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>OAuth.wish.client_secret</code>.
     */
    public void setClientSecret(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>OAuth.wish.client_secret</code>.
     */
    public String getClientSecret() {
        return (String) get(2);
    }

    /**
     * Setter for <code>OAuth.wish.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>OAuth.wish.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>OAuth.wish.merchant_id</code>.
     */
    public void setMerchantId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>OAuth.wish.merchant_id</code>.
     */
    public String getMerchantId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>OAuth.wish.expiry_time</code>.
     */
    public void setExpiryTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>OAuth.wish.expiry_time</code>.
     */
    public Timestamp getExpiryTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>OAuth.wish.refresh_token</code>.
     */
    public void setRefreshToken(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>OAuth.wish.refresh_token</code>.
     */
    public String getRefreshToken() {
        return (String) get(6);
    }

    /**
     * Setter for <code>OAuth.wish.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>OAuth.wish.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>OAuth.wish.enable_mail_notify</code>.
     */
    public void setEnableMailNotify(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>OAuth.wish.enable_mail_notify</code>.
     */
    public Boolean getEnableMailNotify() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>OAuth.wish.wishpost_auth_code</code>.
     */
    public void setWishpostAuthCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>OAuth.wish.wishpost_auth_code</code>.
     */
    public String getWishpostAuthCode() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, Timestamp, String, String, Boolean, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, Timestamp, String, String, Boolean, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Wish.WISH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Wish.WISH.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Wish.WISH.CLIENT_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Wish.WISH.ACCESS_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Wish.WISH.MERCHANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Wish.WISH.EXPIRY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Wish.WISH.REFRESH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Wish.WISH.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Wish.WISH.ENABLE_MAIL_NOTIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Wish.WISH.WISHPOST_AUTH_CODE;
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
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getExpiryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getEnableMailNotify();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getWishpostAuthCode();
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
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getExpiryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getEnableMailNotify();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWishpostAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value2(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value3(String value) {
        setClientSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value4(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value5(String value) {
        setMerchantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value6(Timestamp value) {
        setExpiryTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value7(String value) {
        setRefreshToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value8(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value9(Boolean value) {
        setEnableMailNotify(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord value10(String value) {
        setWishpostAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, String value7, String value8, Boolean value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WishRecord
     */
    public WishRecord() {
        super(Wish.WISH);
    }

    /**
     * Create a detached, initialised WishRecord
     */
    public WishRecord(String id, String clientId, String clientSecret, String accessToken, String merchantId, Timestamp expiryTime, String refreshToken, String authCode, Boolean enableMailNotify, String wishpostAuthCode) {
        super(Wish.WISH);

        set(0, id);
        set(1, clientId);
        set(2, clientSecret);
        set(3, accessToken);
        set(4, merchantId);
        set(5, expiryTime);
        set(6, refreshToken);
        set(7, authCode);
        set(8, enableMailNotify);
        set(9, wishpostAuthCode);
    }
}
