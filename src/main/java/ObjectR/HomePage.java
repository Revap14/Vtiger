package ObjectR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	@FindBy(xpath="//a[text()='Organization']")private WebElement orglink;
	@FindBy(xpath="//a[text()='Contact']")private WebElement contactLink;
	@FindBy(xpath="//a[text()='Opprtunities")private WebElement opportunityLink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.'PNG']")private WebElement adminImg;
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement signOutLink;
	//Initialization (constructor)
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	//Utilization(getters)
	
	public WebElement getOrglink() {
		return orglink;
	}
	public WebElement getContactLink() {
		return contactLink;
	}
	public WebElement getOpportunityLink() {
		return opportunityLink;
	}
	public WebElement getAdminImg() {
		return adminImg;
	}
	public WebElement getSignOutLink() {
		return signOutLink;
	}

	
	//bussiness library
	public void clickorganizationlink() {
		orglink.click();
	}
	public void clickcontactLink() {
		contactLink.click();
	}
	
		public void mouseOverAction(WebDriver driver) {
	Actions act= new Actions(driver);
	act.moveToElement(adminImg);
			signOutLink.click();
				
			}

		
		
	
	}
		
		


