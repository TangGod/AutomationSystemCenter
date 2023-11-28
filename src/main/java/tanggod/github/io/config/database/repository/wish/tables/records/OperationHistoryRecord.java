/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.OperationHistory;


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
public class OperationHistoryRecord extends UpdatableRecordImpl<OperationHistoryRecord> implements Record7<String, Timestamp, String, String, String, String, String> {

    private static final long serialVersionUID = -1287492710;

    /**
     * Setter for <code>wish.operation_history.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.operation_history.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.operation_history.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.operation_history.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>wish.operation_history.request_ip</code>.
     */
    public void setRequestIp(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.operation_history.request_ip</code>.
     */
    public String getRequestIp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wish.operation_history.index_name</code>.
     */
    public void setIndexName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.operation_history.index_name</code>.
     */
    public String getIndexName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wish.operation_history.collect_user_name</code>.
     */
    public void setCollectUserName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish.operation_history.collect_user_name</code>.
     */
    public String getCollectUserName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wish.operation_history.request_uri</code>.
     */
    public void setRequestUri(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish.operation_history.request_uri</code>.
     */
    public String getRequestUri() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wish.operation_history.reuqest_parameter</code>.
     */
    public void setReuqestParameter(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>wish.operation_history.reuqest_parameter</code>.
     */
    public String getReuqestParameter() {
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
    public Row7<String, Timestamp, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Timestamp, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return OperationHistory.OPERATION_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return OperationHistory.OPERATION_HISTORY.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OperationHistory.OPERATION_HISTORY.REQUEST_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OperationHistory.OPERATION_HISTORY.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OperationHistory.OPERATION_HISTORY.COLLECT_USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return OperationHistory.OPERATION_HISTORY.REQUEST_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return OperationHistory.OPERATION_HISTORY.REUQEST_PARAMETER;
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
    public Timestamp component2() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRequestIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCollectUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRequestUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getReuqestParameter();
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
    public Timestamp value2() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRequestIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCollectUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRequestUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getReuqestParameter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value2(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value3(String value) {
        setRequestIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value4(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value5(String value) {
        setCollectUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value6(String value) {
        setRequestUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord value7(String value) {
        setReuqestParameter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationHistoryRecord values(String value1, Timestamp value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached OperationHistoryRecord
     */
    public OperationHistoryRecord() {
        super(OperationHistory.OPERATION_HISTORY);
    }

    /**
     * Create a detached, initialised OperationHistoryRecord
     */
    public OperationHistoryRecord(String id, Timestamp createDate, String requestIp, String indexName, String collectUserName, String requestUri, String reuqestParameter) {
        super(OperationHistory.OPERATION_HISTORY);

        set(0, id);
        set(1, createDate);
        set(2, requestIp);
        set(3, indexName);
        set(4, collectUserName);
        set(5, requestUri);
        set(6, reuqestParameter);
    }
}
