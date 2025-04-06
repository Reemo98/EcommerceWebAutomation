package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.actions.CommonActions;

public class CartPage extends CommonActions {

	private By cartIconButton = By.cssSelector("a[class='action showcart']");
	private By viewCartButton = By.cssSelector("a[class='action viewcart']");
	private By checkoutButton = By.cssSelector("button[data-role='proceed-to-checkout']");
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickCartIconButton() throws InterruptedException {
		Thread.sleep(6000);
		scrollToElement(cartIconButton,0);
		driver.findElement(cartIconButton).click();
	}
	
	public void clickViewCartButton() {
		scrollToElement(viewCartButton,0);
		driver.findElement(viewCartButton).click();
	}
	
	public CheckoutPage checkoutButton() throws InterruptedException {
		Thread.sleep(5000);
		scrollToElement(checkoutButton,0);
		driver.findElement(checkoutButton).click();
		return new CheckoutPage(driver);
	}
	
}
