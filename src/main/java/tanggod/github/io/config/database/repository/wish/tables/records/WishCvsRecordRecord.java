/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.WishCvsRecord;


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
public class WishCvsRecordRecord extends UpdatableRecordImpl<WishCvsRecordRecord> implements Record6<String, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = 690600184;

    /**
     * Setter for <code>wish.wish_cvs_record.job_id</code>.
     */
    public void setJobId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.wish_cvs_record.job_id</code>.
     */
    public String getJobId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.wish_cvs_record.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.wish_cvs_record.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.wish_cvs_record.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.wish_cvs_record.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wish.wish_cvs_record.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.wish_cvs_record.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wish.wish_cvs_record.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish.wish_cvs_record.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>wish.wish_cvs_record.filePath</code>.
     */
    public void setFilepath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish.wish_cvs_record.filePath</code>.
     */
    public String getFilepath() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Timestamp, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WishCvsRecord.WISH_CVS_RECORD.JOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WishCvsRecord.WISH_CVS_RECORD.ACCESS_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WishCvsRecord.WISH_CVS_RECORD.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WishCvsRecord.WISH_CVS_RECORD.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return WishCvsRecord.WISH_CVS_RECORD.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WishCvsRecord.WISH_CVS_RECORD.FILEPATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getFilepath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFilepath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord value1(String value) {
        setJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord value2(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord value4(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord value5(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord value6(String value) {
        setFilepath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCvsRecordRecord values(String value1, String value2, String value3, String value4, Timestamp value5, String value6) {
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
     * Create a detached WishCvsRecordRecord
     */
    public WishCvsRecordRecord() {
        super(WishCvsRecord.WISH_CVS_RECORD);
    }

    /**
     * Create a detached, initialised WishCvsRecordRecord
     */
    public WishCvsRecordRecord(String jobId, String accessToken, String type, String authCode, Timestamp createDate, String filepath) {
        super(WishCvsRecord.WISH_CVS_RECORD);

        set(0, jobId);
        set(1, accessToken);
        set(2, type);
        set(3, authCode);
        set(4, createDate);
        set(5, filepath);
    }
}
