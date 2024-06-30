package Components;

import Base.BasePage;
import Utils.WaitTool;
import org.openqa.selenium.By;



public class CouponDashboard extends BasePage {

    private static final By EDIT_FREE_SHIPPING_COUPON_BUTTON = By.xpath("(//*[@class='fa fa-pencil'])[3]");

    public static void click0nEditFreeShipingButton(){
        WaitTool.waitForElementtobeClicable(EDIT_FREE_SHIPPING_COUPON_BUTTON, 10);
        clickOnWebElementByLocator(EDIT_FREE_SHIPPING_COUPON_BUTTON);
    }
}
