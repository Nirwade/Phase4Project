package phaSe4MobileApp;
	
	import java.net.URL;
	import java.util.List;
	import java.util.function.Function;
	import java.net.MalformedURLException;
	import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	
	public class AndroidFlip1 {
		
		public AndroidDriver driver;
	
		@BeforeMethod
		public static void SetUp() throws MalformedURLException, InterruptedException {
			
	    	DesiredCapabilities caps = new DesiredCapabilities();
	    	
	    	// Set your access credentials
	    	caps.setCapability("browserstack.user", "nirwadeshashikal_j395Lu");
	    	caps.setCapability("browserstack.key", "gBLDE8W1ertzvUUwzZoC");
	    	
	    	// Set URL of the application under test
	    	caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");  
	    	
	    	// Specify device and os_version for testing
	    	caps.setCapability("device", "Google Pixel 3");
	    	caps.setCapability("os_version", "9.0");
	        
	    	// Set other BrowserStack capabilities
	    	caps.setCapability("project", "First Java Project");
	    	caps.setCapability("build", "browserstack-build-1");
	    	caps.setCapability("name", "first_test");
	       
	    	
	    	// Initialise the remote Webdriver using BrowserStack remote URL
	    	// and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	        		new URL("http://hub.browserstack.com/wd/hub"), caps);
		}      
	        
	        @Test
	    	public void sampleTest() throws Exception 
	    	{
	    		Thread.sleep(5000);
	    		MobileElement language= (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]\r\n"
	    				);
	    		language.click();

	    		driver.findElementById("com.flipkart.android:id/select_btn").click();

	    		//driver.findElementById("com.flipkart.android:id/button").click();
	    		driver.findElementById("com.flipkart.android:id/custom_back_icon").click();
	    		Thread.sleep(5000);
	    		driver.findElementById("com.flipkart.android:id/search_widget_textbox").click();
	    		MobileElement searchtext = (MobileElement) driver.findElementByAccessibilityId("Search grocery products");
	    		searchtext.sendKeys("samsung phones");
	    		try 
	    		{
	    			Thread.sleep(5000);
	    		} catch (InterruptedException e)
	    		{
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    	}

	    	public void inputext()
	    	{
	    		MobileElement menuOptionText= (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Text\"]");
	    		menuOptionText.click();

	    		MobileElement menuOption_LogTextBox =(MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"LogTextBox\"]");
	    		menuOption_LogTextBox.click();

	    		MobileElement txtBox_logtxtbox =(MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
	    		txtBox_logtxtbox.sendKeys(" Welcome class");

	    	} 
	        
	        // Invoke driver.quit() after the test is done to indicate that the test is completed.
	    	
	    	@AfterMethod
	    	public void tearDown()
	    	{
	    	
	        driver.quit();
			
		}
	}


