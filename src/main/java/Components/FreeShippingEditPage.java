package Components;

import Utils.WaitTool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.BasePage.*;


public class FreeShippingEditPage {

    private static final By EDIT_DATE_BUTTON = By.xpath("//*[@id='input-date-end']/following-sibling::span");
    private static final By DATE_FIELD_INPUT = By.id("input-date-end");
    private static final By POP_UP_SET_DATE_FIELD = By.xpath("(//*[@class='datepicker-days']//td[@class='day'])[14]");
    private static final By STATUS_BUTTON = By.id("input-status");


    public static void click0nEditDateButton(){
        WaitTool.waitForElementtobeClicable(EDIT_DATE_BUTTON, 10);
        clickOnWebElementByLocator(EDIT_DATE_BUTTON);
    }

    public static void type0nDateFieldInput(){
        WaitTool.waitForElementtobeClicable(DATE_FIELD_INPUT, 10).clear();

    }
    public static void setDateField(String dateField){
        writeDateInputField(dateField);
    }
    private static void writeDateInputField(String dateField) {
        writeTextInWebElement(DATE_FIELD_INPUT, dateField);
    }

//    public static void click0nPopUpDateButton(){
 //       WaitTool.waitForElementtobeClicable(POP_UP_SET_DATE_FIELD, 10);
 //       clickOnWebElementByLocator(POP_UP_SET_DATE_FIELD);
  //  }

    public static void click0nStatusButtonChange(){
        WaitTool.waitForElementtobeClicable(STATUS_BUTTON, 10);
        selectDropdownOptionByVisibleText(STATUS_BUTTON,"Enabled");

    }
}





