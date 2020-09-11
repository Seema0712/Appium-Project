import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Demo1 extends Base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = settingDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //xpath syntax //tagname[@attribute='value']
        driver.findElementByAccessibilityId("Preference").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementById("android:id/edit").sendKeys("hey");
        driver.findElementsByClassName("android.widget.Button").get(2).click();
    }
}
