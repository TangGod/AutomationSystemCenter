package tanggod.github.io.webdriver.service;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ProcessOnService {

    private PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static final String URL = "https://www.processon.com/i/";
    private static final String DEFAULT_USER_ID = "5a7aa50ae4b059c41ab9c3b9";


    private static final String registerButtonText="注册";

    /**
     *
     * @param userId 需要推荐的用户id
     * @param email 注册邮箱
     * @param password 注册密码
     * 用户名随机
     */
    public void createUser(String userId,String email,String password)throws Exception {
        if (isBlank(userId)) {
            userId = DEFAULT_USER_ID;
            print("执行默认用户");
        }
        String menuUrl = URL + userId;

        WebDriver chrome = phantomJsUtil.getChromeDriver();
        chrome.get(menuUrl);

        //获取注册按钮
        List<WebElement> liList = chrome.findElements(By.className("navbar-collapse")).get(0).findElements(By.tagName("li"));
        WebElement registerLi = liList.get(liList.size() - 1);
        if (!registerButtonText.equals(registerLi.getText())) {
            print("找不到注册按钮");
            return;
        }
        //点击注册按钮
        registerLi.click();

        //随机用户名
        String fullName = UUID.randomUUID().toString().substring(0, 15);
        //填写邮箱
        chrome.findElements(By.id("login_email")).get(0).sendKeys(email);
        //填写密码
        chrome.findElements(By.id("login_password")).get(0).sendKeys(password);
        //填写用户名
        chrome.findElements(By.id("login_fullname")).get(0).sendKeys(fullName);
        //点击验证
        chrome.findElements(By.id("TencentCaptcha")).get(0).click();
        //查找验证码的iframe
        //等待
        WebDriverWait wait_1 = new WebDriverWait(chrome, 20L);
        wait_1.until(ExpectedConditions.presenceOfElementLocated(By.id("tcaptcha_popup")));
        chrome.switchTo().frame("tcaptcha_popup");




        //进行验证码验证  iframe #tcaptcha_popup
       /* JavascriptExecutor chromeJs = (JavascriptExecutor)chrome;
        chromeJs.executeScript("$('#tcaptcha_drag_thumb').css('left','241px')");
        chromeJs.executeScript("$('#slideBlock').css('left','241px');");
        chrome.findElement(By.id("slideBlock")).click();*/
        //chromeJs.executeScript("$('#slideBlock').click();");

        //跳出iframe
        chrome.switchTo().defaultContent();

        //slide(777,700);
        System.out.println("success");

    }



    private void slide(int x,int y)throws Exception{
        int x1=x-232;
        Thread.sleep(3000);
        Robot robot=new Robot();
        robot.mouseMove(x1,y);
        robot.mousePress(KeyEvent.BUTTON1_MASK);
        for (int i=0;i<232;i++){
            robot.mouseMove(++x1,y);
            Thread.sleep(20);

        }
        //robot.mouseMove(x1,y);
        robot.mouseRelease(KeyEvent.BUTTON1_MASK);
        Thread.sleep(2000);
    }

    private boolean isBlank(String data) {
        if (Objects.isNull(data) || "".equals(data.trim()))
            return true;
        return false;
    }

    private static final String msg = " ------------------------------------- ";

    private void print(String message) {
        System.out.println(msg + message + msg);
    }

    public static void main(String[] args)throws Exception {
        ProcessOnService processOnService = new ProcessOnService();
        processOnService.createUser(null,"tang1084986263@163.com","123456");
        //processOnService.slide(777,700);
    }

}
