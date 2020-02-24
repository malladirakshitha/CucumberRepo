package dummy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("i Enterthe Username")
	public void i_Enterthe_Username() {
		System.out.println("username is entered");
	    
	}

	@Given("i Enter the password")
	public void i_Enter_the_password() {
		System.out.println("password is entered");
	  
	}

	@When("i click on Login button")
	public void i_click_on_Login_button() {
		System.out.println("Login button is clicked");
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	    

	}
}
