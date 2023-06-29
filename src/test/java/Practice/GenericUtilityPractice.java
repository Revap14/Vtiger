package Practice;

import genericUtilities.ExcelUtitlies;
import genericUtilities.PropertyUtility;

public class GenericUtilityPractice {
public static void main(String[] args) throws Throwable {
	PropertyUtility putil=new PropertyUtility();
	String URL = putil.readDataFromPropertyFile("Url");
	System.out.println(URL);
	String USERNAME = putil.readDataFromPropertyFile("Username");
	System.out.println(USERNAME);
	String PASSWORD = putil.readDataFromPropertyFile("Password");
	System.out.println(PASSWORD);
	
	ExcelUtitlies eutil=new ExcelUtitlies();
	System.out.println(eutil.readDataFromExcel("Organization", 4, 3));
	System.out.println("hi from git hub");
}
}
