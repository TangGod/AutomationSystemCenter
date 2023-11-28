package tanggod.github.io.webdriver.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TangGod on 2018/12/5.
 */
public class TestSort {


    public void runApp() {
        String s1 = "2017-08-13 22:18:22";
        String s2 = "2017-08-12 22:18:22";
        String s3 = "2017-08-11 22:19:22";
        List<String> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new->old排序，首先将字符型的日期转换为日期类型。
        arr.sort((a1, a2) -> {
            try {
                return df.parse(a2).compareTo(df.parse(a1));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return 1;
        });

        arr.stream().forEach(data-> System.out.println(data));

    }

    public static void main(String[] args) {
        new TestSort().runApp();
    }

}
