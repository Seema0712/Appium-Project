import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DragAndDrop extends Base{

    public static void main(String[] args) throws MalformedURLException {
        driver = settingDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByXPath("//*[@text='Drag and Drop']").click();
        TouchAction t = new TouchAction(driver);
        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
        //here we dont have to use Longpressoptions first as we dont need to provide any duration
        t.longPress(element(source)).moveTo(element(destination)).release().perform();
    }
}
