package testMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;


public class RobotClass {
	
	private static final Logger LOG = LogManager.getLogger(RobotClass.class);

	static WebDriver driver;
	  WebElement BtnUp;
	  
	  String FilePatch="C:\\Users\\win-8\\Desktop\\test2.txt";
	  
	@BeforeMethod
	public void beforeMethod() {


	
		LOG.info("Start test");
		
		
	}

	@Test
	public void f() throws AWTException {
		
		driver =BasePage.initChromeDriver("https://files.fm/");

		
	WebElement ChosseFile=	driver.findElement(By.id("file_upload"));
		
  
		Actions ac= new Actions(driver);
		ac.click(ChosseFile).build().perform();
		
		try{
			Robot robot=new Robot();
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_C);
            robot.keyPress(KeyEvent.VK_SHIFT);  
			robot.keyPress(KeyEvent.VK_SEMICOLON);
            robot.keyPress(KeyEvent.VK_SLASH);

			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyPress(KeyEvent.VK_T);
			robot.delay(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
		
	}
		catch(AWTException e)
		{
			e.printStackTrace();
			LOG.error("the file in not uploud");
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}


}
