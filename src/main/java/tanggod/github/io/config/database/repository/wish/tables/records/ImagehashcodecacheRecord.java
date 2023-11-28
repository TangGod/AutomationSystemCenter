/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.Imagehashcodecache;


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
public class ImagehashcodecacheRecord extends TableRecordImpl<ImagehashcodecacheRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -2064087510;

    /**
     * Setter for <code>wish.ImageHashCodeCache.hashCode</code>.
     */
    public void setHashcode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.ImageHashCodeCache.hashCode</code>.
     */
    public String getHashcode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.ImageHashCodeCache.productId</code>.
     */
    public void setProductid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.ImageHashCodeCache.productId</code>.
     */
    public String getProductid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.ImageHashCodeCache.category_id</code>.
     */
    public void setCategoryId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.ImageHashCodeCache.category_id</code>.
     */
    public String getCategoryId() {
        return (String) get(2);
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
        return Imagehashcodecache.IMAGEHASHCODECACHE.HASHCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Imagehashcodecache.IMAGEHASHCODECACHE.PRODUCTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Imagehashcodecache.IMAGEHASHCODECACHE.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHashcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProductid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHashcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProductid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagehashcodecacheRecord value1(String value) {
        setHashcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagehashcodecacheRecord value2(String value) {
        setProductid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagehashcodecacheRecord value3(String value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagehashcodecacheRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ImagehashcodecacheRecord
     */
    public ImagehashcodecacheRecord() {
        super(Imagehashcodecache.IMAGEHASHCODECACHE);
    }

    /**
     * Create a detached, initialised ImagehashcodecacheRecord
     */
    public ImagehashcodecacheRecord(String hashcode, String productid, String categoryId) {
        super(Imagehashcodecache.IMAGEHASHCODECACHE);

        set(0, hashcode);
        set(1, productid);
        set(2, categoryId);
    }
}