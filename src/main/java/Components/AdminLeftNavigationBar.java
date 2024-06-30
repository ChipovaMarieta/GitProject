package Components;

import Base.BasePage;
import Utils.WaitTool;
import org.openqa.selenium.By;

import static Base.BasePage.clickOnWebElementByLocator;

public class AdminLeftNavigationBar extends BasePage {

    private static final By MARKETING_BUTTON = By.id("menu-marketing");
    private static final By COUPON_BUTTON = By.cssSelector("#menu-marketing ul>li:nth-of-type(2)");


    public static void click0nMarketingButton(){
        WaitTool.waitForElementtobeClicable(MARKETING_BUTTON, 10);
        clickOnWebElementByLocator(MARKETING_BUTTON);
    }

    public static void clickOnOrdersButton(){
        WaitTool.waitForElementtobeClicable(COUPON_BUTTON, 10);
        clickOnWebElementByLocator(COUPON_BUTTON);
    }
}
