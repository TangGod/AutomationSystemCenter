package tanggod.github.io.webdriver.Independentwebsite.service;

import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import org.springframework.stereotype.Service;
import tanggod.github.io.config.database.repository.independent_website.tables.WebsiteProduct;
import tanggod.github.io.webdriver.IdWorkerUtils;
import tanggod.github.io.webdriver.Independentwebsite.dto.WebsiteProductDTO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by TangGod on 2024/7/18.
 */
@Service
public class WebSiteProductService extends JooqBaseService {

    public void create(String websitePlatformId, String productCategory, String productLink, String productTitle, BigDecimal productPrice, Integer reviewSize, String mainImageUrl) {
        WebsiteProductDTO websiteProductDTO = new WebsiteProductDTO();
        websiteProductDTO.setId(IdWorkerUtils.getInstance().buildPartNumber());
        websiteProductDTO.setCreateDate(new Date());
        websiteProductDTO.setWebsitePlatformId(websitePlatformId);
        websiteProductDTO.setProductLink(productLink);
        websiteProductDTO.setProductTitle(productTitle);
        websiteProductDTO.setProductPrice(productPrice);
        websiteProductDTO.setProductCategory(productCategory);
        websiteProductDTO.setReviewSize(reviewSize);
        websiteProductDTO.setMainImageUrl(mainImageUrl);
        jooqStorage.create(WebsiteProduct.WEBSITE_PRODUCT, WebsiteProductDTO.class, websiteProductDTO);
    }

    public List<WebsiteProductDTO> listWebSiteProductByProductLink(String productLink) {
        return jooqStorage.listByCondition(WebsiteProduct.WEBSITE_PRODUCT, WebsiteProductDTO.class, WebsiteProduct.WEBSITE_PRODUCT.PRODUCT_LINK.eq(productLink));
    }

    public List<WebsiteProductDTO> listWebSiteProductByProductFilterZeroReviewSize() {
        return jooqStorage.dslSelect(dsl -> dsl.select().from(WebsiteProduct.WEBSITE_PRODUCT).where(
                WebsiteProduct.WEBSITE_PRODUCT.REVIEW_SIZE.gt(0)
                .and(
                        WebsiteProduct.WEBSITE_PRODUCT.FILTER_SHOW.eq(false)
                )
                ).orderBy(
                WebsiteProduct.WEBSITE_PRODUCT.REVIEW_SIZE.asc()
                )
                , WebsiteProductDTO.class);
    }

}
