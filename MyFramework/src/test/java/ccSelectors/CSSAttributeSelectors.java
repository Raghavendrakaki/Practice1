package ccSelectors;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MyFramework.Base;

public class CSSAttributeSelectors extends Base {
@Test
	public void attributeSelectors() {

		initializeWebdriver();
		implicitWaitInSeconds(5);
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElements(By.cssSelector("[placeholder]")).size());
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Raghavendra");
		driver.findElement(By.cssSelector("[placeholder~='Last']")).sendKeys("kaki");
		driver.findElement(By.cssSelector("[placeholder*='Gen']")).sendKeys("male");
		System.out.println(driver.findElement(By.cssSelector("[class|='my test']")).getText());
		System.out.println(driver.findElement(By.cssSelector("[class^='my test c']")).getText());
		System.out.println(driver.findElement(By.cssSelector("[class$='ext']")).getText());
		statiWait(6000);
		quitDriver();

	}

}
