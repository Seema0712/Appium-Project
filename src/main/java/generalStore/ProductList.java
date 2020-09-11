package generalStore;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class ProductList extends BaseInitializer{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = settingDriver();
        shopping();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
        driver.findElementByXPath("//*[@text='Jordan 6 Rings']/following-sibling::android.widget.LinearLayout/*[@text='ADD TO CART']").click();
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();

    }
}
