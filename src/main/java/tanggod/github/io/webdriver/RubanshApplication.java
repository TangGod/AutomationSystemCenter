package tanggod.github.io.webdriver;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by TangGod on 2018/10/29.
 */
public class RubanshApplication {

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();
    private static final String filePath = "/Users/tanggod/1";


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

    private static WebDriver addCookies(WebDriver webDriver, Set<Cookie> cookies) {
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

    public void cookieLogin() throws Exception {
        WebDriver chromeDriver = phantomJsUtil.getChromeDriver();
        chromeDriver.get("http://erp.rubansh.com/index");
        Thread.sleep(2000l);
        WebDriverWait wait_1 = new WebDriverWait(chromeDriver, 20);
        wait_1.until(ExpectedConditions.presenceOfElementLocated(By.id("account")));

        chromeDriver.findElement(By.id("account")).sendKeys("teddy");

        WebDriverWait wait_2 = new WebDriverWait(chromeDriver, 20);
        wait_2.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));

        finallyTask(() -> {
            chromeDriver.findElement(By.id("password")).sendKeys("a123456");

        });

        Set<Cookie> cookies = chromeDriver.manage().getCookies();
        batchSerializableWrite(filePath, cookies);
        chromeDriver.quit();

    }

    public void login(WebDriver chromeDriver, String seriesName, String size, String categoryName_1, String categoryName_2, String categoryName_3, int weight) throws Exception {

        String spuName = seriesName + "-" + size;

        chromeDriver.get("http://erp.rubansh.com/core/productSeries/list?clickFunctionId=5aba37e50cf2f07f9a65e045");


        WebDriverWait wait_1 = new WebDriverWait(chromeDriver, 20);
        wait_1.until(ExpectedConditions.presenceOfElementLocated(By.id("addProductSeriesOperationCode")));

        finallyTask(() -> {
            chromeDriver.findElement(By.id("addProductSeriesOperationCode")).click();
        });

        String windowHandle = chromeDriver.getWindowHandle();

        //创建系统产品的iframe
        switchTo(chromeDriver);


        finallyTask(() -> {
            chromeDriver.findElements(By.tagName("tr")).get(5).findElements(By.tagName("a")).get(0).click();
        });

        //切回主页
        chromeDriver.switchTo().window(windowHandle);


        // 3 . 选择分类
        //选择产品分类的iframe
        switchTo(chromeDriver);
        /*finallyTask(()->{
        chromeDriver.findElements(By.className("datagrid-btable")).get(1).findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).get(1).findElement(By.tagName("div")).findElements(By.tagName("span")).get(0).click();
        });*/

        Thread.sleep(1_000);
        finallyTask(() -> {
            selectCategory(chromeDriver, categoryName_1);
        });

        finallyTask(() -> {
            selectCategory(chromeDriver, categoryName_2);
        });
        Thread.sleep(1_000);
        finallyTask(() -> {
            selectCategory(chromeDriver, categoryName_3);
        });

        selectParentPage(chromeDriver);

        pressUiButton(chromeDriver, true);

        // 4 . 上传主图

        //点击上传主图
        //selectParentPage(chromeDriver);

        switchTo(chromeDriver);
        chromeDriver.findElement(By.id("_mainImage_btn")).click();

        //点击插入图片
        chromeDriver.switchTo().frame(chromeDriver.findElement(By.id("edui428_iframe")));
        chromeDriver.findElement(By.id("tabhead")).findElements(By.tagName("span")).get(0).click();
        //输入图片地址
        chromeDriver.findElement(By.id("url")).sendKeys("1");
        //确认
        selectParentPage(chromeDriver);
        switchTo(chromeDriver);

        finallyTask(() -> {
            chromeDriver.findElement(By.id("edui430_body")).click();

        });

        //2  . Spu名
        finallyTask(() -> {
            chromeDriver.findElement(By.id("spuName")).sendKeys(spuName);
        });
        //1  . 系列名
        finallyTask(() -> {
            chromeDriver.findElements(By.className("formtable")).get(0).findElements(By.tagName("tr")).get(0).findElements(By.tagName("input")).get(0).sendKeys(seriesName);
        });

        //5  . 选择尺码

        chromeDriver.findElements(By.tagName("li")).forEach(li -> {
            List<WebElement> inputList = li.findElements(By.tagName("input"));
            if (inputList.size() == 1) {
                WebElement input = inputList.get(0);
                selectSize(chromeDriver, "S", input);
                selectSize(chromeDriver, "M", input);
                selectSize(chromeDriver, "L", input);
                selectSize(chromeDriver, "XL", input);
                selectSize(chromeDriver, "XXL", input);
                selectSize(chromeDriver, "XXXL", input);

            }
        });

        //重量
        chromeDriver.findElements(By.className("td-num")).get(2).findElements(By.tagName("input")).get(0).sendKeys(String.valueOf(weight));
        //供货价
        chromeDriver.findElements(By.className("td-num")).get(3).findElements(By.tagName("input")).get(0).sendKeys("1");


        Thread.sleep(1000);

        finallyTask(() -> {
            chromeDriver.findElements(By.className("td-num")).get(0).findElements(By.tagName("button")).get(0).click();
        });
        finallyTask(() -> {
            chromeDriver.findElements(By.className("td-num")).get(1).findElements(By.tagName("button")).get(0).click();
        });

        selectParentPage(chromeDriver);

        pressUiButton(chromeDriver, true);

        System.out.println();
        //chromeDriver.quit();

    }

    //选择尺码
    public void selectSize(WebDriver chromeDriver, String size, WebElement input) {
        String attribute = input.getAttribute("data-attr-opt-val");
        if (size.equals(attribute)) {
            finallyTask(() -> {
                input.click();

            });
        }
    }

    public void selectCategory(WebDriver chromeDriver, String name) {

        chromeDriver.findElements(By.tagName("div")).forEach(div -> {
            List<WebElement> span = div.findElements(By.tagName("span"));
            if (3 == span.size()) {
                System.out.println(span.get(2).getText());
                if (name.equals(span.get(2).getText())) {
                    span.get(0).click();
                }
            } else if (4 == span.size()) {
                System.out.println(span.get(3).getText());
                if (name.equals(span.get(3).getText())) {
                    span.get(1).click();
                }
            } else if (5 == span.size()) {
                System.out.println(span.get(4).getText());
                if (name.equals(span.get(4).getText())) {
                    span.get(3).click();
                }
            }
        });
    }

    //yes : 0 ：确认 1 ：取消
    public void pressUiButton(WebDriver chromeDriver, boolean yes) {
        finallyTask(() -> {
            List<WebElement> ui_buttons = chromeDriver.findElements(By.className("ui_buttons"));
            for (int j = 0; j < ui_buttons.size(); j++) {
                int size = chromeDriver.findElements(By.className("ui_buttons")).get(j).findElements(By.tagName("input")).size();
                if (size == 2)
                    chromeDriver.findElements(By.className("ui_buttons")).get(j).findElements(By.tagName("input")).get(yes ? 0 : 1).click();
            }
        });
    }

    //切换回父页面
    public void selectParentPage(WebDriver chromeDriver) {
        chromeDriver.switchTo().window(chromeDriver.getWindowHandle());
    }


    //切换到当前弹出到iframe
    public void switchTo(WebDriver chromeDriver) {
        WebElement systemOrderIframe = chromeDriver.findElements(By.tagName("iframe")).get(0);
        chromeDriver.switchTo().frame(systemOrderIframe);
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
            if (i > 500) {
                try {
                    //login();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        RubanshApplication M = new RubanshApplication();
        //M.cookieLogin();
        //new RubanshApplication().cookieLogin();
        //new RubanshApplication().login(1);

        //卫衣
        //new RubanshApplication().login("测试系列名", "测试Spu名", "服装", "男装", "卫衣",300);
        //shirt
        //new RubanshApplication().login("测试系列名", "测试Spu名", "服装", "男装", "短袖T恤",160);

        //  M.login("测试系列名", "测试Spu名", "服装", "男装", "短袖T恤",160);
        WebDriver chromeDriver = phantomJsUtil.getChromeDriver();
        chromeDriver.get("http://erp.rubansh.com/index");

        Set<Cookie> cookies1 = batchSerializableRead(filePath);
        addCookies(chromeDriver, cookies1);

        String seriesName = "system-16187377";
        //M.login(chromeDriver, seriesName, "Multicolor", "服装", "男装", "卫衣", 300);

        M.login(chromeDriver, seriesName, "White & Black", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "Red", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "White", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "Blue", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "Yellow", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "Black", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "Orange", "服装", "男装", "卫衣", 300);
        M.login(chromeDriver, seriesName, "Green", "服装", "男装", "卫衣", 300);


        /*String seriesName2 = "";
        M.login(chromeDriver, seriesName2, "", "服装", "男装", "卫衣", 300);*/
    }
}
