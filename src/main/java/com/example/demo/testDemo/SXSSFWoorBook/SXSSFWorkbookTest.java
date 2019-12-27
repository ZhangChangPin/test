package com.example.demo.testDemo.SXSSFWoorBook;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SXSSFWorkbookTest {

    public static void main(String[] args) throws IOException {

       testWriteLargeData();
    }
    public static void testWriteLargeData() throws IOException {

        SXSSFWorkbook wb = new SXSSFWorkbook();
        wb.setCompressTempFiles(true);

        SXSSFSheet sh = (SXSSFSheet) wb.createSheet("导出");
        sh.setRandomAccessWindowSize(100);// keep 100 rows in memory, exceeding rows will be flushed to disk
        List<Test> list = new ArrayList<>();
        for (int i = 0; i < 1040000; i++) {
            Test test = new Test();
            test.setName1("发电股份的股份公司风格十分购房时");
            test.setName2("发电股份的股份公司风格十分购房时");
            test.setName3("发电股份的股份公司风格十分购房时");
            test.setName4("发电股份的股份公司风格十分购房时");
            test.setName5("发电股份的股份公司风格十分购房时");
            test.setName6("发电股份的股份公司风格十分购房时");
            test.setName7("发电股份的股份公司风格十分购房时");
            test.setName8("发电股份的股份公司风格十分购房时");
            test.setName9("发电股份的股份公司风格十分购房时");
            test.setName10("发电股份的股份公司风格十分购房时");
            list.add(test);
        }
        Date start = new Date();
        for(int rownum = 0; rownum < list.size(); rownum++){
            SXSSFRow row = sh.createRow(rownum);
            row.createCell(0).setCellValue(list.get(rownum).getName1());
            row.createCell(1).setCellValue(list.get(rownum).getName2());
            row.createCell(2).setCellValue(list.get(rownum).getName3());
            row.createCell(3).setCellValue(list.get(rownum).getName4());
            row.createCell(4).setCellValue(list.get(rownum).getName5());
            row.createCell(5).setCellValue(list.get(rownum).getName6());
            row.createCell(6).setCellValue(list.get(rownum).getName7());
            row.createCell(7).setCellValue(list.get(rownum).getName8());
            row.createCell(8).setCellValue(list.get(rownum).getName9());
            row.createCell(9).setCellValue(list.get(rownum).getName10());
        }


        FileOutputStream out = new FileOutputStream("E://tempsxssf6.xlsx");
        wb.write(out);
        out.close();
        // dispose of temporary files backing this workbook on disk
        wb.dispose();
        Date end = new Date();
        System.out.println(new Date(end.getTime()-start.getTime()).getTime());
    }





}
