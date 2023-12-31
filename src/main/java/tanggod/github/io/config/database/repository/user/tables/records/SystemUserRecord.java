/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.user.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.user.tables.SystemUser;


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
public class SystemUserRecord extends UpdatableRecordImpl<SystemUserRecord> implements Record5<String, String, String, Boolean, String> {

    private static final long serialVersionUID = 592439684;

    /**
     * Setter for <code>user.system_user.user_id</code>.
     */
    public void setUserId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>user.system_user.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>user.system_user.user_name</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>user.system_user.user_name</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>user.system_user.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>user.system_user.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>user.system_user.permission</code>.
     */
    public void setPermission(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>user.system_user.permission</code>.
     */
    public Boolean getPermission() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>user.system_user.shop_auth_code</code>.
     */
    public void setShopAuthCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>user.system_user.shop_auth_code</code>.
     */
    public String getShopAuthCode() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Boolean, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SystemUser.SYSTEM_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SystemUser.SYSTEM_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemUser.SYSTEM_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return SystemUser.SYSTEM_USER.PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SystemUser.SYSTEM_USER.SHOP_AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUserId();
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
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getShopAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserId();
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
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getShopAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value4(Boolean value) {
        setPermission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value5(String value) {
        setShopAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord values(String value1, String value2, String value3, Boolean value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemUserRecord
     */
    public SystemUserRecord() {
        super(SystemUser.SYSTEM_USER);
    }

    /**
     * Create a detached, initialised SystemUserRecord
     */
    public SystemUserRecord(String userId, String userName, String password, Boolean permission, String shopAuthCode) {
        super(SystemUser.SYSTEM_USER);

        set(0, userId);
        set(1, userName);
        set(2, password);
        set(3, permission);
        set(4, shopAuthCode);
    }
}
