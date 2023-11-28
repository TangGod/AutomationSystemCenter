/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.dummy_data.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.dummy_data.tables.DummyUserInfo;


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
public class DummyUserInfoRecord extends UpdatableRecordImpl<DummyUserInfoRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -1260149366;

    /**
     * Setter for <code>dummy_data.dummy_user_info.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_user_info.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dummy_data.dummy_user_info.user_name</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_user_info.user_name</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dummy_data.dummy_user_info.full_name</code>.
     */
    public void setFullName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_user_info.full_name</code>.
     */
    public String getFullName() {
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
        return DummyUserInfo.DUMMY_USER_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DummyUserInfo.DUMMY_USER_INFO.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DummyUserInfo.DUMMY_USER_INFO.FULL_NAME;
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
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFullName();
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
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyUserInfoRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyUserInfoRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyUserInfoRecord value3(String value) {
        setFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyUserInfoRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DummyUserInfoRecord
     */
    public DummyUserInfoRecord() {
        super(DummyUserInfo.DUMMY_USER_INFO);
    }

    /**
     * Create a detached, initialised DummyUserInfoRecord
     */
    public DummyUserInfoRecord(String id, String userName, String fullName) {
        super(DummyUserInfo.DUMMY_USER_INFO);

        set(0, id);
        set(1, userName);
        set(2, fullName);
    }
}