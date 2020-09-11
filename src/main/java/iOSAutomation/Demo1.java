package iOSAutomation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class Demo1 extends BaseIOS{

    public static void main(String[] args) throws MalformedURLException {
       IOSDriver<IOSElement> driver = driverInitialization();
      /* driver.findElementByAccessibilityId("Alert Views").click();
       driver.findElementByXPath("//*[@name='Text Entry']").click();
       driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hey");
       driver.findElementByXPath("//XCUIElementTypeButton[@name='OK']").click();
       driver.navigate().back();

       //this method not supported
      *//* Dimension dimension = driver.manage().window().getSize();
       int x = dimension.getWidth()/2;
       int startY = (int) (dimension.getHeight()*0.69);
       int endY = (int) (dimension.getHeight()*0.10);
       driver.swipe(x, starty, x, endy, 2000);
*//*
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "down");
        driver.executeScript("mobile: swipe", params);
        driver.findElementByAccessibilityId("Text View").click();
        driver.navigate().back();
        driver.findElementByXPath("//*[@name='StepperViewController']").click();
        int count = 3;
        for(int i=0; i<count;i++) {
            driver.findElementByXPath("(//XCUIElementTypeButton[@name='Increment'])[1]").click();
        }
        String countVal = driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getAttribute("value");
        if(count==Integer.parseInt(countVal))
            System.out.println("values are correct");

        driver.navigate().back();

        //Picker view it is generally be handled using sendKeys() method
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Red color component value").sendKeys("70");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("210");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("125");

        driver.navigate().back();

        //Alerts section
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByAccessibilityId("Simple").click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.navigate().back();*/

        //Switches section
        driver.findElementByAccessibilityId("Switches").click();
        String val = driver.findElementsByClassName("XCUIElementTypeSwitch").get(0).getAttribute("value");
        if(Integer.parseInt(val)==1)
            System.out.println("switch is selected");
        driver.findElementsByClassName("XCUIElementTypeSwitch").get(0).click();
        if(Integer.parseInt(val)==0)
            System.out.println("switch is deselected");
    }
}
