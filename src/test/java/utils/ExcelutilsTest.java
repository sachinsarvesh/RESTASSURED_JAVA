package utils;

public class ExcelutilsTest {
    public static void main(String[] args)
    {
        String file_path = "./data/REST_testing.xlsx";
        String sheet_name = "Sheet1";

        ExcelUtils excel = new ExcelUtils(file_path, sheet_name);

        excel.getRowCount();
        excel.getCellData(1,2);

    }

}
