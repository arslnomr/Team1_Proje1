package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'NAME')]//input)[1]")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;
    @FindBy(xpath = "(//td[@role='cell'])[2]")
    private WebElement searchResultCell;
    @FindBy(xpath = "(//ms-edit-button[contains(@table,'true')]//button)")
    private WebElement editButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement educationCode;


    WebElement myElement;

    public  void  findAndSend(String strElement, String value){
        switch (strElement){
            case "username":myElement=username;break;
            case "password":myElement=password;break;
            case "nameInput":myElement = nameInput;break;
            case "codeInput":myElement = codeInput;break;
            case "shortName":myElement = shortName;break;
            case "searchInput":myElement = searchInput;break;
            case "educationCode":myElement = educationCode;break;
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
            case "deleteButton":myElement = deleteButton;break;
            case "deleteDialogBtn":myElement = deleteDialogBtn;break;
            case "editButton": myElement=editButton;break;
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

}
