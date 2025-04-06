package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.actions.CommonActions;

public class CheckoutPage extends CommonActions {

	private By emailField = By.id("customer-email"); 
	private By toolTip = By.id("tooltip");
	private By fnField = By.name("firstname");
	private By lnField = By.name("lastname"); 
	private By saField1 = By.name("street[0]"); 
	private By saField2 = By.name("street[1]");
	private By cityField = By.name("city"); 
	private By countryField = By.name("country_id");
	private By stateField = By.name("region_id"); 
	private By zipField = By.name("postcode");
	private By phoneNumberField = By.name("telephone");
	private By nextButton = By.cssSelector("button[class='button action continue primary']");
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public void setEmail(String email) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(emailField).sendKeys(email);
	}
	
	public boolean isTooltipDisplayed() { 
		return driver.findElement(toolTip).isDisplayed();
	}
	
	public void setFirstName(String firstName) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(fnField).sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		scrollToElement(lnField,0);
		driver.findElement(lnField).sendKeys(lastName);
	}
	
	public void setStreetAddress(String streetAddress1, String streetAddress2) {
		scrollToElement(saField1,0);
		driver.findElement(saField1).sendKeys(streetAddress1);
		scrollToElement(saField2,0);
		driver.findElement(saField2).sendKeys(streetAddress2);
	}
	
	public void setCity(String city) {
		scrollToElement(cityField,0);
		driver.findElement(cityField).sendKeys(city);
	}
	
	public void setCountry(String country) { //dropdown
		scrollToElement(countryField,0);
		selectFromDropdown(countryField,country);
	}
	
	public void setState(String city) { //dropdown
		scrollToElement(stateField,0);
		selectFromDropdown(stateField,city);
	}
	
	public void setZip(String zip) {
		scrollToElement(zipField,0);
		driver.findElement(zipField).sendKeys(zip);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		scrollToElement(phoneNumberField,0);
		driver.findElement(phoneNumberField).sendKeys(phoneNumber);
	}
	
	public PaymentPage clickNextButton() throws InterruptedException {
		scrollToElement(nextButton,0);
		driver.findElement(nextButton).click();
		Thread.sleep(3000);
		driver.findElement(nextButton).click(); //for the website to confirm shipping method
		return new PaymentPage(driver);
	}
}
