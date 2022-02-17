package dropdownspracttice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import MyFramework.Base;

public class LoginPageWaitsPractice extends Base {
	@Test
	public void waitsTest() {
		initializeWebdriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();
		
		loginPageWaitstest();
		
		statiWait(3000);
		
		quitDriver();
	}
	
	void loginPageWaitstest(){
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		
		//driver.switchTo().alert().accept();
	//	statiWait(5000);
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
		
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		
		
		Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));

		select.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		//statiWait(5000);
		explicitWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//app-card-list//button"))));
		List<WebElement> ele =  driver.findElements(By.xpath("//app-card-list//button"));
		
		for(WebElement ele1 : ele) {
			ele1.click();
		}
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link btn btn-primary']")));
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
	}

	
	
}
