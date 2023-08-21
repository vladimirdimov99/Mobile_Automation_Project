package Pages.AndroidOS;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCalculatorApplication {
    AppiumDriver driver;
    public AndroidCalculatorApplication (AppiumDriver driver) {this.driver = driver;}

    public By selectNumber = By.id("com.sec.android.app.popupcalculator:id/bt_07");
    public By selectMultiply = By.id("com.sec.android.app.popupcalculator:id/bt_mul");
    public By selectDivide = By.id("com.sec.android.app.popupcalculator:id/bt_div");
    public By selectAdd = By.id("com.sec.android.app.popupcalculator:id/bt_add");
    public By selectSubtract = By.id("com.sec.android.app.popupcalculator:id/bt_sub");
    public By selectEqual = By.id("com.sec.android.app.popupcalculator:id/bt_equal");
    public By selectHistory = By.id("com.sec.android.app.popupcalculator:id/history_button");
    public By checkResult = By.id("com.sec.android.app.popupcalculator:id/txtCalc");
    public By checkRealTimeResult = By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult");
    public By calculatorApp = By.id("android:id/decor_content_parent");
    public By historyButton = By.id("com.sec.android.app.popupcalculator:id/history_button");
    public By historyResult = By.id("com.sec.android.app.popupcalculator:id/historyResult");
    public By selectClearHistoryButton = By.id("com.sec.android.app.popupcalculator:id/clear_btn");
    public By historyList = By.id("com.sec.android.app.popupcalculator:id/historyList");

    public DesiredCapabilities openAndroidCalculator(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "device");
        capabilities.setCapability("udid", "0715f710e48f1d36");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        return capabilities;
    }

    public void selectANumber(){
        driver.findElement(selectNumber).click();
    }

    public void selectMultiplySign(){
        driver.findElement(selectMultiply).click();
    }

    public void selectEqualSign(){
        driver.findElement(selectEqual).click();
    }

    public void selectDivideSign(){driver.findElement(selectDivide).click();}

    public void selectAddSign(){driver.findElement(selectAdd).click();}

    public void selectSubtractSign(){driver.findElement(selectSubtract).click();}

    public void selectHistoryButton(){driver.findElement(historyButton).click();}

    public void selectClearHistoryButton(){driver.findElement(selectClearHistoryButton).click();}

}
