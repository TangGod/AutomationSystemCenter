package tanggod.github.io.webdriver.Independentwebsite.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by TangGod on 2024/7/18.
 */
public class WebsiteProductDTO {
    private String    id;
    private String    websitePlatformId;
    private String    productLink;//产品链接
    private String    productTitle;//产品标题
    private BigDecimal productPrice;//产品价格
    private String    productCategory;//产品分类
    private Integer reviewSize;//评论数量
    private String mainImageUrl;//主图链接
    private Date createDate;//创建时间
    private Date firstReviewDate;//首次评论时间
    private Boolean   wordPressAvailable;//我的独立站是否上架
    private String    wordPressUrl;//我的独立站上架链接
    private Boolean   isChildLink;//是否子链接
    private Integer   wordPressReviewSize;//我的独立站链接评论数
    private Integer   wordPressPostId;//我的wordpress的产品id
    private Boolean   filterShow;//显示过滤

    private Integer realityReviewSize;//真实评论数量，现在是关联查询评论表出来

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebsitePlatformId() {
        return websitePlatformId;
    }

    public void setWebsitePlatformId(String websitePlatformId) {
        this.websitePlatformId = websitePlatformId;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getReviewSize() {
        return reviewSize;
    }

    public void setReviewSize(Integer reviewSize) {
        this.reviewSize = reviewSize;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public Date getFirstReviewDate() {
        return firstReviewDate;
    }

    public void setFirstReviewDate(Date firstReviewDate) {
        this.firstReviewDate = firstReviewDate;
    }

    public Boolean getWordPressAvailable() {
        return wordPressAvailable;
    }

    public void setWordPressAvailable(Boolean wordPressAvailable) {
        this.wordPressAvailable = wordPressAvailable;
    }

    public String getWordPressUrl() {
        return wordPressUrl;
    }

    public void setWordPressUrl(String wordPressUrl) {
        this.wordPressUrl = wordPressUrl;
    }

    public Integer getRealityReviewSize() {
        return realityReviewSize;
    }

    public void setRealityReviewSize(Integer realityReviewSize) {
        this.realityReviewSize = realityReviewSize;
    }

    public Boolean getChildLink() {
        return isChildLink;
    }

    public void setChildLink(Boolean childLink) {
        isChildLink = childLink;
    }

    public Integer getWordPressReviewSize() {
        return wordPressReviewSize;
    }

    public void setWordPressReviewSize(Integer wordPressReviewSize) {
        this.wordPressReviewSize = wordPressReviewSize;
    }

    public Integer getWordPressPostId() {
        return wordPressPostId;
    }

    public void setWordPressPostId(Integer wordPressPostId) {
        this.wordPressPostId = wordPressPostId;
    }

    public Boolean getFilterShow() {
        return filterShow;
    }

    public void setFilterShow(Boolean filterShow) {
        this.filterShow = filterShow;
    }
}
