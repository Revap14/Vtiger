package Practice;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatecontactwithOrg {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://localhost:8888/");
		 //Implicit wait 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //Random Class
		 Random r=new Random();
		 int ranNum = r.nextInt(1000);
		 //enter UN 
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		 //enter PWD
		 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		 //Click Login Btn
		 driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		 //click on contacts
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 //click on contact look up image
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		 //enter Lastname
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
		 //clcik onm org look up image
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		 //handle window(capture all window ids)
		 Set<String> allIds = driver.getWindowHandles();
		 //navigate to particular window
		 for(String winid:allIds) {
		  String actTitle = driver.switchTo().window(winid).getTitle();
		  if(actTitle.contains("Accounts&action")) {
		   break;
		  }
		 }
		 driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("Infosys");
		 driver.switchTo().window("");
		 //logout from application
		 
		 
		}
		}


