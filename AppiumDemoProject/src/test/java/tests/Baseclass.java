package tests;

 
import java.io.File;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.Base64.Encoder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.imagecomparison.SimilarityMatchingOptions;
import io.appium.java_client.imagecomparison.SimilarityMatchingResult;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.TakesScreenshot;
import android.graphics.BitmapFactory;

public class Baseclass extends ExtentReportsDemo {

 static AppiumDriver<MobileElement>driver;

@BeforeTest
	public void setup(){
	  {
		  
		  
  try {
	  	
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
	  caps.setCapability(MobileCapabilityType.DEVICE_NAME,"PL2GAMG870202870");
	  caps.setCapability("realMobile", "true");
	  caps.setCapability("autoGrantPermissions", "true");
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
		 
	
	          MobileElement two = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button[1]\r\n" + 
	           		""));    
	           two.click();  // Renault Owner
	           
	           File file21  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(file21, new File("C:\\RENO\\Screenshot21.jpg"));
	           
	     	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     	  

	           MobileElement three = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button[2]"));
	           		
	           three.click(); // Sign in
	           
	           File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(file, new File("C:\\RENO\\Screenshot81.jpg"));
	          
	          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("9841676067"); 
	          //Login
	          
	          driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	          
	          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View")).sendKeys("dhina12"); //password
	        
	          
	     	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     	  
	     	 MobileElement four = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button"));
	     	 		
		           four.click(); // Sign in
		           
		           File file22  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(file22, new File("C:\\RENO\\Screenshot22.jpg"));
		          
		             
				     	 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				     	 
				        driver.findElement(By.xpath(".//android.widget.Button[@bounds='[273,868][819,979]']")).click();
		           Thread.sleep(5000);	
		           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		           
		           File file33  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(file33, new File("C:\\RENO\\Screenshot33.jpg"));
		          
		                    
		  	MobileElement six = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]"));
		  			        six.click(); // My vehicle
						           
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	      File file44  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(file44, new File("C:\\RENO\\Screenshot44.jpg"));
	 	 
    driver.findElement(By.xpath(".//android.widget.Button[@bounds='[273,1491][819,1601]']")).click();
    Thread.sleep(5000);	
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    File file55  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file55, new File("C:\\RENO\\Screenshot55.jpg"));
   
    
    //--------------------------------------------- My Vehicle details------------------------------------------------------------
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//android.widget.Image[@instance='6']")).click();
    		
    File file66  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file66, new File("C:\\RENO\\Screenshot66.jpg"));
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//android.widget.Image[@instance='6']")).click();

    File file77 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file77, new File("C:\\RENO\\Screenshot77.jpg"));
    
    
    
 
    /* Thread.sleep(3000);
      
  MobileElement list11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Vehicle Details\"));"));
      
      System.out.println(list11.getLocation());
      list11.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        Thread.sleep(3000);    

     MobileElement list1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Vehicle Details\"));"));
    
     System.out.println(list1.getLocation());
    list1.click();
    		
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
      */
      
      //------------------------------------ My Vehicle Details - Double tap---------------------------------------------------------
     // Thread.sleep(5000);
      //driver.findElement(By.xpath(".//android.widget.Image[@text='My Vehicle Details']")).click();
      
     
      //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       
        //------------------------------------------------- My Maintenance Schedule -------------------------------------------
      Thread.sleep(3000);
      
           // MobileElement nine = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]/android.view.View\r\n"));
        	
          //  nine.click();
            
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            
            MobileElement list204 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Maintenance Schedule\"));"));
            System.out.println(list204.getLocation());
            list204.click();
              driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
              File file98  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(file98, new File("C:\\RENO\\Screenshot98.jpg"));
            
        //------------------------------------------    My Maintenance schedule - click here ---------------------
              Thread.sleep(3000);
              MobileElement list303 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Click Here\")).instance(2);"));
              System.out.println(list303.getLocation());
              list303.click();
              
              File file99  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(file99, new File("C:\\RENO\\Screenshot99.jpg"));

                  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
               
                //------------------------------ My Maintenance schedule - click here - PDF Close ---------------------------
                
             //   MobileElement eleven = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Close Button\"]"));
              //  eleven.click();  
                
             //   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
             //   File file10  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      //     FileUtils.copyFile(file10, new File("C:\\RENO\\Screenshot10.jpg"));
                
                //---------------------------------My Warranties Schedule---------------------
                
                MobileElement tweleve = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View\r\n" + 
                		""));
                tweleve.click();
                
                File file111  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(file111, new File("C:\\RENO\\Screenshot111.jpg"));
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //---------------------------------// My Warranties Schedule - double tab--------------------------
    
                MobileElement thrityteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View\\r\\n"));
                thrityteen.click(); 
                
                File file12  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(file12, new File("C:\\RENO\\Screenshot12.jpg"));
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //--------------------------------//Renault Finance -------------------------------------
                
                MobileElement fourteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.view.View/android.view.View[1]/android.view.View\r\n" + 
                		""));
                fourteen.click(); 
                
                File file13  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(file13, new File("C:\\RENO\\Screenshot13.jpg"));
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //----------------------------// Renault Finance back arrow-------------------------
                MobileElement fifteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button"));
                		
                fifteen.click(); 
                
                File file14  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		           FileUtils.copyFile(file14, new File("C:\\RENO\\Screenshot14.jpg"));
                
               driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
               
            //---------------------Additional information-------------------------------------------------    
                MobileElement sixteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View/android.view.View[1]/android.view.View\r\n" + 
                		""));
                sixteen.click(); 
                
                File file15  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	           FileUtils.copyFile(file15, new File("C:\\RENO\\Screenshot15.jpg"));
                
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            
                
                MobileElement seventeen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View/android.view.View[1]/android.view.View\\r\\n"));
                seventeen .click(); 

                File file16  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	           FileUtils.copyFile(file16, new File("C:\\RENO\\Screenshot16.jpg"));
                
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                MobileElement eighteen = driver.findElement(By.xpath(""));
               
              eighteen.click(); // 
                
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
           /*     MobileElement nineteen = driver.findElement(By.xpath(""));
                nineteen.click(); //  
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                MobileElement twenty = driver.findElement(By.xpath(""));
                twenty.click(); // 
                */
            
  }
   
  catch(Exception exp) {
		System.out.println("Cause is:"+exp.getCause());
		System.out.println("Message is:"+exp.getMessage()); 
		exp.printStackTrace(); 
}}
	  }
  
@Test
  public void sampletest() {
	
	ExtentTest test = extent.createTest("Step1", "MY RENAULT OWNER");
	
    test.log(Status.INFO, "Application installed Successfully.................");    
    test.log(Status.INFO, "Image Captured Successfully.............");
    test.log(Status.INFO, "Image Compared..............");

    test.log(Status.PASS, "Renault Owner................");
    test.log(Status.INFO, "Image Captured Successfully....................");
	  test.log(Status.INFO, "Sign in...............");
	    test.log(Status.INFO, "Image Captured Successfully.............");
	    test.log(Status.INFO, "Click to got it................");
	    test.log(Status.INFO, "Image Captured Successfully.............");
	    test.log(Status.INFO, "clcik to My Vehicles....................");
	    test.log(Status.INFO, "Image Captured Successfully..............");
		  test.log(Status.INFO, "clcik to My Vehicle Details.....................");
		    test.log(Status.INFO, "Image Captured Successfully..................");
			  test.log(Status.INFO, "clickto My Maintenece Schedule.............");
			    test.log(Status.INFO, "Image Captured Successfully.............");










	  System.out.println("Application installed successfully");
	  System.out.println("Image Captured successfully");

	  
	  ExtentTest test1 = extent.createTest("Step2", "Navigate to renault owner Successfully");
	  
	    test1.log(Status.PASS, "Renault Owner)");

	  System.out.println("Navigate to renault owner");
	  System.out.println("Image Captured successfully");

	  
	  ExtentTest test3 = extent.createTest("Step3", "Sign in successfully");

	  test3.log(Status.INFO, "Sign in");

	  System.out.println("Sign in successfully");
	  System.out.println("Image Captured successfully");

	  ExtentTest test4 = extent.createTest("Step4", "Click gotit Successfully");

	  
	  test4.log(Status.INFO, "Click to got it");

	  System.out.println("Click gotit Successfully");
	  System.out.println("Image Captured successfully");

	  
	  
	  ExtentTest test5 = extent.createTest("Step5", "Click to My Vehicle Successsfully");
  
	  test5.log(Status.INFO, "clcik to My Vehicles");

	  System.out.println("Click to My Vehicle Successsfully");
	  System.out.println("Image Captured successfully");

	  
	  ExtentTest test6 = extent.createTest("Step5", "My Vehicle Details Successsfully");

	  test6.log(Status.INFO, "clcik to My Vehicle Details");

	  System.out.println("Click to My Vehicle Details Successsfully");
	  System.out.println("Image Captured successfully");

	  
	  ExtentTest test7 = extent.createTest("Step7", "Maintenece Schedule Successsfully");

	  test7.log(Status.INFO, "clickto My Maintenece Schedule");
	  System.out.println("Click to My Maintenece Schedule Successsfully");
	  System.out.println("Image Captured successfully");

	  
	  ExtentTest test8 = extent.createTest("Step8", "My Warranties and services Contracts");
	  test8.log(Status.INFO, "clickto My Warranties and services Contracts");

	  System.out.println("Click to My Warranties and services Contracts");
	  System.out.println("Image Captured successfully");

	  
	  
	  ExtentTest test9 = extent.createTest("Step8", "Click to Renault Finance Successfully");
 
	  test9.log(Status.INFO, "Click to Renault Finance");

	  System.out.println("Click to Renault Finance");
	  System.out.println("Image Captured successfully");

	  
	  ExtentTest test10 = extent.createTest("Step10", "Click to Renault Finance Successfully");

	  test10.log(Status.INFO, "Click to Additional Infroamtion");

	  System.out.println("Click to Additional Infroamtion Successfully");
	  System.out.println("Image Captured successfully");

	 
	
	  
  }

  @AfterTest
	public void teardown() {
	}
	 
	
}
