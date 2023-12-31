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
import tanggod.github.io.config.database.repository.wish.tables.records.JzmWarehouseOrderCodeRecord;


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
public class JzmWarehouseOrderCode extends TableImpl<JzmWarehouseOrderCodeRecord> {

    private static final long serialVersionUID = 1125374486;

    /**
     * The reference instance of <code>wish.jzm_warehouse_order_code</code>
     */
    public static final JzmWarehouseOrderCode JZM_WAREHOUSE_ORDER_CODE = new JzmWarehouseOrderCode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JzmWarehouseOrderCodeRecord> getRecordType() {
        return JzmWarehouseOrderCodeRecord.class;
    }

    /**
     * The column <code>wish.jzm_warehouse_order_code.warehouse_order_code</code>.
     */
    public final TableField<JzmWarehouseOrderCodeRecord, String> WAREHOUSE_ORDER_CODE = createField("warehouse_order_code", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.jzm_warehouse_order_code.auth_code</code>.
     */
    public final TableField<JzmWarehouseOrderCodeRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>wish.jzm_warehouse_order_code.create_date</code>.
     */
    public final TableField<JzmWarehouseOrderCodeRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.jzm_warehouse_order_code.enable</code>.
     */
    public final TableField<JzmWarehouseOrderCodeRecord, Boolean> ENABLE = createField("enable", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>wish.jzm_warehouse_order_code</code> table reference
     */
    public JzmWarehouseOrderCode() {
        this(DSL.name("jzm_warehouse_order_code"), null);
    }

    /**
     * Create an aliased <code>wish.jzm_warehouse_order_code</code> table reference
     */
    public JzmWarehouseOrderCode(String alias) {
        this(DSL.name(alias), JZM_WAREHOUSE_ORDER_CODE);
    }

    /**
     * Create an aliased <code>wish.jzm_warehouse_order_code</code> table reference
     */
    public JzmWarehouseOrderCode(Name alias) {
        this(alias, JZM_WAREHOUSE_ORDER_CODE);
    }

    private JzmWarehouseOrderCode(Name alias, Table<JzmWarehouseOrderCodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private JzmWarehouseOrderCode(Name alias, Table<JzmWarehouseOrderCodeRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.JZM_WAREHOUSE_ORDER_CODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JzmWarehouseOrderCodeRecord> getPrimaryKey() {
        return Keys.KEY_JZM_WAREHOUSE_ORDER_CODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JzmWarehouseOrderCodeRecord>> getKeys() {
        return Arrays.<UniqueKey<JzmWarehouseOrderCodeRecord>>asList(Keys.KEY_JZM_WAREHOUSE_ORDER_CODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCode as(String alias) {
        return new JzmWarehouseOrderCode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JzmWarehouseOrderCode as(Name alias) {
        return new JzmWarehouseOrderCode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JzmWarehouseOrderCode rename(String name) {
        return new JzmWarehouseOrderCode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JzmWarehouseOrderCode rename(Name name) {
        return new JzmWarehouseOrderCode(name, null);
    }
}
