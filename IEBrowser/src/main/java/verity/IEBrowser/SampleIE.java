package verity.IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SampleIE {
	
	
	
	@Test
	
	public void IEopen() {

		
		System.setProperty("webdriver.ie.driver","C:\\Users\\anred\\Java Programs\\JARS\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();;
			 
			driver.get("http://107.170.213.234/catalog/");
			 driver.manage().window().maximize();	 
			 driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();	 

			 driver.findElement(By.xpath("//*[@id=\'bodyContent\']/form/div/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("santosh");	
			 driver.findElement(By.xpath("//*[@id='tdb4']/span[2]")).click();

		
		
		
	}

}
