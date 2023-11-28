/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.pojos;


import java.io.Serializable;

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
public class WishProductSalesMonitorUser implements Serializable {

    private static final long serialVersionUID = 37748138;

    private String  id;
    private String  accessToken;
    private String  authCode;
    private String  actualName;
    private Integer sort;
    private Boolean filterStatus;

    public WishProductSalesMonitorUser() {}

    public WishProductSalesMonitorUser(WishProductSalesMonitorUser value) {
        this.id = value.id;
        this.accessToken = value.accessToken;
        this.authCode = value.authCode;
        this.actualName = value.actualName;
        this.sort = value.sort;
        this.filterStatus = value.filterStatus;
    }

    public WishProductSalesMonitorUser(
        String  id,
        String  accessToken,
        String  authCode,
        String  actualName,
        Integer sort,
        Boolean filterStatus
    ) {
        this.id = id;
        this.accessToken = accessToken;
        this.authCode = authCode;
        this.actualName = actualName;
        this.sort = sort;
        this.filterStatus = filterStatus;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getActualName() {
        return this.actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getFilterStatus() {
        return this.filterStatus;
    }

    public void setFilterStatus(Boolean filterStatus) {
        this.filterStatus = filterStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WishProductSalesMonitorUser (");

        sb.append(id);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(authCode);
        sb.append(", ").append(actualName);
        sb.append(", ").append(sort);
        sb.append(", ").append(filterStatus);

        sb.append(")");
        return sb.toString();
    }
}
