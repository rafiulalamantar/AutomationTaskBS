package testrunner;

import base.Listener;
import base.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AddtoCartPage;
import pages.HomePage;

import java.net.MalformedURLException;
public class HomePageTest extends TestBase {
    HomePage homePage;
    AddtoCartPage addtoCartPage;

    public HomePageTest() {
        super();
    }

    @BeforeClass
    public void setup() {
        try {
            initialization();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        homePage = new HomePage();
    }
    @Test()
    public void verifyClickonElement() throws InterruptedException {
        homePage.clickonElement();
    }


}
