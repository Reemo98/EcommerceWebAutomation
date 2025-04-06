package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.actions.CommonActions;

public class PaymentPage extends CommonActions {
	
	private By placeOrderButton = By.cssSelector("button[class='action primary checkout']");
	
	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	public void checkoutButton() throws InterruptedException {
		Thread.sleep(5000);
		scrollToElement(placeOrderButton,0);
		driver.findElement(placeOrderButton).click();
	}
	
}
