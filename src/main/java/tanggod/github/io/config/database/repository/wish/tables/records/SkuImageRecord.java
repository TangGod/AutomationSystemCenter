/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.SkuImage;


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
public class SkuImageRecord extends UpdatableRecordImpl<SkuImageRecord> implements Record7<String, String, String, Date, Long, String, String> {

    private static final long serialVersionUID = 1731598244;

    /**
     * Setter for <code>wish.sku_image.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.sku_image.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.sku_image.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.sku_image.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.sku_image.parentSKU</code>.
     */
    public void setParentsku(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.sku_image.parentSKU</code>.
     */
    public String getParentsku() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wish.sku_image.createDate</code>.
     */
    public void setCreatedate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.sku_image.createDate</code>.
     */
    public Date getCreatedate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>wish.sku_image.fileSize</code>.
     */
    public void setFilesize(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish.sku_image.fileSize</code>.
     */
    public Long getFilesize() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>wish.sku_image.userId</code>.
     */
    public void setUserid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish.sku_image.userId</code>.
     */
    public String getUserid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wish.sku_image.taskRecordId</code>.
     */
    public void setTaskrecordid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>wish.sku_image.taskRecordId</code>.
     */
    public String getTaskrecordid() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Date, Long, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Date, Long, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SkuImage.SKU_IMAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SkuImage.SKU_IMAGE.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SkuImage.SKU_IMAGE.PARENTSKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return SkuImage.SKU_IMAGE.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return SkuImage.SKU_IMAGE.FILESIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SkuImage.SKU_IMAGE.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SkuImage.SKU_IMAGE.TASKRECORDID;
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getParentsku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getFilesize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTaskrecordid();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentsku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getFilesize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTaskrecordid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value2(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value3(String value) {
        setParentsku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value4(Date value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value5(Long value) {
        setFilesize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value6(String value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord value7(String value) {
        setTaskrecordid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SkuImageRecord values(String value1, String value2, String value3, Date value4, Long value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SkuImageRecord
     */
    public SkuImageRecord() {
        super(SkuImage.SKU_IMAGE);
    }

    /**
     * Create a detached, initialised SkuImageRecord
     */
    public SkuImageRecord(String id, String url, String parentsku, Date createdate, Long filesize, String userid, String taskrecordid) {
        super(SkuImage.SKU_IMAGE);

        set(0, id);
        set(1, url);
        set(2, parentsku);
        set(3, createdate);
        set(4, filesize);
        set(5, userid);
        set(6, taskrecordid);
    }
}
