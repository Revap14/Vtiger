package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebdriverUtility {
	/**
	 * @author revat
	 * @param driver
	 */
	public void waitforPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	/**
	 * @author revat
	 * @param driver
	 */
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * @author revat
 * @param driver
 * @param element
 */


public void handleDropDown(WebElement element, int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
	
}
/**
 * @author revat
 * @param element
 * @param value
 */
public void handleDropDown(WebElement element, String value) {
	Select s=new Select(element);
	s.selectByValue(value);
}
/**
 * @author revat
 * @param visibleText
 * @param element
 */
public void handleDropDown( String visibleText,WebElement element) {
	Select s=new Select(element);
	s.selectByVisibleText(visibleText);
}
public void mouseOverAction(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
act.moveToElement(element).perform();
	
}
/**
 * @author revat
 * @param driver
 */
 public void rightClickonWebpage(WebDriver driver) {
	 Actions act= new Actions(driver);
	act.contextClick().perform();
	
}
 /**
  * @author revat
  * @param driver
  * @param element
  */
 public void rightClickonParticularElementofWebpage(WebDriver driver, WebElement element) {
	 Actions act=new Actions(driver);
	 act.contextClick(element).perform();
 }
 /**
  * @author revat
  * @param driver
  */
 public void doubleClickonWebpage(WebDriver driver) {
	 Actions act=new Actions(driver);
	 act.doubleClick().perform();
 }
 public void doubleClickonParticularElement(WebDriver driver, WebElement element) {
	 Actions act=new Actions(driver);
	 act.doubleClick(element).perform();
 }
public void draganddropAction(WebDriver driver, WebElement screlement, WebElement targetelement) {
	Actions act=new Actions(driver);
	act.dragAndDrop(screlement, targetelement).perform();
}
public void switchToFrame(WebDriver driver, int index) {
	driver.switchTo().frame(index);
}
public void switchToFrame(WebDriver driver, String nameorId) {
	driver.switchTo().frame(nameorId);
}
public void switchToFrame(WebDriver driver, WebElement element) {
	driver.switchTo().frame(element);
}
public void switchToParentFrame(WebDriver driver) {
driver.switchTo().parentFrame();
}
public void switchtoDefaultFrame(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void acceptAlter(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void dissmissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
public String getAlertText(WebDriver driver) {
	return driver.switchTo().alert().getText();
}
public String takesScreenshot(WebDriver driver, String screenshotName) throws Throwable {
	TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dest=new File(".\\Screenshot"+screenshotName+".png");
 Files.copy(src, dest);
  return dest.getAbsolutePath();

}
public void scrollAction(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window", "scrollby(0,500)");
}
public void switchToWindow(WebDriver driver, String partialTitle) {
	//capture window
	Set<String> winIDS = driver.getWindowHandles();
	//navigate each window
	for(String winID:winIDS) {
		//capture title of window
		String actTitle = driver.switchTo().window(winID).getTitle();
		//compare partial title and actual title
		if(actTitle.contains(partialTitle));
		break;
	}
	
	

}
}	
	
