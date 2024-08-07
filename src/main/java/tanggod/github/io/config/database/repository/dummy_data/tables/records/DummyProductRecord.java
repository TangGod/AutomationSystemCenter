/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.dummy_data.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;

import tanggod.github.io.config.database.repository.dummy_data.tables.DummyProduct;


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
public class DummyProductRecord extends UpdatableRecordImpl<DummyProductRecord> implements Record18<String, String, String, Integer, BigDecimal, Integer, String, String, Timestamp, Integer, String, String, Integer, Integer, String, String, Integer, Integer> {

    private static final long serialVersionUID = -396373761;

    /**
     * Setter for <code>dummy_data.dummy_product.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.product_id</code>. 产品ID
     */
    public void setProductId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.product_id</code>. 产品ID
     */
    public String getProductId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.product_sku</code>. 产品sku
     */
    public void setProductSku(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.product_sku</code>. 产品sku
     */
    public String getProductSku() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.product_profit_margin</code>. 产品利润率
     */
    public void setProductProfitMargin(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.product_profit_margin</code>. 产品利润率
     */
    public Integer getProductProfitMargin() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.product_cost</code>. 产品成本
     */
    public void setProductCost(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.product_cost</code>. 产品成本
     */
    public BigDecimal getProductCost() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.product_weight</code>. 产品重量
     */
    public void setProductWeight(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.product_weight</code>. 产品重量
     */
    public Integer getProductWeight() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.authCode</code>. 店铺名
     */
    public void setAuthcode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.authCode</code>. 店铺名
     */
    public String getAuthcode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.color_list</code>. 颜色列表 ，用","分割
     */
    public void setColorList(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.color_list</code>. 颜色列表 ，用","分割
     */
    public String getColorList() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.create_date</code>. 创建时间
     */
    public void setCreateDate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.create_date</code>. 创建时间
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.order_count</code>. 要生成的订单数
     */
    public void setOrderCount(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.order_count</code>. 要生成的订单数
     */
    public Integer getOrderCount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.size_list</code>. 尺码列表 , 分割
     */
    public void setSizeList(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.size_list</code>. 尺码列表 , 分割
     */
    public String getSizeList() {
        return (String) get(10);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.order_status</code>.
     */
    public void setOrderStatus(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.order_status</code>.
     */
    public String getOrderStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.items_probability</code>.
     */
    public void setItemsProbability(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.items_probability</code>.
     */
    public Integer getItemsProbability() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.merge_probability</code>.
     */
    public void setMergeProbability(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.merge_probability</code>.
     */
    public Integer getMergeProbability() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.supply_list</code>.
     */
    public void setSupplyList(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.supply_list</code>.
     */
    public String getSupplyList() {
        return (String) get(14);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.category_id</code>.
     */
    public void setCategoryId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.category_id</code>.
     */
    public String getCategoryId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.minFluctuation</code>.
     */
    public void setMinfluctuation(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.minFluctuation</code>.
     */
    public Integer getMinfluctuation() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>dummy_data.dummy_product.maxFluctuation</code>.
     */
    public void setMaxfluctuation(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>dummy_data.dummy_product.maxFluctuation</code>.
     */
    public Integer getMaxfluctuation() {
        return (Integer) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, String, Integer, BigDecimal, Integer, String, String, Timestamp, Integer, String, String, Integer, Integer, String, String, Integer, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, String, Integer, BigDecimal, Integer, String, String, Timestamp, Integer, String, String, Integer, Integer, String, String, Integer, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DummyProduct.DUMMY_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DummyProduct.DUMMY_PRODUCT.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DummyProduct.DUMMY_PRODUCT.PRODUCT_SKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DummyProduct.DUMMY_PRODUCT.PRODUCT_PROFIT_MARGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return DummyProduct.DUMMY_PRODUCT.PRODUCT_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DummyProduct.DUMMY_PRODUCT.PRODUCT_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DummyProduct.DUMMY_PRODUCT.AUTHCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DummyProduct.DUMMY_PRODUCT.COLOR_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return DummyProduct.DUMMY_PRODUCT.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return DummyProduct.DUMMY_PRODUCT.ORDER_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DummyProduct.DUMMY_PRODUCT.SIZE_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return DummyProduct.DUMMY_PRODUCT.ORDER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return DummyProduct.DUMMY_PRODUCT.ITEMS_PROBABILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return DummyProduct.DUMMY_PRODUCT.MERGE_PROBABILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return DummyProduct.DUMMY_PRODUCT.SUPPLY_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return DummyProduct.DUMMY_PRODUCT.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return DummyProduct.DUMMY_PRODUCT.MINFLUCTUATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return DummyProduct.DUMMY_PRODUCT.MAXFLUCTUATION;
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
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProductSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getProductProfitMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getProductCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getProductWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAuthcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getColorList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getOrderCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSizeList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getOrderStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getItemsProbability();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getMergeProbability();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getSupplyList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getMinfluctuation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getMaxfluctuation();
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
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProductSku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getProductProfitMargin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getProductCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getProductWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAuthcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getColorList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getOrderCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSizeList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOrderStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getItemsProbability();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getMergeProbability();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSupplyList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getMinfluctuation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getMaxfluctuation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value2(String value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value3(String value) {
        setProductSku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value4(Integer value) {
        setProductProfitMargin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value5(BigDecimal value) {
        setProductCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value6(Integer value) {
        setProductWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value7(String value) {
        setAuthcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value8(String value) {
        setColorList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value9(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value10(Integer value) {
        setOrderCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value11(String value) {
        setSizeList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value12(String value) {
        setOrderStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value13(Integer value) {
        setItemsProbability(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value14(Integer value) {
        setMergeProbability(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value15(String value) {
        setSupplyList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value16(String value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value17(Integer value) {
        setMinfluctuation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord value18(Integer value) {
        setMaxfluctuation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DummyProductRecord values(String value1, String value2, String value3, Integer value4, BigDecimal value5, Integer value6, String value7, String value8, Timestamp value9, Integer value10, String value11, String value12, Integer value13, Integer value14, String value15, String value16, Integer value17, Integer value18) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DummyProductRecord
     */
    public DummyProductRecord() {
        super(DummyProduct.DUMMY_PRODUCT);
    }

    /**
     * Create a detached, initialised DummyProductRecord
     */
    public DummyProductRecord(String id, String productId, String productSku, Integer productProfitMargin, BigDecimal productCost, Integer productWeight, String authcode, String colorList, Timestamp createDate, Integer orderCount, String sizeList, String orderStatus, Integer itemsProbability, Integer mergeProbability, String supplyList, String categoryId, Integer minfluctuation, Integer maxfluctuation) {
        super(DummyProduct.DUMMY_PRODUCT);

        set(0, id);
        set(1, productId);
        set(2, productSku);
        set(3, productProfitMargin);
        set(4, productCost);
        set(5, productWeight);
        set(6, authcode);
        set(7, colorList);
        set(8, createDate);
        set(9, orderCount);
        set(10, sizeList);
        set(11, orderStatus);
        set(12, itemsProbability);
        set(13, mergeProbability);
        set(14, supplyList);
        set(15, categoryId);
        set(16, minfluctuation);
        set(17, maxfluctuation);
    }
}
