import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Appium_Test_DUT {

//    public static void main(String[] args) {
        public static void main() {

        // Starting APPIUM SERVER automatically
        AppiumServerJava.main();



//            //Set the Desired Capabilities and starting the TEST application
//            DesiredCapabilities caps = new DesiredCapabilities();
//            caps.setCapability("deviceName", "Android Phone");
//            caps.setCapability("appPackage", "com.att.myWireless");
//            caps.setCapability("appActivity", "com.att.myWireless.activity.login.SplashScreenActivity");
//            caps.setCapability("noReset", "true");
//
//            //Instantiate Appium Driver
//            try {
//                AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//                driver.context("NATIVE_APP");
//
//
//
//            } catch (MalformedURLException e) {
//                System.out.println(e.getMessage());
//            }
        }


}


