package tanggod.github.io.webdriver.wish;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/29.
 */
@Service
public class 店小秘拣货列表 extends JooqBaseService {

    private static final List<String> cookieList = new ArrayList<>();

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static WebDriver chromeDriver;

    private void initCookieList() {
        cookieList.add("[{\"domain\":\".dianxiaomi.com\",\"expiry\":1712574231000,\"httpOnly\":false,\"name\":\"Hm_lvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1681038218\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_s\",\"path\":\"/\",\"secure\":false,\"value\":\"osAMu-9TSLl9vCSiswJTcZSupCFdxsMW37gI67HML_o\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_c\",\"path\":\"/\",\"secure\":false,\"value\":\"OWpFY241NlIhWXowNWFrVmpialUyVWchYmYxNDg2MGE4ZjBjOTQ5ZGE1MjNkYWQ5ZjhjYWJlYWE\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_t\",\"path\":\"/\",\"secure\":false,\"value\":\"MTY4MTAzODIyNiFkRDB4TmpneE1ETTRNakkyIWVmNzhkYThiMmQzYjZjMWVmYzVmYWY1MGVkNDljMTcw\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_w\",\"path\":\"/\",\"secure\":false,\"value\":\"ODMxMWUwMjAwMDA0YmJhYmJjOWRjZDlkN2ZkZWNmNjghZHowNE16RXhaVEF5TURBd01EUmlZbUZpWW1NNVpHTmtPV1EzWm1SbFkyWTJPQSFhNjYwOWFlZTA5ZGM5NzljNDNiMDdiNmI2YWJkZDk3MQ\"},{\"domain\":\"www.dianxiaomi.com\",\"httpOnly\":true,\"name\":\"JSESSIONID\",\"path\":\"/\",\"secure\":false,\"value\":\"8F063995C7C62EE62F83342A364590DB\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_i\",\"path\":\"/\",\"secure\":false,\"value\":\"MzM4MzIyIWFUMHpNemd6TWpJITUwNGUyZjczNzM0ZTk4MWJmOGJhZGVlZmFjODEwMGEz\"},{\"domain\":\".dianxiaomi.com\",\"httpOnly\":false,\"name\":\"Hm_lpvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1681038232\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1683630226000,\"httpOnly\":false,\"name\":\"_dxm_ad_client_id\",\"path\":\"/\",\"secure\":false,\"value\":\"F8CF3D6496C0519BEF155A8E1F0CD1AB5\"}]\n");
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

    //如果一个订单多件，则添加多个dto
    class SkuDto {
        private String color;
        private String size;
        private String skuName;
        private String platformSkuImage;
        private String systemSkuImage;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSkuName() {
            return skuName;
        }

        public void setSkuName(String skuName) {
            this.skuName = skuName;
        }

        public String getPlatformSkuImage() {
            return platformSkuImage;
        }

        public void setPlatformSkuImage(String platformSkuImage) {
            this.platformSkuImage = platformSkuImage;
        }

        public String getSystemSkuImage() {
            return systemSkuImage;
        }

        public void setSystemSkuImage(String systemSkuImage) {
            this.systemSkuImage = systemSkuImage;
        }
    }

    private List<SkuDto> skuDtoListCache = new ArrayList<>();

    //https://www.nuomiphp.com/eplan/585486.html
    public void login() {
        initCookieList();

        System.setProperty("webdriver.chrome.driver", "/Users/tanggod/Desktop/util/webdriver/chromedriver");
        chromeDriver=new ChromeDriver();
        //chromeDriver = phantomJsUtil.getChromeDriver(false);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.dianxiaomi.com/order/index.htm");

        String s1 = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s1);
        cookieLogin();


        String s = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s);

        chromeDriver.get("https://www.dianxiaomi.com/order/index.htm");


        关闭提示按钮();
        关闭提示按钮();
        关闭提示按钮();
        关闭提示按钮();
        关闭提示按钮();
        // 关闭提示按钮();
        //点击 ： 有货
        //chromeDriver.findElement(By.id("m10301")).click();
        chromeDriver.findElement(By.id("m10301")).click();
        //选择：wish平台
        输入休眠(1000);
        JavascriptExecutor webDriverJS = (JavascriptExecutor) chromeDriver;
        webDriverJS.executeScript("selPlatform('wish',this);", new Object[0]);
        输入休眠(3000);

        int orderListSize = chromeDriver.findElement(By.className("xianshishujudate")).findElements(By.cssSelector("tr[data-platform='wish']")).size();
        for (int i = 0; i < orderListSize; i++) {
            //获取订单列表
            输入休眠(1000);
            List<WebElement> orderList = chromeDriver.findElement(By.className("xianshishujudate")).findElements(By.cssSelector("tr[data-platform='wish']"));
            WebElement webElement = orderList.get(i);

            /*finallyTask(() -> {
                webElement.findElement(By.partialLinkText("详情")).click();
            });*/
            try {
                webElement.findElement(By.partialLinkText("详情")).click();
            } catch (Exception e) {
                continue;
            }


            //获取颜色列表
            输入休眠(1000);

            //迭代
            List<WebElement> colorElementList = chromeDriver.findElements(By.cssSelector(".tableIn.pairProInfo"));

            for (int z = 0; z < colorElementList.size(); z++) {
                SkuDto skuDto = new SkuDto();
                WebElement colorElement = colorElementList.get(z);

                String color = colorElement.findElements(By.cssSelector(".m0.pairProInfoName")).get(0).getText().replace("Color：", "");
                String size = colorElement.findElements(By.cssSelector(".m0.pairProInfoName")).get(1).getText().replace("Size：", "");
                System.out.println(color);
                System.out.println(size);
                skuDto.setColor(color);
                skuDto.setSize(size);

                //获取系统sku与数量
                int systemIndex = z * 3;
                String[] skuAndCount = chromeDriver.findElements(By.cssSelector(".tableIn .normalDiv p.m0")).get(systemIndex).getText().split(" x ");
                String systemSku = skuAndCount[0];
                String count = skuAndCount[1];
                System.out.println(systemSku);
                System.out.println(count);

                skuDto.setSkuName(systemSku);


                //获取图片
                List<WebElement> elements = chromeDriver.findElements(By.cssSelector(".orderInfoCon.pairProInfoBox .tableIn .listImgOut .listImgIn .imgCss"));
                /*elements.stream().forEach(element -> {
                    String src = element.getAttribute("src").replace("-tiny", "-");
                    System.out.println(src);
                });*/
                skuDto.setPlatformSkuImage(elements.get(z * 2).getAttribute("src").replace("-tiny", "-"));
                skuDto.setSystemSkuImage(elements.get(z * 2 + 1).getAttribute("src").replace("-tiny", "-"));

                //复制count个
                for (int c = 0; c < Integer.valueOf(count); c++) {
                    skuDtoListCache.add(skuDto);
                }

                System.out.println();
            }

            finallyTask(()->{
                chromeDriver.findElement(By.id("packageDetailClose2")).click();
            });
        }

        //计算json
        计算尺码();
        System.out.println();
        chromeDriver.quit();
    }

    private void 计算尺码() {
        Map<String, Map<String, Integer>> response = new HashMap<>();
        for (int i = 0; i < skuDtoListCache.size(); i++) {
            SkuDto skuDto = skuDtoListCache.get(i);
            String color = skuDto.getColor();
            String size = skuDto.getSize();
            if (!response.containsKey(size)) {
                Map<String, Integer> cache2 = new HashMap<>();
                response.put(size, cache2);
            }
            Map<String, Integer> cacheMap2 = response.get(size);
            if (!cacheMap2.containsKey(color)) {
                cacheMap2.put(color, 1);
            } else {
                cacheMap2.put(color, cacheMap2.get(color) + 1);
            }
        }

        //排序
        //https://www.liaoxuefeng.com/wiki/1252599548343744/1265117109276544
        ArrayList<Map<String, Map<String, Integer>>> responseList = new ArrayList<>(10);
        Object[] objects = new Object[10];

        response.keySet().stream().forEach(key -> {
            if (key.equalsIgnoreCase("XS")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("XS", response.get(key));
                //responseList.add(0, sortResponse);
                objects[0] = sortResponse;
            } else if (key.equalsIgnoreCase("S")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("S", response.get(key));
                //responseList.add(1, sortResponse);
                objects[1] = sortResponse;
            } else if (key.equalsIgnoreCase("M")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("M", response.get(key));
                //responseList.add(2, sortResponse);
                objects[2] = sortResponse;
            } else if (key.equalsIgnoreCase("L")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("L", response.get(key));
                //responseList.add(3, sortResponse);
                objects[3] = sortResponse;
            } else if (key.equalsIgnoreCase("XL")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("XL", response.get(key));
                //responseList.add(4, sortResponse);
                objects[4] = sortResponse;
            } else if (key.equalsIgnoreCase("XXL")
                    || key.equalsIgnoreCase("2XL")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("2XL", response.get(key));
                //responseList.add(5, sortResponse);
                objects[5] = sortResponse;
            } else if (key.equalsIgnoreCase("XXXL")
                    || key.equalsIgnoreCase("3XL")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("3XL", response.get(key));
                //responseList.add(6, sortResponse);
                objects[6] = sortResponse;
            } else if (key.equalsIgnoreCase("XXXXL")
                    || key.equalsIgnoreCase("4XL")) {
                Map<String, Map<String, Integer>> sortResponse = new HashMap<>();
                sortResponse.put("4XL", response.get(key));
                //responseList.add(7, sortResponse);
                objects[7] = sortResponse;
            }
        });
        System.out.println(JSON.toJSONString(objects));

        Map<String, JSONObject> skuMap = new HashMap<>();
        for (int i = 0; i < skuDtoListCache.size(); i++) {
            SkuDto skuDto = skuDtoListCache.get(i);
            if (!skuMap.containsKey(skuDto.getSkuName())) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("数量", 1);
                jsonObject.put("图片", skuDto.getSystemSkuImage());
                skuMap.put(skuDto.getSkuName(), jsonObject);
            } else {
                JSONObject jsonObject = skuMap.get(skuDto.getSkuName());
                jsonObject.put("数量", jsonObject.getInteger("数量") + 1);
                skuMap.put(skuDto.getSkuName(), jsonObject);
            }
        }
        System.out.println(JSON.toJSONString(skuMap));

        try {
            Excel处理器.生成excel(JSON.parseObject(JSON.toJSONString(skuMap)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //https://qa.1r1g.com/sf/ask/1158613921/
    public void 关闭提示按钮() {
        try {
            输入休眠(1000);

        /*JavascriptExecutor webDriverJS = (JavascriptExecutor)chromeDriver;
        webDriverJS.executeScript("loadNotice(false)", new Object[0]);*/
            chromeDriver.findElement(By.id("theNewestModalLabelContent")).findElement(By.xpath("..")).findElement(By.className("modal-footer")).findElement(By.cssSelector("button")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
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


    public static void main(String[] args) throws Exception {
        //new Wish后台产品修改.Swing().main();
        new 店小秘拣货列表().login();
    }
}
