package ObjectR;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//identify by locators
	@FindBy() private WebElement untxt;
	@FindBy() private  WebElement pwdtxt;
	@FindBy() private WebElement loginbtn;
//create constructor
public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver,this );
}
	//provide getters
public WebElement getUntxt() {
	return untxt;
}
public WebElement getPwdtxt() {
	return pwdtxt;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
//business logic
public void LoginApp(String USERNAME,String PASSWORD) {
	untxt.sendKeys(USERNAME);
	pwdtxt.sendKeys(PASSWORD);
	loginbtn.click();;
}

}

