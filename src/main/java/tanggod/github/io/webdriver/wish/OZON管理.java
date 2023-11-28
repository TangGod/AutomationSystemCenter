package tanggod.github.io.webdriver.wish;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/29.
 */
@Service
public class OZON管理 extends JooqBaseService {

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static WebDriver chromeDriver;

    //https://www.nuomiphp.com/eplan/585486.html
    public void login() {


        chromeDriver = phantomJsUtil.getChromeDriver(false);
        chromeDriver.get("https://seller.ozon.ru/app/products?filter=all");

        String s = JSON.toJSONString(OZON管理.chromeDriver.manage().getCookies());
        System.out.println(s);

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Wish后台产品修改.Swing().main(OZON管理.chromeDriver);

            }
        }).start();

    }

    public static void 输入休眠(Integer value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static class Swing {
        private Map<String, String> shopCache = new HashMap<>();
        private WebDriver chromeDriver;

        //https://baijiahao.baidu.com/s?id=1747575535472922885&wfr=spider&for=pc
        public void 创建按钮(JPanel jp, JFrame frame, GridBagConstraints gbc) {
            JLabel label = new JLabel("操作：");
            label.setFont(new Font("楷体", Font.BOLD, 16)); //修改字体样式
            jp.add(label, gbc);


            shopCache.keySet().stream().forEach(key -> {
                JButton jButton = new JButton("切换店铺");
                jp.add(jButton, gbc);

                //监听
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        chromeDriver.manage().deleteAllCookies();
                        Set<Cookie> cookies = JSON.parseArray(shopCache.get(key), Cookie.class).stream().collect(Collectors.toSet());
                        addCookies(chromeDriver,cookies );
                        chromeDriver.get("https://seller.ozon.ru/app/products?filter=all");
                    }
                });
            });
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

        public void main(WebDriver chromeDriver) {
            this.chromeDriver = chromeDriver;
            JFrame frame = new JFrame("OZON后台管理"); //创建Frame窗口
            JPanel jp = new JPanel(); //创建面板

            //https://blog.csdn.net/weixin_36378347/article/details/114594090
            jp.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;

            创建按钮(jp, frame, gbc);

            frame.add(jp);
            frame.setBounds(800, 800, 800, 800);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        new OZON管理().login();
    }
}
