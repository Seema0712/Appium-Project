import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class WebDemo extends BaseWeb {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = settingDriver();
        driver.get("https://www.facebook.com/");
        driver.findElementByName("email").sendKeys("dkfj");
        driver.findElementById("m_login_password").sendKeys("sdf");
        driver.findElementByName("login").click();
    }
}
