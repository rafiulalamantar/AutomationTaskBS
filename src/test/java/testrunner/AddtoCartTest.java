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
@Listeners(Listener.class)
public class AddtoCartTest extends TestBase {

    HomePage homePage;
    AddtoCartPage addtoCartPage;

    public AddtoCartTest() {
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
        addtoCartPage = new AddtoCartPage();
    }
    @Test
    public void verifyClickonCheckoutBtn(){
        addtoCartPage.clickOncheckOut();
    }
}
