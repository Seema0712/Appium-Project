import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

public class Swipe extends Base{

    public static void main(String[] args) throws MalformedURLException {
        driver = settingDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAccessibilityId("Date Widgets").click();
        driver.findElementByAccessibilityId("2. Inline").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();
        //now we have long press for sometime then move to other element and release it
        WebElement minuteHand = driver.findElementByAccessibilityId("15");
        WebElement minuteHand2 = driver.findElementByAccessibilityId("35");
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(longPressOptions().withElement(element(minuteHand)).withDuration(ofSeconds(2))).moveTo(element(minuteHand2)).release().perform();
        System.out.println(minuteHand2.isSelected());
    }
}
