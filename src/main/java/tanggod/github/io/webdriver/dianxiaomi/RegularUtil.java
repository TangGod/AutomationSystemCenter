package tanggod.github.io.webdriver.dianxiaomi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/*
 *正则类
 *@author teddy
 *@date 2018/1/30
 */
public enum RegularUtil {
    getMethods;

    //中国香港手机号码8位数，5|6|8|9开头+7位任意数
    private static final String HK_PHONE_REGEXP = "^(5|6|8|9)\\d{7}$";
    private static final Pattern HK_PHONE_REGEXP_PATTERN = Pattern.compile(HK_PHONE_REGEXP);

    /**
     * 中国大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数
     * 此方法中前三位格式有：
     * 13+任意数
     * 15+除4的任意数
     * 18+任意数
     * 17+除9的任意数
     * 147
     * 144 厚爱专用
     */
    private static final String CHINA_PHONE_REGEXP = "^((13[0-9])|(15[^4])|(18[0-9])|(17[0-8])|(147)|(144))\\d{8}$";
    private static final Pattern CHINA_PHONE_REGEXP_PATTERN = Pattern.compile(CHINA_PHONE_REGEXP);

    //时间
    public static final String FORMAT_DATE_1 = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String FORMAT_DATE_2 = "yyyy-MM-dd";
    public static final String FORMAT_DATE_3 = "yyyy-MM-dd HH:mm:ss";
    private static final Map<String, SimpleDateFormat> DATE_FORMAT_MAP = new HashMap<>();

    public String dateFormat(String format, Date date) {
        checkDateFormatMap(format);
        SimpleDateFormat dateFormat = DATE_FORMAT_MAP.get(format);
        return dateFormat.format(date);
    }

    public Date dateParse(String format, String date) {
        checkDateFormatMap(format);
        SimpleDateFormat dateFormat = DATE_FORMAT_MAP.get(format);
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    private void checkDateFormatMap(String format) {
        if (!DATE_FORMAT_MAP.containsKey(format)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            DATE_FORMAT_MAP.put(format, dateFormat);
        }
    }

    /**
     * 校验中国的手机号格式是否正确
     *
     * @param str
     * @return
     */
    public boolean checkPhone(String str) {
        return isChinaPhoneLegal(str) || isHKPhoneLegal(str);
    }

    /**
     * 中国大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数
     * 此方法中前三位格式有：
     * 13+任意数
     * 15+除4的任意数
     * 18+任意数
     * 17+除9的任意数
     * 147
     * 144 厚爱专用
     */
    public boolean isChinaPhoneLegal(String str) {
        return CHINA_PHONE_REGEXP_PATTERN.matcher(str).matches();
    }

    /**
     * 中国香港手机号码8位数，5|6|8|9开头+7位任意数
     */
    public boolean isHKPhoneLegal(String str) {
        return HK_PHONE_REGEXP_PATTERN.matcher(str).matches();
    }

/*    public static void main(String[] args) {
        //固定为144开头
        String prePhoneNumber = "144";
        //随机8位数尾号
        int tallNumber =new Random().nextInt(89999999)+10000000;
        //TODO 此处需要校验映射表中是否有当前手机号
        String phoneNumber = prePhoneNumber + String.valueOf(tallNumber);
        System.out.println(phoneNumber);
        boolean result = RegularUtil.getMethods.isChinaPhoneLegal(phoneNumber);
        System.out.println(phoneNumber+"> > > "+result);

    }*/

    // _获取指定时间的一小时之前的时间
    public Date getTheTimeBeforeTheHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR,
                calendar.get(Calendar.HOUR) - 1);// 让日期减1
        //System.out.println(calendar.get(Calendar.DATE));// 加1之后的日期Top
        //System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS").format(calendar.getTime()));
        return calendar.getTime();
    }

/*    public static void main(String[] args) {
        //1
        long time_1 = RegularUtil.getMethods.getTheTimeBeforeTheHour(new Date()).getTime();
        //2
        long time_2 = RegularUtil.getMethods.getTheTimeBeforeTheHour(new Date()).getTime();
        System.out.println(time_2>time_1);
    }*/
}
