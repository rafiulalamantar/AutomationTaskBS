package pages;

import base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AddtoCartPage extends TestBase {
    HomePage homePage;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")
    AndroidElement btnCheckout;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    AndroidElement btnguestCheckout;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    AndroidElement guidlineAccept;
    public AddtoCartPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public AddressPage clickOncheckOut(){
        btnCheckout.click();
        btnguestCheckout.click();
        return new AddressPage();
    }
}
