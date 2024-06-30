package Base;

import Utils.Browser;
import cucumber.api.java.Before;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @Before
    public static void browserSetup() {
        Browser.setup();
    }

    //   @AfterClass
    //  public static void browserTearDown() {
    //      Browser.tearDown();
    //  }
}