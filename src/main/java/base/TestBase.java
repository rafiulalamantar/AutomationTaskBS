package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestBase {
    public static AndroidDriver driver;
    public static Properties prop;
    public TestBase() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("E:\\Automation\\AutomationTask" +
                    "\\src\\main\\java\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","emulator");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11");
        caps.setCapability("appPackage","com.nopstation.nopcommerce.nopstationcart");
        caps.setCapability("appActivity","com.bs.ecommerce.main.SplashScreenActivity");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","E:\\BS\\nopstationCart_4.40.apk");
        caps.setCapability("noReset",true);
        caps.setCapability("fullReset",false);

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url,caps);

    }
    @AfterTest()
    public void teardown(){
        driver.quit();
    }
}
