import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

public class TouchActions extends Base{

    public static void main(String[] args) throws MalformedURLException {
        driver = settingDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //attribute and value only
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().enabled(true)").size());
        TouchAction touch = new TouchAction(driver);
        WebElement listElement = driver.findElementByAccessibilityId("Expandable Lists");
        //touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
        //using static import to reduce the classNames
        touch.tap(tapOptions().withElement(element(listElement))).perform();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]").click();
        WebElement peopleElement = driver.findElementByXPath("//*[@text='People Names']");
        //for long press with hold for some seconds
        touch.longPress(longPressOptions().withElement(element(peopleElement)).withDuration(ofSeconds(2000))).perform();
        driver.findElementByXPath("//*[@text='Sample menu']").isDisplayed();
    }
}
