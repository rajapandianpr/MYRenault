package tests;

 
import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Baseclass {

 static AppiumDriver<MobileElement>driver;

@BeforeTest
	public void setup(){
	  {
		  
		  
  try {
	  	
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
	  caps.setCapability(MobileCapabilityType.DEVICE_NAME,"PL2GAMG870202870");
	 // caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
	  caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\amsaleka\\apps\\reno.apk");
	  
	  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90); 
	 // caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

	  
	  URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
	 // caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90);
	 
	  driver = new AppiumDriver<MobileElement>(url,caps);
	  
	  //login credentials
	//  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90);
	  
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
	 driver.findElement(By.className("//android.widget.Button[@text='RENAULT OWNER'and @index='0']")).click();
	  
	                                                                                                                                                                                                                                                                                                                                                                                                     

  }
   
  catch(Exception exp) {
		System.out.println("Cause is:"+exp.getCause());
		System.out.println("Message is:"+exp.getMessage()); 
		exp.printStackTrace(); 
}}
	  }
  @Test
  public void sampletest() {
	  System.out.println("I am inside sample test");
  }

  @AfterTest
	public void teardown() {
	}
	 
	
}
