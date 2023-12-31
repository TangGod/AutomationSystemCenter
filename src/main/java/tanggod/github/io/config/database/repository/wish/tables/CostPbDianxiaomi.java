/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables;


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
import tanggod.github.io.config.database.repository.wish.tables.records.CostPbDianxiaomiRecord;


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
public class CostPbDianxiaomi extends TableImpl<CostPbDianxiaomiRecord> {

    private static final long serialVersionUID = -1608457409;

    /**
     * The reference instance of <code>wish.cost_pb_dianxiaomi</code>
     */
    public static final CostPbDianxiaomi COST_PB_DIANXIAOMI = new CostPbDianxiaomi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CostPbDianxiaomiRecord> getRecordType() {
        return CostPbDianxiaomiRecord.class;
    }

    /**
     * The column <code>wish.cost_pb_dianxiaomi.id</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.活动ID</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 活动ID = createField("活动ID", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.活动名称</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 活动名称 = createField("活动名称", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.店铺</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 店铺 = createField("店铺", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.预算</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, Double> 预算 = createField("预算", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.费用</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, Double> 费用 = createField("费用", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.付费流量</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, Integer> 付费流量 = createField("付费流量", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.订单</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, Integer> 订单 = createField("订单", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.成交总额</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, Double> 成交总额 = createField("成交总额", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.花费成交比</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 花费成交比 = createField("花费成交比", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.费用预算比</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 费用预算比 = createField("费用预算比", org.jooq.impl.SQLDataType.VARCHAR(599).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.开始时间</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 开始时间 = createField("开始时间", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.结束时间</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 结束时间 = createField("结束时间", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.活动状态</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 活动状态 = createField("活动状态", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_pb_dianxiaomi.批次时间</code>.
     */
    public final TableField<CostPbDianxiaomiRecord, String> 批次时间 = createField("批次时间", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * Create a <code>wish.cost_pb_dianxiaomi</code> table reference
     */
    public CostPbDianxiaomi() {
        this(DSL.name("cost_pb_dianxiaomi"), null);
    }

    /**
     * Create an aliased <code>wish.cost_pb_dianxiaomi</code> table reference
     */
    public CostPbDianxiaomi(String alias) {
        this(DSL.name(alias), COST_PB_DIANXIAOMI);
    }

    /**
     * Create an aliased <code>wish.cost_pb_dianxiaomi</code> table reference
     */
    public CostPbDianxiaomi(Name alias) {
        this(alias, COST_PB_DIANXIAOMI);
    }

    private CostPbDianxiaomi(Name alias, Table<CostPbDianxiaomiRecord> aliased) {
        this(alias, aliased, null);
    }

    private CostPbDianxiaomi(Name alias, Table<CostPbDianxiaomiRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.COST_PB_DIANXIAOMI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CostPbDianxiaomiRecord> getPrimaryKey() {
        return Keys.KEY_COST_PB_DIANXIAOMI_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CostPbDianxiaomiRecord>> getKeys() {
        return Arrays.<UniqueKey<CostPbDianxiaomiRecord>>asList(Keys.KEY_COST_PB_DIANXIAOMI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CostPbDianxiaomi as(String alias) {
        return new CostPbDianxiaomi(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CostPbDianxiaomi as(Name alias) {
        return new CostPbDianxiaomi(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CostPbDianxiaomi rename(String name) {
        return new CostPbDianxiaomi(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CostPbDianxiaomi rename(Name name) {
        return new CostPbDianxiaomi(name, null);
    }
}
