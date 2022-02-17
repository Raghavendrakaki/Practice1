package ccSelectors;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MyFramework.Base;

public class CSCombinatorSelectors extends Base {
	@Test
	public void combinatorSelectors() {

		initializeWebdriver();
		implicitWaitInSeconds(5);
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		// Descendanat selectors = Clild+grand childs
		System.out.println(driver.findElements(By.cssSelector(".container select")).size());
		// Child Selector
		System.out.println(driver.findElements(By.cssSelector(".container>br")).size());
		// Adjascent Sibling Selector
		driver.findElement(By.cssSelector(".button[value='Buttton1']+input")).click();
		//General Sibling Selector
		System.out.println(driver.findElements(By.cssSelector("button[id='button3']~input")).size());

		statiWait(6000);
		quitDriver();

	}

}
