package ObjectR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {
//Declaration
	@FindBy(By.xpath("//input[@name='accountname']"))private WebElement OrgHeaderTxt;
	//Initialization
	public OrgInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getOrgHeaderTxt() {
		return OrgHeaderTxt;
	}

//business library
public void createOrgInfoPage() {
	orgHeaderTxt.s
}
	
	
}
