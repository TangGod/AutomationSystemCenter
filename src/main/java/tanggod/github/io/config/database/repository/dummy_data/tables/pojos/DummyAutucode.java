/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.dummy_data.tables.pojos;


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
public class DummyAutucode implements Serializable {

    private static final long serialVersionUID = 526003202;

    private String    id;
    private String    authcode;
    private Timestamp createDate;
    private String    platform;
    private String    currencytype;

    public DummyAutucode() {}

    public DummyAutucode(DummyAutucode value) {
        this.id = value.id;
        this.authcode = value.authcode;
        this.createDate = value.createDate;
        this.platform = value.platform;
        this.currencytype = value.currencytype;
    }

    public DummyAutucode(
        String    id,
        String    authcode,
        Timestamp createDate,
        String    platform,
        String    currencytype
    ) {
        this.id = id;
        this.authcode = authcode;
        this.createDate = createDate;
        this.platform = platform;
        this.currencytype = currencytype;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthcode() {
        return this.authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCurrencytype() {
        return this.currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DummyAutucode (");

        sb.append(id);
        sb.append(", ").append(authcode);
        sb.append(", ").append(createDate);
        sb.append(", ").append(platform);
        sb.append(", ").append(currencytype);

        sb.append(")");
        return sb.toString();
    }
}