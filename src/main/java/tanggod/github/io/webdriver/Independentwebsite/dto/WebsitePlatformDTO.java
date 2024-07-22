package tanggod.github.io.webdriver.Independentwebsite.dto;

import java.util.Date;

/**
 * Created by TangGod on 2024/7/18.
 */
public class WebsitePlatformDTO {

    private String    id;
    private String    homeLink;//网站主页链接
    private String    websiteName;//网站名
    private String    remark;//备注
    private Date createDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeLink() {
        return homeLink;
    }

    public void setHomeLink(String homeLink) {
        this.homeLink = homeLink;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
