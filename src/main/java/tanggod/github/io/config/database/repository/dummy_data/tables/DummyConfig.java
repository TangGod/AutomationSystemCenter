/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.dummy_data.tables;


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

import tanggod.github.io.config.database.repository.dummy_data.DummyData;
import tanggod.github.io.config.database.repository.dummy_data.Indexes;
import tanggod.github.io.config.database.repository.dummy_data.Keys;
import tanggod.github.io.config.database.repository.dummy_data.tables.records.DummyConfigRecord;


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
public class DummyConfig extends TableImpl<DummyConfigRecord> {

    private static final long serialVersionUID = 2061246792;

    /**
     * The reference instance of <code>dummy_data.dummy_config</code>
     */
    public static final DummyConfig DUMMY_CONFIG = new DummyConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DummyConfigRecord> getRecordType() {
        return DummyConfigRecord.class;
    }

    /**
     * The column <code>dummy_data.dummy_config.id</code>.
     */
    public final TableField<DummyConfigRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_config.us_order_proportion</code>. 美国订单占比
     */
    public final TableField<DummyConfigRecord, Integer> US_ORDER_PROPORTION = createField("us_order_proportion", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "美国订单占比");

    /**
     * The column <code>dummy_data.dummy_config.refund_order_number_benchmark</code>. 退款订单数基准
     */
    public final TableField<DummyConfigRecord, Integer> REFUND_ORDER_NUMBER_BENCHMARK = createField("refund_order_number_benchmark", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "退款订单数基准");

    /**
     * The column <code>dummy_data.dummy_config.shipped_successfully_order_quantity_benchmark</code>. 发货成功订单数基准
     */
    public final TableField<DummyConfigRecord, Integer> SHIPPED_SUCCESSFULLY_ORDER_QUANTITY_BENCHMARK = createField("shipped_successfully_order_quantity_benchmark", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "发货成功订单数基准");

    /**
     * The column <code>dummy_data.dummy_config.in_stock_count</code>.
     */
    public final TableField<DummyConfigRecord, Integer> IN_STOCK_COUNT = createField("in_stock_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_config.out_of_stock_count</code>.
     */
    public final TableField<DummyConfigRecord, Integer> OUT_OF_STOCK_COUNT = createField("out_of_stock_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_config.refund_rate</code>.
     */
    public final TableField<DummyConfigRecord, Double> REFUND_RATE = createField("refund_rate", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_config.waybill_number_application</code>.
     */
    public final TableField<DummyConfigRecord, Integer> WAYBILL_NUMBER_APPLICATION = createField("waybill_number_application", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>dummy_data.dummy_config</code> table reference
     */
    public DummyConfig() {
        this(DSL.name("dummy_config"), null);
    }

    /**
     * Create an aliased <code>dummy_data.dummy_config</code> table reference
     */
    public DummyConfig(String alias) {
        this(DSL.name(alias), DUMMY_CONFIG);
    }

    /**
     * Create an aliased <code>dummy_data.dummy_config</code> table reference
     */
    public DummyConfig(Name alias) {
        this(alias, DUMMY_CONFIG);
    }

    private DummyConfig(Name alias, Table<DummyConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private DummyConfig(Name alias, Table<DummyConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DummyData.DUMMY_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DUMMY_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DummyConfigRecord> getPrimaryKey() {
        return Keys.KEY_DUMMY_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DummyConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<DummyConfigRecord>>asList(Keys.KEY_DUMMY_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyConfig as(String alias) {
        return new DummyConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyConfig as(Name alias) {
        return new DummyConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DummyConfig rename(String name) {
        return new DummyConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DummyConfig rename(Name name) {
        return new DummyConfig(name, null);
    }
}
