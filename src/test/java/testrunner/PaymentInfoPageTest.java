package testrunner;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;

public class PaymentInfoPageTest extends TestBase {
    HomePage homePage;
    AddtoCartPage addtoCartPage;
    ShippingPage shippingPage;
    AddressPage addressPage;
    PaymentInfoPage paymentInfo;
    public PaymentInfoPageTest() {
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
        addressPage.fillUpAddress(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("company"),
                prop.getProperty("city"),prop.getProperty("address"),prop.getProperty("postal"));
        shippingPage = new ShippingPage();
        shippingPage.shippingInfo();
        paymentInfo = new PaymentInfoPage();
    }
    @Test()
    public void verifyPaymentInfo(){
        paymentInfo.paymentType();
    }
}
