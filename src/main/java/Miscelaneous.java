
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Miscelaneous extends Base{

    public static void main(String[] args) throws MalformedURLException {
        driver = settingDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        System.out.println(driver.currentActivity());
        System.out.println(driver.getContext());
        System.out.println(driver.getOrientation());
        System.out.println(driver.isDeviceLocked());
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        String hey = "fksj sfjsk sfa";
        String numbers[] = hey.split(" - ");
        String fir  = numbers[0];
    };

}
