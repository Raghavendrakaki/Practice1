package dropdownspracttice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import MyFramework.Base;

public class TableAutomation extends Base {

	public void tableAutomation() {

		initializeWebdriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		implicitWaitInSeconds(5);

		driver.manage().window().maximize();
		// 1.print no. of Rows in table
		// 2.Print no of columns in table
		// 3. Print all 2nd row details of all 3 columns
		int columns = 0;
		System.out.println("No of rows in the table is : " + driver
				.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/descendant::tr")).size());
		System.out.println("No of columns in the table is : " + (columns = driver
				.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/descendant::th")).size()));
		List<WebElement> secondRow = driver
				.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/descendant::tr[3]//td"));

		for (int i = 1; i <= columns; i++) {

			System.out.println("The value in " + i + " column is : " + secondRow.get(i - 1).getText());
		}

		driver.findElement(By.id("autocomplete")).sendKeys(prop.getProperty("searchKey"));
		Actions ac = new Actions(driver);

		List<WebElement> listEle = driver.findElements(By.xpath("//div[contains(@id,'ui-id-')]"));

		for (int i = 0; i < listEle.size(); i++) {

			if (listEle.get(i).getText().equalsIgnoreCase(prop.getProperty("country"))) {

				ac.moveToElement(listEle.get(i)).click().build().perform();
			}
		}

		System.out.println();

	}

	@Test
	public void chromOptions() {

		//// span[@class='ns-2jmsz-e-16']
		initializeWebdriver();
		implicitWaitInSeconds(5);
		// driver.get("https://expired.badssl.com/");
		driver.get("http://www.sampledocs.in/BrowseFile/DummyFiles/docx");

		for (int i = 1; i <= 10; i++) {

			if (driver.switchTo().frame("aswift_1").findElements(By.xpath("//span[@class='ns-2jmsz-e-16']"))
					.size() > 0) {
				statiWait(2000);
				driver.findElement(By.xpath("//span[@class='ns-2jmsz-e-16']")).click();
				statiWait(2000);
			}
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//td[.='385 KB']/following-sibling::td[2]/a")).click();

			// driver.findElement(By.xpath("//td[.='385
			// KB']/following-sibling::td[2]/a")).click();

		}

		System.out.println(driver.getTitle());

	}

}
