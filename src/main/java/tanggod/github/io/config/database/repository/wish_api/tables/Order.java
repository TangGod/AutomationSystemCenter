/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish_api.tables;


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

import tanggod.github.io.config.database.repository.wish_api.Indexes;
import tanggod.github.io.config.database.repository.wish_api.Keys;
import tanggod.github.io.config.database.repository.wish_api.WishApi;
import tanggod.github.io.config.database.repository.wish_api.tables.records.OrderRecord;


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
public class Order extends TableImpl<OrderRecord> {

    private static final long serialVersionUID = 729344851;

    /**
     * The reference instance of <code>wish_api.order</code>
     */
    public static final Order ORDER = new Order();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRecord> getRecordType() {
        return OrderRecord.class;
    }

    /**
     * The column <code>wish_api.order.id</code>.
     */
    public final TableField<OrderRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish_api.order.auth_code</code>. 授权编码
     */
    public final TableField<OrderRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "授权编码");

    /**
     * The column <code>wish_api.order.transaction_date</code>. 订单时间
     */
    public final TableField<OrderRecord, Timestamp> TRANSACTION_DATE = createField("transaction_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "订单时间");

    /**
     * The column <code>wish_api.order.order_id</code>. 订单ID
     */
    public final TableField<OrderRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "订单ID");

    /**
     * The column <code>wish_api.order.transaction_iD</code>. 交易编号 (暂时没什么用) 如果用户一次进行多次购买，则可以将订单分为唯一的标识符
     */
    public final TableField<OrderRecord, String> TRANSACTION_ID = createField("transaction_iD", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "交易编号 (暂时没什么用) 如果用户一次进行多次购买，则可以将订单分为唯一的标识符");

    /**
     * The column <code>wish_api.order.order_state</code>. 订单状态
     */
    public final TableField<OrderRecord, String> ORDER_STATE = createField("order_state", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "订单状态");

    /**
     * The column <code>wish_api.order.sku</code>. 产品的 子sku
     */
    public final TableField<OrderRecord, String> SKU = createField("sku", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "产品的 子sku");

    /**
     * The column <code>wish_api.order.product_id</code>. 产品id
     */
    public final TableField<OrderRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "产品id");

    /**
     * The column <code>wish_api.order.product_link</code>. 产品的 wish链接
     */
    public final TableField<OrderRecord, String> PRODUCT_LINK = createField("product_link", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "产品的 wish链接");

    /**
     * The column <code>wish_api.order.product_image_url</code>. 产品主图URL
     */
    public final TableField<OrderRecord, String> PRODUCT_IMAGE_URL = createField("product_image_url", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "产品主图URL");

    /**
     * The column <code>wish_api.order.size</code>. 尺码
     */
    public final TableField<OrderRecord, String> SIZE = createField("size", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "尺码");

    /**
     * The column <code>wish_api.order.color</code>. 颜色
     */
    public final TableField<OrderRecord, String> COLOR = createField("color", org.jooq.impl.SQLDataType.VARCHAR(100), this, "颜色");

    /**
     * The column <code>wish_api.order.currency_code</code>. 货币代码
     */
    public final TableField<OrderRecord, String> CURRENCY_CODE = createField("currency_code", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "货币代码");

    /**
     * The column <code>wish_api.order.price_each</code>. 单件 - 没扣除佣金的价格   （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, BigDecimal> PRICE_EACH = createField("price_each", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "单件 - 没扣除佣金的价格   （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.cost_each</code>. 单件 - 扣除0.85佣金的价格（到手价格）   （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, BigDecimal> COST_EACH = createField("cost_each", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "单件 - 扣除0.85佣金的价格（到手价格）   （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.shipping_each</code>. 单件 - 没扣除佣金的运费    （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, BigDecimal> SHIPPING_EACH = createField("shipping_each", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "单件 - 没扣除佣金的运费    （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.shipping_cost</code>. 单件 - 扣除0.85佣金的运费（到手运费）   （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, BigDecimal> SHIPPING_COST = createField("shipping_cost", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "单件 - 扣除0.85佣金的运费（到手运费）   （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.quantity</code>. 订单数量     （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单数量     （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.total_cost</code>. 多件 - 扣除0.85佣金的订单金额 计算公式 ： (costEach+shippingCost)*quantity  （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, BigDecimal> TOTAL_COST = createField("total_cost", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "多件 - 扣除0.85佣金的订单金额 计算公式 ： (costEach+shippingCost)*quantity  （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.available_for_fulfillment_time</code>. 订单时间  格式: (06-11-2020 13:32)
     */
    public final TableField<OrderRecord, Timestamp> AVAILABLE_FOR_FULFILLMENT_TIME = createField("available_for_fulfillment_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "订单时间  格式: (06-11-2020 13:32)");

    /**
     * The column <code>wish_api.order.shipped_on</code>. 发货时间
     */
    public final TableField<OrderRecord, Timestamp> SHIPPED_ON = createField("shipped_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发货时间");

    /**
     * The column <code>wish_api.order.confirmed_delivery</code>. 物流是否确认妥投    ConfirmedDeliveryEnum
     */
    public final TableField<OrderRecord, Boolean> CONFIRMED_DELIVERY = createField("confirmed_delivery", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "物流是否确认妥投    ConfirmedDeliveryEnum");

    /**
     * The column <code>wish_api.order.date_shipping_carrier_confirmed_delivery</code>. 妥投日期     没有妥投 数据则为 空
     */
    public final TableField<OrderRecord, Timestamp> DATE_SHIPPING_CARRIER_CONFIRMED_DELIVERY = createField("date_shipping_carrier_confirmed_delivery", org.jooq.impl.SQLDataType.TIMESTAMP, this, "妥投日期     没有妥投 数据则为 空");

    /**
     * The column <code>wish_api.order.provider</code>. 物流提供者
     */
    public final TableField<OrderRecord, String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.VARCHAR(50), this, "物流提供者");

    /**
     * The column <code>wish_api.order.tracking</code>. 追踪号
     */
    public final TableField<OrderRecord, String> TRACKING = createField("tracking", org.jooq.impl.SQLDataType.VARCHAR(100), this, "追踪号");

    /**
     * The column <code>wish_api.order.tracking_confirmed</code>. 跟踪号:是否有头程信息
     */
    public final TableField<OrderRecord, Boolean> TRACKING_CONFIRMED = createField("tracking_confirmed", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "跟踪号:是否有头程信息");

    /**
     * The column <code>wish_api.order.tracking_confirmed_date</code>. 跟踪号:头程信息日期
     */
    public final TableField<OrderRecord, Timestamp> TRACKING_CONFIRMED_DATE = createField("tracking_confirmed_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "跟踪号:头程信息日期");

    /**
     * The column <code>wish_api.order.last_updated</code>. 最近更新时间
     */
    public final TableField<OrderRecord, Timestamp> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "最近更新时间");

    /**
     * The column <code>wish_api.order.country_code</code>. 国家代码
     */
    public final TableField<OrderRecord, String> COUNTRY_CODE = createField("country_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "国家代码");

    /**
     * The column <code>wish_api.order.refund_responsibility</code>. 退款责任百分比  0 - 100
     */
    public final TableField<OrderRecord, Integer> REFUND_RESPONSIBILITY = createField("refund_responsibility", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "退款责任百分比  0 - 100");

    /**
     * The column <code>wish_api.order.refund_responsibility_amount</code>. 退款责任金额     （金额币种:按货币代码来）
     */
    public final TableField<OrderRecord, BigDecimal> REFUND_RESPONSIBILITY_AMOUNT = createField("refund_responsibility_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "退款责任金额     （金额币种:按货币代码来）");

    /**
     * The column <code>wish_api.order.refund_date</code>. 退款日期
     */
    public final TableField<OrderRecord, Timestamp> REFUND_DATE = createField("refund_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退款日期");

    /**
     * The column <code>wish_api.order.refund_reason</code>. 退款原因
     */
    public final TableField<OrderRecord, String> REFUND_REASON = createField("refund_reason", org.jooq.impl.SQLDataType.VARCHAR(200), this, "退款原因");

    /**
     * The column <code>wish_api.order.advanced_logistics</code>. A + 物流
     */
    public final TableField<OrderRecord, Boolean> ADVANCED_LOGISTICS = createField("advanced_logistics", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "A + 物流");

    /**
     * Create a <code>wish_api.order</code> table reference
     */
    public Order() {
        this(DSL.name("order"), null);
    }

    /**
     * Create an aliased <code>wish_api.order</code> table reference
     */
    public Order(String alias) {
        this(DSL.name(alias), ORDER);
    }

    /**
     * Create an aliased <code>wish_api.order</code> table reference
     */
    public Order(Name alias) {
        this(alias, ORDER);
    }

    private Order(Name alias, Table<OrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Order(Name alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return WishApi.WISH_API;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDER_1, Indexes.ORDER_10, Indexes.ORDER_2, Indexes.ORDER_3, Indexes.ORDER_4, Indexes.ORDER_5, Indexes.ORDER_6, Indexes.ORDER_7, Indexes.ORDER_8, Indexes.ORDER_9, Indexes.ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderRecord>>asList(Keys.KEY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order as(String alias) {
        return new Order(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order as(Name alias) {
        return new Order(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(String name) {
        return new Order(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(Name name) {
        return new Order(name, null);
    }
}
