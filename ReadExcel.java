package testleaf;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] excelcode() throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./Excel/ExcelSalesforce.xlsx");
		XSSFSheet wsheet = wbook.getSheet("Sheet1");
		int rowcount = wsheet.getLastRowNum();
		int columncount = wsheet.getRow(0).getLastCellNum();
		
		String[][] data = new String [rowcount][columncount];
		
		for (int i = 1; i <=rowcount; i++) {
			
			XSSFRow row = wsheet.getRow(i);
			
			for (int j = 0; j < columncount; j++) {
				String stringCellData = row.getCell(j).getStringCellValue();
				data[i-1][j]= stringCellData;
				
		
			}	
		}

	wbook.close();
	return data;

}
	
}

