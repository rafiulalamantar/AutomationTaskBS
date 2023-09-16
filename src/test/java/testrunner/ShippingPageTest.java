package testrunner;

import base.Listener;
import base.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.AddtoCartPage;
import pages.HomePage;
import pages.ShippingPage;

import java.net.MalformedURLException;
@Listeners(Listener.class)
public class ShippingPageTest extends TestBase {
    HomePage homePage;
    AddtoCartPage addtoCartPage;
    ShippingPage shippingPage;

    AddressPage addressPage;
    public ShippingPageTest() {
        super();
    }

    @BeforeClass
    public void setup() throws InterruptedException {
        try {
            initialization();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
//        homePage = new HomePage();
//        homePage.clickonElement();
//        addtoCartPage = new AddtoCartPage();
//        addtoCartPage.clickOncheckOut();
//        addressPage = new AddressPage();
//        Thread.sleep(3000);
//        addressPage.fillUpAddress(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("company"),
//                prop.getProperty("city"),prop.getProperty("address"),prop.getProperty("postal"));
        shippingPage = new ShippingPage();
    }
    @Test()
    public void verifyShippingInfo() throws InterruptedException {
        shippingPage.shippingInfo();
    }

}
