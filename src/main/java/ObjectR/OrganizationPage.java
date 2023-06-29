package ObjectR;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
//declaration
	@FindBy(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"))private WebElement createorgLookupImg;
	//Initialization
	public void organizationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getCreateorgLookupImg() {
		return createorgLookupImg;
	}
	public void setCreateorgLookupImg(WebElement createorgLookupImg) {
		this.createorgLookupImg = createorgLookupImg;
	}
	//business library
	public void clickorgLookupImg() {
		createorgLookupImg.click();
	}
	
}
