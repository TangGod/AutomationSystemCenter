/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.dummy_data.tables;


import java.math.BigDecimal;
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

import tanggod.github.io.config.database.repository.dummy_data.DummyData;
import tanggod.github.io.config.database.repository.dummy_data.Indexes;
import tanggod.github.io.config.database.repository.dummy_data.Keys;
import tanggod.github.io.config.database.repository.dummy_data.tables.records.DummyOrderRecord;


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
public class DummyOrder extends TableImpl<DummyOrderRecord> {

    private static final long serialVersionUID = 1790180773;

    /**
     * The reference instance of <code>dummy_data.dummy_order</code>
     */
    public static final DummyOrder DUMMY_ORDER = new DummyOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DummyOrderRecord> getRecordType() {
        return DummyOrderRecord.class;
    }

    /**
     * The column <code>dummy_data.dummy_order.id</code>.
     */
    public final TableField<DummyOrderRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.order_time</code>. 下单时间
     */
    public final TableField<DummyOrderRecord, Timestamp> ORDER_TIME = createField("order_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "下单时间");

    /**
     * The column <code>dummy_data.dummy_order.payment_time</code>. 付款时间
     */
    public final TableField<DummyOrderRecord, Timestamp> PAYMENT_TIME = createField("payment_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "付款时间");

    /**
     * The column <code>dummy_data.dummy_order.waybill_number</code>. 运单号
     */
    public final TableField<DummyOrderRecord, String> WAYBILL_NUMBER = createField("waybill_number", org.jooq.impl.SQLDataType.VARCHAR(200), this, "运单号");

    /**
     * The column <code>dummy_data.dummy_order.product_price</code>. 产品价格
     */
    public final TableField<DummyOrderRecord, BigDecimal> PRODUCT_PRICE = createField("product_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "产品价格");

    /**
     * The column <code>dummy_data.dummy_order.product_total_price</code>. 产品总价
     */
    public final TableField<DummyOrderRecord, BigDecimal> PRODUCT_TOTAL_PRICE = createField("product_total_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "产品总价");

    /**
     * The column <code>dummy_data.dummy_order.sku</code>. sku名
     */
    public final TableField<DummyOrderRecord, String> SKU = createField("sku", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "sku名");

    /**
     * The column <code>dummy_data.dummy_order.color</code>. 颜色
     */
    public final TableField<DummyOrderRecord, String> COLOR = createField("color", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "颜色");

    /**
     * The column <code>dummy_data.dummy_order.addressee</code>. 收件人信息
     */
    public final TableField<DummyOrderRecord, String> ADDRESSEE = createField("addressee", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "收件人信息");

    /**
     * The column <code>dummy_data.dummy_order.order_id</code>. 订单号
     */
    public final TableField<DummyOrderRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "订单号");

    /**
     * The column <code>dummy_data.dummy_order.package_number</code>. 包裹号
     */
    public final TableField<DummyOrderRecord, String> PACKAGE_NUMBER = createField("package_number", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "包裹号");

    /**
     * The column <code>dummy_data.dummy_order.shipping_methods</code>. 物流方式
     */
    public final TableField<DummyOrderRecord, String> SHIPPING_METHODS = createField("shipping_methods", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "物流方式");

    /**
     * The column <code>dummy_data.dummy_order.remaining_delivery_time</code>.
     */
    public final TableField<DummyOrderRecord, String> REMAINING_DELIVERY_TIME = createField("remaining_delivery_time", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.order_state</code>.
     */
    public final TableField<DummyOrderRecord, String> ORDER_STATE = createField("order_state", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.image_url</code>. 子sku图片链接
     */
    public final TableField<DummyOrderRecord, String> IMAGE_URL = createField("image_url", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "子sku图片链接");

    /**
     * The column <code>dummy_data.dummy_order.size</code>. 尺码
     */
    public final TableField<DummyOrderRecord, String> SIZE = createField("size", org.jooq.impl.SQLDataType.VARCHAR(500), this, "尺码");

    /**
     * The column <code>dummy_data.dummy_order.auth_code</code>.
     */
    public final TableField<DummyOrderRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.date_search_code</code>.
     */
    public final TableField<DummyOrderRecord, String> DATE_SEARCH_CODE = createField("date_search_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.items</code>.
     */
    public final TableField<DummyOrderRecord, Integer> ITEMS = createField("items", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.stm_combine_orders</code>.
     */
    public final TableField<DummyOrderRecord, Boolean> STM_COMBINE_ORDERS = createField("stm_combine_orders", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.x_date_delivery</code>.
     */
    public final TableField<DummyOrderRecord, Integer> X_DATE_DELIVERY = createField("x_date_delivery", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dummy_data.dummy_order.product_id</code>.
     */
    public final TableField<DummyOrderRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * Create a <code>dummy_data.dummy_order</code> table reference
     */
    public DummyOrder() {
        this(DSL.name("dummy_order"), null);
    }

    /**
     * Create an aliased <code>dummy_data.dummy_order</code> table reference
     */
    public DummyOrder(String alias) {
        this(DSL.name(alias), DUMMY_ORDER);
    }

    /**
     * Create an aliased <code>dummy_data.dummy_order</code> table reference
     */
    public DummyOrder(Name alias) {
        this(alias, DUMMY_ORDER);
    }

    private DummyOrder(Name alias, Table<DummyOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private DummyOrder(Name alias, Table<DummyOrderRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DUMMY_ORDER_1, Indexes.DUMMY_ORDER_2, Indexes.DUMMY_ORDER_3, Indexes.DUMMY_ORDER_4, Indexes.DUMMY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DummyOrderRecord> getPrimaryKey() {
        return Keys.KEY_DUMMY_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DummyOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<DummyOrderRecord>>asList(Keys.KEY_DUMMY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyOrder as(String alias) {
        return new DummyOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyOrder as(Name alias) {
        return new DummyOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DummyOrder rename(String name) {
        return new DummyOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DummyOrder rename(Name name) {
        return new DummyOrder(name, null);
    }
}
