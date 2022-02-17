package ccSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import MyFramework.Base;

public class EportalPractice extends Base {
	@Test
	public void testMyEportal() {
		initializeWebdriver();

		implicitWaitInSeconds(5);
		driver.get("https://eportal.htcindia.com/_index.php");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("20524");
		driver.findElement(By.xpath("//input[@name='user_pass']")).sendKeys("Raghava525525#");
		driver.findElement(By.xpath("//button[@name='subBtn']")).click();

		statiWait(6000);
		driver.findElement(By.xpath("//button[@name='Continue']")).click();
		driver.findElement(By.xpath("//span[text()='Payroll']")).click();
		driver.findElement(By.xpath("//a[text()='View Pay Slip']")).click();
		driver.findElement(By.xpath("//input[@name='spwdTxt']")).sendKeys("Raghava457");
		
		System.out.println("class attribute value of Spwd: "+driver.findElement(By.xpath("//input[@name='spwdTxt']")).getAttribute("class") );
		System.out.println("get Tag Name : "+ driver.findElement(By.xpath("//input[@name='spwdTxt']")).getTagName());
		
		System.out.println("get text : "+driver.findElement(By.xpath("//input[@name='spwdTxt']")).getText());
		System.out.println("is Displayed = "+driver.findElement(By.xpath("//input[@name='spwdTxt']")).isDisplayed());
		System.out.println("is Enabled : "+ driver.findElement(By.xpath("//input[@name='spwdTxt']")).isEnabled());
		System.out.println("is Selected :  "+ driver.findElement(By.xpath("//input[@name='spwdTxt']")).isSelected());
		
		driver.findElement(By.xpath("//button[@name='subBtn']")).click();

		System.out.println("Get Curreent URl: "+ driver.getCurrentUrl());
//System.out.println("page source =========  : "+ driver.getPageSource());
System.out.println("Get Current page title:" + driver.getTitle());
System.out.println("get Window handle : "+ driver.getWindowHandle());

		Select select = new Select(driver.findElement(By.xpath("//select[@name='monthTxt']")));
		//select.selectByValue("IT_Worksheet_Dec-2021");
		//select.selectByIndex(10);

	//	driver.findElement(By.xpath("//button[@name='subBtn2']")).click();

	//	String validationText = driver.findElement(By.xpath("//p[text()='Email sent successfully']")).getText();

		//Assert.assertEquals("Email sent successfully", validationText);

		driver.findElement(By.cssSelector(".logout_text")).click();

		statiWait(6000);

		quitDriver();

	}

}
