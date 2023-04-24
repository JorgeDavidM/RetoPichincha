package demoblaze.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoblaze.testComponents.BaseTest;
import demoblaze.pages.CartPage;

public class TC01_PurchaseTwoProductsTest extends BaseTest {
	
	String name = "John Wick";
	String country = "USA";
	String city = "Alabama";
	String card = "44856528";
	String month = "04";
	String year = "2023";
	String txt = "Thank you for your purchase!";	
	
  @Test
  public void PurchaseTwoProducts() throws InterruptedException {
	  
	  homepage.addPhone();
	  homepage.goToHome();
	  homepage.addPc();
	  homepage.goToCart();
	  CartPage cartpage = new CartPage(driver);
	  Assert.assertTrue(cartpage.compareItems("HTC One M9", "MacBook Pro"));
	  cartpage.enterData(name, country, city, card, month, year);
	  Assert.assertTrue(cartpage.validatePurchase(txt));
	  cartpage.endPurchase();
	  
  }
  
}
