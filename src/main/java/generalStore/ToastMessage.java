package generalStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class ToastMessage extends BaseInitializer{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = settingDriver();
        //for toast will not be able to inspect it
        //by default the class will android.widget.Toast and the name attribute
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));").click();
        driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        String toastMessage = driver.findElementByXPath("//android.widget.Toast").getAttribute("name");
        System.out.println(toastMessage);
    }
}
