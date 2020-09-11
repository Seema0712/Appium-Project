import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseWeb {

    protected static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> settingDriver(String device) throws MalformedURLException {

        //some issue with chrome version to run

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        //how long wait for device
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
        //args are connectionlink then cap object for capabilities
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }

    public static AndroidDriver<AndroidElement> settingDriver() throws MalformedURLException {
       return driver = settingDriver("Seema Emulator");
        //for real device we can give as "Android device" it will pick the connected one
    }
}
