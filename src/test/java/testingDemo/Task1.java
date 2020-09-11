package testingDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;

public class Task1 {

    protected static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) {

        try {
            File fs = new File("original.apk");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Seema_Emulator");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


