/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import tanggod.github.io.config.database.repository.wish.Indexes;
import tanggod.github.io.config.database.repository.wish.Keys;
import tanggod.github.io.config.database.repository.wish.Wish;
import tanggod.github.io.config.database.repository.wish.tables.records.SmsRecordRecord;


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
public class SmsRecord extends TableImpl<SmsRecordRecord> {

    private static final long serialVersionUID = -1726840320;

    /**
     * The reference instance of <code>wish.sms_record</code>
     */
    public static final SmsRecord SMS_RECORD = new SmsRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmsRecordRecord> getRecordType() {
        return SmsRecordRecord.class;
    }

    /**
     * The column <code>wish.sms_record.id</code>.
     */
    public final TableField<SmsRecordRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.sms_record.create_date</code>.
     */
    public final TableField<SmsRecordRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.sms_record.sms_verification_code_id</code>.
     */
    public final TableField<SmsRecordRecord, String> SMS_VERIFICATION_CODE_ID = createField("sms_verification_code_id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.sms_record.target_number</code>.
     */
    public final TableField<SmsRecordRecord, String> TARGET_NUMBER = createField("target_number", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.sms_record.state</code>.
     */
    public final TableField<SmsRecordRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.sms_record.send_date</code>.
     */
    public final TableField<SmsRecordRecord, Timestamp> SEND_DATE = createField("send_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>wish.sms_record.response</code>.
     */
    public final TableField<SmsRecordRecord, String> RESPONSE = createField("response", org.jooq.impl.SQLDataType.VARCHAR(10000), this, "");

    /**
     * Create a <code>wish.sms_record</code> table reference
     */
    public SmsRecord() {
        this(DSL.name("sms_record"), null);
    }

    /**
     * Create an aliased <code>wish.sms_record</code> table reference
     */
    public SmsRecord(String alias) {
        this(DSL.name(alias), SMS_RECORD);
    }

    /**
     * Create an aliased <code>wish.sms_record</code> table reference
     */
    public SmsRecord(Name alias) {
        this(alias, SMS_RECORD);
    }

    private SmsRecord(Name alias, Table<SmsRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmsRecord(Name alias, Table<SmsRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Wish.WISH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SMS_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SmsRecordRecord> getPrimaryKey() {
        return Keys.KEY_SMS_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SmsRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<SmsRecordRecord>>asList(Keys.KEY_SMS_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsRecord as(String alias) {
        return new SmsRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsRecord as(Name alias) {
        return new SmsRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsRecord rename(String name) {
        return new SmsRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsRecord rename(Name name) {
        return new SmsRecord(name, null);
    }
}
