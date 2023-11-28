package tanggod.github.io.webdriver.excel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TangGod on 2018/10/31.
 */
public class Joom {

    private static final String joomTemplatePath = "/Users/tanggod/template_joom.xlsx";
    private static final String joomTemplatePath_test = "/Users/tanggod/test.xlsx";


    public static void convertWishExport(List<String[]> strings) {
        List<WishDto> wishDtoList = new ArrayList<>();
        try {
            wishDtoList = convertWishDto(strings);
        } catch (Exception e) {
            e.printStackTrace();
        }


        XSSFWorkbook xssfWorkbook = returnWorkBookGivenFileHandle();
        int numberOfSheets = xssfWorkbook.getNumberOfSheets();
        //获取第一个表
        String sheetName = xssfWorkbook.getSheetName(0);
        XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);

        // 指定行索引，创建一行数据, 行索引为当前最后一行的行索引 + 1
        int currentLastRowIndex = sheet.getLastRowNum();
        int newRowIndex = currentLastRowIndex + 1;

        for (int i = 0; i < wishDtoList.size(); i++) {
            //获得总列数
            //int coloumNum = sheet.getRow(0).getPhysicalNumberOfCells();
            WishDto wishDto = wishDtoList.get(i);

            XSSFRow newRow = sheet.createRow(newRowIndex);

            // 开始创建并设置该行每一单元格的信息，该行单元格的索引从 0 开始
            int cellIndex = 0;

            // 创建一个单元格，设置其内的数据格式为字符串，并填充内容，其余单元格类同

            XSSFCell ParentSKU = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            ParentSKU.setCellValue(wishDto.getParentSKU());

            XSSFCell SKU = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            SKU.setCellValue(wishDto.getSKU());

            XSSFCell 产品名称 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            产品名称.setCellValue(wishDto.get产品名称());

            XSSFCell 产品描述 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            产品描述.setCellValue(wishDto.get产品描述());

            XSSFCell 产品标签 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            产品标签.setCellValue(wishDto.get产品标签());

            XSSFCell 品牌 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            品牌.setCellValue(wishDto.get品牌());

            XSSFCell 敏感货类型 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            敏感货类型.setCellValue("普通货");

            XSSFCell UPC = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            UPC.setCellValue(wishDto.getUPC());

            XSSFCell landingPageUrl = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            landingPageUrl.setCellValue(wishDto.getLandingPageUrl());

            XSSFCell msrp = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            msrp.setCellValue(wishDto.getMsrp());

            XSSFCell 颜色 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            颜色.setCellValue(wishDto.get颜色());

            XSSFCell 尺寸值 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            尺寸值.setCellValue(wishDto.get尺寸值());

            XSSFCell 来源url = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            来源url.setCellValue(wishDto.get来源url());

            XSSFCell 价格 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            价格.setCellValue(wishDto.get价格());


            XSSFCell 运费 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            运费.setCellValue(wishDto.get运费());

            XSSFCell 库存量 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            库存量.setCellValue(wishDto.get库存量());

            XSSFCell 最小送达时间 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            最小送达时间.setCellValue(wishDto.get最小送达时间());

            XSSFCell 最大送达时间 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            最大送达时间.setCellValue(wishDto.get最大送达时间());

            XSSFCell 报关金额 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            报关金额.setCellValue(wishDto.get价格());

            XSSFCell 海关编码 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            海关编码.setCellValue("");

            XSSFCell 长度 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            长度.setCellValue("");

            XSSFCell 宽度 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            宽度.setCellValue("");

            XSSFCell 高度 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            高度.setCellValue("");

            XSSFCell 重量 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            重量.setCellValue("0.3");

            XSSFCell 主图URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            主图URL地址.setCellValue(wishDto.get主图URL地址());

            XSSFCell 变种图图URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            变种图图URL地址.setCellValue(wishDto.get主图URL地址());

            XSSFCell 附图1URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图1URL地址.setCellValue(wishDto.get附图1URL地址());

            XSSFCell 附图2URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图2URL地址.setCellValue(wishDto.get附图2URL地址());

            XSSFCell 附图3URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图3URL地址.setCellValue(wishDto.get附图3URL地址());

            XSSFCell 附图4URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图4URL地址.setCellValue(wishDto.get附图4URL地址());

            XSSFCell 附图5URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图5URL地址.setCellValue(wishDto.get附图5URL地址());

            XSSFCell 附图6URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图6URL地址.setCellValue(wishDto.get附图6URL地址());

            XSSFCell 附图7URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图7URL地址.setCellValue(wishDto.get附图7URL地址());

            XSSFCell 附图8URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图8URL地址.setCellValue(wishDto.get附图8URL地址());

            XSSFCell 附图9URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图9URL地址.setCellValue(wishDto.get附图9URL地址());

            XSSFCell 附图10URL地址 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            附图10URL地址.setCellValue(wishDto.get附图10URL地址());


           /* XSSFCell newNameCell_7 = newRow.createCell(cellIndex++, Cell.CELL_TYPE_STRING);
            newNameCell_7.setCellValue(wishDto.getSKU());*/
            newRowIndex++;

        }


        File file = new File(joomTemplatePath_test);
        if (file.isFile())
            file.delete();

        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(joomTemplatePath_test);
            xssfWorkbook.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("");

    }

    private static List<WishDto> convertWishDto(List<String[]> strings) throws Exception {
        List<WishDto> wishDtoList = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            String[] rowResult = strings.get(i);

            WishDto wishDto = new WishDto();
            Field[] fields = wishDto.getClass().getDeclaredFields();
            System.out.println("1 : " + fields.length + "2: " + rowResult.length);
            for (int j = 0; j < rowResult.length; j++) {
                String columnValue = rowResult[j];
                Field field = fields[j];
                field.setAccessible(true);
                field.set(wishDto, columnValue);

            }
            wishDtoList.add(wishDto);
        }

        return wishDtoList;
    }

    public static void main(String[] args) {
        Joom joom = new Joom();
        //joom.convertWishExport();
    }

    /**
     * 得到一个已有的工作薄的POI对象
     *
     * @return
     */
    private static XSSFWorkbook returnWorkBookGivenFileHandle() {
        XSSFWorkbook wb = null;
        FileInputStream fis = null;
        File f = new File(joomTemplatePath);
        try {
            if (f != null) {
                fis = new FileInputStream(f);
                wb = new XSSFWorkbook(fis);
            }
        } catch (Exception e) {
            return null;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return wb;
    }
}
