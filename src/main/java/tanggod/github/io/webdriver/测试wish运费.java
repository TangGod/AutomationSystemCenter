package tanggod.github.io.webdriver;

import java.math.BigDecimal;

/**
 * Created by TangGod on 2023/5/23.
 */
public class 测试wish运费 {
    private static void 测试运费(Double 利润, Double 运费) {
        //产品价格+产品运费+产品利润  - (产品成本+产品运费)
        double 基础定价 = 22.98;
        double 产品定价 = (基础定价 + 运费 + 利润) / 0.85;
        double 不折扣毛利润 = 产品定价 * 0.84 - (11 + 运费);
        double 折扣毛利润 = 产品定价 * 0.85 * 0.84 - (11 + 运费);
        double 运费模版运费 = 产品定价 - 基础定价;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("产品定价（RMB）：" + 四舍五入(产品定价));
        System.out.println("产品定价（USD）：" + 四舍五入((产品定价 / 7)));
        System.out.println();

        System.out.println("不折扣毛利润（RMB）：" + 四舍五入(不折扣毛利润));
        System.out.println("折扣毛利润（RMB）：" + 四舍五入(折扣毛利润));
        System.out.println();

        System.out.println("运费模版运费（RMB）：" + 四舍五入(运费模版运费));
        System.out.println("运费模版运费（USD）：" + 四舍五入(运费模版运费 / 7));

    }

    public static double 四舍五入(double value) {
        return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double 四舍五入(double value, Integer 小数点) {
        return new BigDecimal(value).setScale(小数点, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        new 测试wish运费().测试运费(17D, 41.43);

    }
}
