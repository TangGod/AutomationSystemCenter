package tanggod.github.io.webdriver.test;

import cn.xchats.onlinetraffic.common.other.mq.AMQPServer;
import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.common.type.AMQPType;
import cn.xchats.onlinetraffic.common.type.EmailParameterType;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import tanggod.github.io.webdriver.WebdriverApplication;
import tanggod.github.io.webdriver.dianxiaomi.RegularUtil;

import java.io.*;
import java.util.*;

/**
 * Created by TangGod on 2018/10/29.
 */
@Service
public class TestApplication {

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();
    private static final String filePath1 = "/Users/tanggod/meizhilogin";

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

    public void cookieLogin(String path) throws Exception {
        WebDriver chromeDriver = phantomJsUtil.getChromeDriver();
        chromeDriver.get("http://www.tomorrowgold.com");


        Thread.sleep(30000l);
        Set<Cookie> cookies = chromeDriver.manage().getCookies();
        batchSerializableWrite(path, cookies);
        chromeDriver.quit();

    }



    public void login(int var) throws Exception {
        if (0 == var) {
            cookieLogin(filePath1);
        }
    }

    public static void main(String[] args) throws Exception {
        new TestApplication().login(0);

    }
}
