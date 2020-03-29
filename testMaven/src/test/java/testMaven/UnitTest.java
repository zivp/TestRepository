package testMaven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.BasePage;



public class UnitTest {
	
	WebDriver driver;

		
		  @Test
		  public void Test1() throws Exception {
			  try{
			driver= BasePage.initChromeDriver("https://www.google.com");
			  BasePage.getElement("//div[3]/center/input[1]", "xpath");
			  }
			  catch(Exception e) {
				  e.getStackTrace();
				 BasePage.takeSnapShot(driver);
			  }
		  }
		  
		  
		  

}
