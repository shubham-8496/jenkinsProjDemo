package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on login page");
    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("user enters valid credentials");
    }
    @And("hit submit")
    public void hit_submit() {
        System.out.println("hit submit");
    }
    @Then("User is able to login successfully")
    public void user_is_able_to_login_successfully() {
        System.out.println("User is able to login successfully");
    }

    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        System.out.println("user enters invalid credentials");
    }
    @Then("error message is shown on display")
    public void error_message_is_shown_on_display() {
        System.out.println("error message is shown on display");
    }

}
