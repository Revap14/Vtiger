package Practice;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericUtilities.ExcelUtitlies;
import genericUtilities.JavaUtility;
import genericUtilities.PropertyUtility;
import genericUtilities.WebdriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateORGwithIndTest {
	public static void main(String[] args) throws Throwable {
		JavaUtility jutil=new JavaUtility();
		ExcelUtitlies eutil=new ExcelUtitlies();
		PropertyUtility putil=new PropertyUtility();
		WebdriverUtility wutil=new WebdriverUtility();
		Random r=new Random();
		int ran=r.nextInt(1000);
		WebDriver driver=null;
		String BROWSER = putil.readDataFromPropertyFile("Browser");
		String URL=putil.readDataFromPropertyFile("Url");
		String USERNAME = putil.readDataFromPropertyFile("Username");
		String PASSWORD = putil.readDataFromPropertyFile("Password");
		System.out.println(BROWSER+URL+USERNAME+PASSWORD);
		
		String ORGNAME = eutil.readDataFromExcel("Organization", 4, 2)+ran;
		String INDUSTRY = eutil.readDataFromExcel("Organization", 4, 3);
		
		//launch browser
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(BROWSER.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("PROPER BROWSER NAME");
		}
		wutil.maximizeWindow(driver);
		wutil.waitforPageLoad(driver);
		driver.get(URL);
		//login appp
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@id='submitButton'")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(ORGNAME);
		WebElement DROPDOWN = driver.findElement(By.xpath("//select[@name='industry']"));
		wutil.handleDropDown(INDUSTRY, DROPDOWN);
		driver.findElement(By.xpath("//input[@title='Save[Alt+S]']")).click();
		String orgHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(orgHeader.contains(ORGNAME)) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("TC is FAIL");
		}
		WebElement adImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wutil.mouseOverAction(driver,adImg );
			
			
		}
		
	}
	

