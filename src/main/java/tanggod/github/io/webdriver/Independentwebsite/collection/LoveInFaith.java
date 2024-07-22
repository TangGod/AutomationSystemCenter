package tanggod.github.io.webdriver.Independentwebsite.collection;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import tanggod.github.io.webdriver.Independentwebsite.dto.WebsiteProductDTO;
import tanggod.github.io.webdriver.Independentwebsite.dto.WebsiteProductReviewDTO;
import tanggod.github.io.webdriver.Independentwebsite.service.WebSiteProductService;
import tanggod.github.io.webdriver.Independentwebsite.service.WebsiteProductReviewService;
import tanggod.github.io.webdriver.WebdriverApplication;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/29.
 * 信仰之爱
 */
@Service
public class LoveInFaith extends JooqBaseService {

    private static final String best_sellers = "https://www.loveinfaith.life/collections/best-sellers";
    private static final String websitePlatformId = "1";
    private static final String productCategory = "best_sellers";

    // 用于指示是否退出循环的共享状态变量
    private static boolean shouldExit = false;
    private static int successSize = 0;
    private static List<String> comparedKeyList = new ArrayList<>();

    private static Set<String> comparedKeySet = new HashSet<>();

    private static final List<String> cookieList = new ArrayList<>();

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static WebDriver chromeDriver;

    @Autowired
    private WebSiteProductService webSiteProductService;

    @Autowired
    private WebsiteProductReviewService websiteProductReviewService;

    private void initCookieList() {
        cookieList.add("[{\"domain\":\"www.loveinfaith.life\",\"expiry\":1752919729000,\"httpOnly\":false,\"name\":\"localization\",\"path\":\"/\",\"secure\":false,\"value\":\"HK\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1752806414000,\"httpOnly\":false,\"name\":\"po_visitor\",\"path\":\"/\",\"secure\":true,\"value\":\"cLr4N0Fv_zoM\"},{\"domain\":\"www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"locale_bar_accepted\",\"path\":\"/\",\"secure\":false,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721387221000,\"httpOnly\":false,\"name\":\"shopify_pay_redirect\",\"path\":\"/\",\"secure\":false,\"value\":\"pending\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1752919729000,\"httpOnly\":false,\"name\":\"_tracking_consent\",\"path\":\"/\",\"secure\":false,\"value\":\"%7B%22con%22%3A%7B%22CMP%22%3A%7B%22a%22%3A%22%22%2C%22m%22%3A%22%22%2C%22p%22%3A%22%22%2C%22s%22%3A%22%22%7D%7D%2C%22v%22%3A%222.1%22%2C%22region%22%3A%22HK%22%2C%22reg%22%3A%22%22%7D\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1721385550000,\"httpOnly\":false,\"name\":\"_hjSession_3168008\",\"path\":\"/\",\"secure\":true,\"value\":\"eyJpZCI6ImRiNWQwMjZjLWMxNDktNGY3Mi04ZjVhLWJmYWNjN2JmZDhlNSIsImMiOjE3MjEzODM2MzAxNzUsInMiOjEsInIiOjAsInNiIjowLCJzciI6MCwic2UiOjAsImZzIjowLCJzcCI6MH0=\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1754966403000,\"httpOnly\":false,\"name\":\"_tt_enable_cookie\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"252782fsb_excluded_products\",\"path\":\"/\",\"secure\":false,\"value\":\"\"},{\"domain\":\".www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"amped-fh0iqcz-sessionId\",\"path\":\"/\",\"secure\":true,\"value\":\"\\\"4b0efff1-4187-4113-8b36-cd876d742672\\\"\"},{\"domain\":\"www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"amped-fh0iqcz-sessionId\",\"path\":\"/\",\"secure\":false,\"value\":\"\\\"0cfd4c27-1862-4185-a1a2-264d603b7793\\\"\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1752919696000,\"httpOnly\":false,\"name\":\"___ELEVAR_GTM_SUITE--apexDomain\",\"path\":\"/\",\"secure\":true,\"value\":\"[[%22userId%22%2C%2290c847c9-097b-49a5-b54d-43ce59b5288e%22]%2C[%22sessionId%22%2C%221721383617%22]%2C[%22sessionCount%22%2C%224%22]%2C[%22lastCollectionPathname%22%2C%22/collections/best-sellers%22]%2C[%22lastDlPushTimestamp%22%2C%221721383696%22]%2C[%22userOnSignupPath%22%2Cnull]%2C[%22userLoggedIn%22%2Cnull]%2C[%22params%22%2C%22{%5C%22user_id%5C%22:%5C%2290c847c9-097b-49a5-b54d-43ce59b5288e%5C%22%2C%5C%22session_id%5C%22:%5C%221721383617%5C%22%2C%5C%22session_count%5C%22:%5C%224%5C%22}%22]%2C[%22cookies%22%2C%22{%5C%22_ga%5C%22:%5C%22GA1.1.174971013.1721270402%5C%22%2C%5C%22_ga_JM1YNFS6D3%5C%22:%5C%22GS1.1.1721383610.2.1.0.0.0.0%5C%22%2C%5C%22_fbp%5C%22:%5C%22fb.1.1721270402529.6865950152%5C%22%2C%5C%22_ttp%5C%22:%5C%22IhWJiv537ARdIDCo7e7Ox7r23kl%5C%22%2C%5C%22_ga_CQQWECQBL7%5C%22:%5C%22GS1.1.1721383610.2.1.0.60.0.0%5C%22}%22]%2C[%22debug%22%2Cnull]]\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1721443208000,\"httpOnly\":false,\"name\":\"_gers\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721470141000,\"httpOnly\":false,\"name\":\"__attentive_vf\",\"path\":\"/\",\"secure\":true,\"value\":\"true\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1722480024000,\"httpOnly\":false,\"name\":\"cart_currency\",\"path\":\"/\",\"secure\":true,\"value\":\"USD\"},{\"domain\":\"www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"252782fsb_incurred_fee_products\",\"path\":\"/\",\"secure\":false,\"value\":\"\"},{\"domain\":\".loveinfaith.life\",\"httpOnly\":false,\"name\":\"_li_dcdm_c\",\"path\":\"/\",\"secure\":true,\"value\":\".loveinfaith.life\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1754966403000,\"httpOnly\":false,\"name\":\"_ttp\",\"path\":\"/\",\"secure\":true,\"value\":\"IhWJiv537ARdIDCo7e7Ox7r23kl\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1752919737000,\"httpOnly\":false,\"name\":\"_shopify_y\",\"path\":\"/\",\"secure\":false,\"value\":\"90c847c9-097b-49a5-b54d-43ce59b5288e\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1755830406000,\"httpOnly\":false,\"name\":\"_lc2_fpi_meta\",\"path\":\"/\",\"secure\":true,\"value\":\"{%22w%22:1721270406990}\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721473668000,\"httpOnly\":false,\"name\":\"yotpo_pixel\",\"path\":\"/\",\"secure\":false,\"value\":\"3b442d68-621a-48a5-9742-f23e956bac46\"},{\"domain\":\".www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"fsb_previous_pathname\",\"path\":\"/\",\"secure\":true,\"value\":\"/collections/best-sellers\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1755830407000,\"httpOnly\":false,\"name\":\"__attentive_cco\",\"path\":\"/\",\"secure\":true,\"value\":\"1721270407747\"},{\"domain\":\"www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"fsb_previous_pathname\",\"path\":\"/\",\"secure\":false,\"value\":\"/products/faith-flag-vintage-camo-tee\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1722479999000,\"httpOnly\":false,\"name\":\"_orig_referrer\",\"path\":\"/\",\"secure\":true,\"value\":\"\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1755943732000,\"httpOnly\":false,\"name\":\"_attn_\",\"path\":\"/\",\"secure\":true,\"value\":\"eyJ1Ijoie1wiY29cIjoxNzIxMjcwNDA3NzQ1LFwidW9cIjoxNzIxMjcwNDA3NzQ1LFwibWFcIjoyMTkwMCxcImluXCI6ZmFsc2UsXCJ2YWxcIjpcImE3ZTQyMGFiYTk3NTQyM2JiZTE0NDIzOTRmNjM3Nzg1XCJ9In0=\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1729046403000,\"httpOnly\":false,\"name\":\"_gcl_au\",\"path\":\"/\",\"secure\":false,\"value\":\"1.1.1077156840.1721270403\"},{\"domain\":\".www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"fsb_total_price_252782\",\"path\":\"/\",\"secure\":true,\"value\":\"0\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721385535000,\"httpOnly\":false,\"name\":\"__attentive_pv\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1752374406000,\"httpOnly\":false,\"name\":\"_geuid\",\"path\":\"/\",\"secure\":true,\"value\":\"c72c982c-6e62-44e2-a725-e6201e138c98-1721270406271\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1721875207000,\"httpOnly\":false,\"name\":\"_getd\",\"path\":\"/\",\"secure\":true,\"value\":\"NmJhNGUwN2VlMjAzM2U1NDZhOWI4YmJkNDY0NjViYjE=\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1721443207000,\"httpOnly\":false,\"name\":\"_getdran\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1752919737000,\"httpOnly\":true,\"name\":\"secure_customer_sig\",\"path\":\"/\",\"secure\":true,\"value\":\"\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1755830417000,\"httpOnly\":false,\"name\":\"__kla_id\",\"path\":\"/\",\"secure\":true,\"value\":\"eyJjaWQiOiJORE13WWpCaFkyTXRZekV6T0MwME5qSTRMVGt3WVRBdE9UUTVNRFF4TkRFellURXgiLCIkcmVmZXJyZXIiOnsidHMiOjE3MjEyNzA0MDMsInZhbHVlIjoiIiwiZmlyc3RfcGFnZSI6Imh0dHBzOi8vd3d3LmxvdmVpbmZhaXRoLmxpZmUvY29sbGVjdGlvbnMvYmVzdC1zZWxsZXJzIn0sIiRsYXN0X3JlZmVycmVyIjp7InRzIjoxNzIxMjcwNDE4LCJ2YWx1ZSI6IiIsImZpcnN0X3BhZ2UiOiJodHRwczovL3d3dy5sb3ZlaW5mYWl0aC5saWZlL2NvbGxlY3Rpb25zL2Jlc3Qtc2VsbGVycyJ9fQ==\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1755943710000,\"httpOnly\":false,\"name\":\"__kla_id\",\"path\":\"/\",\"secure\":false,\"value\":\"eyJjaWQiOiJORE13WWpCaFkyTXRZekV6T0MwME5qSTRMVGt3WVRBdE9UUTVNRFF4TkRFellURXgiLCIkcmVmZXJyZXIiOnsidHMiOjE3MjEyNzA0MDMsInZhbHVlIjoiIiwiZmlyc3RfcGFnZSI6Imh0dHBzOi8vd3d3LmxvdmVpbmZhaXRoLmxpZmUvY29sbGVjdGlvbnMvYmVzdC1zZWxsZXJzIn0sIiRsYXN0X3JlZmVycmVyIjp7InRzIjoxNzIxMzgzNzEwLCJ2YWx1ZSI6IiIsImZpcnN0X3BhZ2UiOiJodHRwczovL3d3dy5sb3ZlaW5mYWl0aC5saWZlL3Byb2R1Y3RzL2ZhaXRoLWZsYWctdmludGFnZS1jYW1vLXRlZT92YXJpYW50PTM5OTczNDI4MDAyODgzIn19\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1755943728000,\"httpOnly\":false,\"name\":\"_ga_CQQWECQBL7\",\"path\":\"/\",\"secure\":false,\"value\":\"GS1.1.1721383610.2.1.1721383728.13.0.0\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1721385537000,\"httpOnly\":false,\"name\":\"_shopify_s\",\"path\":\"/\",\"secure\":false,\"value\":\"2fa84303-0682-49fa-a1a2-41370f7cb365\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1729159729000,\"httpOnly\":false,\"name\":\"_fbp\",\"path\":\"/\",\"secure\":false,\"value\":\"fb.1.1721270402529.6865950152\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1755943738000,\"httpOnly\":false,\"name\":\"_sp_id.0b2d\",\"path\":\"/\",\"secure\":false,\"value\":\"3c67608f687b6ebc.1721383677.1.1721383739.1721383677\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1752919710000,\"httpOnly\":false,\"name\":\"_hjSessionUser_3168008\",\"path\":\"/\",\"secure\":true,\"value\":\"eyJpZCI6ImUxYWI2YTRkLWJhM2MtNTRmMC1iMTE0LTA1MGM1ZjQzNzAyYSIsImNyZWF0ZWQiOjE3MjEyNzA0MDI1NzEsImV4aXN0aW5nIjp0cnVlfQ==\"},{\"domain\":\".www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"receive-cookie-deprecation\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721385535000,\"httpOnly\":false,\"name\":\"__attentive_ss_referrer\",\"path\":\"/\",\"secure\":true,\"value\":\"ORGANIC\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721470133000,\"httpOnly\":false,\"name\":\"_ps_session\",\"path\":\"/\",\"secure\":false,\"value\":\"TaXT-8yprRjsyOTbGsdEj\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1721385489000,\"httpOnly\":false,\"name\":\"_shopify_sa_t\",\"path\":\"/\",\"secure\":false,\"value\":\"2024-07-19T10%3A08%3A09.309Z\"},{\"domain\":\".www.loveinfaith.life\",\"httpOnly\":false,\"name\":\"252782fsb_target_products_type\",\"path\":\"/\",\"secure\":true,\"value\":\"all\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721426827000,\"httpOnly\":false,\"name\":\"sessionCookie\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1721385489000,\"httpOnly\":false,\"name\":\"_shopify_sa_p\",\"path\":\"/\",\"secure\":false,\"value\":\"\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1722479999000,\"httpOnly\":false,\"name\":\"_landing_page\",\"path\":\"/\",\"secure\":true,\"value\":\"%2Fcollections%2Fbest-sellers\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1721470133000,\"httpOnly\":false,\"name\":\"_cmp_a\",\"path\":\"/\",\"secure\":false,\"value\":\"%7B%22purposes%22%3A%7B%22a%22%3Atrue%2C%22p%22%3Atrue%2C%22m%22%3Atrue%2C%22t%22%3Atrue%7D%2C%22display_banner%22%3Afalse%2C%22sale_of_data_region%22%3Afalse%7D\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1752806416000,\"httpOnly\":false,\"name\":\"_pin_unauth\",\"path\":\"/\",\"secure\":true,\"value\":\"dWlkPU1qUTBZbVJqTUdRdFkyWTRNaTAwTldVMkxUaGtNek10TURjNFkyUXhOR0ZpTUdKag\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1752919689000,\"httpOnly\":false,\"name\":\"_pin_unauth\",\"path\":\"/\",\"secure\":false,\"value\":\"dWlkPU9HWXhNelZqWlRFdFlURmhZeTAwWWpSakxUazNZV0V0T1dRME5qUXlPVGN6TldReA\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1755830406000,\"httpOnly\":false,\"name\":\"_lc2_fpi\",\"path\":\"/\",\"secure\":true,\"value\":\"a9d42ba12238--01j31vc3tehhznbeg2tg7vhmgf\"},{\"domain\":\".www.loveinfaith.life\",\"expiry\":1721443206000,\"httpOnly\":false,\"name\":\"_geran\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721470137000,\"httpOnly\":false,\"name\":\"__attentive_dv\",\"path\":\"/\",\"secure\":true,\"value\":\"1\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1755943732000,\"httpOnly\":false,\"name\":\"__attentive_id\",\"path\":\"/\",\"secure\":true,\"value\":\"a7e420aba975423bbe1442394f637785\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1755943728000,\"httpOnly\":false,\"name\":\"_ga\",\"path\":\"/\",\"secure\":false,\"value\":\"GA1.1.174971013.1721270402\"},{\"domain\":\".loveinfaith.life\",\"expiry\":1755943710000,\"httpOnly\":false,\"name\":\"_ga_JM1YNFS6D3\",\"path\":\"/\",\"secure\":false,\"value\":\"GS1.1.1721383610.2.1.1721383710.0.0.0\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721385533000,\"httpOnly\":true,\"name\":\"keep_alive\",\"path\":\"/\",\"secure\":false,\"value\":\"dbcdb364-42a3-40cb-b105-b058bdc67daa\"},{\"domain\":\"www.loveinfaith.life\",\"expiry\":1721385538000,\"httpOnly\":false,\"name\":\"_sp_ses.0b2d\",\"path\":\"/\",\"secure\":false,\"value\":\"*\"}]");
    }

    private WebDriver addCookies(WebDriver webDriver, Set<Cookie> cookies) {
        try {
            Iterator var5 = cookies.iterator();

            while (var5.hasNext()) {
                Cookie cookie = (Cookie) var5.next();
                try {
                    webDriver.manage().addCookie(cookie);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return webDriver;
    }

    public void cookieLogin() {
        chromeDriver.manage().deleteAllCookies();
        Set<Cookie> cookies = JSON.parseArray(cookieList.get(0), Cookie.class).stream().collect(Collectors.toSet());
        addCookies(chromeDriver, cookies);
    }


    //https://www.nuomiphp.com/eplan/585486.html
    //JSON.toJSONString(chromeDriver.manage().getCookies())
    public void login() {
        initCookieList();


        System.setProperty("webdriver.chrome.driver", "/Users/tanggod/Desktop/macos-desktop-count/util/webdriver/chromedriver");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.loveinfaith.life/products/forgiven-sunflower-v-neck-3011?variant=41629261234243");

        cookieLogin();

        chromeDriver.get("https://www.loveinfaith.life/products/forgiven-sunflower-v-neck-3011?variant=41629261234243");

        //爬产品列表();
        爬商品评论();
        chromeDriver.quit();
    }

    private void 爬商品评论() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");

        List<WebsiteProductDTO> websiteProductDTOList = webSiteProductService.listWebSiteProductByProductFilterZeroReviewSize();
        for (int i = 0; i < websiteProductDTOList.size(); i++) {
        //for (int i = 2; i < 3; i++) {
            System.out.println("当前进度:" + (i + 1) + "/" + websiteProductDTOList.size() + "  " + websiteProductDTOList.get(i).getId());
            shouldExit = false;
            successSize = 0;
            WebsiteProductDTO websiteProductDTO = websiteProductDTOList.get(i);

            comparedKeySet.clear();
            comparedKeySet = websiteProductReviewService.getComparedKeySet(websiteProductReviewService.listWebsiteProductReviewDTOListByProductId(websiteProductDTO.getId()));

            finallyTask(() -> {
                chromeDriver.get(websiteProductDTO.getProductLink());

                //1、点击评论
                chromeDriver.findElement(By.cssSelector(".product-display__details .product-review-summary--yotpo__count")).click();

                输入休眠(3000);
            });

            //2、滚动到底部
            scrollTop(chromeDriver, 5);
            //3、获取评论区列表
            if (0 == chromeDriver.findElements(By.cssSelector(".yotpo-horizontal-pagination")).size()) {
                System.out.println("评论数量小于6，只执行一次");
                爬取评论区列表(formatter, websiteProductDTO.getId(), websiteProductDTO.getReviewSize());
                shouldExit = true;
            }

            while (!shouldExit && !Boolean.valueOf(chromeDriver.findElement(By.cssSelector(".yotpo-horizontal-pagination")).findElement(By.cssSelector(".yotpo-reviews-pagination-item[aria-label='Goto next page']")).getAttribute("aria-disabled"))
            ) {
                爬取评论区列表(formatter, websiteProductDTO.getId(), websiteProductDTO.getReviewSize());
                System.out.println("翻页");
                //翻页
                try {
                    翻页();
                    //输入休眠(2200);
                    //scrollTop(chromeDriver, 10);
                    输入休眠(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //System.out.println("最后一页 开始");
            shouldExit = false;
            /*try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            //爬取评论区列表(formatter, websiteProductDTO.getId(), websiteProductDTO.getReviewSize());
            //System.out.println("最后一页 结束");
        }

        System.out.println("所有产品采集完毕!");
    }

    private List<WebElement> 获取评论区列表WebElementList() {
        return chromeDriver.findElements(By.cssSelector(".yotpo-reviews-list .yotpo-review"));
    }

    private void 翻页() {
        finallyTask(() -> {
            scrollTop(chromeDriver, 5);
            chromeDriver.findElement(By.cssSelector(".yotpo-horizontal-pagination")).findElement(By.cssSelector(".yotpo-reviews-pagination-item[aria-label='Goto next page']")).click();
        });
    }

    private void 爬取评论区列表(SimpleDateFormat formatter, String websiteProductId, int reviewSize) {
        List<WebElement> reviewElementList = 获取评论区列表WebElementList();
        for (int i = 0; i < reviewElementList.size(); i++) {
            WebsiteProductReviewDTO 爬取每一条评论 = 爬取每一条评论(websiteProductId, i, formatter, reviewSize);
            //循环三次 不行的话就翻页
            int index = 0;
            while (null == 爬取每一条评论) {
                输入休眠(3000);
                if (index++ == 6) {
                    System.out.println("查询失败 直接翻页");
                    翻页();
                    输入休眠(3000);
                    //如果翻页后，还是存在，则退出
                    WebsiteProductReviewDTO 爬取每一条评论2 = 爬取每一条评论(websiteProductId, i, formatter, reviewSize);
                    if (null == 爬取每一条评论2) {
                        System.out.println("评论数据已是最新的，退出任务");
                        shouldExit = true;
                    }
                    return;
                }
            }

            saveWebsiteProductReviewDTO(爬取每一条评论);
        }
    }

    private void saveWebsiteProductReviewDTO(WebsiteProductReviewDTO websiteProductReviewDTO) {
        //shouldExit = true;
        websiteProductReviewService.create(websiteProductReviewDTO);
        comparedKeySet.add(websiteProductReviewDTO.getComparedKey());
        comparedKeyList.add(websiteProductReviewDTO.getComparedKey());
        System.out.println("创建成功 " + ++successSize);
    }

    private WebsiteProductReviewDTO 爬取每一条评论(String websiteProductId, int index, SimpleDateFormat formatter, int reviewSize) {
        WebsiteProductReviewDTO websiteProductReviewDTO = new WebsiteProductReviewDTO();
        websiteProductReviewDTO.setWebsiteProductId(websiteProductId);
        List<WebElement> reviewElementList = 获取评论区列表WebElementList();

        List<Integer> starRatingList = new ArrayList<>(5);
        if (获取评论区列表WebElementList().size() != reviewElementList.size()) {
            System.out.println("页面数据不匹配,跳出评论区循环");
            return null;
        }
        finallyTask(() -> {
            if (获取评论区列表WebElementList().size() != reviewElementList.size()) {
            } else {
                //用户名
                String userName = 获取评论区列表WebElementList().get(index).findElement(By.cssSelector(".yotpo-reviewer-name")).getText();
                websiteProductReviewDTO.setUserName(userName);
            }
        });

        finallyTask(() -> {
            if (获取评论区列表WebElementList().size() != reviewElementList.size()) {
            } else {
                //评分等级
                List<WebElement> starRatingElementList = 获取评论区列表WebElementList().get(index).findElements(By.cssSelector(".star-container"));
                starRatingElementList.stream().forEach(starRatingElement -> {
                    List<WebElement> fullStar = starRatingElement.findElements(By.cssSelector(".yotpo-sr-star-full"));
                    if (fullStar.size() > 0) {
                        starRatingList.add(1);
                    }
                });

                int starRating = starRatingList.size();
                if (starRating > 5) {
                    starRating = 5;
                }
                websiteProductReviewDTO.setStarRating(starRating);
            }

        });

        finallyTask(() -> {
            if (获取评论区列表WebElementList().size() != reviewElementList.size()) {
            } else {
                //评论标题
                String reviewTitle = 获取评论区列表WebElementList().get(index).findElement(By.cssSelector(".yotpo-review-title")).getText();
                //文字评论内容
                String reviewTextContent = 获取评论区列表WebElementList().get(index).findElement(By.cssSelector(".yotpo-read-more-text")).getText();
                //图片评论内容
                String reviewImageContent = "";
                List<WebElement> reviewImageContentList = 获取评论区列表WebElementList().get(index).findElements(By.cssSelector(".yotpo-image-thumbnail"));
                if (reviewImageContentList.size() > 0) {
                    reviewImageContent = reviewImageContentList.get(0).getCssValue("background-image").replace("url(\"", "").replace("\")", "");
                }
                //评论日期
                Date reviewDate = null;
                try {
                    reviewDate = formatter.parse(获取评论区列表WebElementList().get(index).findElement(By.cssSelector(".yotpo-date-format")).getText());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                websiteProductReviewDTO.setReviewDate(reviewDate);

                websiteProductReviewDTO.setReviewTitle(reviewTitle);
                websiteProductReviewDTO.setReviewTextContent(reviewTextContent);
                websiteProductReviewDTO.setReviewImageContent(reviewImageContent);

            }
        });

        if (StringUtils.isNotBlank(websiteProductReviewDTO.getUserName())
                && StringUtils.isNotBlank(websiteProductReviewDTO.getReviewTextContent())
                && null != websiteProductReviewDTO.getStarRating()
                && null != websiteProductReviewDTO.getReviewDate()) {

            String comparedKey = websiteProductReviewService.getComparedKey(websiteProductReviewDTO);
            //创建之前要先校验评论是否存在，如果存在，则跳出这次采集
            if (websiteProductReviewService.checkReviewExist(websiteProductReviewDTO, comparedKeySet)
            ) {
                return null;
            } else {
                websiteProductReviewDTO.setComparedKey(comparedKey);
            }


        } else {
            System.out.println("获取数据失败!重新执行");
            爬取评论区列表(formatter, websiteProductId, reviewSize);
        }
        return websiteProductReviewDTO;
    }

    private void 爬产品列表() {
        phantomJsUtil.scrollTop(chromeDriver, 350);

        //1、查找所有产品列表
        List<WebElement> 产品列表 = 获取产品列表();
        for (int i = 174; i < 产品列表.size(); i++) {
            int index = i;
            System.out.println("当前进度:" + (i + 1) + "/" + 产品列表.size());

            finallyTask(() -> {
                //产品链接
                WebElement productLink = 获取产品列表().get(index);
                //2、点击进入产品链接
                productLink.click();
                System.out.println("点击进入产品链接");
            });

            finallyTask(() -> {
                System.out.println("采集数据 开始");
                //3、采集数据
                采集数据();
                System.out.println("采集数据 结束");
            });

            finallyTask(() -> {
                //4、回退
                chromeDriver.navigate().back();
                System.out.println("回退 首页");
                phantomJsUtil.scrollTop(chromeDriver, 6);
            });

        }
    }

    private List<WebElement> 获取产品列表() {
        return chromeDriver.findElements(By.cssSelector(".product-tile__details h3"));
    }

    private void 采集数据() {
        String currentUrl = chromeDriver.getCurrentUrl().split("\\?")[0];
        BigDecimal price = new BigDecimal(chromeDriver.findElement(By.cssSelector(".product-price__price.on-sale")).getText().replace("$", ""));
        String title;
        if (0 == chromeDriver.findElements(By.cssSelector(".product-info__title")).size()) {
            title = chromeDriver.findElement(By.cssSelector(".product-name")).getText();
        } else {
            title = chromeDriver.findElement(By.cssSelector(".product-info__title")).getText();
        }

        int reviewSize;
        if (0 == chromeDriver.findElements(By.cssSelector(".product-display__details .product-review-summary--yotpo__count")).size()) {
            reviewSize = 0;
        } else {
            reviewSize = Integer.valueOf(chromeDriver.findElement(By.cssSelector(".product-display__details .product-review-summary--yotpo__count")).getText().replace("(", "").replace(")", ""));
        }
        String mainImageUrl = chromeDriver.findElement(By.cssSelector(".product-images-carousel__media img")).getAttribute("src");
        List<WebsiteProductDTO> websiteProductDTOList = webSiteProductService.listWebSiteProductByProductLink(currentUrl);
        if (websiteProductDTOList.size() > 0) {
            System.out.println("error !!!! websiteProductDTOList.size()>0");
        } else {
            webSiteProductService.create(websitePlatformId, productCategory, currentUrl, title, price, reviewSize, mainImageUrl);
        }
        System.out.println(currentUrl);
    }


    public static void 输入休眠(Integer value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void finallyTask(Runnable task) {
        int i = 0;
        while (true) {
            try {
                task.run();
                break;
            } catch (Exception e) {
            }
            i++;
            if (i > 100000)
                break;
        }
    }

    public void scrollTop(WebDriver webDriver, int count) {
        JavascriptExecutor webDriverJS = (JavascriptExecutor) webDriver;
        int size = 1000;
        String builder = new String("document.documentElement.scrollTop=" + size);

        for (int i = 0; i < count; ++i) {
            webDriverJS.executeScript(builder, new Object[0]);
            int beforeSize = size;
            size += 1000;
            builder = builder.replace(String.valueOf(beforeSize), String.valueOf(size));

            输入休眠(100);
        }

    }


    public WebElement closeAlertById(String id) {
        WebElement element = (WebElement) ((JavascriptExecutor) chromeDriver).executeScript("return document.querySelector('#{id}');".replace("{id}", id));
        return element;
    }

    public WebElement closeAlertByClass(String clazz) {
        WebElement element = (WebElement) ((JavascriptExecutor) chromeDriver).executeScript("return document.querySelector('.{clazz}');".replace("{clazz}", clazz));
        return element;
    }

    public void 缩放() {
        String zoom_out = "document.body.style.zoom='0.5'";
        ((JavascriptExecutor) chromeDriver).executeScript(zoom_out);
    }


    public static void main(String[] args) throws Exception {
        //new LoveInFaith().login();
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(WebdriverApplication.class, args);
        LoveInFaith bean = configurableApplicationContext.getBean(LoveInFaith.class);
        bean.login();

    }
}
