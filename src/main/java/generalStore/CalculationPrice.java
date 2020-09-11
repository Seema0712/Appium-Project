package generalStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//need to optimize based on the no. of items want to add
public class CalculationPrice extends BaseInitializer{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = settingDriver();
        shopping();
        driver.findElementsByXPath("//*[@resource-id='com.androidsample.generalstore:id/productAddCart']").get(0).click();
        driver.findElementsByXPath("//*[@resource-id='com.androidsample.generalstore:id/productAddCart']").get(1).click();
        String products = driver.findElementById("com.androidsample.generalstore:id/counterText").getText();
        if(Integer.valueOf(products)==2)
            System.out.println("Products are proper");
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        //here wait is used as the second screen appears so it has to wait till all the elements loaded properly
        Thread.sleep(5000);
        String prodVal1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
        String prodVal2  = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
        float totalVal = Float.parseFloat(deAmount(prodVal1))+Float.parseFloat(deAmount(prodVal2));
        Float totalValApp = Float.parseFloat(deAmount(driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText()));
        if(totalVal==totalValApp)
            System.out.println("Amount is correct");
    }
}
