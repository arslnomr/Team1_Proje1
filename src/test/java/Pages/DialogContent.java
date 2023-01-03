package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GeneralWD.getDriver(),this);
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
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement orderInput;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(xpath = "(//div[contains(@class,'mat-form-f')]//input)[1]")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//td[contains(@class,'column-name mat-column-name')]")
    public List<WebElement> nameList;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;
    @FindBy(xpath = "(//td[@role='cell'])[2]")
    private WebElement searchResultCell;
    @FindBy(xpath = "//ms-edit-button[contains(@table,'true')]//button")
    private WebElement editButton;
    // (//fa-icon[contains(@class,'fa-icon')])[164]
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement code;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement description;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;
    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    private WebElement  toggleBar;
    @FindBy(xpath="(//ms-text-field[contains(@placeholder,'.DESCRIPTION')]//input)[1]")
    private WebElement  searchDescription;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacityInput;
    @FindBy(xpath ="//mat-slide-toggle[@formcontrolname='active']" )
    private WebElement activeBtn;
    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement IbanButonu;
    @FindBy(xpath ="(//*[@formcontrolname='currency']//div)[1]")
    private WebElement currencyDropdownButonu;
    @FindBy(xpath = "(//mat-option[@role='option']//span)[4]")
    private WebElement tryBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integresyonKodButonu;
    @FindBy(xpath="//ms-masked-text-field[@formcontrolname='iban']/input")
    private WebElement iban;
    @FindBy(xpath="(//mat-select[@formcontrolname='currency']/div/div/span)[1]")
    private WebElement currency;
    @FindBy(xpath="(//mat-option[@role='option']/span)[2]")
    private WebElement currency2;
    @FindBy(xpath="//ms-text-field[@formcontrolname='integrationCode']/input")
    private WebElement IntegrationCode;


    WebElement myElement;

    public  void  findAndSend(String strElement, String value){
        switch (strElement){
            case "username":myElement=username;break;
            case "password":myElement=password;break;
            case "nameInput":myElement = nameInput;break;
            case "codeInput":myElement = codeInput;break;
            case "shortName":myElement = shortName;break;
            case "orderInput":myElement=orderInput;break;
            case "searchInput":myElement = searchInput;break;
            case "code":myElement = code;break;
            case "description":myElement = description;break;
            case "priority":myElement = priority;break;
            case "searchDescription":myElement = searchDescription;break;
            case "capacityInput":myElement = capacityInput;break;
            case "iban":myElement = iban;break;
            case "IntegrationCode":myElement = IntegrationCode;break;


        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton":myElement=loginButton;break;
            case "addButton":myElement = addButton;break;
            case "saveButton":myElement = saveButton;break;
            case "acceptCookies":myElement = acceptCookies;break;
            case "searchButton":myElement = searchButton;break;
            case "deleteDialogBtn":myElement = deleteDialogBtn;break;
            case "editButton":myElement = editButton;break;
            case "toggleBar": myElement=toggleBar;break;
            case "deleteButton": myElement=deleteButton;break;
            case "activeBtn": myElement=activeBtn;break;
            case "IbanButonu": myElement=IbanButonu;break;
            case "currencyDropdownButonu": myElement=currencyDropdownButonu;break;
            case "tryBtn": myElement=tryBtn;break;
            case "integresyonKodButonu": myElement=integresyonKodButonu;break;
            case "currency": myElement=currency;break;
            case "currency2": myElement=currency2;break;






        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "txtTechnoStudy": myElement = txtTechnoStudy;break;
            case "successMessage":myElement = successMessage;break;
            case "alreadyExist": myElement = alreadyExist;break;
            case "searchResultCell":myElement = searchResultCell;break;

        }
        verifyContainsTextFunction(myElement, text);
    }

    public void findAndDelete(String searchText) {

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        //wait.until(ExpectedConditions.stalenessOf(deleteButton)); stale zamanını yakalayamadım
        //wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//tbody[@role='rowgroup']//tr"),5));
        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }

    public void findAndDelete2(String searchText) {

        findAndSend("searchDescription", searchText);
        findAndClick("searchButton");

        //wait.until(ExpectedConditions.stalenessOf(deleteButton)); stale zamanını yakalayamadım
        //wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//tbody[@role='rowgroup']//tr"),5));
        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }
}
