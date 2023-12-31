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
public class WebsiteAddress implements Serializable {

    private static final long serialVersionUID = -447582560;

    private String    id;
    private String    domainnname;
    private String    type;
    private String    remark;
    private Timestamp createdate;

    public WebsiteAddress() {}

    public WebsiteAddress(WebsiteAddress value) {
        this.id = value.id;
        this.domainnname = value.domainnname;
        this.type = value.type;
        this.remark = value.remark;
        this.createdate = value.createdate;
    }

    public WebsiteAddress(
        String    id,
        String    domainnname,
        String    type,
        String    remark,
        Timestamp createdate
    ) {
        this.id = id;
        this.domainnname = domainnname;
        this.type = type;
        this.remark = remark;
        this.createdate = createdate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomainnname() {
        return this.domainnname;
    }

    public void setDomainnname(String domainnname) {
        this.domainnname = domainnname;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WebsiteAddress (");

        sb.append(id);
        sb.append(", ").append(domainnname);
        sb.append(", ").append(type);
        sb.append(", ").append(remark);
        sb.append(", ").append(createdate);

        sb.append(")");
        return sb.toString();
    }
}
