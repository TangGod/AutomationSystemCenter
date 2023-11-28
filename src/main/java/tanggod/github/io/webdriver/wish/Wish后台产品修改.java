package tanggod.github.io.webdriver.wish;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.openqa.selenium.*;
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
public class Wish后台产品修改 extends JooqBaseService {

    private static final String cookieValue = "[{\"domain\":\"china-merchant.wish.com\",\"httpOnly\":false,\"name\":\"bsid\",\"path\":\"/\",\"secure\":false,\"value\":\"5a68272a58ad44f49a165e858a3d60fe\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1713803807000,\"httpOnly\":false,\"name\":\"cmapi_gtm_bl\",\"path\":\"/\",\"secure\":true,\"value\":\"\"},{\"domain\":\".china-merchant.wish.com\",\"httpOnly\":false,\"name\":\"Hm_lpvt_d77c4604986365eea64acf8e8131da64\",\"path\":\"/\",\"secure\":false,\"value\":\"1680976614\"},{\"domain\":\"china-merchant.wish.com\",\"expiry\":1683568608000,\"httpOnly\":true,\"name\":\"session\",\"path\":\"/\",\"secure\":true,\"value\":\"\\\"2|1:1|10:1680976608|7:session|84:MjAyMy0wNC0wOCAxNzo1Njo0OC4yMDcyNzU0ZjY1MGI0Yi0wMmI1LTQwMDctYmFlZi1mZjFkMTQxNGVkYzU=|9a15000b0455c5809d400f3836b7e8687c2954c5b70d0c78fd6a1043c79bd27c\\\"\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1712512614000,\"httpOnly\":false,\"name\":\"Hm_lvt_d77c4604986365eea64acf8e8131da64\",\"path\":\"/\",\"secure\":false,\"value\":\"1679675807\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1713803807000,\"httpOnly\":false,\"name\":\"cmapi_cookie_privacy\",\"path\":\"/\",\"secure\":true,\"value\":\"permit 1,2,3\"},{\"domain\":\"china-merchant.wish.com\",\"expiry\":1683568608000,\"httpOnly\":true,\"name\":\"secure_session\",\"path\":\"/\",\"secure\":true,\"value\":\"\\\"2|1:1|10:1680976608|14:secure_session|84:MjAyMy0wNC0wOCAxNzo1Njo0OC4yMDczMjMwMTQxYzI3Yy0wNjY3LTRhMDUtYWM1My01YzU4ZjdjMGRmODc=|7fad53465df359b4ee698fb2296118981bfa58f55219e65d7d5425aef9d26893\\\"\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1680978410000,\"httpOnly\":false,\"name\":\"TAsessionID\",\"path\":\"/\",\"secure\":true,\"value\":\"38454e81-f065-404b-8523-87921c13874e|EXISTING\"},{\"domain\":\"china-merchant.wish.com\",\"expiry\":1696528608000,\"httpOnly\":true,\"name\":\"rd\",\"path\":\"/\",\"secure\":true,\"value\":\"\\\"2|1:1|10:1680976608|2:rd|48:NDc3MmY4OGMtMGMyMi00MWRiLWEwODItNTMyYzJjOGJjMjgw|3716a652e63e54a0df46061f19a851a31d9671ec86cd101dfcfe602fba4115bf\\\"\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1713803807000,\"httpOnly\":false,\"name\":\"notice_poptime\",\"path\":\"/\",\"secure\":true,\"value\":\"1656720000000\"},{\"domain\":\".china-merchant.wish.com\",\"httpOnly\":false,\"name\":\"notice_behavior\",\"path\":\"/\",\"secure\":true,\"value\":\"implied,eu\"},{\"domain\":\".wish.com\",\"expiry\":1712512619000,\"httpOnly\":false,\"name\":\"__zlcmid\",\"path\":\"/\",\"secure\":false,\"value\":\"1F2lhA8KF0wF42o\"},{\"domain\":\"china-merchant.wish.com\",\"httpOnly\":false,\"name\":\"timezone_name\",\"path\":\"/\",\"secure\":false,\"value\":\"Asia/Shanghai\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1713803807000,\"httpOnly\":false,\"name\":\"notice_gdpr_prefs\",\"path\":\"/\",\"secure\":true,\"value\":\"0,1,2:\"},{\"domain\":\"china-merchant.wish.com\",\"expiry\":1680977560000,\"httpOnly\":false,\"name\":\"_dd_s\",\"path\":\"/\",\"secure\":false,\"value\":\"rum=2&id=bab0faef-29ae-4be7-a10d-04594da7ffe0&created=1680976567169&expire=1680977558011\"},{\"domain\":\".china-merchant.wish.com\",\"expiry\":1713803807000,\"httpOnly\":false,\"name\":\"notice_preferences\",\"path\":\"/\",\"secure\":true,\"value\":\"2:\"},{\"domain\":\"china-merchant.wish.com\",\"httpOnly\":false,\"name\":\"_xsrf\",\"path\":\"/\",\"secure\":false,\"value\":\"2|51bc3c2b|eec667c263aff0a37668806c7b45cf98|1680976564\"}]";


    private static final PhantomJsUtil phantomJsUtil = new PhantomJsUtil();

    private static final Double defaultPrice = 55.93;
    private static final Integer defaultStock = 10;


    private static WebDriver chromeDriver;

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
        Set<Cookie> cookies = JSON.parseArray(cookieValue, Cookie.class).stream().collect(Collectors.toSet());
        addCookies(chromeDriver, cookies);
    }

    //https://www.nuomiphp.com/eplan/585486.html
    public void login() {
        chromeDriver = phantomJsUtil.getChromeDriver(false);
        chromeDriver.get("https://china-merchant.wish.com/md/login");

        cookieLogin();

        //监控按钮点击(chromeDriver);

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Swing().main(chromeDriver);

            }
        }).start();

       /* new Thread(new Runnable() {
            @Override
            public void run() {
                监控按钮();

            }
        }).start();*/
        String s = JSON.toJSONString(chromeDriver.manage().getCookies());
        System.out.println(s);

        System.out.println();

        chromeDriver.get("https://china-merchant.wish.com/md/products");
        //chromeDriver.get("https://china-merchant.wish.com/products/edit/6410144e5f6671a76dc9227f");
        //chromeDriver.get("https://china-merchant.wish.com/products/edit/641ce82fa4f60f4d544df5c9");
        // chromeDriver.quit();
    }

    public static void 输入休眠(Integer value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void 输入sku列表(String size, String color) {
        WebDriverWait wait_0 = new WebDriverWait(chromeDriver, 30L);
        wait_0.until(ExpectedConditions.presenceOfElementLocated(By.className("root_1o642ef-o_O-addVariation_1jy5bph")));
        System.out.println("等待完成!");
        //点击添加变体
        chromeDriver.findElement(By.className("root_1o642ef-o_O-addVariation_1jy5bph ")).click();
        while (true) {
            List<WebElement> 新增变体表单 = chromeDriver.findElements(By.className("inputBase_1hyxqsc-o_O-input_sqerl5 "));
            if (11 == 新增变体表单.size()) {
                break;
            }
        }

        List<WebElement> 新增变体表单 = chromeDriver.findElements(By.className("inputBase_1hyxqsc-o_O-input_sqerl5 "));
        //输入颜色
        新增变体表单.get(7).sendKeys(String.valueOf(color));
        输入休眠(33);
        //输入尺码
        新增变体表单.get(8).sendKeys(String.valueOf(size));
        输入休眠(33);
        //输入价格
        新增变体表单.get(9).sendKeys(String.valueOf(defaultPrice));
        输入休眠(33);
        //输入库存
        chromeDriver.findElement(By.cssSelector(".root_3hmsj .root_1vdfesj.field_tl9kbc  .input_v18ser[type='number']")).sendKeys(String.valueOf(defaultStock));
        输入休眠(33);
        //输入SKU
        //新增变体表单.get(10).sendKeys(chromeDriver.findElement(By.cssSelector("input[placeholder='输入唯一标识符，对变体进行分组']")).getAttribute("value") + "-" + 新增变体表单.get(1).getAttribute("value") + "-" + 新增变体表单.get(0).getAttribute("value"));
        新增变体表单.get(10).sendKeys(chromeDriver.findElement(By.cssSelector("input[placeholder='输入唯一标识符，对变体进行分组']")).getAttribute("value") + "-" + size + "-" + color);
        //输入休眠(50);

        //点击其他元素触发保存按钮
        新增变体表单.get(9).click();
        //输入休眠(55);

        //save
        //WebDriverWait wait_1 = new WebDriverWait(chromeDriver, 30L);
        //wait_1.until(ExpectedConditions.presenceOfElementLocated(By.className("root_u01hsb-o_O-rootEnabled_1d8zzey")));

        //WebDriverWait wait_2 = new WebDriverWait(chromeDriver, 30L);
        //wait_2.until(ExpectedConditions.presenceOfElementLocated(By.className("textContainer_36rlri")));

        chromeDriver.findElement(By.className("root_u01hsb-o_O-rootEnabled_1d8zzey")).findElement(By.className("textContainer_36rlri")).click();
        //输入休眠(10);
        //$(".modalContent_s0gvl3-o_O-contentEntrance_vii0gb img").eq(1).click();

    }

    public static void 输入图片(String color, String size, Integer index) {
        List<WebElement> imageElements = chromeDriver.findElements(By.cssSelector(".table_4edxay .root_1suy1th img[alt='变体图片']"));//chromeDriver.findElements(By.cssSelector(".cell_6gp2uv[data-cy='image']"));
        List<WebElement> colorElements = chromeDriver.findElements(By.cssSelector(".cell_6gp2uv[data-cy='column-custom-color'] div"));
        List<WebElement> sizeElements = chromeDriver.findElements(By.cssSelector(".cell_6gp2uv[data-cy='column-custom-variation'] div"));

        搜索指定的sku元素_image(imageElements, colorElements, sizeElements, color, size, index);
        System.out.println();
    }

    public static void 搜索指定的sku元素_image(List<WebElement> imageElements, List<WebElement> colorElements, List<WebElement> sizeElements
            , String color, String size, Integer index) {
        for (int i = 0; i < colorElements.size(); i++) {
            String colorValue = colorElements.get(i).getText();
            if (colorValue.equalsIgnoreCase(color)) {
                if (sizeElements.get(i).getText().equalsIgnoreCase(size)) {
                    //找到坐标 开始执行替换图片
                    WebElement imageElement = imageElements.get(i);

                    try {
                        imageElement.click();
                    } catch (Exception e) {
                        finallyTask(() -> {
                            phantomJsUtil.scrollTop(chromeDriver, 1);
                            imageElement.click();
                        });
                    }

                    //输入休眠(60);

                    chromeDriver.findElements(By.cssSelector(".image_1mzvnzn ")).get(index).click();

                    //close
                    // 输入休眠(60);
                    chromeDriver.findElement(By.cssSelector(".style_1co73if ")).click();
                    System.out.println();
                }
            }
        }

    }

    static class Swing {
        private WebDriver chromeDriver;

        private static List<String> colorList = new ArrayList<>();
        private static List<String> sizeList = new ArrayList<>();
        private static Map<String, Integer> imageIndexMap = new HashMap<>();

        public static boolean isSize(String value) {
            return new HashSet<>(sizeList).contains(value);
        }

        public static boolean isColor(String value) {
            return new HashSet<>(colorList).contains(value);
        }

        public void 创建复选框(JPanel jp, JFrame frame, GridBagConstraints gbc) {
            JLabel label = new JLabel("颜色：");
            label.setFont(new Font("楷体", Font.BOLD, 16)); //修改字体样式

            JLabel label2 = new JLabel("尺码：");
            label2.setFont(new Font("楷体", Font.BOLD, 16)); //修改字体样式

            colorList.add("Grey");
            colorList.add("Black");
            colorList.add("White");
            colorList.add("Green");
            colorList.add("Navy Blue");
            colorList.add("Light Grey");
            colorList.add("Red");
            colorList.add("Wine red");
            colorList.add("Royal Blue");
            colorList.add("Dark Gray");
            colorList.add("Yellow");
            colorList.add("Pink");

            imageIndexMap.put("Grey", 2);
            imageIndexMap.put("Light Grey", 2);
            imageIndexMap.put("Pink", 3);
            imageIndexMap.put("Green", 4);
            imageIndexMap.put("Royal Blue", 5);
            imageIndexMap.put("Black", 6);
            imageIndexMap.put("Dark Gray", 7);
            imageIndexMap.put("White", 8);
            imageIndexMap.put("Navy Blue", 9);
            imageIndexMap.put("Wine red", 10);
            imageIndexMap.put("Yellow", 11);
            imageIndexMap.put("Red", 12);


            sizeList.add("XS");
            sizeList.add("S");
            sizeList.add("M");
            sizeList.add("L");
            sizeList.add("XL");
            sizeList.add("XXL");
            sizeList.add("XXXL");
            sizeList.add("XXXXL");

            jp.add(label, gbc);

            colorList.stream().forEach(color -> {
                JCheckBox chkbox = new JCheckBox(color, false); //创建指定文本和状态的复选框
                jp.add(chkbox, gbc);
            });

            jp.add(label2, gbc);

            sizeList.stream().forEach(size -> {
                JCheckBox chkbox = new JCheckBox(size, false); //创建指定文本和状态的复选框
                jp.add(chkbox, gbc);
            });
        }

        //https://baijiahao.baidu.com/s?id=1747575535472922885&wfr=spider&for=pc
        public JButton 创建按钮(JPanel jp, JFrame frame, GridBagConstraints gbc) {
            JLabel label = new JLabel("操作：");
            label.setFont(new Font("楷体", Font.BOLD, 16)); //修改字体样式
            jp.add(label, gbc);

            JButton jButton = new JButton("生成选中的sku信息");
            jp.add(jButton, gbc);

            JButton jButton2 = new JButton("生成图片");
            jp.add(jButton2, gbc);

            //监听
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JSONObject 获取颜色与尺码信息 = 获取颜色与尺码信息(jp);
                    System.out.println(获取颜色与尺码信息.toJSONString());

                    JSONArray colorList = 获取颜色与尺码信息.getJSONArray("colorList");
                    JSONArray sizeList = 获取颜色与尺码信息.getJSONArray("sizeList");

                    //新建尺码
                    colorList.stream().forEach(color -> {
                        sizeList.stream().forEach(size -> {
                            输入sku列表(String.valueOf(size), String.valueOf(color));
                        });
                        System.out.println();
                    });
                }
            });

            //监听
            jButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JSONObject 获取颜色与尺码信息 = 获取颜色与尺码信息(jp);
                    System.out.println(获取颜色与尺码信息.toJSONString());

                    JSONArray colorList = 获取颜色与尺码信息.getJSONArray("colorList");
                    JSONArray sizeList = 获取颜色与尺码信息.getJSONArray("sizeList");

                    //新建尺码
                    colorList.stream().forEach(color -> {
                        phantomJsUtil.scrollTop(chromeDriver, 1);
                        sizeList.stream().forEach(size -> {
                            输入图片(String.valueOf(color), String.valueOf(size), imageIndexMap.get(color));
                        });
                        System.out.println();
                    });
                }
            });
            return jButton;
        }

        public void main(WebDriver chromeDriver) {
            this.chromeDriver = chromeDriver;
            JFrame frame = new JFrame("wish后台SKU创建"); //创建Frame窗口
            JPanel jp = new JPanel(); //创建面板

            //https://blog.csdn.net/weixin_36378347/article/details/114594090
            jp.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;


            创建复选框(jp, frame, gbc);
            创建按钮(jp, frame, gbc);


            frame.add(jp);
            frame.setBounds(800, 800, 800, 800);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

        public static JSONObject 获取颜色与尺码信息(JPanel jp) {
            //https://blog.csdn.net/weixin_39996742/article/details/114853865
            //查看复选框值
            //通过面板属性名获取到该面板上的所有组件

            JSONObject response = new JSONObject();
            response.put("sizeList", new JSONArray());
            response.put("colorList", new JSONArray());

            Arrays.stream(jp.getComponents()).forEach(data -> {
                //通过 instanceof方法筛选复选框组件
                if (data instanceof JCheckBox) {
                    //判断复选框组件是否被选中
                    if (((JCheckBox) data).isSelected()) {
                        String text = ((JCheckBox) data).getText();
                        System.out.println(text);
                        if (isSize(text)) {
                            response.getJSONArray("sizeList").add(text);
                        } else if (isColor(text)) {
                            response.getJSONArray("colorList").add(text);

                        }
                    }
                }

            });
            return response;
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
        new Wish后台产品修改().login();
    }
}
