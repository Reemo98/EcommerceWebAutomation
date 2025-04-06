package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.actions.CommonActions;

public class ProductPage extends CommonActions {

	private By productSize = By.id("option-label-size-143-item-169"); //Large
	private By productColor = By.id("option-label-color-93-item-49"); //Black
	private By productQuantity = By.cssSelector("input[id='qty']");
	private By addToCartButton = By.cssSelector("button[class='action primary tocart']");
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public void setProductSize() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(productSize).click(); //.sendKeys(itemName);
	}
	
	public void setProductColor() {
		driver.findElement(productColor).click(); //.sendKeys(itemName);
	}
	
	public void setProductQuantity(String qty) {
		scrollToElement(productQuantity,0);
		driver.findElement(productQuantity).clear();
		driver.findElement(productQuantity).sendKeys(qty);
	}
	
	public CartPage clickAddToCartButton() {
		scrollToElement(addToCartButton,0);
		driver.findElement(addToCartButton).click();
		return new CartPage(driver);
	}
}
