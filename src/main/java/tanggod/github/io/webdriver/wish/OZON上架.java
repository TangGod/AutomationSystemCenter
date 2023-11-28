package tanggod.github.io.webdriver.wish;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.commons.lang3.StringUtils;
import org.jooq.FieldOrRow;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/29.
 */
@Service
public class OZON上架 extends JooqBaseService {

    private static final List<String> cookieList = new ArrayList<>();

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static WebDriver chromeDriver;

    //key : 1688货源链接
    //value ： 爬取的当前链接
    private static final Map<String, List<_1688_sku>> _1688_SKU_INFO_CACHE = new HashMap<>();

    private static final String hrefKey = "HangZhouDingHong-V1.0";

    private void initCookieList() {
        //TangTianDing - 主账号
        //cookieList.add("[{\"domain\":\".dianxiaomi.com\",\"expiry\":1712574231000,\"httpOnly\":false,\"name\":\"Hm_lvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1681038218\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_s\",\"path\":\"/\",\"secure\":false,\"value\":\"osAMu-9TSLl9vCSiswJTcZSupCFdxsMW37gI67HML_o\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_c\",\"path\":\"/\",\"secure\":false,\"value\":\"OWpFY241NlIhWXowNWFrVmpialUyVWchYmYxNDg2MGE4ZjBjOTQ5ZGE1MjNkYWQ5ZjhjYWJlYWE\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_t\",\"path\":\"/\",\"secure\":false,\"value\":\"MTY4MTAzODIyNiFkRDB4TmpneE1ETTRNakkyIWVmNzhkYThiMmQzYjZjMWVmYzVmYWY1MGVkNDljMTcw\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_w\",\"path\":\"/\",\"secure\":false,\"value\":\"ODMxMWUwMjAwMDA0YmJhYmJjOWRjZDlkN2ZkZWNmNjghZHowNE16RXhaVEF5TURBd01EUmlZbUZpWW1NNVpHTmtPV1EzWm1SbFkyWTJPQSFhNjYwOWFlZTA5ZGM5NzljNDNiMDdiNmI2YWJkZDk3MQ\"},{\"domain\":\"www.dianxiaomi.com\",\"httpOnly\":true,\"name\":\"JSESSIONID\",\"path\":\"/\",\"secure\":false,\"value\":\"8F063995C7C62EE62F83342A364590DB\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1712142226000,\"httpOnly\":true,\"name\":\"dxm_i\",\"path\":\"/\",\"secure\":false,\"value\":\"MzM4MzIyIWFUMHpNemd6TWpJITUwNGUyZjczNzM0ZTk4MWJmOGJhZGVlZmFjODEwMGEz\"},{\"domain\":\".dianxiaomi.com\",\"httpOnly\":false,\"name\":\"Hm_lpvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1681038232\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1683630226000,\"httpOnly\":false,\"name\":\"_dxm_ad_client_id\",\"path\":\"/\",\"secure\":false,\"value\":\"F8CF3D6496C0519BEF155A8E1F0CD1AB5\"}]\n");
        //TangTianDing - ZhangQi - 子账号
        //cookieList.add("[{\"domain\":\".dianxiaomi.com\",\"expiry\":1718623575000,\"httpOnly\":false,\"name\":\"Hm_lvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1687087561\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1718191574000,\"httpOnly\":true,\"name\":\"dxm_s\",\"path\":\"/\",\"secure\":false,\"value\":\"GtYFE6oz29jx5qgMlTcxw9NZnHIkYuIRH0rJy8qEubs\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1718191574000,\"httpOnly\":true,\"name\":\"dxm_c\",\"path\":\"/\",\"secure\":false,\"value\":\"Q0FURFBld20hWXoxRFFWUkVVR1YzYlEhMjk0ZDE4YTNiNDI5NWFiNTNkN2UyNTdiNWEyYzc3MGI\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1718191574000,\"httpOnly\":true,\"name\":\"dxm_t\",\"path\":\"/\",\"secure\":false,\"value\":\"MTY4NzA4NzU3NCFkRDB4TmpnM01EZzNOVGMwITM0MTljNzhlOWE4OTM1MGE1MGFlOGI5MzI3MDMxZDg2\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1718191574000,\"httpOnly\":true,\"name\":\"dxm_w\",\"path\":\"/\",\"secure\":false,\"value\":\"M2YxYjFkYWE0MDhiZWVhMTUwMGZiMGYyNDJkNTM1Y2QhZHowelpqRmlNV1JoWVRRd09HSmxaV0V4TlRBd1ptSXdaakkwTW1RMU16VmpaQSFjYWNiYjY0OTVlNzVlM2UyMThkZDU0MDJjMmMzZmI0Zg\"},{\"domain\":\"www.dianxiaomi.com\",\"httpOnly\":true,\"name\":\"JSESSIONID\",\"path\":\"/\",\"secure\":false,\"value\":\"901064A2795F02C5B7684AD20810EE4A\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1718191574000,\"httpOnly\":true,\"name\":\"dxm_i\",\"path\":\"/\",\"secure\":false,\"value\":\"MTM0MTIyNyFhVDB4TXpReE1qSTMhZDYyOTQ1ZDVmMGZhNjZmYmY3OTQ4MGNlMmRkOTU3NzY\"},{\"domain\":\".dianxiaomi.com\",\"httpOnly\":false,\"name\":\"Hm_lpvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1687087575\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1689679574000,\"httpOnly\":false,\"name\":\"_dxm_ad_client_id\",\"path\":\"/\",\"secure\":false,\"value\":\"036D513B1F1424A8808A1421D5C2A2897\"}]");
        //TangTianDing - 张琼 - 子账号
        //cookieList.add("[{\"domain\":\".dianxiaomi.com\",\"expiry\":1720361413000,\"httpOnly\":false,\"name\":\"Hm_lvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1688825391\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1719929412000,\"httpOnly\":true,\"name\":\"dxm_s\",\"path\":\"/\",\"secure\":false,\"value\":\"0atCVx1qK73Vuq1YWoWpZC4DRJw8dM0zAfLxDJBJoDw\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1719929412000,\"httpOnly\":true,\"name\":\"dxm_c\",\"path\":\"/\",\"secure\":false,\"value\":\"c1o3Q0ZMc00hWXoxeldqZERSa3h6VFEhN2RmNDc5YzJiMTdkY2UzMGYzMDE1MWUwZjYyNDRjMmQ\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1719929412000,\"httpOnly\":true,\"name\":\"dxm_t\",\"path\":\"/\",\"secure\":false,\"value\":\"MTY4ODgyNTQxMyFkRDB4TmpnNE9ESTFOREV6IWNkOTliNWRkNDE5YWZmNGE2MmY0OWY3NTYzMjdlYTNi\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1719929412000,\"httpOnly\":true,\"name\":\"dxm_w\",\"path\":\"/\",\"secure\":false,\"value\":\"MGEwZjJlNjYzZmMyNDdlZGVlNGU0OTk3YWFmMDk2MjEhZHowd1lUQm1NbVUyTmpObVl6STBOMlZrWldVMFpUUTVPVGRoWVdZd09UWXlNUSFiZmMzNWJmYmJlMzQ1YWZhZGFhY2Y4MGE5MGRhMWQ4MQ\"},{\"domain\":\"www.dianxiaomi.com\",\"httpOnly\":true,\"name\":\"JSESSIONID\",\"path\":\"/\",\"secure\":false,\"value\":\"4C3A3BA8353D30FF3EA6C5781DE265F2\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1719929412000,\"httpOnly\":true,\"name\":\"dxm_i\",\"path\":\"/\",\"secure\":false,\"value\":\"MTM1NDQ2NyFhVDB4TXpVME5EWTMhMzkwYWQ0MTE3YTBkN2Q4NmNmZGI0NzYxOWMwMjY3MGM\"},{\"domain\":\".dianxiaomi.com\",\"httpOnly\":false,\"name\":\"Hm_lpvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1688825414\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1691417413000,\"httpOnly\":false,\"name\":\"_dxm_ad_client_id\",\"path\":\"/\",\"secure\":false,\"value\":\"F83CBCAD01FA4BB81449D050AFE28A57C\"}]");
        //唐天鼎 - 直播用 - ozon - 1 : tangtianding-ozon-1
        cookieList.add("[{\"domain\":\".dianxiaomi.com\",\"expiry\":1729519378000,\"httpOnly\":false,\"name\":\"Hm_lvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1697983365\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1729087377000,\"httpOnly\":true,\"name\":\"dxm_s\",\"path\":\"/\",\"secure\":false,\"value\":\"Bl9JzwNCIrQB3GJwY4bEeyUstPsxxX85LMC7L5XNBKM\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1729087377000,\"httpOnly\":true,\"name\":\"dxm_c\",\"path\":\"/\",\"secure\":false,\"value\":\"ZFBFWTg1ZXohWXoxa1VFVlpPRFZsZWchYzQ4NzRkODU2MmMzZmM0N2MxYWJiZGIwZWI2ZTQyZmQ\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1729087377000,\"httpOnly\":true,\"name\":\"dxm_t\",\"path\":\"/\",\"secure\":false,\"value\":\"MTY5Nzk4MzM3NyFkRDB4TmprM09UZ3pNemMzITZmYjkwOTEzMDBjNWY3ZTI2OTEzMDI3NzFlNGFiOGEz\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1729087377000,\"httpOnly\":true,\"name\":\"dxm_w\",\"path\":\"/\",\"secure\":false,\"value\":\"NTcxNWFmNDhhM2NjMGQ1NDMzYjljYTVjZTNhMjhhM2UhZHowMU56RTFZV1kwT0dFelkyTXdaRFUwTXpOaU9XTmhOV05sTTJFeU9HRXpaUSFlMTkzYmRlN2M4NTU2MDYyZTBlYTc1MTFmMmE4OWZhOQ\"},{\"domain\":\"www.dianxiaomi.com\",\"httpOnly\":true,\"name\":\"JSESSIONID\",\"path\":\"/\",\"secure\":false,\"value\":\"B95254CD97B62B88FA06841E9E937422\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1729087377000,\"httpOnly\":true,\"name\":\"dxm_i\",\"path\":\"/\",\"secure\":false,\"value\":\"MTQyNzkyMSFhVDB4TkRJM09USXghYjk5MWM2ZmU3ZWQxOTkxMTUyOTY4YjlmYTg5ZGY1Y2I\"},{\"domain\":\".dianxiaomi.com\",\"httpOnly\":false,\"name\":\"Hm_lpvt_f8001a3f3d9bf5923f780580eb550c0b\",\"path\":\"/\",\"secure\":false,\"value\":\"1697983378\"},{\"domain\":\"www.dianxiaomi.com\",\"expiry\":1700575377000,\"httpOnly\":false,\"name\":\"_dxm_ad_client_id\",\"path\":\"/\",\"secure\":false,\"value\":\"B8045550EE7599DF9C65CEBC9CC2F77E1\"}]\n");
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
    public void login() {
        //test
        //https://blog.csdn.net/u011360767/article/details/126783692
        //https://zhuanlan.zhihu.com/p/454358010


        initCookieList();

        chromeDriver = phantomJsUtil.getChromeDriver(false);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.dianxiaomi.com/ozonProduct/draft.htm?dxmState=draft");

        String s1 = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s1);
        cookieLogin();


        String s = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s);

        chromeDriver.get("https://www.dianxiaomi.com/ozonProduct/draft.htm?dxmState=draft");


        关闭提示按钮();
        关闭提示按钮();
        关闭提示按钮();

        新建标签页("https://translate.google.com/?hl=zh-CN&sl=auto&tl=ru&op=translate");
        Object[] objects = chromeDriver.getWindowHandles().toArray();
        chromeDriver.switchTo().window(objects[0].toString());

        切换获取翻译("亚马逊2023欧美跨境外贸春夏新品金色花边V领瓦片短袖纯色T恤上衣");

        新建标签页("https://detail.1688.com/offer/680230825139.html?_t=1684758435287&spm=a2615.7691456.co_0_0_tradenumdown_0_0_0_0_0_0_0000_0.0");

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    //System.out.println(chromeDriver.getCurrentUrl());
                    //每隔一秒检测当前页面是不是ozon上架页面
                    if (chromeDriver.getCurrentUrl().contains("https://www.dianxiaomi.com/ozonProduct/add.htm?id=")) {
                        //如果没有 "更新SKU图片" 按钮 则新建
                        if (0 == chromeDriver.findElements(By.id("updateSkuImage")).size()
                                && chromeDriver.getCurrentUrl().contains(hrefKey)) {
                            更改页面title("DingHong_v1.0-编辑");
                            //第一步 获取1688链接
                            finallyTask(() -> {
                                String _1688_value = get1688链接();

                                //保存当前编辑的链接
                                //String currentUrl_dianxiaomi = chromeDriver.getCurrentUrl();
                                //加载1688链接
                                //chromeDriver.get(_1688_value);
                                System.out.println("新建标签页 - start");
                                新建标签页(_1688_value);
                                System.out.println("新建标签页 - end");
                                //采集1688 sku数据
                                //List<_1688_sku> _1688_sku_info = 获取1688sku信息();
                                //PUT cache
                                //_1688_SKU_INFO_CACHE.put(_1688_value, _1688_sku_info);
                                //带着采集数据返回店小秘-编辑 页面
                                //chromeDriver.get(currentUrl_dianxiaomi);
                                System.out.println("切换获取1688信息 - strat");
                                切换获取1688信息(_1688_value);
                                System.out.println("切换获取1688信息 - end");
                            });

                            更改页面title("DingHong_v1.0-编辑");
                            System.out.println("设置编辑页面的按钮 - strat");

                            //设置产品价格 - 输入框
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\">" +
                                    "<input placeholder=\"填写商品售价\" id=\"setProductPrice\" class=\"form-component  sameVariantIpt \" type=\"text\"  datatype=\"proSalePrice\" nullmsg=\"请填写售价\" errormsg=\"请填写售价\" maxlength=\"8\" oninput=\"clearNoNumAndMinus(this);\">" +
                                    "</div>');");

                            //设置商品尺码 按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"setProductSize\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">1.设置商品尺码</button></div>');");
                            //设置商品颜色 按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"setProductColor\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">2.设置商品颜色</button></div>');");
                            //更新SKU图片 按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"updateSkuImage\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">3.更新SKU图片</button></div>');");
                            //更新sku名  按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"updateSkuColor\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">4.确认商品颜色名</button></div>');");
                            //设置基础sku信息  按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"setSkuInfo\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">5.设置SKU基本信息</button></div>');");
                            //谷歌翻译  按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"googleTranslate\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">6.翻译标题</button></div>');");
                            //设置基础sku信息  按钮
                            executeScript("$(\".locationHref.location-href.fixed-box\").append('<div style=\"margin-bottom:10px;\"><button id=\"ALL_METHOD\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">7.一键设置</button></div>');");
                            //设置基础sku信息  按钮
                            executeScript("$(\".button.btn-determine.categoryModalShow\").after('<button style=\"margin-left:15px;\" id=\"setProductInfo\" type=\"button\" class=\"button btn-orange m-left12 toSubmit\" data-value=\"save-3\">设置产品属性</button>');");

                            //新建点击状态按钮
                            createClickInputStateButton();

                            System.out.println("设置编辑页面的按钮 - end");

                            //1. 选择品牌

                            //点击：服装和鞋类品牌(Бренд в одежде и обуви)
                            finallyTask(() -> {
                                chromeDriver.findElement(By.xpath("//*[@id=\"mergeAttributeShow\"]/table/tbody/tr[1]/td[2]/input")).click();
                            });
                            //点击：无品牌
                            finallyTask(() -> {
                                chromeDriver.findElement(By.xpath("//*[@id=\"mergeAttributeShow\"]/table/tbody/tr[1]/td[2]/ul/li")).click();
                            });

                            //2.设置默认SKU
                            String sku = "system-" + new Date().getTime() / 1000;//innovation
                            //填写：默认SKU
                            finallyTask(() -> {
                                chromeDriver.findElement(By.xpath("//*[@id=\"mergeAttributeShow\"]/table/tbody/tr[2]/td[2]/input")).sendKeys(sku);
                            });

                            listenerClickInputStateButton(ClickInputStateEnum.updateSkuImage);
                            listenerClickInputStateButton(ClickInputStateEnum.updateSkuColor);
                            listenerClickInputStateButton(ClickInputStateEnum.setProductColor);
                            listenerClickInputStateButton(ClickInputStateEnum.setSkuInfo);
                            listenerClickInputStateButton(ClickInputStateEnum.ALL_METHOD);
                            listenerClickInputStateButton(ClickInputStateEnum.googleTranslate);
                            listenerClickInputStateButton(ClickInputStateEnum.setProductSize);
                            listenerClickInputStateButton(ClickInputStateEnum.setProductInfo);

                        }
                    }
                    //采集箱页面
                    else if (chromeDriver.getCurrentUrl().contains("https://www.dianxiaomi.com/ozonProduct/draft.htm?dxmState=draft")) {
                        if (0 == chromeDriver.findElements(By.cssSelector(".自动化编辑")).size()) {
                            更改页面title("DingHong_v1.0-产品管理");
                            List<WebElement> TR = chromeDriver.findElement(By.id("ozonPageList")).findElements(By.cssSelector(".content.lineContent"));
                            int ozonPageListSize = TR.size();
                            for (int i = 0; i < ozonPageListSize; i++) {
                                String dataId = TR.get(i).getAttribute("data-id");
                                executeScript("$('#ozonPageList .content.lineContent').eq(" + i + ").find('.operating').prepend('<a href=\"javascript:\"  data-id=\"" + dataId + "\" class=\"自动化编辑\" style=color:red;>自动化编辑</a>')" +
                                        "" +
                                        "");

                                //监控
                            }
                            executeScript("$('.自动化编辑').on('click',function(){" +
                                    "var dataId=$(this).attr('data-id');" +
                                    "document.location.href ='https://www.dianxiaomi.com/ozonProduct/add.htm?id='+dataId" +
                                    "+'&dataType=" + hrefKey + "'" +
                                    "})");

                        }

                    } /*else {
                        if (!chromeDriver.getCurrentUrl().contains("1688.com")) {
                            chromeDriver.get("https://www.dianxiaomi.com/ozonProduct/draft.htm?dxmState=draft");
                        }
                    }*/


                    输入休眠(1_000);
                }

            }
        }).start();


        //监控页面点击
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (chromeDriver.findElements(By.id(clickInputStateButtonId)).size() == 0) {
                            输入休眠(500);
                            continue;
                        }
                        String value;
                        try {
                            value = chromeDriver.findElement(By.id(clickInputStateButtonId)).getAttribute("value");
                        } catch (Exception e) {
                            value = null;
                        }
                        //有任务进来
                        if (StringUtils.isNotBlank(value)) {
                            switchClickMethod(value);
                        }
                        输入休眠(500);
                    } catch (Exception e) {
                    }
                }

            }
        }).start();
    }

    private static void tryCatchForNull(Runnable task) {
        try {
            task.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final void adsPower() {
        //kye 5fcfc9f844316ab6a60236aaed36374a
        //https://www.amz123.com/thread-826877.htm
    }

    private static void 设置产品基本信息() {
        点击展开产品属性();
        设置基本属性();
    }

    //设置产品属性
    private static void 点击展开产品属性() {
        tryCatchForNull(() -> {
            if ("+展开".equalsIgnoreCase(chromeDriver.findElement(By.id("otherAttrShowAndHide")).getText())){
                chromeDriver.findElement(By.id("otherAttrShowAndHide")).click();
            }
        });
    }

    private static void 设置基本属性() {
        //1.设置季节
        tryCatchForNull(() -> {
            WebElement 季节 = 获取一个属性元素("季节(Сезон)");
            季节.findElement(By.cssSelector(".menuContentShowBox")).click();
            季节.findElement(By.cssSelector("ul")).findElement(By.cssSelector("li[title='对于任何季节(На любой сезон)']")).click();
        });

        输入休眠(1_00);
        //2.身高
        tryCatchForNull(() -> {
            WebElement 身高 = 获取一个属性元素("身高 (Рост)");
            身高.findElement(By.cssSelector(".menuContentShowBox")).click();
            身高.findElement(By.cssSelector(".commMenuSearchBox")).sendKeys("150-190");
            身高.findElement(By.cssSelector(".menuListUl")).findElement(By.cssSelector(".menuListLi[title='150-190(150-190)']")).click();
        });

        输入休眠(1_00);
        //3.服装包装类型
        tryCatchForNull(() -> {
            WebElement 包装类型 = 获取一个属性元素("服装包装类型(Тип упаковки одежды)");
            包装类型.findElement(By.cssSelector(".menuContentShowBox")).click();
            包装类型.findElement(By.cssSelector(".commMenuSearchBox")).sendKeys("小袋");
            包装类型.findElement(By.cssSelector("ul")).findElement(By.cssSelector("li[title='小袋(Чехол)']")).click();
        });

        输入休眠(1_00);
        //4.垫片/内部材料
        tryCatchForNull(() -> {
            WebElement 垫片内部材料 = 获取一个属性元素("垫片/内部材料(Материал подклада/внутренней отделки)");
            垫片内部材料.findElements(By.cssSelector("td")).get(1).findElement(By.cssSelector(".checkboxName[title='聚酯(Полиэстер)']")).click();
        });

        输入休眠(1_00);

    }

    private static WebElement 获取一个属性元素(String title) {
        return chromeDriver.findElement(By.cssSelector(".productAttributeTr")).findElement(By.cssSelector("tr[data-showname='" + title + "']"));
    }

    private static final void 更改页面title(String title) {
        executeScript("document.title='" + title + "'");
    }

    private static final void 新建标签页(String url) {
        executeScript("window.open('" +
                url +
                "')");
    }

    private static final void 切换获取1688信息(String value) {
        Object[] objects = chromeDriver.getWindowHandles().toArray();
        chromeDriver.switchTo().window(objects[2].toString());

        //采集1688 sku数据
        List<_1688_sku> _1688_sku_info = 获取1688sku信息();
        //PUT cache
        _1688_SKU_INFO_CACHE.put(value, _1688_sku_info);

        chromeDriver.close();

        chromeDriver.switchTo().window(objects[0].toString());
    }

    private static final void 翻译标题() {
        String value = chromeDriver.findElement(By.xpath("//*[@id=\"productTitleBuyer\"]")).getAttribute("value");
        String 翻译value = 切换获取翻译(value);
        输入休眠(500);
        chromeDriver.findElement(By.xpath("//*[@id=\"productTitleBuyer\"]")).clear();
        chromeDriver.findElement(By.xpath("//*[@id=\"productTitleBuyer\"]")).sendKeys(翻译value);
    }

    private static final String 切换获取翻译(String value) {
        Object[] objects = chromeDriver.getWindowHandles().toArray();
        chromeDriver.switchTo().window(objects[1].toString());
        chromeDriver.get("https://translate.google.com/?hl=zh-CN&sl=auto&tl=ru&op=translate");
        chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea")).clear();
        chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea")).sendKeys(value);
        StringBuilder response = new StringBuilder();
        finallyTask(() -> {
            String text = chromeDriver.findElement(By.cssSelector(".ryNqvb")).getText();//chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div/div[2]/div[3]/c-wiz[2]/div/div[9]/div/div[1]/span[1]/span/span")).getText();
            response.append(text);
        });
        chromeDriver.switchTo().window(objects[0].toString());
        return response.toString();
    }

    private static final void switchClickMethod(String value) {
        //switch
        //2.更新SKU图片
        if (value.equalsIgnoreCase(ClickInputStateEnum.updateSkuImage.name())) {
            clearImageList();
            更新图片();
            executeScript("$('#updateSkuImage').removeClass('btn-orange')");
            //3.确认商品颜色名
        } else if (value.equalsIgnoreCase(ClickInputStateEnum.updateSkuColor.name())) {
            确认更新颜色信息();
            executeScript("$('#updateSkuColor').removeClass('btn-orange')");
            //1.设置商品颜色
        } else if (value.equalsIgnoreCase(ClickInputStateEnum.setProductColor.name())) {
            设置产品颜色();
            executeScript("$('#setProductColor').removeClass('btn-orange')");
        } else if (value.equalsIgnoreCase(ClickInputStateEnum.setSkuInfo.name())) {
            设置商品基本信息();
            executeScript("$('#setSkuInfo').removeClass('btn-orange')");
        } else if (value.equalsIgnoreCase(ClickInputStateEnum.googleTranslate.name())) {
            翻译标题();
            executeScript("$('#googleTranslate').removeClass('btn-orange')");
        } else if (value.equalsIgnoreCase(ClickInputStateEnum.setProductSize.name())) {
            设置产品尺码();
            executeScript("$('#setProductSize').removeClass('btn-orange')");
        } else if (value.equalsIgnoreCase(ClickInputStateEnum.setProductInfo.name())) {
            设置产品基本信息();
            executeScript("$('#setProductInfo').removeClass('btn-orange')");
        }

        //执行所有方法
        else if (value.equalsIgnoreCase(ClickInputStateEnum.ALL_METHOD.name())) {
            switchClickMethod(ClickInputStateEnum.setProductSize.name());
            switchClickMethod(ClickInputStateEnum.setProductColor.name());
            switchClickMethod(ClickInputStateEnum.updateSkuImage.name());
            switchClickMethod(ClickInputStateEnum.updateSkuColor.name());
            switchClickMethod(ClickInputStateEnum.setSkuInfo.name());
            switchClickMethod(ClickInputStateEnum.googleTranslate.name());
            executeScript("$('#ALL_METHOD').removeClass('btn-orange')");
        }


        //任务完成 清空按钮
        clearClickInputStateButton();
    }

    private static final void 设置商品基本信息() {
        //1.设置库存
        设置产品库存();
        //2.设置尺寸信息
        设置尺寸信息();
        //3.设置商品重量
        设置商品重量();
        //4.设置商品售价
        设置商品售价();
        //5.设置吊牌售价
        设置吊牌售价();
    }

    private static final void 设置商品售价() {
        String priceValue = chromeDriver.findElement(By.id("setProductPrice")).getAttribute("value");
        if (StringUtils.isBlank(priceValue)) {
            return;
        }

        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoTable\"]/thead/tr/th[6]/span[2]/a")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"price1\"]")).sendKeys(priceValue);
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[3]/button[1]")).click();
    }


    private static final void 设置吊牌售价() {
        //1. 获取价格
        String priceValue = chromeDriver.findElement(By.xpath("//*[@id=\"ozonSkuInfoTbody\"]/tr[1]/td[6]/div[1]/input")).getAttribute("value");
        if (StringUtils.isBlank(priceValue)) {
            return;
        }

        Double v = Double.valueOf(priceValue) / 0.4;
        int value = v.intValue();

        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoTable\"]/thead/tr/th[7]/span/a")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"price1\"]")).sendKeys(String.valueOf(value));
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[3]/button[1]")).click();
    }

    private static final void 设置商品重量() {
        List<_1688_sku> sku_info_cache = get_1688_SKU_INFO_CACHE();
        Integer weight = sku_info_cache.get(0).getWeight();
        //1.点击批量设置重量
        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoTable\"]/thead/tr/th[11]/span[3]/a")).click();
        //2.输入重量
        chromeDriver.findElement(By.xpath("//*[@id=\"skuWeight\"]")).sendKeys(String.valueOf(weight));
        //3.保存
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[3]/button[1]")).click();
    }


    private static final void 设置尺寸信息() {
        //1.点击设置
        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoTable\"]/thead/tr/th[10]/span[3]/a")).click();
        //2.长
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[2]/div")).findElements(By.cssSelector("input")).get(0).sendKeys("288");
        //3.宽
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[2]/div")).findElements(By.cssSelector("input")).get(1).sendKeys("150");
        //4.高
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[2]/div")).findElements(By.cssSelector("input")).get(2).sendKeys("80");
        //5.保存
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[3]/button[1]")).click();
    }

    private static final void 设置产品库存() {
        //点击设置
        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoTable\"]/thead/tr/th[8]/span/a")).click();
        //写库存
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[2]/div/input")).sendKeys("100");
        //应用库存
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[2]/div/button")).click();
        //保存
        chromeDriver.findElement(By.xpath("//*[@id=\"skuListBatchEdit\"]/div[2]/div/div[3]/button[1]")).click();
    }

    private static final void 设置产品颜色() {
        //1.先清空所有颜色信息
        try {
            removeColor();
        } catch (Exception e) {
        }
        //2.按采集到的颜色 重新生成一遍
        List<_1688_sku> sku_info_cache = get_1688_SKU_INFO_CACHE();

        for (int i = 0; i < sku_info_cache.size() - 1; i++) {
            finallyTask(() -> {
                addColor();
            });
        }


        for (int i = 0; i < sku_info_cache.size(); i++) {
            _1688_sku sku = sku_info_cache.get(i);
            selectColor(i);
            sendKeysColor(i, sku.getColor());
        }

        输入休眠(1_000);
        一键生成sku();
    }

    private static final void 设置产品尺码() {
        //1.先清空所有颜色信息
        try {
            removeSize();
        } catch (Exception e) {
        }
        //2.按采集到的尺码 重新生成一遍
        List<_1688_sku> sku_info_cache = get_1688_SKU_INFO_CACHE();
        List<String> skuList = sku_info_cache.get(0).getSkuList();

        for (int i = 0; i < skuList.size() - 1; i++) {
            finallyTask(() -> {
                addSize();
            });
        }

        for (int i = 0; i < skuList.size(); i++) {
            String size = skuList.get(i);
            String searchValue;
            if ("s".equalsIgnoreCase(size)) {
                searchValue = "42";
            } else if ("m".equalsIgnoreCase(size)) {
                searchValue = "44";
            } else if ("l".equalsIgnoreCase(size)) {
                searchValue = "46";
            } else if ("xl".equalsIgnoreCase(size)) {
                searchValue = "48";
            } else if ("xxl".equalsIgnoreCase(size)
                    || "2xl".equalsIgnoreCase(size)) {
                searchValue = "50";
            } else if ("xxxl".equalsIgnoreCase(size)
                    || "3xl".equalsIgnoreCase(size)) {
                searchValue = "52";
            } else if ("xxxxl".equalsIgnoreCase(size)
                    || "4xl".equalsIgnoreCase(size)) {
                searchValue = "54";
            } else if ("xxxxxl".equalsIgnoreCase(size)
                    || "5xl".equalsIgnoreCase(size)) {
                searchValue = "56";
            } else {
                searchValue = "";
            }
            try {
                selectSize(i, searchValue);
            } catch (Exception e) {
            }
            sendKeysSize(i, size);
        }

        输入休眠(1_000);
        //一键生成sku();
    }

    private static void selectSize(int index, String searchValue) {
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".attrOptionTextArea.p5.attrOptionBoxNote.p-top0")).get(index).click();
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".content")).get(index + 1).findElement(By.cssSelector(".skuAttrSearch")).sendKeys(searchValue);

        List<WebElement> 选择框List = chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".change-box-out.changeBoxOut"));
        for (int i = 0; i < 选择框List.size(); i++) {
            WebElement 选择框 = 选择框List.get(i);
            //hide
            if (!选择框.getAttribute("class").contains("hide")) {
                //选择第一个尺码
                选择框.findElement(By.cssSelector("input")).click();
                //确认
                chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".text-right.m-right30.m-top10.m-bottom10 button")).get(0).click();
            }
            System.out.println();
        }

        //chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".text-right.m-right30.m-top10.m-bottom10 button")).get(0).click();
    }

    private static void sendKeysSize(int index, String value) {
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".con.attrCon.p5.relative")).get(1).findElements(By.tagName("input")).get(0).clear();
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".con.attrCon.p5.relative")).get(1).findElements(By.tagName("input")).get(0).sendKeys(value);
    }

    private static final void 确认更新颜色信息() {
        List<_1688_sku> sku_info_cache = get_1688_SKU_INFO_CACHE();

        for (int i = 0; i < sku_info_cache.size(); i++) {
            try {
                sendKeysColor(i, String.valueOf((i + 1)));
            } catch (Exception e) {
            }
        }
    }

    class _1688_sku {
        private String color;
        private String image_url;
        private Integer weight;
        private List<String> skuList;

        public List<String> getSkuList() {
            return skuList;
        }

        public void setSkuList(List<String> skuList) {
            this.skuList = skuList;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }

    private static final List<_1688_sku> 获取1688sku信息() {
        //点击sku详情
        System.out.println("点击sku详情 - start");
        System.out.println("scrollTop - start");
        //phantomJsUtil.scrollTop(chromeDriver, 2);
        scrollTop(chromeDriver,0,5,200);
        System.out.println("scrollTop - end");
        chromeDriver.findElement(By.cssSelector(".sku-wrapper-expend-button")).click();
        System.out.println("点击sku详情 - end");
        输入休眠(5_00);


        List<_1688_sku> responseList = new ArrayList<>();
        Integer weight = 218;
        //获取重量
        try {
            String text = chromeDriver.findElement(By.cssSelector(".od-pc-offer-cross .offer-attr-item-value")).getText();
            if (text.contains("kg")) {
                Double weightDdouble = Double.valueOf(text.replace("kg", "")) * 1000;
                weight = weightDdouble.intValue();
            }
            System.out.println(weight);
        } catch (Exception e) {
        }


        //sku info
        //chromeDriver.findElement(By.id("sku-count-widget-wrapper")).findElements(By.cssSelector(".sku-item-name")).get(0).getText();
        System.out.println("skuList - start");
        List<WebElement> skuList = chromeDriver.findElement(By.id("sku-count-widget-wrapper")).findElements(By.cssSelector(".sku-item-name"));
        List<String> sizeList = new ArrayList<>();
        for (int i = 0; i < skuList.size(); i++) {
            String text = skuList.get(i).getText();
            sizeList.add(text);
        }

        List<WebElement> imgList = chromeDriver.findElement(By.cssSelector(".pc-sku-wrapper .prop-item-wrapper")).findElements(By.cssSelector(".prop-img"));
        List<WebElement> skuNameList = chromeDriver.findElement(By.cssSelector(".pc-sku-wrapper .prop-item-wrapper")).findElements(By.cssSelector(".prop-name"));
        for (int i = 0; i < imgList.size(); i++) {
            String title = skuNameList.get(i).getAttribute("title");
            String background_image_url = imgList.get(i).getCssValue("background").split("url\\(\"")[1].split("\"\\)")[0];

            _1688_sku _1688_sku = new OZON上架().new _1688_sku();
            _1688_sku.setColor(title);
            _1688_sku.setImage_url(background_image_url);
            _1688_sku.setWeight(weight);
            _1688_sku.setSkuList(sizeList);
            responseList.add(_1688_sku);
            System.out.println(title);
            System.out.println(background_image_url);
        }
        System.out.println("skuList - end");
        return responseList;
    }

    private static final String get1688链接() {
        StringBuilder response = new StringBuilder();
        finallyTask(() -> {
            String _1688_value = chromeDriver.findElement(By.id("sourceUrl0")).getAttribute("value");
            if (StringUtils.isBlank(_1688_value) || !_1688_value.contains("1688.com")) {
                executeScript("alert('来源链接为空 ｜ 不是1688链接 !')");
                return;
            }
            response.append(_1688_value);
        });
        return response.toString();
    }

    private static final List<_1688_sku> get_1688_SKU_INFO_CACHE() {
        return _1688_SKU_INFO_CACHE.get(get1688链接());
    }

    private static final String clickInputStateButtonId = "clickInputState";

    //创建按钮监控元素
    private static void createClickInputStateButton() {
        executeScript("$('body').append('<input id=\"" + clickInputStateButtonId + "\" type=\"hidden\" />')");
    }

    //清空监控内容
    private static void clearClickInputStateButton() {
        executeScript("$('#" + clickInputStateButtonId + "').val('')");
    }

    //添加按钮监控元素状态
    private static void listenerClickInputStateButton(ClickInputStateEnum clickInputStateEnum) {
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.updateSkuImage.name())) {
            executeScript("$('#updateSkuImage').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.updateSkuImage.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.updateSkuColor.name())) {
            executeScript("$('#updateSkuColor').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.updateSkuColor.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.setProductColor.name())) {
            executeScript("$('#setProductColor').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.setProductColor.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.setSkuInfo.name())) {
            executeScript("$('#setSkuInfo').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.setSkuInfo.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.ALL_METHOD.name())) {
            executeScript("$('#ALL_METHOD').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.ALL_METHOD.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.googleTranslate.name())) {
            executeScript("$('#googleTranslate').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.googleTranslate.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.setProductSize.name())) {
            executeScript("$('#setProductSize').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.setProductSize.name() + "')})");
        }
        if (clickInputStateEnum.name().equalsIgnoreCase(ClickInputStateEnum.setProductInfo.name())) {
            executeScript("$('#setProductInfo').on('click',function(){$('#" + clickInputStateButtonId + "').val('" + ClickInputStateEnum.setProductInfo.name() + "')})");
        }
    }

    enum ClickInputStateEnum {
        ALL_METHOD,//执行所有方法
        updateSkuImage,//更新SKU图片
        updateSkuColor,//更改sku 颜色 为 ：1～x
        setProductColor,//设置商品颜色
        setSkuInfo,//设置商品基本信息
        googleTranslate,//google 翻译
        setProductSize,//设置商品尺码
        setProductInfo;//设置产品基本信息

    }

    private static void clearImageList() {
        //获取sku列表
        List<WebElement> skuImageList = chromeDriver.findElements(By.cssSelector(".skuImgList"));//chromeDriver.findElements(By.cssSelector(".skuImgList .menu.uploadImgOut"));
        //如果sku列表不为空 则清空第一条sku的所有图片
        //OZON_PRODUCT_IMAGE_UP.imageFn.uploadImg(2, "", $(".skuImgList .menu.uploadImgOut").eq(0).find("li").eq(3))
        if (skuImageList.size() > 0) {
            //获取第一个sku列表的所有图片
            //todo 效率慢 走js
            /*for (int i = 0; i < skuImageList.size(); i++) {
                List<WebElement> elements = skuImageList.get(i).findElements(By.cssSelector(".glyphicon.glyphicon-trash"));
                //清空所有图片
                elements.stream().forEach(element -> {
                    element.click();
                });
            }*/
            //清空所有图片
            executeScript("$.each($(\".glyphicon.glyphicon-trash[data-original-title='删除']\"), function(index, value) {\n" +
                    "        $(this).click();\n" +
                    "    });");
            System.out.println();

            //addImageUrl();
        }
    }

    private static void removeSize() {

        //要先末尾添加一个 否则删不干净
        addSize();

        List<WebElement> elements = chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(0).findElements(By.cssSelector(".v-middle.f-center.removeAttrTd i"));

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).click();
        }
    }

    private static void addSize() {
        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoArrBox\"]/div[1]/div[2]/table/thead/tr/th[3]/i")).click();
    }

    private static void addColor() {
        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoArrBox\"]/div[2]/div[2]/table/thead/tr/th[3]/i")).click();
    }

    private static void removeColor() {

        //要先末尾添加一个 否则删不干净
        addColor();

        List<WebElement> elements = chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(1).findElements(By.cssSelector(".v-middle.f-center.removeAttrTd i"));

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).click();
        }
    }

    private static void selectColor(int index) {
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(1).findElements(By.cssSelector(".attrOptionTextArea.p5.attrOptionBoxNote.p-top0")).get(index).click();
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(1).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".change-box-out.changeBoxOut")).get(0).click();
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(1).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".text-right.m-right30.m-top10.m-bottom10 button")).get(0).click();
    }

    private static void sendKeysColor(int index, String value) {
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(1).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".con.attrCon.p5.relative")).get(1).findElements(By.tagName("input")).get(0).clear();
        chromeDriver.findElements(By.cssSelector(".sku-info-attr.skuInfoAttr")).get(1).findElements(By.cssSelector(".content")).get(index + 1).findElements(By.cssSelector(".con.attrCon.p5.relative")).get(1).findElements(By.tagName("input")).get(0).sendKeys(value);
    }

    private static void 一键生成sku() {
        String skuName = chromeDriver.findElement(By.xpath("//*[@id=\"mergeAttributeShow\"]/table/tbody/tr[2]/td[2]/input")).getAttribute("value");
        chromeDriver.findElement(By.xpath("//*[@id=\"skuInfoTable\"]/thead/tr/th[5]/span[2]/a[1]")).click();
        chromeDriver.findElement(By.id("ozonProductSku")).sendKeys(skuName);
        chromeDriver.findElement(By.cssSelector(".button.btn-determine.skuListBatchEdit")).click();
    }

    //添加网络图片
    private static void addImageUrl(int index, String imageUrl) {
        //1.打开图片输入框
        String js = "OZON_PRODUCT_IMAGE_UP.imageFn.uploadImg(2,'',$('.skuImgList').eq(" + index + ").find('.menu.uploadImgOut a').eq(2))";
        executeScript(js);
        //2.输入图片链接
        chromeDriver.findElement(By.id("netImgUrl2")).sendKeys(imageUrl);
        //3.保存；OZON_PRODUCT_IMAGE_UP.imageFn.downImgFromUrl2();
        executeScript("OZON_PRODUCT_IMAGE_UP.imageFn.downImgFromUrl2();");
        //4.应用同颜色
        executeScript("OZON_PRODUCT_IMAGE_UP.imageFn.applyPicToVariant($('.skuImgList').eq(" + index + ").find('.skuImgApply').eq(1))");
    }

    private static void 更新图片() {
        List<_1688_sku> sku_info_cache = get_1688_SKU_INFO_CACHE();
        Map<String, String> imageMap = new HashMap<>();
        //转化Map key ：1 开始
        for (int i = 0; i < sku_info_cache.size(); i++) {
            //imageMap.put(String.valueOf((i + 1)), sku_info_cache.get(i).getImage_url());
            imageMap.put(sku_info_cache.get(i).getColor(), sku_info_cache.get(i).getImage_url());
        }

        //String js = "OZON_PRODUCT_IMAGE_UP.imageFn.uploadImg(2,'',$('.skuImgList').eq(" + index + ").find('.menu.uploadImgOut a').eq(2))";
        List<WebElement> skuImgListElementList = chromeDriver.findElements(By.cssSelector(".skuImgList"));
        for (int i = 0; i < skuImgListElementList.size(); i++) {
            WebElement skuImg = skuImgListElementList.get(i);
            //获取颜色名称
            WebElement webElement = skuImg.findElements(By.cssSelector(".skuImgValue")).get(3);
            String color = webElement.getAttribute("title");
            //第一次设置好 直接删除 等待下个key
            if (imageMap.containsKey(color)) {
                addImageUrl(Integer.valueOf(i), imageMap.get(color));
                imageMap.remove(color);
            }

        }

    }


    //https://qa.1r1g.com/sf/ask/1158613921/
    public void 关闭提示按钮() {
        try {
            输入休眠(1000);

            chromeDriver.findElement(By.id("theNewestModalLabelContent")).findElement(By.xpath("..")).findElement(By.className("modal-footer")).findElement(By.cssSelector("button")).click();
        } catch (Exception e) {
            //e.printStackTrace();
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

    public static void executeScript(String js) {
        JavascriptExecutor webDriverJS = (JavascriptExecutor) chromeDriver;
        webDriverJS.executeScript(js, new Object[0]);
    }

    public static void 获取账号cookie() {
        WebDriver chromeDriver = phantomJsUtil.getChromeDriver(false);
        chromeDriver.get("https://www.dianxiaomi.com");

        Set<Cookie> cookies = chromeDriver.manage().getCookies();
        String s = JSON.toJSONString(cookies);
        System.out.println(s);
    }

    public static int scrollTop(WebDriver webDriver, int startCount, int count, int sleepTime) {
        输入休眠(1500);
        System.out.println("滚动开始");
        JavascriptExecutor webDriverJS = (JavascriptExecutor) webDriver;
        int size = startCount;
        String builder = new String("document.documentElement.scrollTop=" + size);

        for (int i = 0; i < count; ++i) {
            webDriverJS.executeScript(builder);
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

    public static void main(String[] args) throws Exception {
        //new OZON上架().获取账号cookie();
        new OZON上架().login();
    }
}
