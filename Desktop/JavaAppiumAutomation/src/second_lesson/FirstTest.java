package second_lesson;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstTest {

	private AppiumDriver driver;

	@Before
	public void setUp() throws Exception
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "AndroidTestDevice");
		desiredCapabilities.setCapability("platformVersion", "11");
		desiredCapabilities.setCapability("automationName", "Appium");
		desiredCapabilities.setCapability("appPackage", "org.wikipedia");
		desiredCapabilities.setCapability("appActivity", ".main.MainActivity");
		desiredCapabilities.setCapability("app", "/Users/rsa/Desktop/JavaAppiumAutomation/apks/org.wikipedia.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void firstTest()
	{
		System.out.println("First test run");
	}
}
