package generalStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseInitializer {

    protected static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> settingDriver(String device) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
        //we can check it from the appium logs when it will install in the device
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"10");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
        return driver;
    }

    public static AndroidDriver<AndroidElement> settingDriver() throws MalformedURLException {
       // return settingDriver("Seema Emulator");
        return settingDriver("Version10");
    }

    public static void shopping() {
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hey");
        driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
    }

    public static String deAmount(String amount) {
        return amount.replace("$","");
    }

    public static void addItemToCart() {
        driver.findElementsByXPath("//*[@resource-id='com.androidsample.generalstore:id/productAddCart']").get(0).click();
        driver.findElementById("com.androidsample.generalstore:id/counterText").click();
    }
}
