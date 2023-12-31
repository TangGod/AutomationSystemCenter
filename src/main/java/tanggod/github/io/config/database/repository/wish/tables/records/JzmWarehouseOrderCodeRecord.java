/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.JzmWarehouseOrderCode;


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
public class JzmWarehouseOrderCodeRecord extends UpdatableRecordImpl<JzmWarehouseOrderCodeRecord> implements Record4<String, String, Timestamp, Boolean> {

    private static final long serialVersionUID = 18054014;

    /**
     * Setter for <code>wish.jzm_warehouse_order_code.warehouse_order_code</code>.
     */
    public void setWarehouseOrderCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.jzm_warehouse_order_code.warehouse_order_code</code>.
     */
    public String getWarehouseOrderCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.jzm_warehouse_order_code.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.jzm_warehouse_order_code.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.jzm_warehouse_order_code.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.jzm_warehouse_order_code.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>wish.jzm_warehouse_order_code.enable</code>.
     */
    public void setEnable(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.jzm_warehouse_order_code.enable</code>.
     */
    public Boolean getEnable() {
        return (Boolean) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Timestamp, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Timestamp, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE.WAREHOUSE_ORDER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE.ENABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getWarehouseOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getWarehouseOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCodeRecord value1(String value) {
        setWarehouseOrderCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCodeRecord value2(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCodeRecord value3(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCodeRecord value4(Boolean value) {
        setEnable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCodeRecord values(String value1, String value2, Timestamp value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JzmWarehouseOrderCodeRecord
     */
    public JzmWarehouseOrderCodeRecord() {
        super(JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE);
    }

    /**
     * Create a detached, initialised JzmWarehouseOrderCodeRecord
     */
    public JzmWarehouseOrderCodeRecord(String warehouseOrderCode, String authCode, Timestamp createDate, Boolean enable) {
        super(JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE);

        set(0, warehouseOrderCode);
        set(1, authCode);
        set(2, createDate);
        set(3, enable);
    }
}
