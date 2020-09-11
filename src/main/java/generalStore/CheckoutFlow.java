package generalStore;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import java.net.MalformedURLException;
import java.time.Duration;

//not working in T&C screen
public class CheckoutFlow extends BaseInitializer{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = settingDriver();
        shopping();
        addItemToCart();
        //click on the checkbox for sending discounts
        driver.findElementByXPath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']").click();
        //long press on T&Cs text
        WebElement termsElement = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        TouchAction action = new TouchAction(driver);
        action.longPress(longPressOptions().withElement(element(termsElement)).withDuration(ofSeconds(3000))).perform();
        //check the title and message of alert tile
        System.out.println(driver.findElementById("com.androidsample.generalstore:id/alertTitle").getText());
        System.out.println(driver.findElementById("android:id/message").getText());
        //close the alert
        WebElement closeButton = driver.findElementByXPath("//android.widget.Button[@text='CLOSE']");
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(closeButton))).perform();
        //click on complete purchase
        driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();

    }

}
