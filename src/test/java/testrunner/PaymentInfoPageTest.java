package testrunner;

import base.Listener;
import base.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
@Listeners(Listener.class)
public class PaymentInfoPageTest extends TestBase {
    HomePage homePage;
    AddtoCartPage addtoCartPage;
    ShippingPage shippingPage;
    AddressPage addressPage;
    PaymentInfoPage paymentInfo;
    public PaymentInfoPageTest() {
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
//        shippingPage = new ShippingPage();
//        shippingPage.shippingInfo();
        paymentInfo = new PaymentInfoPage();
    }
    @Test()
    public void verifyPaymentInfo(){
        paymentInfo.paymentType();
    }
}
