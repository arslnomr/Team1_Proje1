package StepDefinitions;

import Pages.A_S_DialogContent;
import Pages.A_S_FormContent;
import Pages.A_S_HelperFunctions;
import Utilities.GeneralWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class A_S_DiscountSteps {

    A_S_HelperFunctions hfa = new A_S_HelperFunctions();

    A_S_DialogContent dca = new A_S_DialogContent();
    A_S_FormContent fca = new A_S_FormContent();

    @When("Radio buttonun calistigini kontrol et")
    public void radioButtonunCalistiginiKontrolEt() {
        Actions actions = new Actions(GeneralWD.getDriver());
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();

        hfa.elementExists();
        hfa.clickFunction(fca.activateRadioButton);
        hfa.clickFunction(fca.activateRadioButton);
    }

    @When("Description, Integration Code, Priority")
    public void descriptionIntegrationCodePriority(DataTable element) {
        List<List<String>> elementLists = element.asLists(String.class);

        for (int i = 0; i < elementLists.size(); i++) {
            fca.findAndSend(elementLists.get(i).get(0), elementLists.get(i).get(1));
        }
    }
    @Then("{string} ismini delete yapin.")
    public void isminiDeleteYapiniz(String isim) {
        // dca.findAndDeleteNumb(isim);
        dca.waitUntilLoading();
        dca.findAndDelete(isim);
        dca.findAndClick("delete");
    }

}
