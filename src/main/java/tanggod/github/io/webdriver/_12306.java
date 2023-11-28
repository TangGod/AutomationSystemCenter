package tanggod.github.io.webdriver;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _12306 {
    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();
    private static final String productMenuUrl = "https://kyfw.12306.cn/otn/index/init";
    private static final String[] addressCityFast = {"ABCDE", "FGHIJ", "KLMNO", "KLMNO", "PQRST", "UVWXYZ"};


    public void init(int addressCityFastIndex) {
        WebDriver chromeDriver = phantomJsUtil.getDisplayChromeDriver();
        chromeDriver.get(productMenuUrl);

        //开始设置搜索条件
        List<WebElement> addressElements = chromeDriver.findElements(By.className("inp-w"));
        for (int i = 0; i < addressElements.size(); i++) {
            WebElement webElement = addressElements.get(i);
            webElement.click();
            if (0 == i)
                selectCity(chromeDriver, 1, "蚌埠");
            if (1 == i)
                selectCity(chromeDriver, 2, "杭州");
            if (2 == i)
                break;
            if (3 == i)
                break;        }

    }

    private void selectCity(WebDriver webDriver, int addressCityFastIndex, String cityName) {
        if (addressCityFastIndex > addressCityFast.length)
            return;

        //String adddressCity = addressCityFast[addressCityFastIndex];

        //12306已有jquery
        //phantomJsUtil.getJquery(webDriver);
        //JavascriptExecutor webDriverJS = (JavascriptExecutor) webDriver;
        // webDriverJS.executeScript("$('#abc li').eq(" + addressCityFastIndex + ")");
        webDriver.findElement(By.id("abc")).findElements(By.tagName("li")).get(addressCityFastIndex).click();
        String cityNameJs = "$('#ul_list2 li[title=%]').click();".replace("%", cityName);
        ((JavascriptExecutor) webDriver).executeScript(cityNameJs);
    }


    public static void main(String[] args) {
        new _12306().init(1);
        System.out.println("success");

    }
}
