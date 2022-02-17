package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefinations {
	

@Given("User is on Landing page \\/ Login page")
public void user_is_on_landing_page_login_page() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("User is on Landing page");
}

@Given("having valid credentials")
public void having_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User is on Landing page and having credentials");
}


@Then("Homepage should display")
public void homepage_should_display() {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User is on Home page");
}

@When("User login  into application with username {string} and password {string}")
public void user_login_into_application_with_username_and_password(String string, String string2) {
    
	System.out.println(string +"    "+  string2);
}

@Then("Username is displayed on Homepage {string}")
public void username_is_displayed_on_homepage(String string) {
   
	System.out.println(string);
}

}
