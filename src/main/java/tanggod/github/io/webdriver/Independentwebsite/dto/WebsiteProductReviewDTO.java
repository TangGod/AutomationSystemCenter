package tanggod.github.io.webdriver.Independentwebsite.dto;

import java.util.Date;

/**
 * Created by TangGod on 2024/7/18.
 */
public class WebsiteProductReviewDTO {
    private String    id;
    private String    websiteProductId;
    private Date createDate;
    private Date reviewDate;
    private String    userName;
    private Integer   starRating;
    private String    reviewTitle;
    private String    reviewTextContent;
    private String    reviewImageContent;
    private String comparedKey;
    private Boolean   importWordPress;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebsiteProductId() {
        return websiteProductId;
    }

    public void setWebsiteProductId(String websiteProductId) {
        this.websiteProductId = websiteProductId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewTextContent() {
        return reviewTextContent;
    }

    public void setReviewTextContent(String reviewTextContent) {
        this.reviewTextContent = reviewTextContent;
    }

    public String getReviewImageContent() {
        return reviewImageContent;
    }

    public void setReviewImageContent(String reviewImageContent) {
        this.reviewImageContent = reviewImageContent;
    }

    public String getComparedKey() {
        return comparedKey;
    }

    public void setComparedKey(String comparedKey) {
        this.comparedKey = comparedKey;
    }

    public Boolean getImportWordPress() {
        return importWordPress;
    }

    public void setImportWordPress(Boolean importWordPress) {
        this.importWordPress = importWordPress;
    }
}
