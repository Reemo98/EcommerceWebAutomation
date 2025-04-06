package common.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

	protected WebDriver driver;
	
	public CommonActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hoverOverAndSelectFigure(By figureBox, int index) {
		WebElement figure = driver.findElements(figureBox).get(index - 1);
		Actions actions = new Actions(driver);
		actions.moveToElement(figure).click();
	}
	
	public void scrollToElement(By untilElement, int arg) {
        WebElement element = driver.findElement(untilElement);
        ((JavascriptExecutor)driver).executeScript("arguments[" + arg +"].scrollIntoView(true);",element);
	}
	
	public void selectFromDropdown(By dropdown, String option) {
		WebElement element = driver.findElement(dropdown);
		new Select(element).selectByVisibleText(option);
	}
}
