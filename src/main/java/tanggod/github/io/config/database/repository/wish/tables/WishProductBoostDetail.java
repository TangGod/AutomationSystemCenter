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
import tanggod.github.io.config.database.repository.wish.tables.records.WishProductBoostDetailRecord;


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
public class WishProductBoostDetail extends TableImpl<WishProductBoostDetailRecord> {

    private static final long serialVersionUID = -743195210;

    /**
     * The reference instance of <code>wish.wish_product_boost_detail</code>
     */
    public static final WishProductBoostDetail WISH_PRODUCT_BOOST_DETAIL = new WishProductBoostDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WishProductBoostDetailRecord> getRecordType() {
        return WishProductBoostDetailRecord.class;
    }

    /**
     * The column <code>wish.wish_product_boost_detail.campaign_id</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> CAMPAIGN_ID = createField("campaign_id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.campaign_max_budget</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Double> CAMPAIGN_MAX_BUDGET = createField("campaign_max_budget", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.total_campaign_spend</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Double> TOTAL_CAMPAIGN_SPEND = createField("total_campaign_spend", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.gmv</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Double> GMV = createField("gmv", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.sales</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Integer> SALES = createField("sales", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.product_id</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.merchant_bid_rate</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> MERCHANT_BID_RATE = createField("merchant_bid_rate", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.keywords</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> KEYWORDS = createField("keywords", org.jooq.impl.SQLDataType.VARCHAR(2000), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.status</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.authCode</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> AUTHCODE = createField("authCode", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.id</code>.
     */
    public final TableField<WishProductBoostDetailRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.start_time</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.end_time</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.wish_product_boost_detail.is_simple_boost</code>.
     */
    public final TableField<WishProductBoostDetailRecord, Boolean> IS_SIMPLE_BOOST = createField("is_simple_boost", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>wish.wish_product_boost_detail</code> table reference
     */
    public WishProductBoostDetail() {
        this(DSL.name("wish_product_boost_detail"), null);
    }

    /**
     * Create an aliased <code>wish.wish_product_boost_detail</code> table reference
     */
    public WishProductBoostDetail(String alias) {
        this(DSL.name(alias), WISH_PRODUCT_BOOST_DETAIL);
    }

    /**
     * Create an aliased <code>wish.wish_product_boost_detail</code> table reference
     */
    public WishProductBoostDetail(Name alias) {
        this(alias, WISH_PRODUCT_BOOST_DETAIL);
    }

    private WishProductBoostDetail(Name alias, Table<WishProductBoostDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private WishProductBoostDetail(Name alias, Table<WishProductBoostDetailRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.WISH_PRODUCT_BOOST_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WishProductBoostDetailRecord> getPrimaryKey() {
        return Keys.KEY_WISH_PRODUCT_BOOST_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WishProductBoostDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<WishProductBoostDetailRecord>>asList(Keys.KEY_WISH_PRODUCT_BOOST_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetail as(String alias) {
        return new WishProductBoostDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetail as(Name alias) {
        return new WishProductBoostDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WishProductBoostDetail rename(String name) {
        return new WishProductBoostDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WishProductBoostDetail rename(Name name) {
        return new WishProductBoostDetail(name, null);
    }
}
