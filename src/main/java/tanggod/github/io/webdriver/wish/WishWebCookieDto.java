/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.webdriver.wish;


import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


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
public class WishWebCookieDto implements Serializable {

    private static final long serialVersionUID = 1514841290;

    private String    cookies;
    private Date createdate;
    private String    id;

    public WishWebCookieDto() {}

    public WishWebCookieDto(WishWebCookieDto value) {
        this.cookies = value.cookies;
        this.createdate = value.createdate;
        this.id = value.id;
    }

    public WishWebCookieDto(
        String    cookies,
        Timestamp createdate,
        String    id
    ) {
        this.cookies = cookies;
        this.createdate = createdate;
        this.id = id;
    }

    public String getCookies() {
        return this.cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    public Date getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WishWebCookie (");

        sb.append(cookies);
        sb.append(", ").append(createdate);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
