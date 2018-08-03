package junitcucumber;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.User;

public class UserSteps {

	private User user = new User();

/*	@Given("")
	public void sum(int x, int y) throws Throwable {
		user.setX(x);
		user.setY(y);
	}

	@When("^i have a variable (\\d+) (\\d+)$")
	public void I_Have_a_variable(int x, int y) throws Throwable {
		user.sum(user.getX(), user.getY());
	}

	@Then("result will be(\\d+)$")
	public void result_will_be(int z) throws Throwable {
		System.out.println(user.z);
	}*/
	@Given("^I have entered (\\d+) into the calculator$")
	public void i_have_entered_into_the_calculator(int arg1) throws Throwable {
	   user.setX(arg1);
	}

	@Given("^I want to add (\\d+)$")
	public void i_want_to_add(int arg1) throws Throwable {
		user.setY(arg1);
	}

	@When("^I press add$")
	public void i_press_add() throws Throwable {
	    user.sum();
	}

	@Then("^the result should be (\\d+) on the screen$")
	public void the_result_should_be_on_the_screen(int arg1) throws Throwable {
	  System.out.println(user.sum());
	}

}
