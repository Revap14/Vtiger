package genericUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtitlies {
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		 FileInputStream fise=new FileInputStream(IconstantsUtility.excelPath);
		 Workbook wb = WorkbookFactory.create(fise);
		 String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		 wb.close();
		 return value;
		}
		}


