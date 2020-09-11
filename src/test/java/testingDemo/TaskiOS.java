package testingDemo;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class TaskiOS {

    public static IOSDriver<IOSElement> driver;

    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        caps.setCapability(MobileCapabilityType.APP,"Users/seema/Desktop/TestApp.app");
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.findElementByAccessibilityId("IntegerA").sendKeys("2");
        driver.findElementByAccessibilityId("IntegerB").sendKeys("3");
        driver.findElementByAccessibilityId("ComputeSumButton").click();
        String sum = driver.findElementByAccessibilityId("Answer").getText();
        Assert.assertEquals(sum, "5");
        driver.quit();
    }
}
