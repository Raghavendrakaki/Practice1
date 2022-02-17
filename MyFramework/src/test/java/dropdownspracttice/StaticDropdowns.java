package dropdownspracttice;


import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MyFramework.Base;

public class StaticDropdowns extends Base {
	@Test(priority = 1)
	public void staticDropdowns() {

		initializeWebdriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		/*
		 * WebElement currencyDropdown =
		 * driver.findElement(By.cssSelector(".currency-dropdown>select"));
		 * 
		 * Select select = new Select(currencyDropdown); select.selectByIndex(1);
		 * statiWait(3000); select.selectByValue("AED"); statiWait(4000);
		 * select.selectByVisibleText("USD"); statiWait(2000);
		 * System.out.println("selected option : " +
		 * select.getFirstSelectedOption().getText());
		 * 
		 * List<WebElement> list = select.getOptions(); Iterator iterator =
		 * list.iterator(); for (WebElement ele : list) {
		 * 
		 * System.out.println(ele.getText());
		 * 
		 * }
		 */

	}

	//@Test(priority = 2)
	public void updatedDropdowns() {

		WebElement passengersDrop = driver.findElement(By.cssSelector("#divpaxinfo"));
		passengersDrop.click();
		// #hrefIncAdt
		statiWait(3000);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}

	}

	//@Test(priority = 3)
	public void dynamicDropdowns() {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		statiWait(3000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	}
@Test(priority = 4)
	public void autoSuggestiveDropdown() throws AWTException {
	
	Actions actions = new Actions(driver);

	Robot robo = new Robot();
	

		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("Au");
		// .ui-menu-item a
		statiWait(3000);
		List<WebElement> ele = driver.findElements(By.cssSelector(".ui-menu-item a"));
//Australia
		for (WebElement element : ele) {
//
			if (element.getText().equalsIgnoreCase("Australia")) {
				System.out.println(element.getText());
			
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyPress(KeyEvent.VK_ENTER);
				
				break;
			}
		}
		
		statiWait(6000);

		quitDriver();
	}
}
