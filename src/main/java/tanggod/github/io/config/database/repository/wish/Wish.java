/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import tanggod.github.io.config.database.repository.DefaultCatalog;
import tanggod.github.io.config.database.repository.wish.tables.Announcement;
import tanggod.github.io.config.database.repository.wish.tables.CategoryData;
import tanggod.github.io.config.database.repository.wish.tables.CategoryDataDataAnalysis;
import tanggod.github.io.config.database.repository.wish.tables.CategoryDataDataAnalysisSync;
import tanggod.github.io.config.database.repository.wish.tables.CategoryDataPermission;
import tanggod.github.io.config.database.repository.wish.tables.CategoryDataRequestCode;
import tanggod.github.io.config.database.repository.wish.tables.CollectionDataFilter;
import tanggod.github.io.config.database.repository.wish.tables.CollectionDataParameter;
import tanggod.github.io.config.database.repository.wish.tables.CollectionDataUser;
import tanggod.github.io.config.database.repository.wish.tables.CostPbCost;
import tanggod.github.io.config.database.repository.wish.tables.CostPbDianxiaomi;
import tanggod.github.io.config.database.repository.wish.tables.CostTotal;
import tanggod.github.io.config.database.repository.wish.tables.Customizeinfo;
import tanggod.github.io.config.database.repository.wish.tables.Customizeproduct;
import tanggod.github.io.config.database.repository.wish.tables.DesktopApplication;
import tanggod.github.io.config.database.repository.wish.tables.Imagehashcodecache;
import tanggod.github.io.config.database.repository.wish.tables.JieZiManCookie;
import tanggod.github.io.config.database.repository.wish.tables.JzmPurchaseOrder;
import tanggod.github.io.config.database.repository.wish.tables.JzmWarehouseOrderCode;
import tanggod.github.io.config.database.repository.wish.tables.JzmWishUser;
import tanggod.github.io.config.database.repository.wish.tables.OperationHistory;
import tanggod.github.io.config.database.repository.wish.tables.PbProduct;
import tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateProduct;
import tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateRecord;
import tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateUser;
import tanggod.github.io.config.database.repository.wish.tables.ProductInventoryAddRecord;
import tanggod.github.io.config.database.repository.wish.tables.ProductPriceTrackingTemplate;
import tanggod.github.io.config.database.repository.wish.tables.ProductRanking;
import tanggod.github.io.config.database.repository.wish.tables.ProductSalesMonitor;
import tanggod.github.io.config.database.repository.wish.tables.Productinfo;
import tanggod.github.io.config.database.repository.wish.tables.SkuFile;
import tanggod.github.io.config.database.repository.wish.tables.SkuImage;
import tanggod.github.io.config.database.repository.wish.tables.SmsRecord;
import tanggod.github.io.config.database.repository.wish.tables.SmsVerificationCode;
import tanggod.github.io.config.database.repository.wish.tables.Taskrecord;
import tanggod.github.io.config.database.repository.wish.tables.TiktokOrder;
import tanggod.github.io.config.database.repository.wish.tables.User;
import tanggod.github.io.config.database.repository.wish.tables.WebsiteAddress;
import tanggod.github.io.config.database.repository.wish.tables.WebsiteTask;
import tanggod.github.io.config.database.repository.wish.tables.WishAuth;
import tanggod.github.io.config.database.repository.wish.tables.WishCategory;
import tanggod.github.io.config.database.repository.wish.tables.WishCountryShipping;
import tanggod.github.io.config.database.repository.wish.tables.WishCvsRecord;
import tanggod.github.io.config.database.repository.wish.tables.WishKeywordSearch;
import tanggod.github.io.config.database.repository.wish.tables.WishProduct;
import tanggod.github.io.config.database.repository.wish.tables.WishProductBoostDetail;
import tanggod.github.io.config.database.repository.wish.tables.WishProductNumberSold;
import tanggod.github.io.config.database.repository.wish.tables.WishProductSalesMonitorData;
import tanggod.github.io.config.database.repository.wish.tables.WishProductSalesMonitorUser;
import tanggod.github.io.config.database.repository.wish.tables.WishSoldDate;
import tanggod.github.io.config.database.repository.wish.tables.WishStockAutomation;
import tanggod.github.io.config.database.repository.wish.tables.WishUser;
import tanggod.github.io.config.database.repository.wish.tables.WishVariant;
import tanggod.github.io.config.database.repository.wish.tables.WishViolation;
import tanggod.github.io.config.database.repository.wish.tables.WishWebClient;
import tanggod.github.io.config.database.repository.wish.tables.WishWebCookie;


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
public class Wish extends SchemaImpl {

    private static final long serialVersionUID = -825650591;

    /**
     * The reference instance of <code>wish</code>
     */
    public static final Wish WISH = new Wish();

    /**
     * The table <code>wish.ImageHashCodeCache</code>.
     */
    public final Imagehashcodecache IMAGEHASHCODECACHE = tanggod.github.io.config.database.repository.wish.tables.Imagehashcodecache.IMAGEHASHCODECACHE;

    /**
     * The table <code>wish.announcement</code>.
     */
    public final Announcement ANNOUNCEMENT = tanggod.github.io.config.database.repository.wish.tables.Announcement.ANNOUNCEMENT;

    /**
     * The table <code>wish.category_data</code>.
     */
    public final CategoryData CATEGORY_DATA = tanggod.github.io.config.database.repository.wish.tables.CategoryData.CATEGORY_DATA;

    /**
     * The table <code>wish.category_data_data_analysis</code>.
     */
    public final CategoryDataDataAnalysis CATEGORY_DATA_DATA_ANALYSIS = tanggod.github.io.config.database.repository.wish.tables.CategoryDataDataAnalysis.CATEGORY_DATA_DATA_ANALYSIS;

    /**
     * The table <code>wish.category_data_data_analysis_sync</code>.
     */
    public final CategoryDataDataAnalysisSync CATEGORY_DATA_DATA_ANALYSIS_SYNC = tanggod.github.io.config.database.repository.wish.tables.CategoryDataDataAnalysisSync.CATEGORY_DATA_DATA_ANALYSIS_SYNC;

    /**
     * The table <code>wish.category_data_permission</code>.
     */
    public final CategoryDataPermission CATEGORY_DATA_PERMISSION = tanggod.github.io.config.database.repository.wish.tables.CategoryDataPermission.CATEGORY_DATA_PERMISSION;

    /**
     * The table <code>wish.category_data_request_code</code>.
     */
    public final CategoryDataRequestCode CATEGORY_DATA_REQUEST_CODE = tanggod.github.io.config.database.repository.wish.tables.CategoryDataRequestCode.CATEGORY_DATA_REQUEST_CODE;

    /**
     * The table <code>wish.collection_data_filter</code>.
     */
    public final CollectionDataFilter COLLECTION_DATA_FILTER = tanggod.github.io.config.database.repository.wish.tables.CollectionDataFilter.COLLECTION_DATA_FILTER;

    /**
     * The table <code>wish.collection_data_parameter</code>.
     */
    public final CollectionDataParameter COLLECTION_DATA_PARAMETER = tanggod.github.io.config.database.repository.wish.tables.CollectionDataParameter.COLLECTION_DATA_PARAMETER;

    /**
     * The table <code>wish.collection_data_user</code>.
     */
    public final CollectionDataUser COLLECTION_DATA_USER = tanggod.github.io.config.database.repository.wish.tables.CollectionDataUser.COLLECTION_DATA_USER;

    /**
     * The table <code>wish.cost_pb_cost</code>.
     */
    public final CostPbCost COST_PB_COST = tanggod.github.io.config.database.repository.wish.tables.CostPbCost.COST_PB_COST;

    /**
     * The table <code>wish.cost_pb_dianxiaomi</code>.
     */
    public final CostPbDianxiaomi COST_PB_DIANXIAOMI = tanggod.github.io.config.database.repository.wish.tables.CostPbDianxiaomi.COST_PB_DIANXIAOMI;

    /**
     * The table <code>wish.cost_total</code>.
     */
    public final CostTotal COST_TOTAL = tanggod.github.io.config.database.repository.wish.tables.CostTotal.COST_TOTAL;

    /**
     * The table <code>wish.customizeInfo</code>.
     */
    public final Customizeinfo CUSTOMIZEINFO = tanggod.github.io.config.database.repository.wish.tables.Customizeinfo.CUSTOMIZEINFO;

    /**
     * The table <code>wish.customizeProduct</code>.
     */
    public final Customizeproduct CUSTOMIZEPRODUCT = tanggod.github.io.config.database.repository.wish.tables.Customizeproduct.CUSTOMIZEPRODUCT;

    /**
     * The table <code>wish.desktop_application</code>.
     */
    public final DesktopApplication DESKTOP_APPLICATION = tanggod.github.io.config.database.repository.wish.tables.DesktopApplication.DESKTOP_APPLICATION;

    /**
     * The table <code>wish.jie_zi_man_cookie</code>.
     */
    public final JieZiManCookie JIE_ZI_MAN_COOKIE = tanggod.github.io.config.database.repository.wish.tables.JieZiManCookie.JIE_ZI_MAN_COOKIE;

    /**
     * The table <code>wish.jzm_purchase_order</code>.
     */
    public final JzmPurchaseOrder JZM_PURCHASE_ORDER = tanggod.github.io.config.database.repository.wish.tables.JzmPurchaseOrder.JZM_PURCHASE_ORDER;

    /**
     * The table <code>wish.jzm_warehouse_order_code</code>.
     */
    public final JzmWarehouseOrderCode JZM_WAREHOUSE_ORDER_CODE = tanggod.github.io.config.database.repository.wish.tables.JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE;

    /**
     * The table <code>wish.jzm_wish_user</code>.
     */
    public final JzmWishUser JZM_WISH_USER = tanggod.github.io.config.database.repository.wish.tables.JzmWishUser.JZM_WISH_USER;

    /**
     * The table <code>wish.operation_history</code>.
     */
    public final OperationHistory OPERATION_HISTORY = tanggod.github.io.config.database.repository.wish.tables.OperationHistory.OPERATION_HISTORY;

    /**
     * The table <code>wish.pb_product</code>.
     */
    public final PbProduct PB_PRODUCT = tanggod.github.io.config.database.repository.wish.tables.PbProduct.PB_PRODUCT;

    /**
     * The table <code>wish.productInfo</code>.
     */
    public final Productinfo PRODUCTINFO = tanggod.github.io.config.database.repository.wish.tables.Productinfo.PRODUCTINFO;

    /**
     * The table <code>wish.product_boost_template_product</code>.
     */
    public final ProductBoostTemplateProduct PRODUCT_BOOST_TEMPLATE_PRODUCT = tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateProduct.PRODUCT_BOOST_TEMPLATE_PRODUCT;

    /**
     * The table <code>wish.product_boost_template_record</code>.
     */
    public final ProductBoostTemplateRecord PRODUCT_BOOST_TEMPLATE_RECORD = tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD;

    /**
     * The table <code>wish.product_boost_template_user</code>.
     */
    public final ProductBoostTemplateUser PRODUCT_BOOST_TEMPLATE_USER = tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateUser.PRODUCT_BOOST_TEMPLATE_USER;

    /**
     * The table <code>wish.product_inventory_add_record</code>.
     */
    public final ProductInventoryAddRecord PRODUCT_INVENTORY_ADD_RECORD = tanggod.github.io.config.database.repository.wish.tables.ProductInventoryAddRecord.PRODUCT_INVENTORY_ADD_RECORD;

    /**
     * The table <code>wish.product_price_tracking_template</code>.
     */
    public final ProductPriceTrackingTemplate PRODUCT_PRICE_TRACKING_TEMPLATE = tanggod.github.io.config.database.repository.wish.tables.ProductPriceTrackingTemplate.PRODUCT_PRICE_TRACKING_TEMPLATE;

    /**
     * The table <code>wish.product_ranking</code>.
     */
    public final ProductRanking PRODUCT_RANKING = tanggod.github.io.config.database.repository.wish.tables.ProductRanking.PRODUCT_RANKING;

    /**
     * The table <code>wish.product_sales_monitor</code>.
     */
    public final ProductSalesMonitor PRODUCT_SALES_MONITOR = tanggod.github.io.config.database.repository.wish.tables.ProductSalesMonitor.PRODUCT_SALES_MONITOR;

    /**
     * The table <code>wish.sku_file</code>.
     */
    public final SkuFile SKU_FILE = tanggod.github.io.config.database.repository.wish.tables.SkuFile.SKU_FILE;

    /**
     * The table <code>wish.sku_image</code>.
     */
    public final SkuImage SKU_IMAGE = tanggod.github.io.config.database.repository.wish.tables.SkuImage.SKU_IMAGE;

    /**
     * The table <code>wish.sms_record</code>.
     */
    public final SmsRecord SMS_RECORD = tanggod.github.io.config.database.repository.wish.tables.SmsRecord.SMS_RECORD;

    /**
     * The table <code>wish.sms_verification_code</code>.
     */
    public final SmsVerificationCode SMS_VERIFICATION_CODE = tanggod.github.io.config.database.repository.wish.tables.SmsVerificationCode.SMS_VERIFICATION_CODE;

    /**
     * The table <code>wish.taskRecord</code>.
     */
    public final Taskrecord TASKRECORD = tanggod.github.io.config.database.repository.wish.tables.Taskrecord.TASKRECORD;

    /**
     * The table <code>wish.tikTok_order</code>.
     */
    public final TiktokOrder TIKTOK_ORDER = tanggod.github.io.config.database.repository.wish.tables.TiktokOrder.TIKTOK_ORDER;

    /**
     * The table <code>wish.user</code>.
     */
    public final User USER = tanggod.github.io.config.database.repository.wish.tables.User.USER;

    /**
     * The table <code>wish.website_address</code>.
     */
    public final WebsiteAddress WEBSITE_ADDRESS = tanggod.github.io.config.database.repository.wish.tables.WebsiteAddress.WEBSITE_ADDRESS;

    /**
     * The table <code>wish.website_task</code>.
     */
    public final WebsiteTask WEBSITE_TASK = tanggod.github.io.config.database.repository.wish.tables.WebsiteTask.WEBSITE_TASK;

    /**
     * The table <code>wish.wish_auth</code>.
     */
    public final WishAuth WISH_AUTH = tanggod.github.io.config.database.repository.wish.tables.WishAuth.WISH_AUTH;

    /**
     * The table <code>wish.wish_category</code>.
     */
    public final WishCategory WISH_CATEGORY = tanggod.github.io.config.database.repository.wish.tables.WishCategory.WISH_CATEGORY;

    /**
     * The table <code>wish.wish_country_shipping</code>.
     */
    public final WishCountryShipping WISH_COUNTRY_SHIPPING = tanggod.github.io.config.database.repository.wish.tables.WishCountryShipping.WISH_COUNTRY_SHIPPING;

    /**
     * The table <code>wish.wish_cvs_record</code>.
     */
    public final WishCvsRecord WISH_CVS_RECORD = tanggod.github.io.config.database.repository.wish.tables.WishCvsRecord.WISH_CVS_RECORD;

    /**
     * The table <code>wish.wish_keyword_search</code>.
     */
    public final WishKeywordSearch WISH_KEYWORD_SEARCH = tanggod.github.io.config.database.repository.wish.tables.WishKeywordSearch.WISH_KEYWORD_SEARCH;

    /**
     * The table <code>wish.wish_product</code>.
     */
    public final WishProduct WISH_PRODUCT = tanggod.github.io.config.database.repository.wish.tables.WishProduct.WISH_PRODUCT;

    /**
     * The table <code>wish.wish_product_boost_detail</code>.
     */
    public final WishProductBoostDetail WISH_PRODUCT_BOOST_DETAIL = tanggod.github.io.config.database.repository.wish.tables.WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL;

    /**
     * The table <code>wish.wish_product_number_sold</code>.
     */
    public final WishProductNumberSold WISH_PRODUCT_NUMBER_SOLD = tanggod.github.io.config.database.repository.wish.tables.WishProductNumberSold.WISH_PRODUCT_NUMBER_SOLD;

    /**
     * The table <code>wish.wish_product_sales_monitor_data</code>.
     */
    public final WishProductSalesMonitorData WISH_PRODUCT_SALES_MONITOR_DATA = tanggod.github.io.config.database.repository.wish.tables.WishProductSalesMonitorData.WISH_PRODUCT_SALES_MONITOR_DATA;

    /**
     * The table <code>wish.wish_product_sales_monitor_user</code>.
     */
    public final WishProductSalesMonitorUser WISH_PRODUCT_SALES_MONITOR_USER = tanggod.github.io.config.database.repository.wish.tables.WishProductSalesMonitorUser.WISH_PRODUCT_SALES_MONITOR_USER;

    /**
     * The table <code>wish.wish_sold_date</code>.
     */
    public final WishSoldDate WISH_SOLD_DATE = tanggod.github.io.config.database.repository.wish.tables.WishSoldDate.WISH_SOLD_DATE;

    /**
     * The table <code>wish.wish_stock_automation</code>.
     */
    public final WishStockAutomation WISH_STOCK_AUTOMATION = tanggod.github.io.config.database.repository.wish.tables.WishStockAutomation.WISH_STOCK_AUTOMATION;

    /**
     * The table <code>wish.wish_user</code>.
     */
    public final WishUser WISH_USER = tanggod.github.io.config.database.repository.wish.tables.WishUser.WISH_USER;

    /**
     * The table <code>wish.wish_variant</code>.
     */
    public final WishVariant WISH_VARIANT = tanggod.github.io.config.database.repository.wish.tables.WishVariant.WISH_VARIANT;

    /**
     * The table <code>wish.wish_violation</code>.
     */
    public final WishViolation WISH_VIOLATION = tanggod.github.io.config.database.repository.wish.tables.WishViolation.WISH_VIOLATION;

    /**
     * The table <code>wish.wish_web_client</code>.
     */
    public final WishWebClient WISH_WEB_CLIENT = tanggod.github.io.config.database.repository.wish.tables.WishWebClient.WISH_WEB_CLIENT;

    /**
     * The table <code>wish.wish_web_cookie</code>.
     */
    public final WishWebCookie WISH_WEB_COOKIE = tanggod.github.io.config.database.repository.wish.tables.WishWebCookie.WISH_WEB_COOKIE;

    /**
     * No further instances allowed
     */
    private Wish() {
        super("wish", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Imagehashcodecache.IMAGEHASHCODECACHE,
            Announcement.ANNOUNCEMENT,
            CategoryData.CATEGORY_DATA,
            CategoryDataDataAnalysis.CATEGORY_DATA_DATA_ANALYSIS,
            CategoryDataDataAnalysisSync.CATEGORY_DATA_DATA_ANALYSIS_SYNC,
            CategoryDataPermission.CATEGORY_DATA_PERMISSION,
            CategoryDataRequestCode.CATEGORY_DATA_REQUEST_CODE,
            CollectionDataFilter.COLLECTION_DATA_FILTER,
            CollectionDataParameter.COLLECTION_DATA_PARAMETER,
            CollectionDataUser.COLLECTION_DATA_USER,
            CostPbCost.COST_PB_COST,
            CostPbDianxiaomi.COST_PB_DIANXIAOMI,
            CostTotal.COST_TOTAL,
            Customizeinfo.CUSTOMIZEINFO,
            Customizeproduct.CUSTOMIZEPRODUCT,
            DesktopApplication.DESKTOP_APPLICATION,
            JieZiManCookie.JIE_ZI_MAN_COOKIE,
            JzmPurchaseOrder.JZM_PURCHASE_ORDER,
            JzmWarehouseOrderCode.JZM_WAREHOUSE_ORDER_CODE,
            JzmWishUser.JZM_WISH_USER,
            OperationHistory.OPERATION_HISTORY,
            PbProduct.PB_PRODUCT,
            Productinfo.PRODUCTINFO,
            ProductBoostTemplateProduct.PRODUCT_BOOST_TEMPLATE_PRODUCT,
            ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD,
            ProductBoostTemplateUser.PRODUCT_BOOST_TEMPLATE_USER,
            ProductInventoryAddRecord.PRODUCT_INVENTORY_ADD_RECORD,
            ProductPriceTrackingTemplate.PRODUCT_PRICE_TRACKING_TEMPLATE,
            ProductRanking.PRODUCT_RANKING,
            ProductSalesMonitor.PRODUCT_SALES_MONITOR,
            SkuFile.SKU_FILE,
            SkuImage.SKU_IMAGE,
            SmsRecord.SMS_RECORD,
            SmsVerificationCode.SMS_VERIFICATION_CODE,
            Taskrecord.TASKRECORD,
            TiktokOrder.TIKTOK_ORDER,
            User.USER,
            WebsiteAddress.WEBSITE_ADDRESS,
            WebsiteTask.WEBSITE_TASK,
            WishAuth.WISH_AUTH,
            WishCategory.WISH_CATEGORY,
            WishCountryShipping.WISH_COUNTRY_SHIPPING,
            WishCvsRecord.WISH_CVS_RECORD,
            WishKeywordSearch.WISH_KEYWORD_SEARCH,
            WishProduct.WISH_PRODUCT,
            WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL,
            WishProductNumberSold.WISH_PRODUCT_NUMBER_SOLD,
            WishProductSalesMonitorData.WISH_PRODUCT_SALES_MONITOR_DATA,
            WishProductSalesMonitorUser.WISH_PRODUCT_SALES_MONITOR_USER,
            WishSoldDate.WISH_SOLD_DATE,
            WishStockAutomation.WISH_STOCK_AUTOMATION,
            WishUser.WISH_USER,
            WishVariant.WISH_VARIANT,
            WishViolation.WISH_VIOLATION,
            WishWebClient.WISH_WEB_CLIENT,
            WishWebCookie.WISH_WEB_COOKIE);
    }
}