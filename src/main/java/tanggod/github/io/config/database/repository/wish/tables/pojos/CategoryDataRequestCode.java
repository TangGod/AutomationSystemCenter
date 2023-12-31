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
public class CategoryDataRequestCode implements Serializable {

    private static final long serialVersionUID = -1614712616;

    private String id;
    private String requestCode;
    private String msg;
    private String msgCn;

    public CategoryDataRequestCode() {}

    public CategoryDataRequestCode(CategoryDataRequestCode value) {
        this.id = value.id;
        this.requestCode = value.requestCode;
        this.msg = value.msg;
        this.msgCn = value.msgCn;
    }

    public CategoryDataRequestCode(
        String id,
        String requestCode,
        String msg,
        String msgCn
    ) {
        this.id = id;
        this.requestCode = requestCode;
        this.msg = msg;
        this.msgCn = msgCn;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestCode() {
        return this.requestCode;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgCn() {
        return this.msgCn;
    }

    public void setMsgCn(String msgCn) {
        this.msgCn = msgCn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CategoryDataRequestCode (");

        sb.append(id);
        sb.append(", ").append(requestCode);
        sb.append(", ").append(msg);
        sb.append(", ").append(msgCn);

        sb.append(")");
        return sb.toString();
    }
}
