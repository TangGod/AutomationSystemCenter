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
import tanggod.github.io.config.database.repository.wish.tables.records.CostTotalRecord;


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
public class CostTotal extends TableImpl<CostTotalRecord> {

    private static final long serialVersionUID = -162991937;

    /**
     * The reference instance of <code>wish.cost_total</code>
     */
    public static final CostTotal COST_TOTAL = new CostTotal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CostTotalRecord> getRecordType() {
        return CostTotalRecord.class;
    }

    /**
     * The column <code>wish.cost_total.id</code>.
     */
    public final TableField<CostTotalRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.shop</code>.
     */
    public final TableField<CostTotalRecord, String> SHOP = createField("shop", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.currentDate</code>.
     */
    public final TableField<CostTotalRecord, String> CURRENTDATE = createField("currentDate", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.成交总额</code>.
     */
    public final TableField<CostTotalRecord, Double> 成交总额 = createField("成交总额", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.总订单数</code>.
     */
    public final TableField<CostTotalRecord, Double> 总订单数 = createField("总订单数", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.总花费</code>.
     */
    public final TableField<CostTotalRecord, Double> 总花费 = createField("总花费", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.花费与利润占比</code>.
     */
    public final TableField<CostTotalRecord, Double> 花费与利润占比 = createField("花费与利润占比", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.cost_total.平均每单价格</code>.
     */
    public final TableField<CostTotalRecord, Double> 平均每单价格 = createField("平均每单价格", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * Create a <code>wish.cost_total</code> table reference
     */
    public CostTotal() {
        this(DSL.name("cost_total"), null);
    }

    /**
     * Create an aliased <code>wish.cost_total</code> table reference
     */
    public CostTotal(String alias) {
        this(DSL.name(alias), COST_TOTAL);
    }

    /**
     * Create an aliased <code>wish.cost_total</code> table reference
     */
    public CostTotal(Name alias) {
        this(alias, COST_TOTAL);
    }

    private CostTotal(Name alias, Table<CostTotalRecord> aliased) {
        this(alias, aliased, null);
    }

    private CostTotal(Name alias, Table<CostTotalRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.COST_TOTAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CostTotalRecord> getPrimaryKey() {
        return Keys.KEY_COST_TOTAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CostTotalRecord>> getKeys() {
        return Arrays.<UniqueKey<CostTotalRecord>>asList(Keys.KEY_COST_TOTAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CostTotal as(String alias) {
        return new CostTotal(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CostTotal as(Name alias) {
        return new CostTotal(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CostTotal rename(String name) {
        return new CostTotal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CostTotal rename(Name name) {
        return new CostTotal(name, null);
    }
}
