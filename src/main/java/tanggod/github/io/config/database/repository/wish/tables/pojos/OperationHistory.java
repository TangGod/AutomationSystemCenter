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
public class OperationHistory implements Serializable {

    private static final long serialVersionUID = -1716410817;

    private String    id;
    private Timestamp createDate;
    private String    requestIp;
    private String    indexName;
    private String    collectUserName;
    private String    requestUri;
    private String    reuqestParameter;

    public OperationHistory() {}

    public OperationHistory(OperationHistory value) {
        this.id = value.id;
        this.createDate = value.createDate;
        this.requestIp = value.requestIp;
        this.indexName = value.indexName;
        this.collectUserName = value.collectUserName;
        this.requestUri = value.requestUri;
        this.reuqestParameter = value.reuqestParameter;
    }

    public OperationHistory(
        String    id,
        Timestamp createDate,
        String    requestIp,
        String    indexName,
        String    collectUserName,
        String    requestUri,
        String    reuqestParameter
    ) {
        this.id = id;
        this.createDate = createDate;
        this.requestIp = requestIp;
        this.indexName = indexName;
        this.collectUserName = collectUserName;
        this.requestUri = requestUri;
        this.reuqestParameter = reuqestParameter;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getRequestIp() {
        return this.requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getCollectUserName() {
        return this.collectUserName;
    }

    public void setCollectUserName(String collectUserName) {
        this.collectUserName = collectUserName;
    }

    public String getRequestUri() {
        return this.requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getReuqestParameter() {
        return this.reuqestParameter;
    }

    public void setReuqestParameter(String reuqestParameter) {
        this.reuqestParameter = reuqestParameter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OperationHistory (");

        sb.append(id);
        sb.append(", ").append(createDate);
        sb.append(", ").append(requestIp);
        sb.append(", ").append(indexName);
        sb.append(", ").append(collectUserName);
        sb.append(", ").append(requestUri);
        sb.append(", ").append(reuqestParameter);

        sb.append(")");
        return sb.toString();
    }
}
