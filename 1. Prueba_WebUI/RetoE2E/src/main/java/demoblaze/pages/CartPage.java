package demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoblaze.abstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		// Initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr[1]/td[2]")
	WebElement htcText;

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr[2]/td[2]")
	WebElement macText;

	@FindBy(css = "[class='btn btn-success']")
	WebElement placeOrder;

	@FindBy(id = "name")
	WebElement nameFld;

	@FindBy(id = "country")
	WebElement countryFld;

	@FindBy(id = "city")
	WebElement cityFld;

	@FindBy(id = "card")
	WebElement creditCard;

	@FindBy(id = "month")
	WebElement monthFld;

	@FindBy(id = "year")
	WebElement yearFld;

	@FindBy(xpath = "//button[text()='Purchase']")
	WebElement purchase;

	@FindBy(xpath = "//h2[(text()='Thank you for your purchase!')]")
	WebElement successText;

	@FindBy(xpath = "//button[(text()='OK')]")
	WebElement okBtn;
	
	public Boolean compareItems(String item1, String item2) {
		waitForWebElementPresent(htcText);
		String txt = htcText.getText();
		String txt1 = macText.getText();
		if ((txt.equals(item1)||txt.equals(item2))&&(txt1.equals(item1)||txt1.equals(item2))) {
			return true;
		} return false;	
	}
	
	public void enterData (String name, String country, String city, String card, String month, String year) {
		waitForWebElementPresent(placeOrder);
		placeOrder.click();
		waitForWebElementPresent(nameFld);
		nameFld.sendKeys(name);
		countryFld.sendKeys(country);
		cityFld.sendKeys(city);
		creditCard.sendKeys(card);
		monthFld.sendKeys(month);
		yearFld.sendKeys(year);
		purchase.click();		
	}
	
	public Boolean validatePurchase(String msg) {
		waitForWebElementPresent(successText);
		if(successText.getText().equalsIgnoreCase(msg)) {
			return true;
		} return false;
	}
	
	public void endPurchase() {
		waitForWebElementPresent(okBtn);
		okBtn.click();		
	}

}
