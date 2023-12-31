/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish.tables.ProductBoostTemplateRecord;


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
public class ProductBoostTemplateRecordRecord extends UpdatableRecordImpl<ProductBoostTemplateRecordRecord> implements Record9<String, String, Timestamp, Double, String, Double, String, String, String> {

    private static final long serialVersionUID = 1853788604;

    /**
     * Setter for <code>wish.product_boost_template_record.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.entrance_name</code>.
     */
    public void setEntranceName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.entrance_name</code>.
     */
    public String getEntranceName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.amount</code>.
     */
    public void setAmount(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.amount</code>.
     */
    public Double getAmount() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.localized_currency_code</code>.
     */
    public void setLocalizedCurrencyCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.localized_currency_code</code>.
     */
    public String getLocalizedCurrencyCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.campaign_max_budget</code>.
     */
    public void setCampaignMaxBudget(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.campaign_max_budget</code>.
     */
    public Double getCampaignMaxBudget() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.product_id</code>.
     */
    public void setProductId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.product_id</code>.
     */
    public String getProductId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.campaign_id</code>.
     */
    public void setCampaignId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.campaign_id</code>.
     */
    public String getCampaignId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>wish.product_boost_template_record.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>wish.product_boost_template_record.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Timestamp, Double, String, Double, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Timestamp, Double, String, Double, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.ENTRANCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.LOCALIZED_CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.CAMPAIGN_MAX_BUDGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.CAMPAIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEntranceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLocalizedCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCampaignMaxBudget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCampaignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEntranceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLocalizedCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCampaignMaxBudget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCampaignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value2(String value) {
        setEntranceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value3(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value4(Double value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value5(String value) {
        setLocalizedCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value6(Double value) {
        setCampaignMaxBudget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value7(String value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value8(String value) {
        setCampaignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord value9(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateRecordRecord values(String value1, String value2, Timestamp value3, Double value4, String value5, Double value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductBoostTemplateRecordRecord
     */
    public ProductBoostTemplateRecordRecord() {
        super(ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD);
    }

    /**
     * Create a detached, initialised ProductBoostTemplateRecordRecord
     */
    public ProductBoostTemplateRecordRecord(String id, String entranceName, Timestamp createDate, Double amount, String localizedCurrencyCode, Double campaignMaxBudget, String productId, String campaignId, String authCode) {
        super(ProductBoostTemplateRecord.PRODUCT_BOOST_TEMPLATE_RECORD);

        set(0, id);
        set(1, entranceName);
        set(2, createDate);
        set(3, amount);
        set(4, localizedCurrencyCode);
        set(5, campaignMaxBudget);
        set(6, productId);
        set(7, campaignId);
        set(8, authCode);
    }
}
