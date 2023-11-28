package tanggod.github.io.webdriver;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Service;
import tanggod.github.io.webdriver.wish.Excel处理器;
import tanggod.github.io.webdriver.wish.Wish后台产品修改;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/29.
 */
@Service
public class 陈思强_Temu_抢单 extends JooqBaseService {

    private static final List<String> cookieList = new ArrayList<>();

    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static WebDriver chromeDriver;

    private void initCookieList() {
        cookieList.add("[{\"domain\":\"kuajing.pinduoduo.com\",\"expiry\":1728623267000,\"httpOnly\":false,\"name\":\"_nano_fp\",\"path\":\"/\",\"secure\":false,\"value\":\"XpEbn09jXqPjnqXYX9_09sb6i0Iv6_QmB0bOPOy_\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1725721007000,\"httpOnly\":true,\"name\":\"rckk\",\"path\":\"/\",\"secure\":true,\"value\":\"zXSMEGy0oGTk5KibO2l0iVkTlXHuwamH\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1728744970000,\"httpOnly\":false,\"name\":\"api_uid\",\"path\":\"/\",\"secure\":false,\"value\":\"CmngTGT7NgpeJABVS3BTAg==\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1725721007000,\"httpOnly\":true,\"name\":\"ru1k\",\"path\":\"/\",\"secure\":true,\"value\":\"f4a94227-5006-4304-8cfb-5f44c665adeb\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1725721007000,\"httpOnly\":true,\"name\":\"ru2k\",\"path\":\"/\",\"secure\":true,\"value\":\"5140dca1-cb4a-4d84-9d99-38ed7adbbb8b\"},{\"domain\":\"kuajing.pinduoduo.com\",\"expiry\":1694271264000,\"httpOnly\":true,\"name\":\"SUB_PASS_ID\",\"path\":\"/\",\"secure\":true,\"value\":\"eyJ0IjoiUnprWUIxcVV3c20xSWVSSENDa1JmMUxkYjlENlJ4VTBRelhrY0dHMEgwRWZDYlE3czk2K252bFNjeTFMRmpSRiIsInYiOjEsInMiOjEwMDAwLCJ1Ijo5NzQxODA2MDE5OTYzfQ==\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1725721007000,\"httpOnly\":true,\"name\":\"_f77\",\"path\":\"/\",\"secure\":true,\"value\":\"f4a94227-5006-4304-8cfb-5f44c665adeb\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1725721007000,\"httpOnly\":true,\"name\":\"_a42\",\"path\":\"/\",\"secure\":true,\"value\":\"5140dca1-cb4a-4d84-9d99-38ed7adbbb8b\"},{\"domain\":\".pinduoduo.com\",\"expiry\":1725721007000,\"httpOnly\":true,\"name\":\"_bee\",\"path\":\"/\",\"secure\":true,\"value\":\"zXSMEGy0oGTk5KibO2l0iVkTlXHuwamH\"}]");
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

    public void getCookieLogin() {
        //chromeDriver.manage().deleteAllCookies();
        chromeDriver = phantomJsUtil.getChromeDriver(true);
        输入休眠(3_000);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://kuajing.pinduoduo.com/main/order-manage");

        String s = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s);
        Set<Cookie> cookies = JSON.parseArray(cookieList.get(0), Cookie.class).stream().collect(Collectors.toSet());
        addCookies(chromeDriver, cookies);
    }

    public void cookieLogin() {
        //chromeDriver.manage().deleteAllCookies();
        /*String s = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s);*/
        Set<Cookie> cookies = JSON.parseArray(cookieList.get(0), Cookie.class).stream().collect(Collectors.toSet());
        addCookies(chromeDriver, cookies);
    }


    //https://www.nuomiphp.com/eplan/585486.html
    public void login() {
        initCookieList();

        chromeDriver = phantomJsUtil.getChromeDriver(true);
        输入休眠(3_000);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://kuajing.pinduoduo.com/main/order-manage");

        String s1 = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s1);
        cookieLogin();


        String s = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s);

        chromeDriver.get("https://kuajing.pinduoduo.com/main/order-manage");

        生成自动化抢单按钮();
        //chromeDriver.quit();
    }

    public void 生成自动化抢单按钮() {
        new Thread("Swing") {
            @Override
            public void run() {
                new Swing().main(chromeDriver);
            }
        }.start();

        new Thread("监控页面奔溃") {
            @Override
            public void run() {
                while (true) {
                    监控页面崩溃();
                }
            }
        }.start();

       /* new Thread("抢单按钮") {
            @Override
            public void run() {
                while (true) {
                    输入休眠(2_000);
                    try {
                        String button = "自动化抢单";
                        System.out.println("111");
                        List<WebElement> buttonList = chromeDriver.findElements(By.tagName("button"));
                        for (int i = 0; i < buttonList.size(); i++) {
                            String text = buttonList.get(i).getText();
                            if (text.contains(button)) {
                                break;
                            } else {
                                phantomJsUtil.getJquery(chromeDriver);
                                executeScript("$('button').eq(" + 0 + ").before('<button><a href=\"javascript:\"  data-id=\"" + button + "\" class=\"自动化抢单\" style='color:red;margin-right:30px;'>自动化抢单</a></button>')" +
                                        "" +
                                        "");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };//.start();*/
    }

    public void 监控页面崩溃() {
        try {
            //1。 页面奔溃
            List<WebElement> tips = chromeDriver.findElements(By.className("tips"));
            for (int i = 0; i < tips.size(); i++) {
                WebElement top = tips.get(i);
                String text = top.getText();
                if ("当前访问人数较多，请稍后重试".equalsIgnoreCase(text)) {
                    System.out.println("当前访问人数较多，请稍后重试");
                    //刷新页面 https://kuajing.pinduoduo.com/main/order-manage
                    chromeDriver.get("https://kuajing.pinduoduo.com/main/order-manage");
                }
            }
            //2。 暂无数据
            //tr[data-platform='wish']
            List<WebElement> beastBoxElement = chromeDriver.findElements(By.cssSelector("div[data-testid='beast-core-box']"));
            for (int i = 0; i < beastBoxElement.size(); i++) {
                WebElement webElement = beastBoxElement.get(i);
                List<WebElement> divList = webElement.findElements(By.tagName("div"));
                for (int j = 0; j < divList.size(); j++) {
                    WebElement div = divList.get(j);
                    String text = div.getText();
                    if ("暂无数据".equalsIgnoreCase(text)) {
                        System.out.println("暂无数据");
                        chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/form/div/div/div[20]/div/button[1]")).click();
                        //chromeDriver.get("https://kuajing.pinduoduo.com/main/order-manage");
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        输入休眠(2_000);
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

    static class Swing {
        private WebDriver chromeDriver;

        //https://baijiahao.baidu.com/s?id=1747575535472922885&wfr=spider&for=pc
        public JButton 创建按钮(JPanel jp, JFrame frame, GridBagConstraints gbc) {
            JLabel label = new JLabel("操作：");
            label.setFont(new Font("楷体", Font.BOLD, 16)); //修改字体样式
            jp.add(label, gbc);

            JButton 开启自动化抢单 = new JButton("开启自动化抢单");

            //监听
            开启自动化抢单.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("自动化抢单");
                    开启自动化抢单();
                }
            });
            jp.add(开启自动化抢单);

            JButton 关闭自动化抢单 = new JButton("关闭自动化抢单");

            //监听
            关闭自动化抢单.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("关闭自动化抢单");
                    关闭自动化抢单();
                }
            });
            jp.add(关闭自动化抢单);


          /*  JTextArea 日志 = new JTextArea();

            System.setOut(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    日志.append(String.valueOf((char) b));
                }
            }));

            jp.add(日志);

            for (int i=0;i<1000;i++){
                System.out.println("自动化抢单自动化抢单");
            }*/
            return null;
        }

        public void main(WebDriver chromeDriver) {
            this.chromeDriver = chromeDriver;
            JFrame frame = new JFrame("自动化抢单"); //创建Frame窗口
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


            while (true) {
                try {
                    if (是否开启了自动化抢单()) {
                        自动化抢单逻辑();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                输入休眠(2_00);
            }

        }

        private static final String 加入发货台 = "加入发货台";

        public void 自动化抢单逻辑() {
            chromeDriver.findElements(By.cssSelector(".order-manage_actions___xYyp")).get(0).findElements(By.cssSelector("a")).get(2).getText();
            List<WebElement> 所有操作的optionList = chromeDriver.findElements(By.cssSelector(".order-manage_actions___xYyp"));

            for (int i = 0; i < 所有操作的optionList.size(); i++) {
                WebElement option = 所有操作的optionList.get(i);
                List<WebElement> 所有a标签 = option.findElements(By.cssSelector("a"));

                for (int j = 0; j < 所有a标签.size(); j++) {
                    String text = 所有a标签.get(j).getText();
                    if (加入发货台.equalsIgnoreCase(text)) {
                        String disabled = 所有a标签.get(j).getAttribute("disabled");
                        if ("true".equalsIgnoreCase(disabled)) {
                            //禁用
                            System.out.println("加入发货台 - 禁用");
                            删除元素列表();
                            break;
                        }
                        try {
                            //chromeDriver.findElements(By.cssSelector(".order-manage_actions___xYyp")).get(0).findElements(By.cssSelector("a")).get(2).click();
                            所有a标签.get(j).click();
                        } catch (Exception e) {
                            System.out.println("加入发货台 - error");
                        }
                        System.out.println("加入发货台");

                        //进行确认
                        //chromeDriver.findElement(By.cssSelector(".body-module__footer___APhLF")).findElements(By.cssSelector("button")).get(0).click();
                        WebElement 确认框 = chromeDriver.findElement(By.cssSelector("div[data-testid='beast-core-portal-main']"));//chromeDriver.findElement(By.cssSelector(".body-module__footer___APhLF"));
                        List<WebElement> 确认框_按钮 = 确认框.findElements(By.cssSelector("button"));

                        //todo 滚动到指定元素
                        //https://www.wp2.cn/other/%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-selenium-webdriver-%E6%BB%9A%E5%8A%A8%E5%88%B0%E5%85%83%E7%B4%A0/
                       /* Actions actions = new Actions(chromeDriver);
                        actions.moveToElement(确认框);
                        actions.perform();*/

                        // Javascript executor
                        滚动到指定元素(chromeDriver.findElement(By.cssSelector("div[data-testid='beast-core-portal-main']")));

                        for (int b = 0; b < 确认框_按钮.size(); b++) {
                            if ("确认".equalsIgnoreCase(确认框_按钮.get(b).getText())) {
                                确认框_按钮.get(b).click();
                                System.out.println("加入发货台 - 确认");
                                输入休眠(50);

                                删除元素列表();

                                输入休眠(50);

                            }
                        }
                        break;
                    }
                }
            }
        }

        public void 删除元素列表(){
            phantomJsUtil.getJquery(chromeDriver);
            //$("tbody[data-testid='beast-core-table-middle-tbody']").eq(0).find("tr").eq(0).remove();
            List<WebElement> trList = chromeDriver.findElement(By.cssSelector("tbody[data-testid='beast-core-table-middle-tbody']")).findElements(By.tagName("tr"));
            for (int i=0;i<trList.size();i++){
                String trText = trList.get(i).getText();

                //直接删
                executeScript("$(\"tbody[data-testid='beast-core-table-middle-tbody']\").eq(0).find(\"tr\").eq(0).remove();");
                System.out.println("已删除TR");
                //如果 包含合计 则停止删除
                if (trText.contains("合计")){
                    break;
                }
            }

        }

        private void 滚动到指定元素(WebElement element){
            ((JavascriptExecutor)chromeDriver).executeScript("arguments[0].scrollIntoView (true);", element );
        }

        private static boolean 自动化抢单标记 = true;

        public void 开启自动化抢单() {
            自动化抢单标记 = true;
        }

        public void 关闭自动化抢单() {
            自动化抢单标记 = false;
        }

        public boolean 是否开启了自动化抢单() {
            return 自动化抢单标记;
        }

    }


    public static void main(String[] args) throws Exception {
        //new Wish后台产品修改.Swing().main();
        new 陈思强_Temu_抢单().login();
    }
}
