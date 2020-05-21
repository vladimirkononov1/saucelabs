package Academy.Saucelabs;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SauceLabsTest {
	
	public static final String SAUCE_USERNAME = "vladimirkon";
	public static final String SAUCE_ACCESS_KEY = "8d30410b-e5ac-493b-87c5-b7bb263b3de3";
//	public static final String SAUCE_DC = "US-WEST1";
	public static final String URL = "http://" + SAUCE_USERNAME + ":" + SAUCE_ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			
		DesiredCapabilities caps = DesiredCapabilities.safari();

//		FirefoxOptions browserOptions = new FirefoxOptions();
		SafariOptions browserOptions = new SafariOptions();
		browserOptions.setCapability("platformName", "macOS 10.14");
		browserOptions.setCapability("browserVersion", "12.0");
		browserOptions.setCapability("sauce:options", caps);
//		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
