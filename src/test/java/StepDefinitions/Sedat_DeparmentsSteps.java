package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class Sedat_DeparmentsSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

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

        dc.findAndClick("addDepartmentButton");
        dc.findAndSend("inputName",randomGenName);
        dc.findAndSend("codeInput",randomGencodeName);
        dc.findAndClick("saveBtn");





    }

    @When("delete a school departments")
    public void deleteASchoolDepartments() {
        dc.findAndClick("deletedBtn");
        dc.findAndClick("dltBtnn");




    }
}
