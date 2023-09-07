package actions;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Action extends TestBase {
    public Action(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void swipeHorizontal(@NotNull AppiumDriver<MobileElement> driver) {
        int screenWidth = driver.manage().window().getSize().getWidth();
        int startY = driver.manage().window().getSize().getHeight() / 2;
        int startX = (int) (screenWidth * 0.8);
        int endX = (int) (screenWidth * 0.2);

        new TouchAction(driver)
                .longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }
    public static void scrollDown(@NotNull AppiumDriver<MobileElement> driver) {
        int screenHeight = driver.manage().window().getSize().getHeight();
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = (int) (screenHeight * 0.8);
        int endY = (int) (screenHeight * 0.2);

        new TouchAction(driver)
                .longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }
}
