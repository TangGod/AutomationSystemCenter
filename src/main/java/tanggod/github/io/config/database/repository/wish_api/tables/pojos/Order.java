/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish_api.tables.pojos;


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
public class Order implements Serializable {

    private static final long serialVersionUID = -933154138;

    private String     id;
    private String     authCode;
    private Timestamp  transactionDate;
    private String     orderId;
    private String     transactionId;
    private String     orderState;
    private String     sku;
    private String     productId;
    private String     productLink;
    private String     productImageUrl;
    private String     size;
    private String     color;
    private String     currencyCode;
    private BigDecimal priceEach;
    private BigDecimal costEach;
    private BigDecimal shippingEach;
    private BigDecimal shippingCost;
    private Integer    quantity;
    private BigDecimal totalCost;
    private Timestamp  availableForFulfillmentTime;
    private Timestamp  shippedOn;
    private Boolean    confirmedDelivery;
    private Timestamp  dateShippingCarrierConfirmedDelivery;
    private String     provider;
    private String     tracking;
    private Boolean    trackingConfirmed;
    private Timestamp  trackingConfirmedDate;
    private Timestamp  lastUpdated;
    private String     countryCode;
    private Integer    refundResponsibility;
    private BigDecimal refundResponsibilityAmount;
    private Timestamp  refundDate;
    private String     refundReason;
    private Boolean    advancedLogistics;

    public Order() {}

    public Order(Order value) {
        this.id = value.id;
        this.authCode = value.authCode;
        this.transactionDate = value.transactionDate;
        this.orderId = value.orderId;
        this.transactionId = value.transactionId;
        this.orderState = value.orderState;
        this.sku = value.sku;
        this.productId = value.productId;
        this.productLink = value.productLink;
        this.productImageUrl = value.productImageUrl;
        this.size = value.size;
        this.color = value.color;
        this.currencyCode = value.currencyCode;
        this.priceEach = value.priceEach;
        this.costEach = value.costEach;
        this.shippingEach = value.shippingEach;
        this.shippingCost = value.shippingCost;
        this.quantity = value.quantity;
        this.totalCost = value.totalCost;
        this.availableForFulfillmentTime = value.availableForFulfillmentTime;
        this.shippedOn = value.shippedOn;
        this.confirmedDelivery = value.confirmedDelivery;
        this.dateShippingCarrierConfirmedDelivery = value.dateShippingCarrierConfirmedDelivery;
        this.provider = value.provider;
        this.tracking = value.tracking;
        this.trackingConfirmed = value.trackingConfirmed;
        this.trackingConfirmedDate = value.trackingConfirmedDate;
        this.lastUpdated = value.lastUpdated;
        this.countryCode = value.countryCode;
        this.refundResponsibility = value.refundResponsibility;
        this.refundResponsibilityAmount = value.refundResponsibilityAmount;
        this.refundDate = value.refundDate;
        this.refundReason = value.refundReason;
        this.advancedLogistics = value.advancedLogistics;
    }

    public Order(
        String     id,
        String     authCode,
        Timestamp  transactionDate,
        String     orderId,
        String     transactionId,
        String     orderState,
        String     sku,
        String     productId,
        String     productLink,
        String     productImageUrl,
        String     size,
        String     color,
        String     currencyCode,
        BigDecimal priceEach,
        BigDecimal costEach,
        BigDecimal shippingEach,
        BigDecimal shippingCost,
        Integer    quantity,
        BigDecimal totalCost,
        Timestamp  availableForFulfillmentTime,
        Timestamp  shippedOn,
        Boolean    confirmedDelivery,
        Timestamp  dateShippingCarrierConfirmedDelivery,
        String     provider,
        String     tracking,
        Boolean    trackingConfirmed,
        Timestamp  trackingConfirmedDate,
        Timestamp  lastUpdated,
        String     countryCode,
        Integer    refundResponsibility,
        BigDecimal refundResponsibilityAmount,
        Timestamp  refundDate,
        String     refundReason,
        Boolean    advancedLogistics
    ) {
        this.id = id;
        this.authCode = authCode;
        this.transactionDate = transactionDate;
        this.orderId = orderId;
        this.transactionId = transactionId;
        this.orderState = orderState;
        this.sku = sku;
        this.productId = productId;
        this.productLink = productLink;
        this.productImageUrl = productImageUrl;
        this.size = size;
        this.color = color;
        this.currencyCode = currencyCode;
        this.priceEach = priceEach;
        this.costEach = costEach;
        this.shippingEach = shippingEach;
        this.shippingCost = shippingCost;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.availableForFulfillmentTime = availableForFulfillmentTime;
        this.shippedOn = shippedOn;
        this.confirmedDelivery = confirmedDelivery;
        this.dateShippingCarrierConfirmedDelivery = dateShippingCarrierConfirmedDelivery;
        this.provider = provider;
        this.tracking = tracking;
        this.trackingConfirmed = trackingConfirmed;
        this.trackingConfirmedDate = trackingConfirmedDate;
        this.lastUpdated = lastUpdated;
        this.countryCode = countryCode;
        this.refundResponsibility = refundResponsibility;
        this.refundResponsibilityAmount = refundResponsibilityAmount;
        this.refundDate = refundDate;
        this.refundReason = refundReason;
        this.advancedLogistics = advancedLogistics;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Timestamp getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderState() {
        return this.orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductLink() {
        return this.productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductImageUrl() {
        return this.productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
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

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getPriceEach() {
        return this.priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    public BigDecimal getCostEach() {
        return this.costEach;
    }

    public void setCostEach(BigDecimal costEach) {
        this.costEach = costEach;
    }

    public BigDecimal getShippingEach() {
        return this.shippingEach;
    }

    public void setShippingEach(BigDecimal shippingEach) {
        this.shippingEach = shippingEach;
    }

    public BigDecimal getShippingCost() {
        return this.shippingCost;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public Timestamp getAvailableForFulfillmentTime() {
        return this.availableForFulfillmentTime;
    }

    public void setAvailableForFulfillmentTime(Timestamp availableForFulfillmentTime) {
        this.availableForFulfillmentTime = availableForFulfillmentTime;
    }

    public Timestamp getShippedOn() {
        return this.shippedOn;
    }

    public void setShippedOn(Timestamp shippedOn) {
        this.shippedOn = shippedOn;
    }

    public Boolean getConfirmedDelivery() {
        return this.confirmedDelivery;
    }

    public void setConfirmedDelivery(Boolean confirmedDelivery) {
        this.confirmedDelivery = confirmedDelivery;
    }

    public Timestamp getDateShippingCarrierConfirmedDelivery() {
        return this.dateShippingCarrierConfirmedDelivery;
    }

    public void setDateShippingCarrierConfirmedDelivery(Timestamp dateShippingCarrierConfirmedDelivery) {
        this.dateShippingCarrierConfirmedDelivery = dateShippingCarrierConfirmedDelivery;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTracking() {
        return this.tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public Boolean getTrackingConfirmed() {
        return this.trackingConfirmed;
    }

    public void setTrackingConfirmed(Boolean trackingConfirmed) {
        this.trackingConfirmed = trackingConfirmed;
    }

    public Timestamp getTrackingConfirmedDate() {
        return this.trackingConfirmedDate;
    }

    public void setTrackingConfirmedDate(Timestamp trackingConfirmedDate) {
        this.trackingConfirmedDate = trackingConfirmedDate;
    }

    public Timestamp getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getRefundResponsibility() {
        return this.refundResponsibility;
    }

    public void setRefundResponsibility(Integer refundResponsibility) {
        this.refundResponsibility = refundResponsibility;
    }

    public BigDecimal getRefundResponsibilityAmount() {
        return this.refundResponsibilityAmount;
    }

    public void setRefundResponsibilityAmount(BigDecimal refundResponsibilityAmount) {
        this.refundResponsibilityAmount = refundResponsibilityAmount;
    }

    public Timestamp getRefundDate() {
        return this.refundDate;
    }

    public void setRefundDate(Timestamp refundDate) {
        this.refundDate = refundDate;
    }

    public String getRefundReason() {
        return this.refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Boolean getAdvancedLogistics() {
        return this.advancedLogistics;
    }

    public void setAdvancedLogistics(Boolean advancedLogistics) {
        this.advancedLogistics = advancedLogistics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order (");

        sb.append(id);
        sb.append(", ").append(authCode);
        sb.append(", ").append(transactionDate);
        sb.append(", ").append(orderId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(orderState);
        sb.append(", ").append(sku);
        sb.append(", ").append(productId);
        sb.append(", ").append(productLink);
        sb.append(", ").append(productImageUrl);
        sb.append(", ").append(size);
        sb.append(", ").append(color);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(priceEach);
        sb.append(", ").append(costEach);
        sb.append(", ").append(shippingEach);
        sb.append(", ").append(shippingCost);
        sb.append(", ").append(quantity);
        sb.append(", ").append(totalCost);
        sb.append(", ").append(availableForFulfillmentTime);
        sb.append(", ").append(shippedOn);
        sb.append(", ").append(confirmedDelivery);
        sb.append(", ").append(dateShippingCarrierConfirmedDelivery);
        sb.append(", ").append(provider);
        sb.append(", ").append(tracking);
        sb.append(", ").append(trackingConfirmed);
        sb.append(", ").append(trackingConfirmedDate);
        sb.append(", ").append(lastUpdated);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(refundResponsibility);
        sb.append(", ").append(refundResponsibilityAmount);
        sb.append(", ").append(refundDate);
        sb.append(", ").append(refundReason);
        sb.append(", ").append(advancedLogistics);

        sb.append(")");
        return sb.toString();
    }
}
