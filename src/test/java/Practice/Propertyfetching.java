package Practice;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfetching {
	public static void main(String[] args) throws Throwable {
		 //create object of FIS
		 FileInputStream fisp=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		 //create object of properties class
		 Properties p=new Properties();
		 //call load method
		 p.load(fisp);
		 //get the keys automatic values will come
		 String BROWSER = p.getProperty("Browser");
		 System.out.println(BROWSER);
		 
		 String URL = p.getProperty("Url");
		 System.out.println(URL);
		 
		 String USERNAME= p.getProperty("Username");
		 System.out.println(USERNAME);
		 
		}
		}


