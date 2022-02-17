package dropdownspracttice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import MyFramework.Base;

public class CalanderPractice extends Base {
	@Test
	public void calanderTest() {
		initializeWebdriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		implicitWaitInSeconds(5);
		driver.findElement(By.xpath("//a[@title='Holiday Packages']")).click();

		String[] selectDate = prop.getProperty("date1").split("-");
		String day = selectDate[0];
		String month = selectDate[1];
		String year = selectDate[2];
		driver.findElement(By.cssSelector(".home-date-div>:nth-child(2)")).click();
		WebElement monthElement;
		String monthFromApp;
		WebElement yearElement;
		String yearFromApp;

		while (true) {
			monthElement = driver.findElement(By.cssSelector(".ui-datepicker-month"));
			yearElement = driver.findElement(By.cssSelector(".ui-datepicker-year"));
			monthFromApp = monthElement.getText();
			yearFromApp = yearElement.getText();

			if (yearFromApp.equalsIgnoreCase(year)) {
				if (monthFromApp.equalsIgnoreCase(month)) {
					break;
				}
			}

			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}

		List<WebElement> eles = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr/td"));
		for (int i = 0; i < eles.size(); i++) {
			if (day.equalsIgnoreCase(eles.get(i).getText())) {
				eles.get(i).click();
				break;
			}
		}
		statiWait(2000);
		quitDriver();
		

	}

}
