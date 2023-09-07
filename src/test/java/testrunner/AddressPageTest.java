package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.AddtoCartPage;
import pages.HomePage;

import java.net.MalformedURLException;

public class AddressPageTest extends TestBase {
    HomePage homePage;
    AddtoCartPage addtoCartPage;
    AddressPage addressPage;

    public AddressPageTest() {
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
        addtoCartPage.clickOncheckOut();
        addressPage = new AddressPage();
    }
    @Test()
    public void verifyFillupAddress() throws InterruptedException {
        addressPage.fillUpAddress(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("company"),
                prop.getProperty("city"),prop.getProperty("address"),prop.getProperty("postal"));

    }
}
