package Practice;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelfetching {
	public static void main(String[] args) throws Throwable {
		 //Create object of FIS
		 FileInputStream fise=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		 //create method from workbook factpry
		 Workbook wb = WorkbookFactory.create(fise);
		 //getsheet
		  org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Organization");
		 //navigate to row
		 String ORGNAME = sh.getRow(1).getCell(2).getStringCellValue();
		 System.out.println(ORGNAME);
		}
		}


