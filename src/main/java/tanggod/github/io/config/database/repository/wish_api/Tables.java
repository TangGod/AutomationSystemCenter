/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish_api;


import javax.annotation.Generated;

import tanggod.github.io.config.database.repository.wish_api.tables.BatchBase;
import tanggod.github.io.config.database.repository.wish_api.tables.Campaigns;
import tanggod.github.io.config.database.repository.wish_api.tables.FinanceSyncOrderStatus;
import tanggod.github.io.config.database.repository.wish_api.tables.Order;
import tanggod.github.io.config.database.repository.wish_api.tables.Penalty;
import tanggod.github.io.config.database.repository.wish_api.tables.Product;
import tanggod.github.io.config.database.repository.wish_api.tables.Tracking;
import tanggod.github.io.config.database.repository.wish_api.tables.Variation;


/**
 * Convenience access to all tables in wish_api
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>wish_api.batch_base</code>.
     */
    public static final BatchBase BATCH_BASE = tanggod.github.io.config.database.repository.wish_api.tables.BatchBase.BATCH_BASE;

    /**
     * The table <code>wish_api.campaigns</code>.
     */
    public static final Campaigns CAMPAIGNS = tanggod.github.io.config.database.repository.wish_api.tables.Campaigns.CAMPAIGNS;

    /**
     * 财务 - 同步订单状态
     */
    public static final FinanceSyncOrderStatus FINANCE_SYNC_ORDER_STATUS = tanggod.github.io.config.database.repository.wish_api.tables.FinanceSyncOrderStatus.FINANCE_SYNC_ORDER_STATUS;

    /**
     * The table <code>wish_api.order</code>.
     */
    public static final Order ORDER = tanggod.github.io.config.database.repository.wish_api.tables.Order.ORDER;

    /**
     * The table <code>wish_api.penalty</code>.
     */
    public static final Penalty PENALTY = tanggod.github.io.config.database.repository.wish_api.tables.Penalty.PENALTY;

    /**
     * The table <code>wish_api.product</code>.
     */
    public static final Product PRODUCT = tanggod.github.io.config.database.repository.wish_api.tables.Product.PRODUCT;

    /**
     * The table <code>wish_api.tracking</code>.
     */
    public static final Tracking TRACKING = tanggod.github.io.config.database.repository.wish_api.tables.Tracking.TRACKING;

    /**
     * The table <code>wish_api.variation</code>.
     */
    public static final Variation VARIATION = tanggod.github.io.config.database.repository.wish_api.tables.Variation.VARIATION;
}
