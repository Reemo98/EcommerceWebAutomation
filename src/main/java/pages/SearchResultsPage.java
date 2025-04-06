package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.actions.CommonActions;

public class SearchResultsPage extends CommonActions {

	private By resultsMsg = By.cssSelector("span[data-ui-id='page-title-wrapper']");
	private By viewProduct = By.cssSelector("img[alt='Chaz Kangeroo Hoodie']");
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getResultsText() {
		return driver.findElement(resultsMsg).getText();
	}
	
	public ProductPage viewSelectedProduct() {
		scrollToElement(viewProduct,0);
		driver.findElement(viewProduct).click();
		return new ProductPage(driver);
	}
	
}
