package in.swiggy.testscripts;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import in.swiggy.pages.SwiggyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodItem extends Driver {
	@Given("a user is on the landing page of swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));

	}

	@When("he type {string} as my delivery location and select the first option")
	public void he_type_as_my_delivery_location_and_select_the_first_option(String string) throws InterruptedException {
		SwiggyPage.searchProduct("Hyderabad");

		 
	}

	@When("he clicks on the first restaurant shown under {string}")
	public void he_clicks_on_the_first_restaurant_shown_under(String string) throws InterruptedException {
		SwiggyPage.item();


	}

	@When("he clicks on the {string} button corresponding to the first listed dish")
	public void he_clicks_on_the_button_corresponding_to_the_first_listed_dish(String string) throws InterruptedException {

		SwiggyPage.addItem();

	}

	@When("he hover over the {string} in the top right corner")
	public void he_hover_over_the_in_the_top_right_corner(String string) throws InterruptedException {

		SwiggyPage.hoverOverToCart();

	}

	@When("he clicks on {string} in the sub-menu")
	public void he_clicks_on_in_the_sub_menu(String string) throws InterruptedException {
		SwiggyPage.checkItem();
	    


	}
	@Then("he verifies that the text {string} is visible on the next page")
	public void he_verifies_that_the_text_is_visible_on_the_next_page(String string) throws InterruptedException {

		Thread.sleep(3000);
		String expectedText="To place your order now, log in to your existing account or sign up.";
		String actualText=SwiggyPage.getText();
		Assert.assertEquals(actualText,expectedText);

	}

@Then("he close the browser")
	public void he_close_the_browser() {
  driver.quit();
}

	}

