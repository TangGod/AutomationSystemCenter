/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish_api.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.wish_api.tables.Variation;


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
public class VariationRecord extends UpdatableRecordImpl<VariationRecord> implements Record13<String, String, String, String, String, String, BigDecimal, BigDecimal, String, Integer, Boolean, String, String> {

    private static final long serialVersionUID = 922088445;

    /**
     * Setter for <code>wish_api.variation.product_id</code>.
     */
    public void setProductId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>wish_api.variation.product_id</code>.
     */
    public String getProductId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>wish_api.variation.parent_sku</code>.
     */
    public void setParentSku(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wish_api.variation.parent_sku</code>.
     */
    public String getParentSku() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wish_api.variation.variation_id</code>.
     */
    public void setVariationId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>wish_api.variation.variation_id</code>.
     */
    public String getVariationId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>wish_api.variation.sku</code>.
     */
    public void setSku(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>wish_api.variation.sku</code>.
     */
    public String getSku() {
        return (String) get(3);
    }

    /**
     * Setter for <code>wish_api.variation.size</code>.
     */
    public void setSize(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>wish_api.variation.size</code>.
     */
    public String getSize() {
        return (String) get(4);
    }

    /**
     * Setter for <code>wish_api.variation.color</code>.
     */
    public void setColor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>wish_api.variation.color</code>.
     */
    public String getColor() {
        return (String) get(5);
    }

    /**
     * Setter for <code>wish_api.variation.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>wish_api.variation.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>wish_api.variation.shipping</code>.
     */
    public void setShipping(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>wish_api.variation.shipping</code>.
     */
    public BigDecimal getShipping() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>wish_api.variation.currencyCode</code>.
     */
    public void setCurrencycode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>wish_api.variation.currencyCode</code>.
     */
    public String getCurrencycode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>wish_api.variation.inventory</code>.
     */
    public void setInventory(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>wish_api.variation.inventory</code>.
     */
    public Integer getInventory() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>wish_api.variation.status</code>.
     */
    public void setStatus(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>wish_api.variation.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>wish_api.variation.image_url</code>.
     */
    public void setImageUrl(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>wish_api.variation.image_url</code>.
     */
    public String getImageUrl() {
        return (String) get(11);
    }

    /**
     * Setter for <code>wish_api.variation.auth_code</code>.
     */
    public void setAuthCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>wish_api.variation.auth_code</code>.
     */
    public String getAuthCode() {
        return (String) get(12);
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
    public Row13<String, String, String, String, String, String, BigDecimal, BigDecimal, String, Integer, Boolean, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, BigDecimal, BigDecimal, String, Integer, Boolean, String, String> valuesRow() {
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
        return Variation.VARIATION.SKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Variation.VARIATION.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Variation.VARIATION.COLOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Variation.VARIATION.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Variation.VARIATION.SHIPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Variation.VARIATION.CURRENCYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Variation.VARIATION.INVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Variation.VARIATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Variation.VARIATION.IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Variation.VARIATION.AUTH_CODE;
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
        return getSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getShipping();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getInventory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAuthCode();
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
        return getSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getShipping();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getInventory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAuthCode();
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
        setSku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value5(String value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value6(String value) {
        setColor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value7(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value8(BigDecimal value) {
        setShipping(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value9(String value) {
        setCurrencycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value10(Integer value) {
        setInventory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value11(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value12(String value) {
        setImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord value13(String value) {
        setAuthCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariationRecord values(String value1, String value2, String value3, String value4, String value5, String value6, BigDecimal value7, BigDecimal value8, String value9, Integer value10, Boolean value11, String value12, String value13) {
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
    public VariationRecord(String productId, String parentSku, String variationId, String sku, String size, String color, BigDecimal price, BigDecimal shipping, String currencycode, Integer inventory, Boolean status, String imageUrl, String authCode) {
        super(Variation.VARIATION);

        set(0, productId);
        set(1, parentSku);
        set(2, variationId);
        set(3, sku);
        set(4, size);
        set(5, color);
        set(6, price);
        set(7, shipping);
        set(8, currencycode);
        set(9, inventory);
        set(10, status);
        set(11, imageUrl);
        set(12, authCode);
    }
}