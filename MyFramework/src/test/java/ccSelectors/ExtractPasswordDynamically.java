package ccSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import MyFramework.Base;

public class ExtractPasswordDynamically extends Base{
	@Test
	public void getPasswordDynamically() {
		
		initializeWebdriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Raghavendra kaki");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Raghavendra@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9514458529");
		//button[text()='Reset Login']
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		//.infoMsg
		String pwdFullString = driver.findElement(By.cssSelector(".infoMsg")).getText();
		
		String actualPwd = getActualPassword(pwdFullString);
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		statiWait(5000);
		WebElement username = driver.findElement(By.cssSelector("#inputUsername"));
				
		username.clear();
		username.sendKeys("Raghavendra kaki");
		//rahulshettyacademy
		WebElement pass = driver.findElement(By.xpath("//input[@name='inputPassword']"));
		pass.clear();
		pass.sendKeys(actualPwd);
		driver.findElement(By.cssSelector(".signInBtn")).click();
		statiWait(5000);
		String validateSuccessMessage = driver.findElement(By.xpath("//*[text()='You are successfully logged in.']")).getText();
		Assert.assertEquals("You are successfully logged in.", validateSuccessMessage);
		
		statiWait(5000);
		
		quitDriver();
		
		
		
	}

	private String getActualPassword(String pwd) {
		
		String pwdArray [] = pwd.split("'");
		System.out.println("Array starts");
		for (int i = 0; i < pwdArray.length; i++) {
			System.out.println(pwdArray[i]);
		}
		
		return pwdArray[1];
	}
	
	

}
