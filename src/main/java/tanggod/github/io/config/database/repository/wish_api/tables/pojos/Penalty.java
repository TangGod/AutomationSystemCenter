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
public class Penalty implements Serializable {

    private static final long serialVersionUID = -1264664448;

    private String     id;
    private String     authCode;
    private String     penaltyReason;
    private String     relatedEntityType;
    private String     relatedEntityId;
    private BigDecimal penaltyAmount;
    private String     currencyCode;
    private Timestamp  createdAt;
    private Boolean    reversed;

    public Penalty() {}

    public Penalty(Penalty value) {
        this.id = value.id;
        this.authCode = value.authCode;
        this.penaltyReason = value.penaltyReason;
        this.relatedEntityType = value.relatedEntityType;
        this.relatedEntityId = value.relatedEntityId;
        this.penaltyAmount = value.penaltyAmount;
        this.currencyCode = value.currencyCode;
        this.createdAt = value.createdAt;
        this.reversed = value.reversed;
    }

    public Penalty(
        String     id,
        String     authCode,
        String     penaltyReason,
        String     relatedEntityType,
        String     relatedEntityId,
        BigDecimal penaltyAmount,
        String     currencyCode,
        Timestamp  createdAt,
        Boolean    reversed
    ) {
        this.id = id;
        this.authCode = authCode;
        this.penaltyReason = penaltyReason;
        this.relatedEntityType = relatedEntityType;
        this.relatedEntityId = relatedEntityId;
        this.penaltyAmount = penaltyAmount;
        this.currencyCode = currencyCode;
        this.createdAt = createdAt;
        this.reversed = reversed;
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

    public String getPenaltyReason() {
        return this.penaltyReason;
    }

    public void setPenaltyReason(String penaltyReason) {
        this.penaltyReason = penaltyReason;
    }

    public String getRelatedEntityType() {
        return this.relatedEntityType;
    }

    public void setRelatedEntityType(String relatedEntityType) {
        this.relatedEntityType = relatedEntityType;
    }

    public String getRelatedEntityId() {
        return this.relatedEntityId;
    }

    public void setRelatedEntityId(String relatedEntityId) {
        this.relatedEntityId = relatedEntityId;
    }

    public BigDecimal getPenaltyAmount() {
        return this.penaltyAmount;
    }

    public void setPenaltyAmount(BigDecimal penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getReversed() {
        return this.reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Penalty (");

        sb.append(id);
        sb.append(", ").append(authCode);
        sb.append(", ").append(penaltyReason);
        sb.append(", ").append(relatedEntityType);
        sb.append(", ").append(relatedEntityId);
        sb.append(", ").append(penaltyAmount);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(reversed);

        sb.append(")");
        return sb.toString();
    }
}
