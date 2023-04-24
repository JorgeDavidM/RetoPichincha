package demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoblaze.abstractComponents.AbstractComponents;

public class HomePage extends AbstractComponents {

		WebDriver driver;

		public HomePage(WebDriver driver) {
			super(driver);
			// Initialization
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(css = "[class='navbar-nav ml-auto'] li:nth-child(1)")
		WebElement homeBtn;
		
		@FindBy(css = "[class='navbar-nav ml-auto'] li:nth-child(4)")
		WebElement cartBtn;
		
		@FindBy(id = "tbodyid")   
		WebElement container;
		
		@FindBy(css = "div[class='list-group'] a:nth-child(2)")
		WebElement phonesBtn;
		
		@FindBy(css = "div[class='list-group'] a:nth-child(3)")
		WebElement laptopsBtn;
		
		@FindBy(xpath = "//div[@id='tbodyid']/div[7]/div/a/img")
		WebElement htcPhone;
		
		@FindBy(linkText = "MacBook Pro")
		WebElement macPc;
		
		@FindBy(linkText = "Add to cart")
		WebElement addBtn;
		
		public void goToSite() {
			driver.get("https://www.demoblaze.com/index.html");
		}
		
		public void goToHome() {
			homeBtn.click();
		}
		
		public void addPhone() throws InterruptedException {
			waitForWebElementPresent(phonesBtn);
			phonesBtn.click();
			waitForWebElementPresent(htcPhone);
			htcPhone.click();
			addBtn.click();
			Thread.sleep(1000);
			acceptAlert();
		}
		
		public void addPc() throws InterruptedException {
			waitForWebElementPresent(container);
			laptopsBtn.click();
			waitForWebElementPresent(macPc);
			macPc.click();
			addBtn.click();
			Thread.sleep(1000);
			acceptAlert();			
		}
		
		public void goToCart() {
			cartBtn.click();
		}

}
