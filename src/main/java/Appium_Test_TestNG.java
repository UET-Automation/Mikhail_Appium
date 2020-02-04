import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;


public class Appium_Test_TestNG extends AppiumServerJava {
    private static AndroidDriver<WebElement> driver;
//    private AppiumServerJava appiumServer;


    @BeforeTest
    public static void setUp() throws Exception {

        Appium_Test_DUT.main();
          }

          @Test
    public static void testLoginPage() throws Exception {



              //Set the Desired Capabilities and starting the TEST application
              DesiredCapabilities caps = new DesiredCapabilities();
              caps.setCapability("deviceName", "Android Phone");
              caps.setCapability("appPackage", "com.att.myWireless");
              caps.setCapability("appActivity", "com.att.myWireless.activity.login.SplashScreenActivity");
              caps.setCapability("noReset", "true");

              //Instantiate Appium Driver
              try {
                  AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
                  driver.context("NATIVE_APP");

              } catch (MalformedURLException e) {
                  System.out.println(e.getMessage());
              }

              //driver.context("NATIVE_APP");
    driver.findElement(By.xpath("//*[resource-id=\"com.att.myWireless:id/fingerprint_cancel_button\"]")).click();
    //    driver.findElement(By.xpath("//*[@resource-id=\"com.att.myWireless:id/acceptButton\"]")).click();
//        Thread.sleep(1000L);
//        driver.findElement(By.xpath("//*[@resource-id=\"com.att.myWireless:id/disable_location_services_button\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@text=\"armenin2001\"]")).click();
        Thread.sleep(1000L);

        driver.findElement(By.id("com.att.myWireless:id/wirelessNumField")).sendKeys("TESTING");
        driver.findElement(By.id("com.att.myWireless:id/passwordField")).sendKeys("12345");

        driver.findElement(By.xpath("//*[@resource-id=\"com.att.myWireless:id/showHidePasswordBtn\"]")).click();
        driver.findElement(By.id("com.att.myWireless:id/showHidePasswordBtn")).click();
        driver.findElement(By.id("com.att.myWireless:id/savePasswordSwitchNewLogin")).click();
        driver.findElement(By.id("com.att.myWireless:id/savePasswordNo")).click();
        driver.findElement(By.id("com.att.myWireless:id/savePasswordSwitchNewLogin")).click();
        driver.findElement(By.id("com.att.myWireless:id/savePasswordYes")).click();
        driver.findElement(By.id("com.att.myWireless:id/manageAppSettingsBtn")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("com.att.myWireless:id/backButton")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("com.att.myWireless:id/loginBtn")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("android:id/button1")).click();
        Thread.sleep(1000L);
      }

    @AfterTest
    public void tearDown() {


    stopServer();
        driver.quit();

    }


}

