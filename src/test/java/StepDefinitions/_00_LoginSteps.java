package StepDefinitions;

import Pages.DialogContent;
import Utilities.GeneralWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _00_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Mersys")
    public void navigateToMersys() {
        GeneralWD.getDriver().manage().window().maximize();
        GeneralWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Admin entered valid username and valid password and clicked Login Button")
    public void adminEnteredValidUsernameAndValidPasswordAndClickedLoginButton() {
        dc.findAndSend("username","turkeyts");
        dc.findAndSend("password","TechnoStudy123");
        dc.findAndClick("loginButton");
    }

    @Then("Admin user should login successfully")
    public void adminUserShouldLoginSuccessfully() {
        dc.findAndContainsText("txtTechnoStudy","Techno Study");
        dc.findAndClick("acceptCookies");
    }
}
