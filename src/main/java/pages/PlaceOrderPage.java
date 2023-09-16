package pages;

import base.Listener;
import base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

public class PlaceOrderPage extends TestBase {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]" +
            "/android.view.View/android.view.View[2]/android.widget.Button")
    AndroidElement btnnextPayment;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    AndroidElement btnContinue1;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/md_text_message")
    AndroidElement thankyouMessage;

    public PlaceOrderPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void paymentDone() throws InterruptedException {
        btnnextPayment.click();
        Thread.sleep(3000);
        btnContinue1.click();
    }
    public String validateThankyouMesssge(){
        return thankyouMessage.getText();
    }
}
