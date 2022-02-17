package dropdownspracttice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import MyFramework.Base;

public class GreenCart extends Base {
@Test
	public void addToCart() {

		initializeWebdriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.cssSelector(".product-image~h4"));

		String[] productsToAdd = { "Cucumber", "Beans", "Potato", "Corn","Banana","Mango" };

		List productsToAddList = Arrays.asList(productsToAdd);

		String text;
		int count =0;
		WebElement webEle;
		for (int i = 0; i < ele.size(); i++) {
			webEle = ele.get(i);
			text = webEle.getText().split("-")[0].trim();
			if (productsToAddList.contains(text)) {
				count++;
				driver.findElements(By.cssSelector(".product>.product-action>button")).get(i).click();
				

			}
			System.out.println(text);
			if(count==productsToAddList.size()) {
				break;
			}
			
		}
		statiWait(2000);
		quitDriver();

	}

}
