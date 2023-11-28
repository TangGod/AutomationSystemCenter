/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.system.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class Variation implements Serializable {

    private static final long serialVersionUID = 1018675088;

    private String     productId;
    private String     parentSku;
    private String     variationId;
    private String     imageUrl;
    private String     skuName;
    private String     size;
    private String     color;
    private BigDecimal price;
    private Integer    inventory;
    private String     authCode;
    private Timestamp  createDate;
    private Timestamp  updateDate;
    private Boolean    enable;

    public Variation() {}

    public Variation(Variation value) {
        this.productId = value.productId;
        this.parentSku = value.parentSku;
        this.variationId = value.variationId;
        this.imageUrl = value.imageUrl;
        this.skuName = value.skuName;
        this.size = value.size;
        this.color = value.color;
        this.price = value.price;
        this.inventory = value.inventory;
        this.authCode = value.authCode;
        this.createDate = value.createDate;
        this.updateDate = value.updateDate;
        this.enable = value.enable;
    }

    public Variation(
        String     productId,
        String     parentSku,
        String     variationId,
        String     imageUrl,
        String     skuName,
        String     size,
        String     color,
        BigDecimal price,
        Integer    inventory,
        String     authCode,
        Timestamp  createDate,
        Timestamp  updateDate,
        Boolean    enable
    ) {
        this.productId = productId;
        this.parentSku = parentSku;
        this.variationId = variationId;
        this.imageUrl = imageUrl;
        this.skuName = skuName;
        this.size = size;
        this.color = color;
        this.price = price;
        this.inventory = inventory;
        this.authCode = authCode;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.enable = enable;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getParentSku() {
        return this.parentSku;
    }

    public void setParentSku(String parentSku) {
        this.parentSku = parentSku;
    }

    public String getVariationId() {
        return this.variationId;
    }

    public void setVariationId(String variationId) {
        this.variationId = variationId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSkuName() {
        return this.skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInventory() {
        return this.inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
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

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Variation (");

        sb.append(productId);
        sb.append(", ").append(parentSku);
        sb.append(", ").append(variationId);
        sb.append(", ").append(imageUrl);
        sb.append(", ").append(skuName);
        sb.append(", ").append(size);
        sb.append(", ").append(color);
        sb.append(", ").append(price);
        sb.append(", ").append(inventory);
        sb.append(", ").append(authCode);
        sb.append(", ").append(createDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(enable);

        sb.append(")");
        return sb.toString();
    }
}
