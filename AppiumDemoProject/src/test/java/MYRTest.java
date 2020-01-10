import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

	
			
public class MYRTest {
	  
	
        
		// create global variable
		 
		private static AndroidDriver driver;
		 
		public static void main(String[] args) throws MalformedURLException, InterruptedException 
		{
		 
		 
		 // Create object of DesiredCapabilities class                             
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 
		 
		 
		// Optional
		 
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		 
		 
		// Specify the device name (any name)
		 
		capabilities.setCapability("deviceName", "Android");
		 
		 
		// Platform version
		 
		capabilities.setCapability("platformVersion", "9"); 
		 
		 
		// platform name
		 
		capabilities.setCapability("platformName", "Android");
		 
		 
		// specify the application package that we copied from appium                
		 
		capabilities.setCapability("appPackage", "com.ttiglobal.myrenault");
		 
		 
		// specify the application activity that we copied from appium                   
		 
		capabilities.setCapability("appActivity", "com.ttiglobal.myrenault.MainActivity");
		 
		 
		// Start android driver I used 4727 port by default it will be 4723
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		 
		 
		 
		// Specify the implicit wait of 5 second
		 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 
		
		 
		Thread.sleep(10000);
		 
		 
		 
		// close the application
		 driver.quit();
		 
	}
}
