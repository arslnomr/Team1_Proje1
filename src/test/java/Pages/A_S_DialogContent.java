package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_S_DialogContent extends Parent{
    A_S_HelperFunctions hfa = new A_S_HelperFunctions();

    public A_S_DialogContent() {
        PageFactory.initElements(GeneralWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    private WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(css = "button[class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(css = "[class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-icon-button mat-button-base mat-badge-accent mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    private WebElement addButton;

    @FindBy(css = "[class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-accent ng-star-inserted']")
    private WebElement editButton;


   /* @FindBy(css = "[class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-warn ng-star-inserted'")
    private WebElement bin;*/


    private WebElement bin;

    @FindBy(css = "[class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-accent']")
    private WebElement delete;

    @FindBy(css = "[class='Bz112c Bz112c-r9oPif']")
    public WebElement closeGoogle;

    @FindBy(xpath = "//ms-text-field/input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
    private WebElement search;

    public WebElement createElementByXpathForDeletingNumb(String elementText, int elementNumb) {
        return hfa.waitUntilClickableAndReturn(GeneralWD.getDriver().findElement(By.xpath("(//*[text()='" + elementText + "']//following::td//div//button[@class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-warn ng-star-inserted'])[" + elementNumb + "]")));
    }

    public WebElement creatElementByXpathText(String elementText){
        return hfa.waitUntilClickableAndReturn(GeneralWD.getDriver().findElement(By.xpath("//td[text()='"+elementText+"']//following::td[4]//button[@class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-warn ng-star-inserted']")));
    }

    public void findAndDeleteNumb(String elementText, int elementNumb) {
        myElement = createElementByXpathForDeletingNumb(elementText, elementNumb);
        clickFunction(myElement);
    }

    public void findAndDelete(String elementText){
        myElement = creatElementByXpathText(elementText);
        clickFunction(myElement);
    }

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "search":
                myElement = search;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "bin":
                myElement = bin;
                break;
            case "delete":
                myElement = delete;
                break;
            case "search":
                myElement = search;
                break;
        }
        clickFunction(myElement);
    }

 /*   public void findAndDeleteNumb(String strElement) {
        findAndClick("bin");
        }*/

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "txtTechnoStudy":
                myElement = txtTechnoStudy;
                break;

        }
        verifyContainsTextFunction(myElement, text);
    }

}
