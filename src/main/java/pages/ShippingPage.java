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
public class ShippingPage extends TestBase {

    @FindBy(xpath = "//android.widget.TextView[@index='2']")
    AndroidElement nextdaySelect;
    public ShippingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public PaymentInfoPage shippingInfo() throws InterruptedException {

        Thread.sleep(5000);
        scrollDown(driver);
        nextdaySelect.click();
//        btnContinue.click();
        return new PaymentInfoPage();
    }
}
