package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeviceList {
	
	private WebDriver driver;

	public DeviceList(WebDriver driver) {
		this.driver = driver;
	}

	By txtListname = By.id("unitlist-name");
	By txtOrgName =  By.id("select-organizations-input");
    By chkOrg1 =  By.id("select-organizations-checkbox-0");
    By chkOrg2 =  By.id("select-organizations-checkbox-1");
    By chkOrg3 =  By.id("select-organizations-checkbox-2");
    By linkTill = By.linkText("Tillbaka till mina enhetslistor");
    By btnDelete = By.xpath("//button[contains(text(),'Ta bort listan')]");
    By listSearch = By.id("select-organizations-listbox");
    By btnColor = By.id("select-color-for-SR-1");
	
	public void enterListName(String arg1) {
		driver.findElement(txtListname).clear();
		driver.findElement(txtListname).sendKeys(arg1);
	}
	
	public void enterOrgName(String arg1) {
		driver.findElement(txtOrgName).click();
		driver.findElement(txtOrgName).sendKeys(arg1);
	}
	
	public void selectOrg() {
		driver.findElement(chkOrg1).click();
		driver.findElement(chkOrg2).click();
		driver.findElement(chkOrg3).click();
	}
	
	

	public void clicklinkTill() {
		driver.findElement(linkTill).click();
		
	}
	
	public void  deleteList() {
		
		driver.findElement(btnDelete).click();
	}

	public void colorClick() {
		
		driver.findElement(btnColor).click();
		
	}

	public void verifysearch() {
		
		Assert.assertTrue("Search not found", (!(driver.findElement(listSearch).isDisplayed())));
	}
	
	

	
}
