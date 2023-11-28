/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import tanggod.github.io.config.database.repository.wish.Wish;
import tanggod.github.io.config.database.repository.wish.tables.records.WishViolationRecord;


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
public class WishViolation extends TableImpl<WishViolationRecord> {

    private static final long serialVersionUID = -519144771;

    /**
     * The reference instance of <code>wish.wish_violation</code>
     */
    public static final WishViolation WISH_VIOLATION = new WishViolation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WishViolationRecord> getRecordType() {
        return WishViolationRecord.class;
    }

    /**
     * The column <code>wish.wish_violation.fine_amount</code>.
     */
    public final TableField<WishViolationRecord, Double> FINE_AMOUNT = createField("fine_amount", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>wish.wish_violation.reason</code>.
     */
    public final TableField<WishViolationRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.last_updated</code>.
     */
    public final TableField<WishViolationRecord, Timestamp> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.created_time</code>.
     */
    public final TableField<WishViolationRecord, Timestamp> CREATED_TIME = createField("created_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.state</code>.
     */
    public final TableField<WishViolationRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.message</code>.
     */
    public final TableField<WishViolationRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>wish.wish_violation.proof_type</code>.
     */
    public final TableField<WishViolationRecord, String> PROOF_TYPE = createField("proof_type", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.product_id</code>.
     */
    public final TableField<WishViolationRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.id</code>.
     */
    public final TableField<WishViolationRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_violation.auth_code</code>.
     */
    public final TableField<WishViolationRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * Create a <code>wish.wish_violation</code> table reference
     */
    public WishViolation() {
        this(DSL.name("wish_violation"), null);
    }

    /**
     * Create an aliased <code>wish.wish_violation</code> table reference
     */
    public WishViolation(String alias) {
        this(DSL.name(alias), WISH_VIOLATION);
    }

    /**
     * Create an aliased <code>wish.wish_violation</code> table reference
     */
    public WishViolation(Name alias) {
        this(alias, WISH_VIOLATION);
    }

    private WishViolation(Name alias, Table<WishViolationRecord> aliased) {
        this(alias, aliased, null);
    }

    private WishViolation(Name alias, Table<WishViolationRecord> aliased, Field<?>[] parameters) {
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
    public WishViolation as(String alias) {
        return new WishViolation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishViolation as(Name alias) {
        return new WishViolation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WishViolation rename(String name) {
        return new WishViolation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WishViolation rename(Name name) {
        return new WishViolation(name, null);
    }
}
