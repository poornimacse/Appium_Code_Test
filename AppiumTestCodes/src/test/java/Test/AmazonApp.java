package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.Pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AmazonApp {
	AppiumDriver<MobileElement> driver;
	@BeforeTest
    public void setup() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Y2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("udid", "3b264f1");
		cap.setCapability("platformVersion", "9.0.0");
		cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		Pages app = PageFactory.initElements(driver, Pages.class);
		TouchActions action = new TouchActions(driver);
     }
    
	@AfterTest
    public void teardown() {
    	driver.close();
    	driver.quit();
    }
}
