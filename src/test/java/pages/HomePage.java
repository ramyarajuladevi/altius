package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By btnOk = By.xpath("//button[contains(text(),'Ok')]");
	By btncreateLst = By.xpath("//button[contains(text(),'Skapa enhetslista')]");
	By linkmylist = By.partialLinkText("Min lista (1)");

	public void acceptCookies() {
		driver.findElement(btnOk).click();
	}
	
	public void createList() {
		driver.findElement(btncreateLst).click();
	}
	
	public void listlink() {

		driver.findElement(linkmylist).click();
		
	}
}
