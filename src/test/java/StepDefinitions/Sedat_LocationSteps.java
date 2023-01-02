package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class Sedat_LocationSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Location page")
    public void navigateToLocationPage() {
        ln.findAndClick("setupOne");
        ln.findAndClick("schoolSetup");
        ln.findAndClick("locations");


    }
    @When("create  a locations")
    public void createALocations() {

        String randomGenName= RandomStringUtils.randomAlphanumeric(8);
        String randomGenShortName=RandomStringUtils.randomNumeric(5);

        dc.findAndClick("addLocationButton");
        dc.findAndSend("nameInput", randomGenName);
        dc.findAndSend("shortNameInput",randomGenShortName);
        dc.findAndSend("capacityInput","12");
        dc.findAndClick("activeBtn");
        dc.findAndClick("saveButton");

    }
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.findAndContainsText("successMessage","success");
        dc.findAndContainsText("successDeleteMessage","success");
        dc.findAndContainsText("successCreateMessage","success");
        dc.findAndContainsText("successdeletedMessage","success");
        dc.findAndContainsText("AccountSuccessfully","success");
        dc.findAndContainsText("basarilideletedMessage","success");

    }

    @When("Create a location name as {string}  shortname as {string}")
    public void createALocationNameAsShortnameAs(String name, String shortname) {

        dc.findAndClick("addLocationButton");
        dc.findAndSend("nameInput", "gibson");
        dc.findAndSend("shortNameInput","fender");
        dc.findAndSend("capacityInput","10");
        dc.findAndClick("activeBtn");
        dc.findAndClick("saveButton");

    }

    @When("delete a school location")
    public void deleteASchoolLocation() {

      dc.findAndClick("deleteButton");
      dc.findAndClick("dltBtn");



    }
}
