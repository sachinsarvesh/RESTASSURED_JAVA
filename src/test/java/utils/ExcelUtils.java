package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String file_path, String sheet_name){

        try{
            workbook = new XSSFWorkbook(file_path);
            sheet = workbook.getSheet(sheet_name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public void getRowCount(){

            int row_count = sheet.getPhysicalNumberOfRows();
            System.out.println("No of rows : " + row_count);

    }

    public void getCellData(int row_num, int col_num){

        DataFormatter dataFormatter = new DataFormatter();
        Object value = dataFormatter.formatCellValue(sheet.getRow(row_num).getCell(col_num));
        // String value = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println("value : " + value);

    }
}
