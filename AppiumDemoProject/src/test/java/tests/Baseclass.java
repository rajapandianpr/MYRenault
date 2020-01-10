package tests;

 
import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
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
	  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
	  caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	  caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
	  caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\amsaleka\\apps\\reno.apk");
	  
	  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90); 
	 // caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

	  
	  URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
	 // caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90);
	 
	  driver = new AppiumDriver<MobileElement>(url,caps);
	  
	  //login credentials
	  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90);
		 
	  MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button[1]");
	  el2.click();
	  MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button[2]");
	  el3.click();
	  MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View");
	  el4.click();
	  MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View");
	  el7.click();
	  el7.sendKeys("9841676067");
	  MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View");
	  el8.click();
	  el8.sendKeys("dhina12");
	  MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button");
	  el9.click();

	  
	  
	  
	                                                                                                                                                                                                                                                                                                                                                                                                     
	 

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
