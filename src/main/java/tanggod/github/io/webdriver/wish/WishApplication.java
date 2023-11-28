package tanggod.github.io.webdriver.wish;

import cn.xchats.onlinetraffic.common.other.mq.AMQPServer;
import cn.xchats.onlinetraffic.common.other.util.PropertyUtil;
import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.common.type.AMQPType;
import cn.xchats.onlinetraffic.common.type.EmailParameterType;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import tanggod.github.io.config.database.repository.wish.tables.CategoryData;
import tanggod.github.io.config.database.repository.wish.tables.Productinfo;
import tanggod.github.io.config.database.repository.wish.tables.WishWebCookie;
import tanggod.github.io.webdriver.IdWorkerUtils;
import tanggod.github.io.webdriver.WebdriverApplication;
import tanggod.github.io.webdriver.dianxiaomi.RegularUtil;
import tanggod.github.io.webdriver.dto.CategoryDataDto;
import tanggod.github.io.webdriver.dto.ProductinfoDto;
import tanggod.github.io.webdriver.thread.ProductTask;
import tanggod.github.io.webdriver.thread.ThreadCache;
import tanggod.github.io.webdriver.timer.MyTimerTask;

import javax.xml.stream.events.DTD;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/29.
 */
@Service
public class WishApplication extends JooqBaseService {

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();
    private static final String filePath1 = "/Users/tanggod/wish_user1";
    //private static final String filePath1 = "D:/tanggod/wish_user1";

    private static final String cookieValue = "[{\"domain\":\"www.wish.com\",\"expiry\":1677138827000,\"httpOnly\":true,\"name\":\"bsid\",\"path\":\"/\",\"secure\":false,\"value\":\"aaebbfdcdeb4479e9a215e5a9e6a78f8\"},{\"domain\":\".wish.com\",\"expiry\":1711264729000,\"httpOnly\":false,\"name\":\"cmapi_gtm_bl\",\"path\":\"/\",\"secure\":true,\"value\":\"\"},{\"domain\":\".wish.com\",\"httpOnly\":false,\"name\":\"_schn\",\"path\":\"/\",\"secure\":false,\"value\":\"_0x18zx\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"logged_out_locale\",\"path\":\"/\",\"secure\":false,\"value\":\"en\"},{\"domain\":\".wish.com\",\"expiry\":1711264729000,\"httpOnly\":false,\"name\":\"cmapi_cookie_privacy\",\"path\":\"/\",\"secure\":true,\"value\":\"permit 1,2,3\"},{\"domain\":\"www.wish.com\",\"expiry\":1708672710000,\"httpOnly\":false,\"name\":\"visitor_id\",\"path\":\"/\",\"secure\":false,\"value\":\"c33b267d568044278d5ff656f5a5027c\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"sweeper_uuid\",\"path\":\"/\",\"secure\":false,\"value\":\"c05536442e30468cb90f5b05dd1378b5\"},{\"domain\":\"www.wish.com\",\"expiry\":1708672999000,\"httpOnly\":false,\"name\":\"_dcmn_p\",\"path\":\"/\",\"secure\":true,\"value\":\"GwYVY2lkPXlaU2R4bVAzRkdleXFrWjdBaEk\"},{\"domain\":\".wish.com\",\"expiry\":1710832783000,\"httpOnly\":false,\"name\":\"_tt_enable_cookie\",\"path\":\"/\",\"secure\":false,\"value\":\"1\"},{\"domain\":\"www.wish.com\",\"expiry\":1677138517000,\"httpOnly\":false,\"name\":\"number_of_product_per_row\",\"path\":\"/\",\"secure\":false,\"value\":\"4\"},{\"domain\":\".wish.com\",\"httpOnly\":false,\"name\":\"IR_gbd\",\"path\":\"/\",\"secure\":false,\"value\":\"wish.com\"},{\"domain\":\".wish.com\",\"expiry\":1711264729000,\"httpOnly\":false,\"name\":\"notice_poptime\",\"path\":\"/\",\"secure\":true,\"value\":\"1656720000000\"},{\"domain\":\".wish.com\",\"httpOnly\":false,\"name\":\"notice_behavior\",\"path\":\"/\",\"secure\":true,\"value\":\"expressed,eu\"},{\"domain\":\".wish.com\",\"expiry\":1711264729000,\"httpOnly\":false,\"name\":\"notice_gdpr_prefs\",\"path\":\"/\",\"secure\":true,\"value\":\"0,1,2:\"},{\"domain\":\"www.wish.com\",\"expiry\":1679728948000,\"httpOnly\":false,\"name\":\"mfa_id\",\"path\":\"/\",\"secure\":false,\"value\":\"\\\"2|1:1|10:1677136948|6:mfa_id|32:NjNmNzE0MzQwODAwZThkOWRhMTNlNzRh|a6fc55ef8204ee195a62a1e5cb0acdddc1f3b537dcd4ce5ebbea0d53e9797e1a\\\"\"},{\"domain\":\".wish.com\",\"expiry\":1684913000000,\"httpOnly\":false,\"name\":\"_fbp\",\"path\":\"/\",\"secure\":false,\"value\":\"fb.1.1677136783564.1974966723\"},{\"domain\":\".wish.com\",\"expiry\":1710832783000,\"httpOnly\":false,\"name\":\"_ttp\",\"path\":\"/\",\"secure\":false,\"value\":\"4IFrpQdgRvAhyitR_e2BydQT3xv\"},{\"domain\":\"www.wish.com\",\"expiry\":1711696999000,\"httpOnly\":false,\"name\":\"_tq_id.TV-09458190-1.2013\",\"path\":\"/\",\"secure\":false,\"value\":\"1b666ac14aadab32.1677137000.0.1677137000..\"},{\"domain\":\"www.wish.com\",\"expiry\":1708672997000,\"httpOnly\":true,\"name\":\"sweeper_session\",\"path\":\"/\",\"secure\":false,\"value\":\"\\\"2|1:1|10:1677136998|15:sweeper_session|84:NjJmZmFlZWYtZTg3ZC00MTkxLTg1MjQtMjkyOGM0YjJkMjRiMjAyMy0wMi0yMyAwNzoyMzoxMi41ODM2ODY=|df26b2bc61996b71af897aa3e4b47453592e7a6717761b7fc4cb341ce63006e5\\\"\"},{\"domain\":\".wish.com\",\"httpOnly\":false,\"name\":\"IR_12396\",\"path\":\"/\",\"secure\":false,\"value\":\"1677136998475%7C0%7C1677136998475%7C%7C\"},{\"domain\":\"www.wish.com\",\"expiry\":1677223398000,\"httpOnly\":false,\"name\":\"sessionRefreshed_62a589eb4f9fde5b15385107\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\".wish.com\",\"expiry\":1711696998000,\"httpOnly\":false,\"name\":\"IR_PI\",\"path\":\"/\",\"secure\":false,\"value\":\"fa4aa3ac-2779-3f6c-962d-85576e23ff9f%7C1677223398475\"},{\"domain\":\"www.wish.com\",\"expiry\":1677223129000,\"httpOnly\":false,\"name\":\"ln_or\",\"path\":\"/\",\"secure\":false,\"value\":\"eyIyMjQxNTMyIjoiZCJ9\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"gtm_functional_allowed\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"gtm_advertising_allowed\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\"www.wish.com\",\"expiry\":1708672992000,\"httpOnly\":false,\"name\":\"authentication_id\",\"path\":\"/\",\"secure\":false,\"value\":\"e3cc701ee8f040472240bc7230e2da3a\"},{\"domain\":\".wish.com\",\"expiry\":1677223237000,\"httpOnly\":false,\"name\":\"_gid\",\"path\":\"/\",\"secure\":false,\"value\":\"GA1.2.197173471.1677136837\"},{\"domain\":\".wish.com\",\"expiry\":1711696837000,\"httpOnly\":false,\"name\":\"_ga\",\"path\":\"/\",\"secure\":false,\"value\":\"GA1.2.1875540772.1677136837\"},{\"domain\":\"www.wish.com\",\"expiry\":1677137928000,\"httpOnly\":false,\"name\":\"_dd_s\",\"path\":\"/\",\"secure\":false,\"value\":\"rum=1&id=a73c5bf8-69c6-4fcd-954e-82bf52c9cab4&created=1677136717217&expire=1677137897549\"},{\"domain\":\".wish.com\",\"expiry\":1684912717000,\"httpOnly\":false,\"name\":\"_gcl_au\",\"path\":\"/\",\"secure\":false,\"value\":\"1.1.108866309.1677136718\"},{\"domain\":\".wish.com\",\"expiry\":1711323415000,\"httpOnly\":false,\"name\":\"_scid\",\"path\":\"/\",\"secure\":false,\"value\":\"5850f0f9-c9e8-4f4b-b368-1893bad207b9\"},{\"domain\":\".wish.com\",\"expiry\":1711264729000,\"httpOnly\":false,\"name\":\"notice_preferences\",\"path\":\"/\",\"secure\":true,\"value\":\"2:\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"_is_desktop\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"_timezone\",\"path\":\"/\",\"secure\":false,\"value\":\"8\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"vendor_user_tracker\",\"path\":\"/\",\"secure\":false,\"value\":\"e9723cdddd127a3ef4f1b0ba0cd4b5cce95dd56f0dd7b8127080d96ba4699d73\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"_xsrf\",\"path\":\"/\",\"secure\":false,\"value\":\"2|cd3e3cb4|13ee53a08a40a5755b20be39ad09590a|1677136710\"},{\"domain\":\"www.wish.com\",\"expiry\":1677223117000,\"httpOnly\":false,\"name\":\"sessionRefreshed_63f71346e7a5dea6ccb0a0db\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"}]";
            //"[{\"domain\":\"www.wish.com\",\"expiry\":1577351922000,\"httpOnly\":false,\"name\":\"sessionRefreshed_5bc837686735d45f4dd4aaa7\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\"www.wish.com\",\"expiry\":1608801522000,\"httpOnly\":true,\"name\":\"sweeper_session\",\"path\":\"/\",\"secure\":false,\"value\":\"\\\"2|1:0|10:1577265522|15:sweeper_session|84:ZmQ4ODQ4ZTAtOGE3Ni00N2NmLThkOWEtOGUxMjQwZmJiZGQzMjAxOS0xMi0yNSAwOToxODo0MS4wNDEwOTA=|d567c91467d22994c2e1f601e9a70155fe7fd67a4a317d85a00be4830ad6c4bf\\\"\"},{\"domain\":\"www.wish.com\",\"expiry\":1577267333000,\"httpOnly\":true,\"name\":\"bsid\",\"path\":\"/\",\"secure\":false,\"value\":\"3fa730100f9c455bad8d9a38e7b96356\"},{\"domain\":\".www.wish.com\",\"expiry\":1577267316000,\"httpOnly\":false,\"name\":\"__stripe_sid\",\"path\":\"/\",\"secure\":false,\"value\":\"d36ee33d-724f-43b1-80ac-8c526bde094e\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"logged_out_locale\",\"path\":\"/\",\"secure\":false,\"value\":\"en\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"sweeper_uuid\",\"path\":\"/\",\"secure\":false,\"value\":\"4785ef759e8e4b8399c0406607f1e540\"},{\"domain\":\".www.wish.com\",\"expiry\":1608801516000,\"httpOnly\":false,\"name\":\"__stripe_mid\",\"path\":\"/\",\"secure\":false,\"value\":\"105b6445-09c3-43ed-b873-b21904191c05\"},{\"domain\":\"www.wish.com\",\"expiry\":1577289599000,\"httpOnly\":false,\"name\":\"web_promotion\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\".www.wish.com\",\"httpOnly\":false,\"name\":\"G_AUTHUSER_H\",\"path\":\"/\",\"secure\":true,\"value\":\"0\"},{\"domain\":\".wish.com\",\"expiry\":1611393437000,\"httpOnly\":false,\"name\":\"notice_gdpr_prefs\",\"path\":\"/\",\"secure\":false,\"value\":\"0,1,2:\"},{\"domain\":\".wish.com\",\"expiry\":1585041526000,\"httpOnly\":false,\"name\":\"_fbp\",\"path\":\"/\",\"secure\":false,\"value\":\"fb.1.1577265433938.2008504125\"},{\"domain\":\".wish.com\",\"expiry\":1611393437000,\"httpOnly\":false,\"name\":\"notice_preferences\",\"path\":\"/\",\"secure\":false,\"value\":\"2:\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"_is_desktop\",\"path\":\"/\",\"secure\":false,\"value\":\"true\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"_timezone\",\"path\":\"/\",\"secure\":false,\"value\":\"8\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"vendor_user_tracker\",\"path\":\"/\",\"secure\":false,\"value\":\"c5e29f881a9f0c9abf5e6c1bb7276a58375c0aa41dad608f65e7ea51789cfd17\"},{\"domain\":\".wish.com\",\"expiry\":1608801433000,\"httpOnly\":false,\"name\":\"_derived_epik\",\"path\":\"/\",\"secure\":false,\"value\":\"dj0yJnU9QXVCck5pdnRhbmkwR3RHbkozNU16OTlHcXhmY3NkRWImbj1JQm5GYWFiZXVJOHRrNXl5Wi1kVndRJm09NyZ0PUFBQUFBRjRES1Jr\"},{\"domain\":\"www.wish.com\",\"httpOnly\":false,\"name\":\"_xsrf\",\"path\":\"/\",\"secure\":false,\"value\":\"2|f8022903|09df83056a9e73c4e78088fc514e73f7|1577265408\"},{\"domain\":\".www.wish.com\",\"expiry\":253402257600000,\"httpOnly\":false,\"name\":\"G_ENABLED_IDPS\",\"path\":\"/\",\"secure\":false,\"value\":\"google\"}]";

    private static Integer size = 0;


    @Autowired
    private AMQPServer amqpServer;


    public void batchSerializableWrite(String filePath, Set<Cookie> cookies) {
        try {
            File file = new File(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(cookies);
            objectOutputStream.flush();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static Set<Cookie> batchSerializableRead(String filePath) {
        try {
            File file = new File(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            return (Set<Cookie>) objectInputStream.readObject();
        } catch (Exception var3) {
            var3.printStackTrace();
        }
        return null;

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


    private WebDriver chromeDriver;

    public void login(String filePath) {
        //WebDriver chromeDriver = null;
        try {


            chromeDriver = phantomJsUtil.getDisplayChromeDriver(false);
            //chromeDriver = phantomJsUtil.getDisplayChromeDriver(true);
            //loginDomecrossExtension(chromeDriver);
            chromeDriver.get("https://wish.com");

            chromeDriver.manage().deleteAllCookies();
            Set<Cookie> cookies = JSON.parseArray(cookieValue, Cookie.class).stream().collect(Collectors.toSet());
            addCookies(chromeDriver, cookies);


          /*  MyTimerTask.task(() -> {

                try {
                    chromeDriver.get("https://www.wish.com/search/men jacket?&source=search");

                    Cookie xsrf = chromeDriver.manage().getCookieNamed("_xsrf");
                    System.out.println(xsrf.getName() + " - > " + xsrf.getValue());


                    List<tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord> wishCvsRecords = jooqStorage.listByCondition(WishCvsRecord.WISH_CVS_RECORD
                            , tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord.class
                            , WishCvsRecord.WISH_CVS_RECORD.ACCESS_TOKEN.eq(xsrf.getValue()));

                    //新的token
                    if (wishCvsRecords.size() == 0) {
                        tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord wishCvsRecord = new tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord();
                        wishCvsRecord.setAccessToken(xsrf.getValue());
                        wishCvsRecord.setJobId(IdWorkerUtils.getInstance().createUUID());
                        wishCvsRecord.setType("-1");

                        jooqStorage.create(WishCvsRecord.WISH_CVS_RECORD
                                , tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord.class
                                , wishCvsRecord);
                    }


                } catch (Exception e) {

                }

            });*/

          /*  MyTimerTask.task(() -> {

                try {
                    chromeDriver.get("https://www.wish.com/search/men jacket?&source=search");

                    Set<Cookie> cookies2 = chromeDriver.manage().getCookies();
                    String value = JSON.toJSONString(cookies2);


                    List<tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord> wishCvsRecords = jooqStorage.listByCondition(WishCvsRecord.WISH_CVS_RECORD
                            , tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord.class
                            , WishCvsRecord.WISH_CVS_RECORD.ACCESS_TOKEN.eq(value));

                    //新的token
                    if (wishCvsRecords.size() == 0) {
                        tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord wishCvsRecord = new tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord();
                        wishCvsRecord.setAccessToken(value);
                        wishCvsRecord.setJobId(IdWorkerUtils.getInstance().createUUID());
                        wishCvsRecord.setType("-1");

                        jooqStorage.create(WishCvsRecord.WISH_CVS_RECORD
                                , tanggod.github.io.webdriver.repository.tables.pojos.WishCvsRecord.class
                                , wishCvsRecord);
                    }


                } catch (Exception e) {

                }

            });*/

            MyTimerTask.task(() -> {

                try {
                    chromeDriver.get("https://www.wish.com/search/men jacket?&source=search");

                    JavascriptExecutor webDriverJS = (JavascriptExecutor) chromeDriver;
                    String cookie = String.valueOf(webDriverJS.executeScript("return document.cookie"));


                    List<WishWebCookieDto> wishWebCookieDtoList = jooqStorage.listByCondition(WishWebCookie.WISH_WEB_COOKIE
                            , WishWebCookieDto.class
                            , WishWebCookie.WISH_WEB_COOKIE.COOKIES.eq(cookie));

                    //校验
                    if (wishWebCookieDtoList.size() == 0) {

                        WishWebCookieDto wishWebCookie = new WishWebCookieDto();
                        wishWebCookie.setId(IdWorkerUtils.getInstance().createUUID());
                        wishWebCookie.setCreatedate(new Date());
                        wishWebCookie.setCookies(cookie);

                        jooqStorage.create(WishWebCookie.WISH_WEB_COOKIE
                                , WishWebCookieDto.class
                                , wishWebCookie);

                    }


                } catch (Exception e) {

                }

            });

            //chromeDriver.findElement(By.className("WishButtons__WishButton-bmVgsL")).click();


            //searchOne(chromeDriver,"https://www.wish.com/product/5bda9a6d2e1f0167d1631ed3");

        } finally {
            //chromeDriver.quit();

        }
    }

    @Bean
    public org.springframework.amqp.core.Queue queue() {
        return new Queue("wish_task");
    }

    @RabbitListener(queues = "wish_task")
    public void task(Map<Object, Object> param) {
        String url = String.valueOf(param.get("url"));
        searchOne(chromeDriver, url);
    }


    public void finallyTask(Runnable task) {
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


    public void searchOne(WebDriver chromeDriver, String shopUrl) {

        chromeDriver.get(shopUrl);
        StringBuilder result = new StringBuilder();

        //todo 要加校验， 数量小于2说明是自定义尺码，只选取第一个
        //获取尺码选择div、颜色选择div
        List<WebElement> jDcWYF = chromeDriver.findElements(By.className("jDcWYF"));
        if (jDcWYF.size() >= 2) {//不是自定义尺码
            WebElement size = jDcWYF.get(0);
            WebElement color = jDcWYF.get(1);


            List<WebElement> colorElements = color.findElements(By.className("ffiDeU"));
            List<WebElement> sizeElements = size.findElements(By.className("ffiDeU"));

            int j2 = 0;
            for (int j = 0; j < colorElements.size(); j++) {
                //finallyTask(()->{});
                //点击颜色选择按钮
                finallyTask(() -> {
                    color.findElements(By.className("kpOjIT")).get(0).click();
                });


                //选择第j个颜色
                WebElement colorElement = colorElements.get(j);
                finallyTask(() -> {
                    colorElement.click();
                });


                if (j == 1)
                    j2++;

                String colorText;
                colorText = color.findElements(By.className("DimensionSection__DimensionText-gwlgex")).get(j2).getText();


                j2++;

                for (int i = 0; i < sizeElements.size(); i++) {
                    WebElement sizeElement = sizeElements.get(i);

                    //点击尺码选择按钮
                    finallyTask(() -> {
                        size.findElements(By.className("kpOjIT")).get(0).click();
                    });
                    //选择第二个sku
                    finallyTask(() -> {
                        sizeElement.click();
                    });

                    String text = size.findElements(By.className("DimensionSection__DimensionText-gwlgex")).get(i).getText();

                    //获取运费&价格
                    String price = chromeDriver.findElements(By.className("cRbBob")).get(0).getText().replace("$", "").replace("USD", "");
                    String freight = chromeDriver.findElements(By.className("kqCIhZ")).get(0).getText().replace("$", "").replace("USD", "");

                    //总价格
                    Double countPrice = Double.valueOf(price) + Double.valueOf(freight);
                    result.append("<p style='color:red;'>" + colorText + "-" + text + ":" + countPrice + "</p>");
                }
            }


            String imageSrc = chromeDriver.findElement(By.className("ProductImageContainer__MainImageWrapper-fFuFzC")).getAttribute("src");

            StringBuffer sb = new StringBuffer();
            sb.append("<p><a href='")
                    .append(shopUrl)
                    .append("'>商品链接</a></p>")
                    .append(result.toString())
                    .append("<img src='")
                    .append(imageSrc)
                    .append("' />");

            sendMessage(sb.toString(), "[sku采集]");
            //sleep
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println();
        } else {
            chromeDriver.findElements(By.className("jDcWYF")).get(0).findElements(By.className("kpOjIT")).get(0);
        }

        System.out.println();

    }


    @Bean
    public Queue wishListQueue() {
        return new Queue("wishList");
    }


    public void sendMessage(String message, String title) {
        amqpServer.send("wishList", EmailParameterType.TARGET_EMAIL, "wish_x@126.com", EmailParameterType.CONTENT, message, "title", title);

    }


    public Set<String> productList = new HashSet<>();
    public Map<String, ProductinfoDto> productinfoDtoCache = new HashMap<>();

    public void startTask() {
        System.out.println("项目初始化开始");

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //todo close

        ThreadCache.task();
        //初始化  productList
        List<String> idList = jooqStorage.dslSelect(dsl -> dsl.select(CategoryData.CATEGORY_DATA.PRODUCTID)
                        .from(CategoryData.CATEGORY_DATA)
                //.where(CategoryData.CATEGORY_DATA.STATE.eq(0))
                //.orderBy(CategoryData.CATEGORY_DATA.CREATEDATE)
                , String.class);

        //初始化 productinfoDtoCache
        List<ProductinfoDto> productinfoDtoList = jooqStorage.listByCondition(Productinfo.PRODUCTINFO, ProductinfoDto.class);

        //组装缓存
        for (int i = 0; i < idList.size(); i++) {
            String productId = idList.get(i);
            //找到当前id相关的信息
            List<ProductinfoDto> collectList = productinfoDtoList.stream().filter(productinfoDto -> {
                if (productinfoDto.getProductid().equals(productId))
                    return true;
                else
                    return false;
            }).collect(Collectors.toList());

            if (0 == collectList.size())
                continue;

            //获取最新的一条，按时间排序

            //大的排前面
            collectList.sort((a1, a2) -> {
                try {
                    return df.parse(df.format(a2.getCreatedate())).compareTo(df.parse(df.format(a1.getCreatedate())));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 1;
            });

            productinfoDtoCache.put(productId, collectList.stream().findFirst().get());

        }

        productList.addAll(idList);


        while (true) {
            System.out.println("数据初始化完毕");
            Long sleepTime = 60_000 * 10L;
            sendMessage("search:men 3d hoodie & women 3d hoodie", "采集开始");

            searchCategaryData(chromeDriver, "men 3d hoodie");

            System.out.println("men 3d hoodie success");

            searchCategaryData(chromeDriver, "women 3d hoodie");
            System.out.println("women 3d hoodie success");

            sendMessage("search:men 3d hoodie & women 3d hoodie", "采集结束,等待" + sleepTime / 60_000 + "/s 开始下次采集任务");


            try {
                //每次休眠10分钟
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    public void purchaseNumberTask(String productId, String purchaseNumber) {
        Integer purchaseNumberInt = 0;
        if (StringUtils.isNotBlank(purchaseNumber.trim())) {
            purchaseNumber = purchaseNumber.replace("bought", "").replace("this", "").replace("+", "").trim();
        } else {
            purchaseNumber = "0";
        }
        //转换
        purchaseNumberInt = Integer.valueOf(purchaseNumber);

        ProductinfoDto productinfoDto = productinfoDtoCache.get(productId);
        //已存在
        if (null != productinfoDto) {
            Integer purchasenumberValue = productinfoDto.getPurchasenumber();
            if (!String.valueOf(purchasenumberValue).equals(String.valueOf(purchaseNumberInt))) {
                createProductInfoQueue(productId, purchaseNumberInt);
            }
        } else {//不存在则直接创建一条关联数据
            createProductInfoQueue(productId, purchaseNumberInt);
        }

    }

    public void createProductInfoQueue(String productId, Integer purchaseNumberInt) {
        ProductinfoDto productinfoDto = new ProductinfoDto();
        productinfoDto.setId(IdWorkerUtils.getInstance().createUUID());
        productinfoDto.setCreatedate(new Date());
        productinfoDto.setProductid(productId);
        productinfoDto.setPurchasenumber(purchaseNumberInt);

        try {
            ProductTask.productInfoQueue.put(productinfoDto);

            ProductinfoDto productinfoDtoValue = productinfoDtoCache.get(productId);
            //空说明不需要更新，直接加入缓存
            if (null == productinfoDtoValue) {
                productinfoDtoCache.put(productId, productinfoDto);
            } else {
                //更新缓存
                productinfoDtoCache.remove(productId);
                productinfoDtoCache.put(productId, productinfoDto);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void searchCategaryData(WebDriver chromeDriver, String search) {
        int repeateCount = 0;
        int scrollTopCount = 0;
        Set<String> productRecordList = new HashSet<>();

        if (search.equals("men 3d hoodie"))
            chromeDriver.get("https://www.wish.com/search/men%203d%20hoodie?&source=search");
        else if (search.equals("women 3d hoodie"))
            chromeDriver.get("https://www.wish.com/search/women%203d%20hoodie?&source=search");
        //chromeDriver.get("https://wish.com");
        //输入内容
       /* finallyTask(() -> {
            chromeDriver.findElements(By.className("kUxOXr")).get(0).clear();
            chromeDriver.findElements(By.className("kUxOXr")).get(0).sendKeys(search);
        });*/

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //关闭弹窗
        try {
            chromeDriver.findElement(By.className("bIloGL")).click();
        } catch (Exception e) {
        }

        //点击搜索
       /* finallyTask(() -> {
            chromeDriver.findElement(By.className("cGgnZj")).click();
        });*/

        int count = 0;
        int countThreshold = 5;

        int beforeProductLength = 0;
        int beforeProductThreshold = 10;
        int beforeProductCount = -1;
        boolean flag = true;
        while (flag) {
            if (productRecordList.size() >= 2000) {
                System.out.println("本次采集任务结束");
                break;
            }

            if (beforeProductCount == productRecordList.size()) {
                beforeProductLength++;
            } else {
                //纠正不是卡住的情况，必须要卡住10次，才算
                beforeProductLength = 0;
            }
            if (beforeProductLength >= beforeProductThreshold)
                break;
            beforeProductCount = productRecordList.size();

            System.out.println("采集总数量：" + productRecordList.size() + " for : " + RegularUtil.getMethods.dateFormat(RegularUtil.FORMAT_DATE_3, new Date()));

            try {

                count += countThreshold;
                //滚动加载数据
                scrollTopCount = this.scrollTop(chromeDriver, scrollTopCount, countThreshold, 500);

                List<WebElement> dataElementList = chromeDriver.findElements(By.className("XDuBT"));

                System.out.println("开始数据解析");
                for (int i = 0; i < dataElementList.size(); i++) {
                    try {
                        //问卷调查
                        chromeDriver.findElements(By.className("bNMPGv")).get(0).click();
                        //空白地区
                        chromeDriver.findElements(By.className("cbBzOK")).get(0).click();
                    } catch (Exception e) {
                    }
                    WebElement webElement = dataElementList.get(i);
                    String productId = webElement.getAttribute("id");

                    if (productRecordList.contains(productId)) {
                        ++repeateCount;
                        continue;
                        //System.out.println("重复：" + repeateCount);
                    }

                    StringBuilder purchaseNumber = new StringBuilder();
                    //购买人数
                    finallyTask(() -> {
                        String gWkNHL = webElement.findElements(By.className("gWkNHL")).get(0).getText();
                        purchaseNumber.append(gWkNHL);
                    });

                    purchaseNumberTask(productId, purchaseNumber.toString());


                    //记录当前是第几条新数据
                    productRecordList.add(productId);

                    boolean containId = productList.contains(productId);

                    //包含id则无视
                    //不包含id。则添加进缓存，且录入数据库
                    if (!containId) {
                        //图片地址
                        StringBuilder imageUrl = new StringBuilder();

                        finallyTask(() -> {
                            imageUrl.append(webElement.findElements(By.tagName("div")).get(0).getCssValue("background-image"));
                        });

                        CategoryDataDto categoryDataDto = new CategoryDataDto();
                        categoryDataDto.setCreatedate(new Date());
                        categoryDataDto.setId(IdWorkerUtils.getInstance().createUUID());
                        categoryDataDto.setProductid(productId);
                        categoryDataDto.setImageurl(imageUrl.toString());
                        categoryDataDto.setState(0);
                        categoryDataDto.setSearch(search);

                        productList.add(productId);

                        try {
                            ProductTask.productQueue.put(categoryDataDto);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        ProductTask.flowQueue.put(productId);
                    }

                }

                //((JavascriptExecutor)chromeDriver).executeScript("return $('.FeedItemV2__Wrapper-DMVKs').eq(0).attr('href').replace('/product/','')");
                //((JavascriptExecutor)chromeDriver).executeScript("var result = [];  var item= $('.FeedItemV2__Wrapper-DMVKs').eq(0).attr('href').replace('/product/',''); result.push({index:0,value:item}); return result;");
                //Object result = ((JavascriptExecutor) chromeDriver).executeScript("var result = [];  var item= $('.FeedItemV2__Wrapper-DMVKs').eq(0).attr('href').replace('/product/',''); result.push({index:0,value:item}); return result;");

                //Map resultMap = JSONObject.parseObject(String.valueOf(result), HashMap.class);


                System.out.println("数据解析完毕");
            } catch (Exception e) {

            }
        }


    }

    public int scrollTop(WebDriver webDriver, int startCount, int count, int sleepTime) {
        System.out.println("滚动开始");
        JavascriptExecutor webDriverJS = (JavascriptExecutor) webDriver;
        int size = startCount;
        String builder = new String("document.documentElement.scrollTop=" + size);

        for (int i = 0; i < count; ++i) {
            webDriverJS.executeScript(builder, new Object[0]);
            int beforeSize = size;
            size += 200;
            builder = builder.replace(String.valueOf(beforeSize), String.valueOf(size));

            try {
                Thread.sleep((long) sleepTime);
            } catch (InterruptedException var10) {
                var10.printStackTrace();
            }
        }
        System.out.println("滚动结束");
        return size;

    }

    public void cookieLogin(String filePath) {
        WebDriver chromeDriver = phantomJsUtil.getChromeDriver(false);
        //loginDomecrossExtension(chromeDriver);

        chromeDriver.get("https://wish.com");

/*
        WebDriverWait wait_0 = new WebDriverWait(chromeDriver, 30L);
        wait_0.until(ExpectedConditions.presenceOfElementLocated(By.className("jMWxuG")));

        //点击谷歌登陆
        chromeDriver.findElements(By.className("jMWxuG")).get(0).click();

        //login
        List<String> loginTabList = chromeDriver.getWindowHandles().stream().collect(Collectors.toList());

        chromeDriver.switchTo().window(loginTabList.get(1));

        //等待谷歌登陆加载完毕 identifierId
        WebDriverWait wait_1 = new WebDriverWait(chromeDriver, 30L);
        wait_1.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));

        //输入用户名
        chromeDriver.findElements(By.id("identifierId")).get(0).sendKeys("txd.cool@gmail.com");

        //下一步
        chromeDriver.findElements(By.className("snByac")).get(2).click();

        //等待谷歌登陆加载完毕 identifierId
        WebDriverWait wait_2 = new WebDriverWait(chromeDriver, 30L);
        wait_2.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));

        //输入密码
        chromeDriver.findElements(By.id("password")).get(0).findElements(By.tagName("input")).get(0).sendKeys("Tangtianding520");

        //下一步
        chromeDriver.findElements(By.className("snByac")).get(2).click();

        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        Set<Cookie> cookies = chromeDriver.manage().getCookies();
        String s = JSON.toJSONString(cookies);
        System.out.println(s);
        //保存cookie
        //batchSerializableWrite(filePath1, cookies);
        System.out.println();
        chromeDriver.quit();
    }


    public void loginDomecrossExtension(WebDriver driver) {
        while (true) {
            try {
                if (null == driver || null == driver.getWindowHandles() || driver.getWindowHandles().size() <= 1) {
                    continue;
                }

                ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
                int switchToCount = 1;
                if (!"chrome-extension://ldbcplcolkhgemejdgibfmhemnkecgni/login.html".equalsIgnoreCase(driver.getCurrentUrl())) {
                    driver.switchTo().window((String) tabs.get(switchToCount));
                    switchToCount = 0;
                }


                WebDriverWait wait_1 = new WebDriverWait(driver, 20L);
                wait_1.until(ExpectedConditions.presenceOfElementLocated(By.id("login_tab")));


                driver.findElement(By.id("login_tab")).click();
                WebDriverWait wait_2 = new WebDriverWait(driver, 20L);
                wait_2.until(ExpectedConditions.presenceOfElementLocated(By.id("log_email")));

                Thread.sleep(500l);

                driver.findElement(By.id("log_email")).sendKeys(new CharSequence[]{"1084986263@qq.com"});
                driver.findElement(By.id("log_password")).sendKeys(new CharSequence[]{"a1084986263"});
                driver.findElement(By.id("logsub")).click();
                WebDriverWait wait_3 = new WebDriverWait(driver, 20L);
                wait_3.until(ExpectedConditions.presenceOfElementLocated(By.id("domainAdd")));
                driver.findElement(By.id("domainAdd")).sendKeys(new CharSequence[]{"https://www.wish.com/"});
                driver.findElement(By.className("btn-success")).click();
                driver.close();
                driver.switchTo().window((String) tabs.get(switchToCount));
            } catch (Exception var7) {
                this.loginDomecrossExtension(driver);
                System.out.println("填写穹顶穿越错误..!");
            }

            return;
        }
    }


    public void login(int var) throws Exception {
        if (0 == var) {
            cookieLogin(filePath1);
        }
        if (1 == var) {
            login(filePath1);
        }

        //startTask();

    }


    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(WebdriverApplication.class, args);

        WishApplication bean = configurableApplicationContext.getBean(WishApplication.class);
        bean.login(0);
    }
}
