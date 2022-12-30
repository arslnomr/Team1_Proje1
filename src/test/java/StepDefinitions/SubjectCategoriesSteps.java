package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExcelUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class SubjectCategoriesSteps {

    DialogContent dc = new DialogContent();

    LeftNav ln=new LeftNav();
    @And("Navigate to Subject Categories page")
    public void navigateToSubjectCategoriesPage() {

        ln.findAndClick("education");
        ln.findAndClick("educationSetup");
        ln.findAndClick("subjectCategories");

    }
    @And("Admin User add different topic subject categories with ApachePOI")
    public void adminUserCreatesDifferentTopicCategoriesWithApachePOI() {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getListData("src/test/java/ApachePOI/ApacheExcelEducation.xlsx",
                        "SubjectObjections", 2);

        for (ArrayList<String> satir : tablo) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", satir.get(0));
            dc.findAndSend("educationCode", satir.get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage", "success");

        }


    }

    @And("Admin User add same subject categories as ApachePOI")
    public void adminUserCreatesSameSubjectCategoriesAsApachePOI() {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getListData("src/test/java/ApachePOI/ApacheExcelEducation.xlsx",
                        "SubjectObjections", 2);

        for (ArrayList<String> satir : tablo) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", satir.get(0));
            dc.findAndSend("educationCode", satir.get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("alreadyExist","already");

        }

    }

    @When("Admin User edit subject categories with ApachePOI")
    public void adminUserEditSubjectCategoriesWithApachePOI() {

        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getListData("src/test/java/ApachePOI/ApacheExcelEducation.xlsx",
                        "SubjectObjections", 4);

        for (ArrayList<String> satir : tablo) {
            dc.findAndClick("editButton");
            dc.findAndSend("nameInput", satir.get(2));
            dc.findAndSend("educationCode", satir.get(3));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage", "success");

        }
    }

    @When("Admin User delete subject categories with ApachePOI")
    public void adminUserDeleteSubjectCategoriesWithApachePOI() {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getListData("src/test/java/ApachePOI/ApacheExcelEducation.xlsx",
                        "SubjectObjections", 5);

        for (ArrayList<String> satir : tablo) {
            dc.findAndDelete(satir.get(4));
            dc.findAndContainsText("successMessage", "success");

        }

    }
}
