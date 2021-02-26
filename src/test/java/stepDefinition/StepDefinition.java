package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.WebDriverInstance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DeviceList;
import pages.HomePage;
import org.junit.Assert;

public class StepDefinition {
	
	protected WebDriver driver;
	WebDriverInstance webdriverInstance = new WebDriverInstance();

	/*Launch browser and Navigating url */
	@Given("^Open chrome and navigate to url \"(.*?)\"$")
	public void open_chrome_and_navigate_to_url(String url) throws Throwable {
		
		driver = webdriverInstance.browserSetup(driver, url);
		
	}
	
	/*Page Validation */
	@When("^validate page for title \"(.*?)\"$")
	public void validate_page_for_title(String arg1) throws Throwable {
		
		Assert.assertEquals("Validation of Home page title", arg1, driver.getTitle());
		
	}
	
	/*Closing Browser */
	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		
		driver.quit();
	}
	
	/*Create Device List*/
	@When("^Create Device list with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void create_Device_list_with_and(String ListName, String OrgName) throws Throwable {
		
		HomePage homePage = new HomePage(driver);
		DeviceList deviceList = new DeviceList(driver);
		
		homePage.acceptCookies();
		homePage.createList();
		
		homePage.listlink();
				
		deviceList.enterListName(ListName);
		deviceList.enterOrgName(OrgName);
		deviceList.selectOrg();
		deviceList.clicklinkTill();
	
	}

	/*Validation of Device List Creation */
	@Then("^Device List Created successfully with the name \"([^\"]*)\"$")
	public void device_List_Created_successfully_with_the_name(String arg1) throws Throwable {
				
		Assert.assertEquals("Validation of Lst Creation", arg1, driver.findElement(By.partialLinkText(arg1)).getText());
		
			
	}
	
	/*Device List Deletion */
	@Then("^Delete List successfully with the name \"([^\"]*)\"$")
	public void delete_List_successfully_with_the_name(String arg1) throws Throwable {
		
		DeviceList deviceList = new DeviceList(driver);
		driver.findElement( By.partialLinkText(arg1)).click();
		deviceList.deleteList();
		
	}
	
	/*Rename Device List */
	@Then("^Renamed  \"([^\"]*)\" List successfully with the name \"([^\"]*)\"$")
	public void renamed_List_successfully_with_the_name(String arg1, String arg2) throws Throwable {
		
		DeviceList deviceList = new DeviceList(driver);
		driver.findElement( By.partialLinkText(arg1)).click();
		deviceList.enterListName(arg2);
		deviceList.clicklinkTill();
		
	}
	
	/*Changing color of the Unit */
	@Then("^\"([^\"]*)\" List Change Color successfully with the color \"([^\"]*)\"$")
	public void list_Change_Color_successfully_with_the_color(String arg1, String arg2) throws Throwable {
		
		driver.findElement(By.partialLinkText(arg1)).click();
		DeviceList deviceList = new DeviceList(driver);
		deviceList.colorClick();
		driver.findElement(By.id(arg2)).click();
		deviceList.clicklinkTill();
	}
	
	/*Organization Search */
	@When("^Create Device list with \"([^\"]*)\" and Validate \"([^\"]*)\" in search$")
	public void create_Device_list_with_and_Validate_in_search(String arg1, String arg2) throws Throwable {
	   
		HomePage homePage = new HomePage(driver);
		DeviceList deviceList = new DeviceList(driver);
		
		homePage.acceptCookies();
		homePage.createList();
		System.out.println("Creating List");
		homePage.listlink();
		System.out.println("Link clicked");
		
		deviceList.enterListName(arg1);
		deviceList.enterOrgName(arg2);
		deviceList.verifysearch();
		
			
		
	}

}

