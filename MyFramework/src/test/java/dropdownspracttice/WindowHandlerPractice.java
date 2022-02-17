package dropdownspracttice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MyFramework.Base;

public class WindowHandlerPractice extends Base {

	public void windowsHandler() {

		initializeWebdriver();
		driver.get("https://the-internet.herokuapp.com/");

		implicitWaitInSeconds(5000);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();
		driver.findElement(By.cssSelector(".example>a")).click();

		Set<String> win = driver.getWindowHandles();

		Iterator it = win.iterator();

		String parentWindow = (String) it.next();
		String childWindow = (String) it.next();

		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

	}

	//@Test
	public void frames() {

		initializeWebdriver();
		driver.get("https://the-internet.herokuapp.com/");

		implicitWaitInSeconds(5);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']")).click();

		WebElement toFrameElemnt = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(toFrameElemnt);
		WebElement leftFrameElemnt = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(leftFrameElemnt);
		System.out.println(driver.findElement(By.id("content")).getText());

	}
	@Test
	public void doNotHardcodeValueExample() {

		initializeWebdriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		implicitWaitInSeconds(5);

		driver.manage().window().maximize();

		WebElement first =  driver.findElement(By.xpath("//label[@for='benz']"));
		
		
		//first.click();
		String option2 = first.getText().trim();
		
		first.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		Select  select= new Select(driver.findElement(By.id("dropdown-class-example")));	
		
		select.selectByVisibleText(option2);
		
		driver.findElement(By.id("name")).sendKeys(option2);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		if(alertText.contains(option2)) {
			
			System.out.println("Alert text contains the selected value , it is : "+option2);
		}

		quitDriver();

	}

}
