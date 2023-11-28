package tanggod.github.io.webdriver.wish.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * Created by TangGod on 2023/3/24.
 */
public class LogEventListener implements WebDriverEventListener {


    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("转向前URL: '" + url + "'");
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("转向后URL:'" + url + "'");
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
        System.out.println("Value of the:" + element.toString()
                + " before any changes made");
    }

    public void afterChangeValueOf(WebElement element, WebDriver driver) {
        System.out.println("Element value changed to: " + element.toString());
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("试图单击对象: " + element.toString());
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("单击对象: " + element.toString());
    }

    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Navigating back to previous page");
    }

    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Navigated back to previous page");
    }

    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Navigating forward to next page");
    }

    public void afterNavigateForward(WebDriver driver) {
        System.out.println("Navigated forward to next page");
    }

    public void onException(Throwable error, WebDriver driver) {
        System.out.println("Exception occured: " + error);
    }

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("试图寻找对象 : " + by.toString());
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("找到对象 : " + by.toString());
    }

    /*
     * non overridden methods of WebListener class
     */
    public void beforeScript(String script, WebDriver driver) {
    }

    public void afterScript(String script, WebDriver driver) {
    }

    @Override
    public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterNavigateRefresh(WebDriver arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeNavigateRefresh(WebDriver arg0) {
        // TODO Auto-generated method stub

    }
}
