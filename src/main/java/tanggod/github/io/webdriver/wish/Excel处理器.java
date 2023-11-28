package tanggod.github.io.webdriver.wish;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.*;
import tanggod.github.io.webdriver.IdWorkerUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * https://blog.csdn.net/leadseczgw01/article/details/124040977
 * https://blog.csdn.net/weixin_47534665/article/details/106856826
 * Created by TangGod on 2023/4/4.
 */
public class Excel处理器 {

    static class ExcelUtil {

        /**
         * <一句话功能简述> excel插入图片
         * <功能详细描述>
         * author: zhanggw
         * 创建时间:  2022/5/25
         *
         * @param book             poi book对象
         * @param drawingPatriarch 用于图片插入Represents a SpreadsheetML drawing
         * @param rowIndex         图片插入的单元格第几行
         * @param colIndex         图片插入的单元格第几列
         * @param localPicPath     本地图片路径
         */
        public static void insertExcelPic(XSSFWorkbook book, XSSFDrawing drawingPatriarch, int rowIndex, int colIndex, String localPicPath) throws IOException {
            // 获取图片后缀格式
            String fileSuffix = localPicPath.substring(localPicPath.lastIndexOf(".") + 1);
            fileSuffix = fileSuffix.toLowerCase();

            // 将图片写入到字节数组输出流中
            BufferedImage bufferImg;
            ByteArrayOutputStream picByteOut = new ByteArrayOutputStream();
            bufferImg = ImageIO.read(new File(localPicPath));
            ImageIO.write(bufferImg, fileSuffix, picByteOut);

            // 将图片字节数组输出流写入到excel中
            XSSFClientAnchor anchor = new XSSFClientAnchor(12, 3, 0, 0,
                    (short) colIndex, rowIndex, (short) colIndex + 1, rowIndex + 1);
            anchor.setAnchorType(ClientAnchor.AnchorType.MOVE_AND_RESIZE);
            drawingPatriarch.createPicture(anchor, book.addPicture(picByteOut.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
            picByteOut.close();
        }

        public static boolean downloadPic(String httpUrlPath, String localPath, boolean forceDownload) {
            try {
                //logger.trace("开始下载文件{}到{}", httpUrlPath, localPath);
                String suffix = localPath.substring(localPath.lastIndexOf(".") + 1);
                if (suffix.equalsIgnoreCase("jpg") || suffix.equalsIgnoreCase("png")) {
                    if (new File(localPath).isFile()) {
                        if (forceDownload) {
                            new File(localPath).delete();
                        } else {
                            //logger.trace("{}图片缓存，不下载!", localPath);
                            System.out.println("图片缓存，不下载!");
                            return true;
                        }
                    }

                    boolean ret = download(httpUrlPath, localPath);
                    if (ret) {
                        //logger.trace("下载文件{}到{}成功", httpUrlPath, localPath);
                        System.out.println("下载文件失败");
                        return true;
                    } else {
                        //logger.debug("下载文件{}到{}失败", httpUrlPath, localPath);
                        System.out.println("下载文件失败");
                    }
                }
            } catch (Exception e) {
                //logger.error("下载图片异常"+httpUrlPath, e);
                System.out.println("下载图片异常");
            }
            return false;
        }

        // 通过url下载图片保存到本地
        public static boolean download(String urlString, String localPath) {
            try {
                // 构造URL
                URL url = new URL(urlString);
                // 打开连接
                URLConnection con = url.openConnection();
                // 输入流
                InputStream is = con.getInputStream();
                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流
                File file = new File(localPath);
                FileOutputStream os = new FileOutputStream(file, true);
                // 开始读取
                while ((len = is.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
                // 完毕，关闭所有链接
                os.close();
                is.close();
                return true;
            } catch (Exception e) {
                //logger.error("下载图片到本地异常!", e);
                System.out.println("下载图片到本地异常!");
            }
            return false;
        }
    }

    public static void 生成excel(JSONObject jsonObject) throws Exception {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("sheet名称");

        ArrayList<Integer> index = new ArrayList<>();
        jsonObject.keySet().stream().forEach(key -> {
            JSONObject jsonObject1 = jsonObject.getJSONObject(key);
            String 数量 = jsonObject1.getString("数量");
            String 图片 = jsonObject1.getString("图片");
            String skuName = key;

            XSSFRow xssfRow; // 行
            XSSFCell xssfCell; // 列
            CellStyle redStyle = xssfWorkbook.createCellStyle();
            CellStyle redStyle2 = xssfWorkbook.createCellStyle();

            redStyle.setAlignment(HorizontalAlignment.CENTER); // 居中
            redStyle2.setAlignment(HorizontalAlignment.CENTER); // 居中

            // 2、在sheet中创建行，注意判断 第一行是否已经创建，否则会覆盖之前的数据
            xssfRow = xssfSheet.getRow(index.size());
            if (xssfRow == null) {
                xssfRow = xssfSheet.createRow(index.size());
            }
            xssfRow.setHeight((short) (100 * 50));
            xssfSheet.setColumnWidth(0, 12000);
            xssfSheet.setColumnWidth(1, 12000);
            // 3、创建单元格
            xssfCell = xssfRow.createCell(1);
            // 4、设置单元格内容
            xssfCell.setCellStyle(redStyle2);
            xssfCell.setCellValue(skuName);

            // 3、创建单元格
            xssfCell = xssfRow.createCell(2);
            xssfCell.setCellStyle(redStyle);


            //https://blog.csdn.net/weixin_38405253/article/details/125650393
            // 设置字体
            XSSFFont font = xssfWorkbook.createFont();
            //颜色
            font.setColor(Font.COLOR_RED);
            //设置字体大小
            font.setFontHeightInPoints((short) 10);
            //字体
            //redFont.setFontName("宋体");
            redStyle.setFont(font);
            xssfCell.setCellStyle(redStyle);
            //https://wenku.baidu.com/view/8f29950a4873f242336c1eb91a37f111f1850d26.html?_wkts_=1681095827365&bdQuery=poi%E8%AE%BE%E7%BD%AE%E5%88%97%E5%B1%85%E4%B8%AD

            // 4、设置单元格内容
            xssfCell.setCellValue(数量);


            XSSFDrawing drawingPatriarch = xssfSheet.createDrawingPatriarch(); // 插入图片
            try {
                if (图片.contains("contestimg.wish.com")) {
                    图片 = 图片.replace("https://contestimg.wish.com", "http://canary.contestimg.wish.com");
                }
                String fileImage = "/Users/tanggod/fileList/downLoad/" + IdWorkerUtils.getInstance().createUUID() + ".jpg";
                boolean b = ExcelUtil.downloadPic(图片
                        , fileImage, false);
                System.out.println(b);
                System.out.println(图片);
                System.out.println(fileImage);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ExcelUtil.insertExcelPic(xssfWorkbook, drawingPatriarch, index.size(), 0, fileImage);
            } catch (Exception e) {
                e.printStackTrace();
            }

            index.add(0);

            System.out.println();
        });


        FileOutputStream fos = new FileOutputStream("/Users/tanggod/fileList/downLoad/12345.xlsx");
        xssfWorkbook.write(fos);


        System.out.println();
    }

    public static void main(String[] args) throws Exception {
     /*   boolean b = ExcelUtil.downloadPic("https://canary.contestimg.wish.com/api/webimage/63fdc6acd5e0e7b17306b29a-large.jpg?cache_buster=2c6e0f9da321e755316e183ad6339184"
                , "/Users/tanggod/fileList/downLoad/1.jpg", false);
        System.out.println(b);*/
        new Excel处理器().生成excel(JSON.parseObject("{\"system-1677566674-white\":{\"数量\":37,\"图片\":\"http://productimage-1251220924.picgz.myqcloud.com/productimage/23249312857600641/0/20230308152326/4873659a370a5f87f3d968d72501b1f3.jpg\"},\"system-1677487261-white\":{\"数量\":2,\"图片\":\"http://productimage-1251220924.picgz.myqcloud.com/productimage/23249312857600713/0/20230308152327/428fbc3b120fb538e67d2e289a57cbf7.jpg\"},\"system-1678325992-white\":{\"数量\":1,\"图片\":\"https://contestimg.wish.com/api/webimage/61af04ffb946f6b1b1e5618e-.jpg\"}}"));

      /*  boolean b = ExcelUtil.downloadPic("http://contestimg.wish.com/api/webimage/61af04ffb946f6b1b1e5618e-.jpg"
                , "/Users/tanggod/fileList/downLoad/1.jpg", false);
        System.out.println(b);*/
    }
}
