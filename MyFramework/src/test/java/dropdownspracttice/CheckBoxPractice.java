package dropdownspracttice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import MyFramework.Base;

public class CheckBoxPractice extends Base{
	/*
	 * @Test public void chekBoxPractice() {
	 * 
	 * initializeWebdriver();
	 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 * driver.manage().window().maximize(); WebElement ele =
	 * driver.findElement(By.cssSelector("#checkBoxOption1"));
	 * Assert.assertFalse(ele.isSelected()); ele.click();
	 * Assert.assertTrue(ele.isSelected());
	 * 
	 * int listSze =
	 * driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	 * System.out.println("No of Check boxes : "+ listSze); statiWait(3000);
	 * quitDriver();
	 * 
	 * }
	 */
	
	@Test
	public void formPractice() {
		
		initializeWebdriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Raghavendra");
		driver.findElement(By.name("email")).sendKeys("raghavamyl@test.com");
		//exampleInputPassword1
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("email");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));

		select.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("09-07-1994");
		
		
		statiWait(3000);
		quitDriver();
		
	}

}
