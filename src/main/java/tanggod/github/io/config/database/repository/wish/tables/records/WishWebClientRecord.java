/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.WishWebClient;


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
public class WishWebClientRecord extends TableRecordImpl<WishWebClientRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = -963166319;

    /**
     * Setter for <code>wish.wish_web_client.cookie</code>.
     */
    public void setCookie(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.wish_web_client.cookie</code>.
     */
    public String getCookie() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.wish_web_client.price_cookie</code>.
     */
    public void setPriceCookie(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.wish_web_client.price_cookie</code>.
     */
    public String getPriceCookie() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.wish_web_client.search_cookie</code>.
     */
    public void setSearchCookie(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.wish_web_client.search_cookie</code>.
     */
    public String getSearchCookie() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wish.wish_web_client.de_cookie</code>.
     */
    public void setDeCookie(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.wish_web_client.de_cookie</code>.
     */
    public String getDeCookie() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wish.wish_web_client.gb_cookie</code>.
     */
    public void setGbCookie(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish.wish_web_client.gb_cookie</code>.
     */
    public String getGbCookie() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wish.wish_web_client.fr_cookie</code>.
     */
    public void setFrCookie(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish.wish_web_client.fr_cookie</code>.
     */
    public String getFrCookie() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WishWebClient.WISH_WEB_CLIENT.COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WishWebClient.WISH_WEB_CLIENT.PRICE_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WishWebClient.WISH_WEB_CLIENT.SEARCH_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WishWebClient.WISH_WEB_CLIENT.DE_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WishWebClient.WISH_WEB_CLIENT.GB_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WishWebClient.WISH_WEB_CLIENT.FR_COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPriceCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSearchCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDeCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGbCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getFrCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPriceCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSearchCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDeCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGbCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFrCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord value1(String value) {
        setCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord value2(String value) {
        setPriceCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord value3(String value) {
        setSearchCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord value4(String value) {
        setDeCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord value5(String value) {
        setGbCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord value6(String value) {
        setFrCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClientRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WishWebClientRecord
     */
    public WishWebClientRecord() {
        super(WishWebClient.WISH_WEB_CLIENT);
    }

    /**
     * Create a detached, initialised WishWebClientRecord
     */
    public WishWebClientRecord(String cookie, String priceCookie, String searchCookie, String deCookie, String gbCookie, String frCookie) {
        super(WishWebClient.WISH_WEB_CLIENT);

        set(0, cookie);
        set(1, priceCookie);
        set(2, searchCookie);
        set(3, deCookie);
        set(4, gbCookie);
        set(5, frCookie);
    }
}
