package ccSelectors;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MyFramework.Base;

public class CSSSimpleSelectorsPractice extends Base {
	@Test
	public void simpleSelectors() throws IOException {

		initializeWebdriver();
		implicitWaitInSeconds(5);
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElement(By.cssSelector("input")).getAttribute("name"));
		System.out.println();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Raghavendra");
		driver.findElement(By.cssSelector(".gender")).sendKeys("male");
		
		System.out.println(driver.findElements(By.cssSelector("*")).size());
		
	}
}
