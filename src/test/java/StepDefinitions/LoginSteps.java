package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is on login page")
    public void pageLogin() {
        System.out.println("On Login page");
    }

    @When("user enters username and password")
    public void enterCredentials() {
        System.out.println("providing uname and password");
    }

    @And("clicks non login button")
    public void clickLogin() {
        System.out.println("button clicked");

    }

    @Then("user should be navigated to homepage")
    public void verifyHomePage() {
        System.out.println("home page opened");
    }
}
