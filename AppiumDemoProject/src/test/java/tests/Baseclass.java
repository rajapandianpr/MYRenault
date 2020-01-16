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
	           
	           
	           
	     	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     	  

	           MobileElement three = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button[2]"));
	           		
	           three.click(); // Sign in
	           
	           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("9841676067"); 
	          //Login
	          
	          driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	          
	          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View")).sendKeys("dhina12"); //password
	        
	          
	     	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     	  
	     	 MobileElement four = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button"));
	     	 		
		           four.click(); // Sign in
		             
				     	 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				     	 
				        driver.findElement(By.xpath(".//android.widget.Button[@bounds='[273,868][819,979]']")).click();
		           Thread.sleep(5000);	
		           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		                    
		  	MobileElement six = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]"));
		  			        six.click(); // My vehicle
						           
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 	 
    driver.findElement(By.xpath(".//android.widget.Button[@bounds='[273,1491][819,1601]']")).click();
    Thread.sleep(5000);	
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
    //--------------------------------------------- My Vehicle details------------------------------------------------------------
    
driver.findElement(By.xpath(".//android.view.View[@text='My Vehicle Details']")).click();
    
    
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
      //------------------------------------ My Vehicle Details - Double tap---------------------------------------------------------
      
      MobileElement eight = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[1]/android.view.View[1]/android.view.View"));
      		
        eight.click(); 
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  
        //------------------------------------------------- My Maintenance Schedule -------------------------------------------
        
        MobileElement nine = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]/android.view.View\r\n"));
        	
            nine.click(); 
            
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            
        //------------------------------------------    My Maintenance schedule - click here ---------------------
            
            MobileElement ten = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View[10]/android.widget.Button\r\n"));	
                ten.click(); 
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //------------------------------ My Maintenance schedule - click here - PDF ---------------------------
                
                MobileElement eleven = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Close Button\"]"));
                eleven.click(); // PDF Close 
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //---------------------------------My Warranties Schedule---------------------
                
                MobileElement tweleve = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View\r\n" + 
                		""));
                tweleve.click();
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //---------------------------------// My Warranties Schedule - double tab--------------------------
    
                MobileElement thrityteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View\\r\\n"));
                thrityteen.click(); 
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //--------------------------------//Renault Finance -------------------------------------
                
                MobileElement fourteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.view.View/android.view.View[1]/android.view.View\r\n" + 
                		""));
                fourteen.click(); 
                
                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                //----------------------------// Renault Finance back arrow-------------------------
                MobileElement fifteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button"));
                		
                fifteen.click(); 
                
               driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
               
            //---------------------Additional information-------------------------------------------------    
                MobileElement sixteen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View/android.view.View[1]/android.view.View\r\n" + 
                		""));
                sixteen.click(); 
                
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                
                MobileElement seventeen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View/android.view.View[1]/android.view.View\\r\\n"));
                seventeen .click(); 
                
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
	  System.out.println("I am inside sample test");
  }

  @AfterTest
	public void teardown() {
	}
	 
	
}
