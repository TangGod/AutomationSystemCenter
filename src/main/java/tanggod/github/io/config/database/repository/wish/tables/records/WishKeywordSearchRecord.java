/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.WishKeywordSearch;


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
public class WishKeywordSearchRecord extends UpdatableRecordImpl<WishKeywordSearchRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1672389178;

    /**
     * Setter for <code>wish.wish_keyword_search.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.wish_keyword_search.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.wish_keyword_search.cookie</code>.
     */
    public void setCookie(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.wish_keyword_search.cookie</code>.
     */
    public String getCookie() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.wish_keyword_search.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.wish_keyword_search.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WishKeywordSearch.WISH_KEYWORD_SEARCH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WishKeywordSearch.WISH_KEYWORD_SEARCH.COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WishKeywordSearch.WISH_KEYWORD_SEARCH.ACCESS_TOKEN;
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
        return getCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAccessToken();
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
        return getCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishKeywordSearchRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishKeywordSearchRecord value2(String value) {
        setCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishKeywordSearchRecord value3(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishKeywordSearchRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WishKeywordSearchRecord
     */
    public WishKeywordSearchRecord() {
        super(WishKeywordSearch.WISH_KEYWORD_SEARCH);
    }

    /**
     * Create a detached, initialised WishKeywordSearchRecord
     */
    public WishKeywordSearchRecord(String id, String cookie, String accessToken) {
        super(WishKeywordSearch.WISH_KEYWORD_SEARCH);

        set(0, id);
        set(1, cookie);
        set(2, accessToken);
    }
}
