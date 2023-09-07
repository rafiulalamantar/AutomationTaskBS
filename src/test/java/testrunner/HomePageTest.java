package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
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

    @BeforeMethod
    public void setup() {
        try {
            initialization();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        homePage = new HomePage();
        addtoCartPage = new AddtoCartPage();
    }
    @Test()
    public void verifyClickonElement() throws InterruptedException {
        homePage.clickonElement();
    }


}
