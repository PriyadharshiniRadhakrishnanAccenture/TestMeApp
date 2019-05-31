package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testing5 {

	@Given("user login to TestMeApp")
	public void user_login_to_TestMeApp() {
	    System.out.println("user logged in to testme app");
	}

	@When("user select product as {string}")
	public void user_select_product_as(String pn) {
	  System.out.println("entered product is "+pn);
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	  System.out.println("user clicks on add to cart");
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {
	   System.out.println("user clicks on cart link");
	}

	@When("user provides quantity as {int}")
	public void user_provides_quantity_as(Integer qu) {
	   System.out.println("user gives quantity "+qu);
	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {
	    System.out.println("user proceed for checkout");
	}

	@Then("verify the review and payment page")
	public void verify_the_review_and_payment_page() {
	  System.out.println("verfied and reviewed. proceed to payment page");
	}
}
