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
public class WebsiteTask implements Serializable {

    private static final long serialVersionUID = -486137732;

    private String    id;
    private String    websiteAddressId;
    private Timestamp createdate;
    private String    remark;
    private String    domainnName;
    private String    taskUrl;
    private String    status;
    private String    sku;
    private Timestamp updatedate;

    public WebsiteTask() {}

    public WebsiteTask(WebsiteTask value) {
        this.id = value.id;
        this.websiteAddressId = value.websiteAddressId;
        this.createdate = value.createdate;
        this.remark = value.remark;
        this.domainnName = value.domainnName;
        this.taskUrl = value.taskUrl;
        this.status = value.status;
        this.sku = value.sku;
        this.updatedate = value.updatedate;
    }

    public WebsiteTask(
        String    id,
        String    websiteAddressId,
        Timestamp createdate,
        String    remark,
        String    domainnName,
        String    taskUrl,
        String    status,
        String    sku,
        Timestamp updatedate
    ) {
        this.id = id;
        this.websiteAddressId = websiteAddressId;
        this.createdate = createdate;
        this.remark = remark;
        this.domainnName = domainnName;
        this.taskUrl = taskUrl;
        this.status = status;
        this.sku = sku;
        this.updatedate = updatedate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebsiteAddressId() {
        return this.websiteAddressId;
    }

    public void setWebsiteAddressId(String websiteAddressId) {
        this.websiteAddressId = websiteAddressId;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDomainnName() {
        return this.domainnName;
    }

    public void setDomainnName(String domainnName) {
        this.domainnName = domainnName;
    }

    public String getTaskUrl() {
        return this.taskUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Timestamp getUpdatedate() {
        return this.updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WebsiteTask (");

        sb.append(id);
        sb.append(", ").append(websiteAddressId);
        sb.append(", ").append(createdate);
        sb.append(", ").append(remark);
        sb.append(", ").append(domainnName);
        sb.append(", ").append(taskUrl);
        sb.append(", ").append(status);
        sb.append(", ").append(sku);
        sb.append(", ").append(updatedate);

        sb.append(")");
        return sb.toString();
    }
}
