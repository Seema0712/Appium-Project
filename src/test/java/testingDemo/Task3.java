package testingDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;

public class Task3 {

    protected static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) {

        try {
            File fs = new File("original.apk");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Seema_Emulator");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            driver.rotate(ScreenOrientation.LANDSCAPE);
            driver.rotate(ScreenOrientation.PORTRAIT);
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("Screenshot.png"));
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
