/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.WishProductBoostDetail;


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
public class WishProductBoostDetailRecord extends UpdatableRecordImpl<WishProductBoostDetailRecord> implements Record14<String, Double, Double, Double, Integer, String, String, String, String, String, String, Timestamp, Timestamp, Boolean> {

    private static final long serialVersionUID = -1643238185;

    /**
     * Setter for <code>wish.wish_product_boost_detail.campaign_id</code>.
     */
    public void setCampaignId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.campaign_id</code>.
     */
    public String getCampaignId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.campaign_max_budget</code>.
     */
    public void setCampaignMaxBudget(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.campaign_max_budget</code>.
     */
    public Double getCampaignMaxBudget() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.total_campaign_spend</code>.
     */
    public void setTotalCampaignSpend(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.total_campaign_spend</code>.
     */
    public Double getTotalCampaignSpend() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.gmv</code>.
     */
    public void setGmv(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.gmv</code>.
     */
    public Double getGmv() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.sales</code>.
     */
    public void setSales(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.sales</code>.
     */
    public Integer getSales() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.product_id</code>.
     */
    public void setProductId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.product_id</code>.
     */
    public String getProductId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.merchant_bid_rate</code>.
     */
    public void setMerchantBidRate(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.merchant_bid_rate</code>.
     */
    public String getMerchantBidRate() {
        return (String) get(6);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.keywords</code>.
     */
    public void setKeywords(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.keywords</code>.
     */
    public String getKeywords() {
        return (String) get(7);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.status</code>.
     */
    public void setStatus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.status</code>.
     */
    public String getStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.authCode</code>.
     */
    public void setAuthcode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.authCode</code>.
     */
    public String getAuthcode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.id</code>.
     */
    public void setId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.id</code>.
     */
    public String getId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.end_time</code>.
     */
    public void setEndTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.end_time</code>.
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>wish.wish_product_boost_detail.is_simple_boost</code>.
     */
    public void setIsSimpleBoost(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>wish.wish_product_boost_detail.is_simple_boost</code>.
     */
    public Boolean getIsSimpleBoost() {
        return (Boolean) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, Double, Double, Double, Integer, String, String, String, String, String, String, Timestamp, Timestamp, Boolean> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, Double, Double, Double, Integer, String, String, String, String, String, String, Timestamp, Timestamp, Boolean> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.CAMPAIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.CAMPAIGN_MAX_BUDGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.TOTAL_CAMPAIGN_SPEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.GMV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.SALES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.MERCHANT_BID_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.KEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.AUTHCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL.IS_SIMPLE_BOOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCampaignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component2() {
        return getCampaignMaxBudget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getTotalCampaignSpend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getGmv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSales();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMerchantBidRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getAuthcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getIsSimpleBoost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCampaignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getCampaignMaxBudget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getTotalCampaignSpend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getGmv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSales();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMerchantBidRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAuthcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getIsSimpleBoost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value1(String value) {
        setCampaignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value2(Double value) {
        setCampaignMaxBudget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value3(Double value) {
        setTotalCampaignSpend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value4(Double value) {
        setGmv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value5(Integer value) {
        setSales(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value6(String value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value7(String value) {
        setMerchantBidRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value8(String value) {
        setKeywords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value9(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value10(String value) {
        setAuthcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value11(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value12(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value13(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord value14(Boolean value) {
        setIsSimpleBoost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishProductBoostDetailRecord values(String value1, Double value2, Double value3, Double value4, Integer value5, String value6, String value7, String value8, String value9, String value10, String value11, Timestamp value12, Timestamp value13, Boolean value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WishProductBoostDetailRecord
     */
    public WishProductBoostDetailRecord() {
        super(WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL);
    }

    /**
     * Create a detached, initialised WishProductBoostDetailRecord
     */
    public WishProductBoostDetailRecord(String campaignId, Double campaignMaxBudget, Double totalCampaignSpend, Double gmv, Integer sales, String productId, String merchantBidRate, String keywords, String status, String authcode, String id, Timestamp startTime, Timestamp endTime, Boolean isSimpleBoost) {
        super(WishProductBoostDetail.WISH_PRODUCT_BOOST_DETAIL);

        set(0, campaignId);
        set(1, campaignMaxBudget);
        set(2, totalCampaignSpend);
        set(3, gmv);
        set(4, sales);
        set(5, productId);
        set(6, merchantBidRate);
        set(7, keywords);
        set(8, status);
        set(9, authcode);
        set(10, id);
        set(11, startTime);
        set(12, endTime);
        set(13, isSimpleBoost);
    }
}
