package generalStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.Set;

//issue with the chrome driver
public class WebContext extends BaseInitializer{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver  =settingDriver();
        shopping();
        addItemToCart();
        driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
        Set<String> contexts = driver.getContextHandles();
        Thread.sleep(5000);
        for (String context : contexts) {
            System.out.println(context);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.name("q")).sendKeys("Cricket");
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP");
    }

}
