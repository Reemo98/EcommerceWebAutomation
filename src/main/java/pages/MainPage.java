package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	private WebDriver driver;
	private By searchField = By.id("search");
	private By searchButton = By.cssSelector("button[class='action search']");
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setProduct(String productName) {
		driver.findElement(searchField).sendKeys(productName);
	}
	
	public SearchResultsPage clickSearchButton() {
		driver.findElement(searchButton).click();
		return new SearchResultsPage(driver);
	}
}
