package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class S_A_Location_DepartmentsSteps {
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

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", randomGenName);
        dc.findAndSend("shortName",randomGenShortName);
        dc.findAndSend("capacityInput","12");
        dc.findAndClick("activeBtn");
        dc.findAndClick("saveButton");

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
      dc.findAndClick("deleteDialogBtn");
    }

    @And("Navigate to Departments page")
    public void navigateToDepartmentsPage() {

        ln.findAndClick("setupOne");
        ln.findAndClick("schoolSetup");
        ln.findAndClick("departments");


    }

    @When("create  a departments")
    public void createADepartments() {
        String randomGenName= RandomStringUtils.randomAlphanumeric(8);
        String randomGencodeName=RandomStringUtils.randomNumeric(5);

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",randomGenName);
        dc.findAndSend("codeInput",randomGencodeName);
        dc.findAndClick("saveButton");

    }

    @When("delete a school departments")
    public void deleteASchoolDepartments() {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
