package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GeneralWD.getDriver(), this);
    }

    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')]/following-sibling::span)[51]")
    private WebElement humanResrc;
    //(//fa-icon[contains(@class,'ng-fa-ico')]/following-sibling::span)[51]
    //(//fa-icon[contains(@class,'ng-fa-ico')])[61]
    @FindBy(xpath = "(//fa-icon[contains(@class,'ng-fa-ico')])[63]")
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
    private WebElement nationalities;




    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccountButton;





    WebElement myElement;
    public void findAndClick(String strlement)
    {
        switch (strlement)
        {
            case "humanResrc": myElement=humanResrc;break;
            case "positionSetup": myElement=positionSetup;break;
            case "positions": myElement=positions;break;
            case "education": myElement=education;break;
            case "nationalities": myElement=nationalities;break;
            case "educationSetup": myElement=educationSetup;break;
            case "subjectCategories": myElement=subjectCategories;break;
            case "setupOne" :myElement=setupOne;break;
            case "schoolSetup" : myElement=schoolSetup;break;
            case "locations" : myElement=locations;break;
            case "departments":myElement=departments;break;
            case "parametersButton":myElement=parametersButton;break;
            case "bankAccountButton":myElement=bankAccountButton;break;
        }

        clickFunction(myElement);
    }
}
