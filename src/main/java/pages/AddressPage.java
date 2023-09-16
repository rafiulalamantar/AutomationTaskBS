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


public class AddressPage extends TestBase {
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinnerLayout")
    AndroidElement selectCountryDropdown;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    AndroidElement selectCountry;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinnerLayout")
    AndroidElement selectstateDropdown;
    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    AndroidElement selectState;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    AndroidElement firstnameField;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    AndroidElement lastnameField;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    AndroidElement emailField;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")
    AndroidElement companyField;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCity")
    AndroidElement cityField;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    AndroidElement streetAddress;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    AndroidElement zipPostal;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    AndroidElement btnContinue;
    public AddressPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public ShippingPage fillUpAddress(String firstname, String lastname, String email, String company, String city, String address, String postal) throws InterruptedException {
        selectCountryDropdown.click();
        selectCountry.click();
        Thread.sleep(5000);
        selectstateDropdown.click();
        selectState.click();
        firstnameField.sendKeys(firstname);
        lastnameField.sendKeys(lastname);
        emailField.sendKeys(email);
        companyField.sendKeys(company);
        cityField.sendKeys(city);
        streetAddress.sendKeys(address);
        scrollDown(driver);
        zipPostal.sendKeys(postal);
        btnContinue.click();

        return new ShippingPage();

    }

}
