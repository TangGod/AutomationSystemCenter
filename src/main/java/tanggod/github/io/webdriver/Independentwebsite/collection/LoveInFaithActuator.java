package tanggod.github.io.webdriver.Independentwebsite.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import tanggod.github.io.webdriver.WebdriverApplication;

/**
 * Created by TangGod on 2024/7/31.
 */
@Service
public class LoveInFaithActuator {

    public static final String ALL_PRODUCT_LINK = "https://www.loveinfaith.life/collections/all";

    @Autowired
    private LoveInFaith loveInFaith;

    public void 爬产品列表() {
        loveInFaith.login(ALL_PRODUCT_LINK);
        loveInFaith.爬产品列表(1000);
        loveInFaith.destroy();
    }

    public void 爬商品评论() {
        loveInFaith.login(ALL_PRODUCT_LINK);
        loveInFaith.爬商品评论();
        loveInFaith.destroy();
    }

    public void 爬指定产品() {
        String requestUrl = "https://www.loveinfaith.life/products/true-story-v-neck-3671?variant=40618399072323";
        loveInFaith.login(requestUrl);
        loveInFaith.爬指定产品(requestUrl);
        loveInFaith.destroy();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(WebdriverApplication.class, args);
        LoveInFaithActuator bean = configurableApplicationContext.getBean(LoveInFaithActuator.class);
        bean.爬指定产品();
    }

}
