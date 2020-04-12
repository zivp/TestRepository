package testMaven;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Data.Log;
import pages.BasePage;


public class UnitTest {
	
	WebDriver driver;
    WebElement c;
	private static final Logger LOG = LogManager.getLogger(UnitTest.class);

   
		  @Test
		  public void Test1() throws Exception {
			  try{
		driver =BasePage.initChromeDriver("https://www.hot.net.il/heb/Main/");
			c = driver.findElement(By.id("headerMenu_tab01"));
			LOG.info("test");
			  BasePage.ClickJS(c, driver);
			  }
			  catch(Exception e) {
				  e.getStackTrace();
				 BasePage.takeSnapShot(driver);
			  }
		  }

		  //inter url and click all the links
@Test
public void Test2() throws Exception {
	driver =BasePage.initChromeDriver("https://www.mako.co.il/");
	
	List<WebElement> linksList = BasePage.clickableLinks(driver);
	for (WebElement link : linksList) {
		String href = link.getAttribute("href");
		try {
			LOG.info("URL " + href + " returned " + BasePage.linkStatus(new URL(href)));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
		  

}
