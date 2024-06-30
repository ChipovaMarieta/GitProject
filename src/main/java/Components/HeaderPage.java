package Components;

import Base.BasePage;
import Utils.WaitTool;
import org.openqa.selenium.By;

import static Base.BasePage.clickOnWebElementByLocator;

public class HeaderPage extends BasePage {

    private static final By SAVE_BUTTON = By.xpath("//div[@class='pull-right']/button");
    private static final By ALERT_NOTIFICATION = By.cssSelector("div.alert");
    public static void click0nSaveButton(){
        WaitTool.waitForElementtobeClicable(SAVE_BUTTON, 10);
        clickOnWebElementByLocator(SAVE_BUTTON);
    }

    public static String getAlertNotification(){
        return driver.findElement(ALERT_NOTIFICATION).getText();
    }
}
