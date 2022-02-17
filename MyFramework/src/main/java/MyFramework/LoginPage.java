package MyFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
	 WebDriver driver;
	 By userName = By.name("user_name");
	 By password= By.name("user_pass");
	 By login = By.name("subBtn");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void login(String name, String password) {
		
		driver.findElement(userName).sendKeys(name);	
		driver.findElement(this.password).sendKeys(password);
		driver.findElement(login).click();
	}

}
