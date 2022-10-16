package basicAppium;

import factoryDevices.IDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasicAppium implements IDevice {

    private AppiumDriver driver;

    @BeforeEach
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Cato");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("platformName","Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterEach
    public void cleanUp(){
       driver.quit();

    }

    @Test
    public void verifyCalculator() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        //implicit 8 appium
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.findElement(By.id("com.google.android.calculator:id/result_final")).click();
        //verification result

        String expectedResult = "8";
        String actualResult = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();

        Assertions.assertEquals(expectedResult,actualResult,"ERROR!! la suma esta mal");

    }

    @Override
    public AppiumDriver create() {
        return null;
    }
}
