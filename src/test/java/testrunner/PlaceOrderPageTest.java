package testrunner;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;

public class PlaceOrderPageTest extends TestBase {
    HomePage homePage;
    AddtoCartPage addtoCartPage;
    ShippingPage shippingPage;
    AddressPage addressPage;
    PaymentInfoPage paymentInfo;
    PlaceOrderPage placeOrder;
    public PlaceOrderPageTest() {
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
        paymentInfo.paymentType();
        placeOrder = new PlaceOrderPage();

    }
    @Test
    public void verifyPlaceorderMessage() throws InterruptedException {
        placeOrder.paymentDone();
        String orderDetails = placeOrder.validateThankyouMesssge();
        boolean messageFound = false;
        if (orderDetails.contains("Your order has been successfully processed!")) {
            messageFound = true;
        }
        Assert.assertTrue(messageFound, "Message 'Your order has been successfully processed!' not found in the text");

    }
}
