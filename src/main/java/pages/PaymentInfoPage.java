package pages;

import base.Listener;
import base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import static actions.Action.scrollDown;

public class PaymentInfoPage extends TestBase {
    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[14]")
    AndroidElement paymentInfo;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    AndroidElement btnContinue;
    public PaymentInfoPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public PlaceOrderPage paymentType(){
        scrollDown(driver);
        scrollDown(driver);
        scrollDown(driver);
        scrollDown(driver);
        paymentInfo.click();
        btnContinue.click();
        return new PlaceOrderPage();
    }

}
