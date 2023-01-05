package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GeneralWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Ö_A_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();


    @And("Click on the element in left nav")
    public void clickOnTheElementInLeftNav(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);

        for (String strButtonName : listElemanlar) {
            //System.out.println("eleman = " + eleman);
            ln.findAndClick(strButtonName);
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);

        for (String strButtonName : listElemanlar)
            dc.findAndClick(strButtonName);
    }


    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++)
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
        // eleman adı                    eleman değeri
    }


    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);

        for (String strButtonName : listElemanlar)
            dc.findAndDelete(strButtonName);
    }

    @And("User delete description item  from Dialog")
    public void userDeleteItemDescriptionFromDialog(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);

        for (String strButtonName : listElemanlar)
            dc.findAndDelete2(strButtonName);
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage", "successfully");
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.findAndContainsText("alreadyExist", "already");
    }

    @And("gedit user admin as {string} in grade levels")
    public void geditUserAdminAsInGradeLevels(String isim) {

        WebDriverWait wait = new WebDriverWait(GeneralWD.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        WebElement editlist =
        GeneralWD.getDriver().findElement(By.xpath("//td[contains(text(),'"+isim+"')]//following::div/ms-edit-button"));
        editlist.click();
    }

    @And("delete user admin as {string} in grade levels")
    public void deleteUserAdminAsInGradeLevels(String isim) {
        WebDriverWait wait = new WebDriverWait(GeneralWD.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

        // WebElement deletelist =
        // GeneralWD.getDriver().findElement(By.xpath("//td[contains(text(),'"+isim+"')]//following::div/ms-delete-button"));
        // deletelist.click();
        // dc.findAndClick("deleteDialogBtn");


        List<WebElement> nameliste =
                GeneralWD.getDriver().findElements(By.xpath("//td[contains(@class,' mat-column-name')]"));

        for (WebElement e: nameliste) {

            if (e.getText().equalsIgnoreCase(isim)) {
                WebElement btnliste =
                        GeneralWD.getDriver().findElement(By.xpath("(//*[@data-icon='trash-can'])"));
                wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
                btnliste.click();
                dc.findAndClick("deleteDialogBtn");

            }
        }

    }


 /*   @And("Find and Delete on the {string} element in the GradeLevel Content")
    public void findAndDeleteOnTheElementInTheGradeLevelContent(String name) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        List<WebElement> liste=GWD.getDriver().findElements(By.xpath("(//tbody[@role='rowgroup']//tr//td)"));
        String editPath="(//*[@data-icon='trash-can'])";
        for(int i=0;i< liste.size() ; i++ ) {
            if (liste.get(i).getText().equalsIgnoreCase(name)){
                editPath=editPath.concat("["+((i/7)+1)+"]");

                WebElement edit= GWD.getDriver().findElement(By.xpath(editPath));
                edit.click();
            }
        }
    }

  */
}
