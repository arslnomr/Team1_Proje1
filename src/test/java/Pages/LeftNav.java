package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GeneralWD.getDriver(), this);
    }

    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')])[5]")
    private WebElement setupOne;
    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')])[6]")
    private WebElement parameters;
    @FindBy(xpath="(//fuse-nav-vertical-item[contains(@class,'ng-tns-c2')])[7]")
    private WebElement  discounts;
    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')]/following-sibling::span)[51]")
    private WebElement humanResrc;
    @FindBy(xpath = "(//fa-icon[contains(@class,'collapsable-arrow')])[11]")
    private WebElement positionSetup;
    @FindBy(xpath = "(//fuse-nav-vertical-item[contains(@class,'ng-tns-c2')])[48]")
    private WebElement positions;
    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')])[88]")
    private WebElement education;
    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')])[90]")
    private WebElement educationSetup;
    @FindBy(xpath = "(//fuse-nav-vertical-item[contains(@class,'ng-tns-c2')])[67]")
    private WebElement subjectCategories;
    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    private WebElement nationality;
    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')])[21]")
    private WebElement schoolSetup;
    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;
    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;
    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestationBtn;
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpB;
    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccount;

    WebElement myElement;
    public void findAndClick(String strlement)
    {
        switch (strlement)
        {
            case "setupOne": myElement=setupOne;break;
            case "parameters": myElement=parameters;break;
            case "discounts": myElement=discounts;break;
            case "nationality": myElement=nationality;break;
            case "humanResrc": myElement=humanResrc;break;
            case "positionSetup": myElement=positionSetup;break;
            case "positions": myElement=positions;break;
            case "education": myElement=education;break;
            case "educationSetup": myElement=educationSetup;break;
            case "subjectCategories": myElement=subjectCategories;break;
            case "schoolSetup": myElement=schoolSetup;break;
            case "locations": myElement=locations;break;
            case "departments": myElement=departments;break;
            case "attestationBtn": myElement=attestationBtn;break;
            case "setUpB": myElement=setUpB;break;
            case "bankAccount": myElement=bankAccount;break;

        }
        clickFunction(myElement);
    }
}
