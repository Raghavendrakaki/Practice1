package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchMrcuryTours {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "G:\\selenium\\new\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		//WebDriverWait driverWait = new WebDriverWait(driver, 10);
		//driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));

		String expecedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		actualTitle = driver.getTitle();

		if (actualTitle.equalsIgnoreCase(expecedTitle)) {
			System.out.println("Title matched");

		} else
			System.out.println("Title not matched");
		String tagName = driver.findElement(By.xpath("//input[@name='userName']")).getTagName();
		System.out.println("Tagname  : " + tagName);

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Nlurm");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123welcome");
		;
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//a[@href='index.php']")).getText());

		Thread.sleep(5000);

		driver.close();
	}

}
