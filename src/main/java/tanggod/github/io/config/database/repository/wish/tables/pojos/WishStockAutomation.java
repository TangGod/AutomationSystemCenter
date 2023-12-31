/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class WishStockAutomation implements Serializable {

    private static final long serialVersionUID = -1888687116;

    private String    productId;
    private String    authCode;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String    sku;
    private Boolean   enable;
    private Integer   addStock;
    private Integer   stockThreshold;
    private Timestamp syncDate;
    private Boolean   code;

    public WishStockAutomation() {}

    public WishStockAutomation(WishStockAutomation value) {
        this.productId = value.productId;
        this.authCode = value.authCode;
        this.createDate = value.createDate;
        this.updateDate = value.updateDate;
        this.sku = value.sku;
        this.enable = value.enable;
        this.addStock = value.addStock;
        this.stockThreshold = value.stockThreshold;
        this.syncDate = value.syncDate;
        this.code = value.code;
    }

    public WishStockAutomation(
        String    productId,
        String    authCode,
        Timestamp createDate,
        Timestamp updateDate,
        String    sku,
        Boolean   enable,
        Integer   addStock,
        Integer   stockThreshold,
        Timestamp syncDate,
        Boolean   code
    ) {
        this.productId = productId;
        this.authCode = authCode;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.sku = sku;
        this.enable = enable;
        this.addStock = addStock;
        this.stockThreshold = stockThreshold;
        this.syncDate = syncDate;
        this.code = code;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Integer getAddStock() {
        return this.addStock;
    }

    public void setAddStock(Integer addStock) {
        this.addStock = addStock;
    }

    public Integer getStockThreshold() {
        return this.stockThreshold;
    }

    public void setStockThreshold(Integer stockThreshold) {
        this.stockThreshold = stockThreshold;
    }

    public Timestamp getSyncDate() {
        return this.syncDate;
    }

    public void setSyncDate(Timestamp syncDate) {
        this.syncDate = syncDate;
    }

    public Boolean getCode() {
        return this.code;
    }

    public void setCode(Boolean code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WishStockAutomation (");

        sb.append(productId);
        sb.append(", ").append(authCode);
        sb.append(", ").append(createDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(sku);
        sb.append(", ").append(enable);
        sb.append(", ").append(addStock);
        sb.append(", ").append(stockThreshold);
        sb.append(", ").append(syncDate);
        sb.append(", ").append(code);

        sb.append(")");
        return sb.toString();
    }
}
