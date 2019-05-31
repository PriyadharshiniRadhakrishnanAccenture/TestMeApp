package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testing2 {
	
	@Given("user login")
	public void user_login() {
	    System.out.println("user performs login");
	}

	@When("user selects product using category")
	public void user_selects_product_using_category() {
	   System.out.println("user searches for product using category");
	}

	@Then("verify the list of products And close application")
	public void verify_the_list_of_products_And_close_application() {
		System.out.println("user verifies the list of products and close the application");
	}

	@When("user selects product using sub-category")
	public void user_selects_product_using_sub_category() {
		System.out.println("user searches for product using sub-category");
		}

	@When("user selects product using product-name")
	public void user_selects_product_using_product_name() {
		System.out.println("user searches for product using product-name");
	}
	@Given("welcome message")
	public void welcome_message() {
		System.out.println("Welcome");
	}


}
