/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.system.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.system.tables.Variation;


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
public class VariationRecord extends UpdatableRecordImpl<VariationRecord> implements Record13<String, String, String, String, String, String, String, BigDecimal, Integer, String, Timestamp, Timestamp, Boolean> {

    private static final long serialVersionUID = -292121802;

    /**
     * Setter for <code>system.variation.product_id</code>.
     */
    public void setProductId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>system.variation.product_id</code>.
     */
    public String getProductId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>system.variation.parent_sku</code>.
     */
    public void setParentSku(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>system.variation.parent_sku</code>.
     */
    public String getParentSku() {
        return (String) get(1);
    }

    /**
     * Setter for <code>system.variation.variation_id</code>.
     */
    public void setVariationId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>system.variation.variation_id</code>.
     */
    public String getVariationId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>system.variation.image_url</code>.
     */
    public void setImageUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>system.variation.image_url</code>.
     */
    public String getImageUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>system.variation.sku_name</code>.
     */
    public void setSkuName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>system.variation.sku_name</code>.
     */
    public String getSkuName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>system.variation.size</code>.
     */
    public void setSize(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>system.variation.size</code>.
     */
    public String getSize() {
        return (String) get(5);
    }

    /**
     * Setter for <code>system.variation.color</code>.
     */
    public void setColor(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>system.variation.color</code>.
     */
    public String getColor() {
        return (String) get(6);
    }

    /**
     * Setter for <code>system.variation.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>system.variation.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>system.variation.inventory</code>.
     */
    public void setInventory(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>system.variation.inventory</code>.
     */
    public Integer getInventory() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>system.variation.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>system.variation.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>system.variation.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>system.variation.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>system.variation.update_date</code>.
     */
    public void setUpdateDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>system.variation.update_date</code>.
     */
    public Timestamp getUpdateDate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>system.variation.enable</code>.
     */
    public void setEnable(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>system.variation.enable</code>.
     */
    public Boolean getEnable() {
        return (Boolean) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, String, BigDecimal, Integer, String, Timestamp, Timestamp, Boolean> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, String, BigDecimal, Integer, String, Timestamp, Timestamp, Boolean> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Variation.VARIATION.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Variation.VARIATION.PARENT_SKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Variation.VARIATION.VARIATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Variation.VARIATION.IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Variation.VARIATION.SKU_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Variation.VARIATION.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Variation.VARIATION.COLOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Variation.VARIATION.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Variation.VARIATION.INVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Variation.VARIATION.AUTH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Variation.VARIATION.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Variation.VARIATION.UPDATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Variation.VARIATION.ENABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getParentSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getVariationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSkuName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getInventory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVariationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSkuName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getInventory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAuthCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value1(String value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value2(String value) {
        setParentSku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value3(String value) {
        setVariationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value4(String value) {
        setImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value5(String value) {
        setSkuName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value6(String value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value7(String value) {
        setColor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value8(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value9(Integer value) {
        setInventory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value10(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value11(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value12(Timestamp value) {
        setUpdateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value13(Boolean value) {
        setEnable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, BigDecimal value8, Integer value9, String value10, Timestamp value11, Timestamp value12, Boolean value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VariationRecord
     */
    public VariationRecord() {
        super(Variation.VARIATION);
    }

    /**
     * Create a detached, initialised VariationRecord
     */
    public VariationRecord(String productId, String parentSku, String variationId, String imageUrl, String skuName, String size, String color, BigDecimal price, Integer inventory, String authCode, Timestamp createDate, Timestamp updateDate, Boolean enable) {
        super(Variation.VARIATION);

        set(0, productId);
        set(1, parentSku);
        set(2, variationId);
        set(3, imageUrl);
        set(4, skuName);
        set(5, size);
        set(6, color);
        set(7, price);
        set(8, inventory);
        set(9, authCode);
        set(10, createDate);
        set(11, updateDate);
        set(12, enable);
    }
}
