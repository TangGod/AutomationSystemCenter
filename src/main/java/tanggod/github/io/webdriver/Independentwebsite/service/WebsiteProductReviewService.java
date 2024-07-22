package tanggod.github.io.webdriver.Independentwebsite.service;

import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import tanggod.github.io.config.database.repository.independent_website.tables.WebsiteProductReview;
import tanggod.github.io.webdriver.IdWorkerUtils;
import tanggod.github.io.webdriver.Independentwebsite.dto.WebsiteProductReviewDTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by TangGod on 2024/7/18.
 */
@Component
public class WebsiteProductReviewService extends JooqBaseService {

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public void create(WebsiteProductReviewDTO websiteProductReviewDTO) {
        websiteProductReviewDTO.setId(IdWorkerUtils.getInstance().buildPartNumber());
        websiteProductReviewDTO.setCreateDate(new Date());
        jooqStorage.create(WebsiteProductReview.WEBSITE_PRODUCT_REVIEW, WebsiteProductReviewDTO.class, websiteProductReviewDTO);
    }

    public List<WebsiteProductReviewDTO> listWebsiteProductReviewDTOListByProductId(String websiteProductId) {
        return jooqStorage.listByCondition(WebsiteProductReview.WEBSITE_PRODUCT_REVIEW, WebsiteProductReviewDTO.class, WebsiteProductReview.WEBSITE_PRODUCT_REVIEW.WEBSITE_PRODUCT_ID.eq(websiteProductId));
    }

    public int countWebsiteProductReviewDTOListByComparedKey(String comparedKey) {
        return jooqStorage.dslSelectCount(dsl->dsl.select().from(WebsiteProductReview.WEBSITE_PRODUCT_REVIEW).where(
                WebsiteProductReview.WEBSITE_PRODUCT_REVIEW.COMPARED_KEY.eq(comparedKey)
        ));
    }

    public boolean checkReviewExist(WebsiteProductReviewDTO websiteProductReviewDTO, Set<String> comparedKeySet) {
        //用户名+评论的标题+评论的文字内容+评论时间
        String comparedKey = getComparedKey(websiteProductReviewDTO);
        return comparedKeySet.contains(comparedKey);
    }

    public Set<String> getComparedKeySet(List<WebsiteProductReviewDTO> websiteProductReviewDTOList) {
        if (null == websiteProductReviewDTOList || 0 == websiteProductReviewDTOList.size()) {
            return new HashSet<>();
        }
        Set<String> response = new HashSet<>();
        for (int i = 0; i < websiteProductReviewDTOList.size(); i++) {
            response.add(getComparedKey(websiteProductReviewDTOList.get(i)));
        }
        return response;
    }

    public String getComparedKey(WebsiteProductReviewDTO websiteProductReviewDTO) {
        return websiteProductReviewDTO.getUserName() + websiteProductReviewDTO.getReviewTitle() + websiteProductReviewDTO.getReviewTextContent() + df.format(websiteProductReviewDTO.getReviewDate());
    }
}
