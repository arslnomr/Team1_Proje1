package StepDefinitions;

import Pages.A_S_DialogContent;
import Pages.A_S_FormContent;
import Pages.A_S_HelperFunctions;
import Pages.A_S_LeftNav;
import Utilities.GeneralWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class A_S_GradelevelsStep {

    A_S_HelperFunctions hfa = new A_S_HelperFunctions();
    A_S_LeftNav lna = new A_S_LeftNav();
    A_S_DialogContent dca = new A_S_DialogContent();
    A_S_FormContent fca = new A_S_FormContent();


    @Given("Left navdaki modullere tiklatiniz")
    public void leftNavdakiModullereTiklatiniz(DataTable elements) {
        List<String> elementsStr = elements.asList(String.class);

        for (String strButton : elementsStr) {
            lna.findAndClick(strButton);
        }
    }


    @And("Add Grade Level butonuna tıklayınız.")
    public void addGradeLevelButonunaTıklayınız() {
        dca.findAndClick("addButton");
    }

    @And("Form content bilgilerini giriniz")
    public void formContentBilgileriniGiriniz(DataTable element) {
        List<List<String>> elementLists = element.asLists(String.class);

        for (int i = 0; i < elementLists.size(); i++) {
            fca.findAndSend(elementLists.get(i).get(0), elementLists.get(i).get(1));
        }
    }

    @And("Form Contentdeki bilgileri seciniz")
    public void formContentdekiBilgileriSeciniz(DataTable elements) {
        String temp = " ";
        List<String> elementList = elements.asList(String.class);
        for (String element : elementList) {
            if (element.contains("Techno Study School")) {
                element = temp.concat(element).concat(temp);
            }
            fca.findAndClick(element);
        }
    }

    @Then("Save butonuna tıklayınız")
    public void saveButonunaTıklayınız() {
        Actions actions = new Actions(GeneralWD.getDriver());
        actions.sendKeys(Keys.TAB).build().perform();
        hfa.elementExists();
        hfa.clickFunction(fca.saveButton);

        /*if (hfa.elementExists()){
            Actions actions = new Actions(GWD.getDriver());     // Istedigi Keys burdan yazabilir fakat lazim olmadigi icin bu sekilde biraktim belki ileride lazim olursa deyistiririm
            actions.sendKeys(Keys.ESCAPE).build().perform();
        }
        hfa.clickFunction(fca.saveButton);*/
    }

    @Then("Successfully mesaji görülmelidir")
    public void successfullyMesajiGörülmelidir() {
        hfa.verifyContainsTextFunction(fca.creatMessageByXpath("created"), "created");
    }

    @And("Edit butonuna tıklayınız.")
    public void editButonunaTıklayınız() {
        dca.findAndClick("editButton");
    }

    @And("Name, Short Name, Order degistirebilinsin")
    public void nameShortNameOrderDegistirebilinsin(DataTable element) {
        List<List<String>> elementLists = element.asLists(String.class);

        for (int i = 0; i < elementLists.size(); i++) {
            fca.findAndSend(elementLists.get(i).get(0), elementLists.get(i).get(1));
        }
    }

    @Then("{string} ismini delete yapiniz.")
    public void isminiDeleteYapiniz(String isim) {
        // dca.findAndDeleteNumb(isim);
        dca.waitUntilLoading();
        dca.findAndDeleteNumb(isim, 1);
        dca.findAndClick("delete");
    }

    @And("Add Discount butonuna tıklayınız.")
    public void addDiscountButonunaTıklayınız() {
        dca.findAndClick("addButton");
    }

}
