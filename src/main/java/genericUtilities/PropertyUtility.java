package genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	public String readDataFromPropertyFile(String key) throws Throwable {
		 FileInputStream fisp=new FileInputStream(IconstantsUtility.propertyFilePath);
		 Properties p=new Properties();
		 p.load(fisp);
		  String value = p.getProperty(key);
		  return value;
		 
		}
		}


