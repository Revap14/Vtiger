package ObjectR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrg {
	
	//Declaration
	@FindBy(By.xpath(""))private WebElement orgText;
	@FindBy(By.xpath(""))private WebElement IndustryDropDown;
	@FindBy(By.xpath(""))private WebElement SaveBtn;
	//Initilation
	public CreateNewOrg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getOrgText() {
		return orgText;
	}
	public WebElement getIndustryDropDown() {
		return IndustryDropDown;
	}
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	//business library
	public void createNeworg(String ORGNAME,String INDUSTRY) {
		orgText.sendKeys(ORGNAME);
	handleDropDown(IndustryDropDown,INDUSTRY);
		SaveBtn.click();
			
			
		}
	}


