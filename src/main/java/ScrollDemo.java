import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ScrollDemo extends Base{

    public static void main(String[] args) throws MalformedURLException {
        driver = settingDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //this code is taken from Android API to scroll the screen
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
    }
}
