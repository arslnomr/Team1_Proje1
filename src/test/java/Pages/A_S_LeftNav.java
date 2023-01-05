package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class A_S_LeftNav extends A_S_HelperFunctions {
    public A_S_LeftNav() {
        PageFactory.initElements(GeneralWD.getDriver(), this);
    }

    WebElement myElement;

    public WebElement createElementByXpath(String elementText) {
        return waitUntilClickableAndReturn(GeneralWD.getDriver().findElement(By.xpath("//span[text()='" + elementText + "']")));
    }

    public void findAndClick(String strElement) {
        myElement = createElementByXpath(strElement);
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

        }
        verifyContainsTextFunction(myElement, text);
    }
}
