import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

//        File appDirectory = new File("src");
//        File apk = new File(appDirectory, "ApiDemos-debug.apk");


        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        service.start();
//your test scripts logic...
        service.stop();


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
//        cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }
}
