package main;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import base.BaseTests;
import pages.*;

public class MainPageTests extends BaseTests{
	
	@Test
	public void SuccessfulScenario() throws InterruptedException {
		MainPage mp = new MainPage(driver);
		mp.setProduct("hoodie");
		
		SearchResultsPage srp = mp.clickSearchButton();
		assertTrue(srp.getResultsText().contains("Search results for: 'hoodie'"),"Search results text don't match!");
		
		ProductPage prodp = srp.viewSelectedProduct();
		prodp.setProductSize();
		prodp.setProductColor();
		prodp.setProductQuantity("2");
		
		CartPage cartP = prodp.clickAddToCartButton();
		cartP.clickCartIconButton();
		cartP.clickViewCartButton();
		
		CheckoutPage checkP = cartP.checkoutButton();
		checkP.setEmail("Reemo98@email.com");
		assertTrue(checkP.isTooltipDisplayed(), "Tooltip isn't displayed!");
		checkP.setFirstName("Reem");
		checkP.setLastName("F");
		checkP.setStreetAddress("108-17", "Unknown Street");
		checkP.setCity("Paris");
		checkP.setCountry("France");
		checkP.setState("Paris");
		checkP.setZip("11375");
		checkP.setPhoneNumber("0100000000");
		
		PaymentPage payP = checkP.clickNextButton();
		payP.checkoutButton();
	}

}
