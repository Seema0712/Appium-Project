package iOSAutomation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseIOS {

    public static IOSDriver<IOSElement> driver;

    public static IOSDriver<IOSElement> driverInitialization() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        //If the app is already installed
        caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.example.apple-samplecode.UICatalog");
        //caps.setCapability(MobileCapabilityType.APP,"/Users/seema/Desktop/UIKitCatalog.app");
        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        return driver;
    }
}