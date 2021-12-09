package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsTest {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * driver.get("https://en-gb.facebook.com/");
		 * 
		 * driver.findElement(By.id("email")).sendKeys("This is m First selennium code"
		 * ); driver.findElement(By.name("pass")).sendKeys("12345"); Thread.sleep(5000);
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 * 
		 * Thread.sleep(5000);
		 */

		/* driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); */
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.get("https://www.google.com/");
		
		// driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Sending keys");
//driver.findElement(By.xpath("//input[contains(@placeholder,'Fruits')]")).sendKeys("Sending keys");

		//driver.findElement(By.cssSelector("input[type='search']")).sendKeys("nothing");
		//driver.findElement(By.cssSelector("input[type*='sea']")).sendKeys("nothing");
		/* driver.findElement(By.cssSelector("#name")).sendKeys("nothing"); */
		/*
		 * driver.findElement(By.cssSelector("input[name*=show-]")).sendKeys("nothing");
		 */
		
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("House");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@value,'Google Search')]")).click();
		
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
	}

}
