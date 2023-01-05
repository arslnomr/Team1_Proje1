package Pages;

import Utilities.GeneralWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class A_S_HelperFunctions {

    WebDriverWait wait = new WebDriverWait(GeneralWD.getDriver(), Duration.ofSeconds(30));

    public void clickFunction(WebElement element) {

        waitUntilClickableAndReturn(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);

    }

    public void verifyContainsTextFunction(WebElement element, String text) {

        waitUntilVisible(element);
        scrollToElement(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()), "The text could not be find");
        // new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void waitUntilLoading() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

    public void elementExists() {
        if (GeneralWD.getDriver().findElements(By.cssSelector("[class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).size() > 0) {
            Actions actions = new Actions(GeneralWD.getDriver());
            actions.sendKeys(Keys.ESCAPE).build().perform();
        }
        //public boolean....
        /*boolean exist=false;
        if(GWD.getDriver().findElements(By.cssSelector("[class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).size() > 0){
            exist=true;
        }
        return exist;*/

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilClickableAndReturn(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public WebElement waitUntilVisibleAndReturn(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GeneralWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


}
