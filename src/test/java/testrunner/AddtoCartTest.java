package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddtoCartPage;
import pages.HomePage;

import java.net.MalformedURLException;

public class AddtoCartTest extends TestBase {

    HomePage homePage;
    AddtoCartPage addtoCartPage;

    public AddtoCartTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        try {
            initialization();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        homePage = new HomePage();
        homePage.clickonElement();
        addtoCartPage = new AddtoCartPage();
    }
    @Test
    public void verifyClickonCheckoutBtn(){
        addtoCartPage.clickOncheckOut();
    }
}
