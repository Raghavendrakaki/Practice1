package stepdefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import MyFramework.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class EportalStepDefinations extends Base {

	@Given("Application Login page")
	public void application_login_page() {
		/*
		 * initializeWebdriver();
		 * 
		 * implicitWaitInSeconds(5);
		 * driver.get("https://eportal.htcindia.com/_index.php");
		 */
		System.out.println("Application Login page");
	}

	@When("User Login with username {string} and pwd {string}")
	public void user_login_with_username_and_pwd(String string, String string2) {
		/*
		 * driver.findElement(By.xpath("//h1[.='HTC ePortal credentials']")).click();
		 * driver.findElement(By.name("username")).sendKeys(string);
		 * driver.findElement(By.name("password")).sendKeys(string2);
		 * driver.findElement(By.cssSelector("submit_btn")).click();
		 */
		System.out.println("Application Login page and user giving username = "+string+" password = "+string2);
	}

	@Then("User should login and logout")
	public void user_should_login_and_logout() {
		/*
		 * driver.findElement(By.xpath("//button[@name='Continue']")).click();
		 * driver.findElement(By.xpath("//span[text()='Payroll']")).click();
		 * driver.findElement(By.xpath("//a[text()='View Pay Slip']")).click();
		 * driver.findElement(By.xpath("//input[@name='spwdTxt']")).sendKeys(
		 * "Raghava457");
		 * driver.findElement(By.xpath("//button[@name='subBtn']")).click();
		 * 
		 * System.out.println("Get Curreent URl: " + driver.getCurrentUrl());
		 * //System.out.println("page source =========  : "+ driver.getPageSource());
		 * System.out.println("Get Current page title:" + driver.getTitle());
		 * driver.findElement(By.cssSelector(".logout_text")).click();
		 * 
		 * statiWait(6000);
		 * 
		 * quitDriver();
		 */
		System.out.println("User should login and logout");
	}

}
