import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    protected static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> settingDriver(String device) throws MalformedURLException {

        System.out.println("appium test");
        File fs = new File("original.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
        //this step recently added to tell that elements shud be accessed with uiautomator
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        /*//if we dont have apk just want to launch the installed app these below are platform related activity
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"");*/
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        //how long wait for device
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
        //args are connectionlink then cap object for capabilities
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }

    public static AndroidDriver<AndroidElement> settingDriver() throws MalformedURLException {
        return settingDriver("Seema Emulator");
        //for real device we can give as "Android device" it will pick the connected one
    }
}
