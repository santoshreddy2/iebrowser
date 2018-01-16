

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
@Test

public class SampleIE {
	
	
	
	public void IEopen() {

		
		System.setProperty("webdriver.ie.driver","C:\\Users\\anred\\Java Programs\\JARS\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();;
		 
		driver.get("http://107.170.213.234/catalog/");
		// Create the DesiredCapability object of InternetExplorer
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		 // Settings to Accept the SSL Certificate in the Capability object
		 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 

		
			 driver.manage().window().maximize();
			 driver.get("http://107.170.213.234/catalog/");
			 driver.findElement(By.linkText("log yourself in")).sendKeys("\n");
			 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gmail.com");
			 

driver.get("http://www.google.com");

// Take screenshot and store as a file format
File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	// now copy the  screenshot to desired location using copyFile //method

  FileUtils.copyFile(src, new File("C:/selenium/error.png"));
}

catch (IOException e)
 
  System.out.println(e.getMessage());


			 
			 
	}}