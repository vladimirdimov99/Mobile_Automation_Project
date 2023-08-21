package Tests.AndroidTests;

import Pages.AndroidOS.AndroidCalculatorApplication;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MultiplyIdenticalNumbers {
    AppiumDriver driver;

    @BeforeTest
    public void openAndroidCalculatorApplication() throws MalformedURLException {
        AndroidCalculatorApplication androidCalculatorApplication = new AndroidCalculatorApplication(driver);
        androidCalculatorApplication.openAndroidCalculator();
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url,androidCalculatorApplication.openAndroidCalculator());
    }

    @Test(priority = 1)
    public void CheckIfAndroidCalculatorApplicationHasStarted(){
        AndroidCalculatorApplication androidCalculatorApplication = new AndroidCalculatorApplication(driver);
        Boolean isCalculatorStarted;
        try{
            isCalculatorStarted = driver.findElement(androidCalculatorApplication.calculatorApp).isDisplayed();
        }
        catch(Exception e){
            isCalculatorStarted = false;
        }
        Assert.assertTrue(isCalculatorStarted, "The Calculator Application is not started!!!");
    }

    @Test(priority = 2)
    public void MultiplyIdenticalNumbers() {
        AndroidCalculatorApplication androidCalculatorApplication = new AndroidCalculatorApplication(driver);
        androidCalculatorApplication.selectANumber();
        androidCalculatorApplication.selectMultiplySign();
        androidCalculatorApplication.selectANumber();
        String realTimeResult = driver.findElement((androidCalculatorApplication.checkRealTimeResult)).getText();
        androidCalculatorApplication.selectEqualSign();

        String actualResult = driver.findElement(androidCalculatorApplication.checkResult).getText();
        Assert.assertEquals(realTimeResult, actualResult);
    }

    @AfterTest
    public void closeTheApplication() {driver.quit();}
}
