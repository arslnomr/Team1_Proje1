package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_S_FormContent extends A_S_HelperFunctions {
    @FindBy(id = "mat-select-value-21")
    public WebElement nextGrade;
    @FindBy(xpath = "//span[text()='None']")
    public WebElement nextGradeSelect;

    @FindBy(css = "[class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb'])[2]")
    public WebElement activateRadioButton;

    public A_S_FormContent() {
        PageFactory.initElements(GeneralWD.getDriver(), this);
    }

    WebElement myElement;


    public WebElement createElementByXpathDataPlaceholder(String elementText) {                                                     // TODO Burayi NOT AL "and" le yapildi
        return waitUntilClickableAndReturn(GeneralWD.getDriver().findElement(By.xpath("//input[@data-placeholder='" + elementText +"' and @aria-required='true']")));
    }

    public WebElement createElementByXpathTextSpan(String elementText){                        //span[text()="None"]
        return waitUntilClickableAndReturn(GeneralWD.getDriver().findElement(By.xpath("//span[text()='"+elementText+ "']")));
    }

    public WebElement creatMessageByXpath(String elementText){ //div[text()='Grade Level successfully deleted']
        return waitUntilVisibleAndReturn(GeneralWD.getDriver().findElement(By.xpath("//div[text()='Grade Level successfully " + elementText + "']")));
    }
    public void findAndSend(String strElement, String value) {
        myElement = createElementByXpathDataPlaceholder(strElement);
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        myElement = createElementByXpathTextSpan(strElement);
        clickFunction(myElement);
    }

}
