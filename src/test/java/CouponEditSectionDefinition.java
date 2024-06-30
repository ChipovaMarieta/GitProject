import Admin.LoginPage;
import Base.BaseTest;
import Components.AdminLeftNavigationBar;
import Components.CouponDashboard;
import Components.FreeShippingEditPage;
import Components.HeaderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CouponEditSectionDefinition {
    @Given("the user is in admin panel portal")
    public void theUserIsInAdminPanelPortal() {
        LoginPage.goToLoginPage();


    }

    @When("he apply their credentials")
    public void heApplyTheirCredentialsSubmit() {
        LoginPage.login("admin1", "parola123!");

    }


    @When("the user goes in Marketing section in Navigation Bar")
    public void theUserGoesInMarketingSectionInNavigationBar() {
        AdminLeftNavigationBar.click0nMarketingButton();

    }

    @When("the user get in the Coupons section")
    public void theUserGetInTheCouponsSection() {
        AdminLeftNavigationBar.clickOnOrdersButton();
    }

    @When("choose Free shipping coupon and click to edit it")
    public void chooseFreeShippingCouponAndClickToEdit() {
        CouponDashboard.click0nEditFreeShipingButton();

    }

    @When("choose proper date as a final date")
    public void chooseProperDateAsFinal() {
        FreeShippingEditPage.click0nEditDateButton();
        FreeShippingEditPage.click0nEditDateButton();
        FreeShippingEditPage.type0nDateFieldInput();
    }

    @When("change the status to enable")
    public void changeTheStatusToEnable(){
        FreeShippingEditPage.click0nStatusButtonChange();
        FreeShippingEditPage.setDateField("2014-02-15");
    }

    @When("save the changes")
    public void saveTheChanges() {
        HeaderPage.click0nSaveButton();

    }

    @Then("there is a alert on the screen as a successful operation")
    public void thereIsAlertOnTheScreenAsSuccessfulOperation() {
  //      String actualText = HeaderPage.getAlertNotification();
        String actualAlertText = HeaderPage.getAlertNotification().trim().replace("\n", " ").replace("\r", " ").replaceAll("\\s+", " ");
        String expectedAlertText = "Success: You have modified coupons! ×".trim().replace("\n", " ").replace("\r", " ").replaceAll("\\s+", " ");
        Assert.assertEquals(expectedAlertText, actualAlertText);


    }




}
