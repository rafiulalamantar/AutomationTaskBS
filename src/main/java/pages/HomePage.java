package pages;

import base.TestBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static actions.Action.scrollDown;
import static actions.Action.swipeHorizontal;

public class HomePage extends TestBase {
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    AndroidElement guidlineAccept;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Placeholder\"]")
    List<AndroidElement> selectElement;
    @FindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Placeholder\"])[3]")
    AndroidElement selectAddIcon;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    AndroidElement counterIcon;


    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public AddtoCartPage clickonElement() throws InterruptedException {

        guidlineAccept.click();
        Thread.sleep(5000);
        swipeHorizontal(driver);
        swipeHorizontal(driver);
        Thread.sleep(3000);
        Thread.sleep(5000);
        selectElement.get(3).click();
        Thread.sleep(3000);
        scrollDown(driver);
        selectAddIcon.click();
        selectAddIcon.click();
        counterIcon.click();
        return new AddtoCartPage();
    }


}
