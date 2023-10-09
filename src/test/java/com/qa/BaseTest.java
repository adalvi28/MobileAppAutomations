package com.qa;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import com.mobile.auto.Utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

@Listeners(ExtentITestListenerAdapter.class)

public class BaseTest{

	protected static AppiumDriver driver;
	protected static Properties properties;
	InputStream inputStream;


	public BaseTest() {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

  //@Parameters
  @BeforeTest
  public void beforeTest() throws Exception {

	try {
				 properties = new Properties();
				 String propFileName = "config.properties";

				 inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

				 properties.load(inputStream);

				  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
				  desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
				  desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel_4_xl");
				  desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,properties.getProperty("androidAutomationName"));
				  desiredCapabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554"); //emulator-5556 // device 98DAY149S1
				  // desiredCapabilities.setCapability("newCommandTimeout", 300);
				  desiredCapabilities.setCapability("appPacakge", properties.getProperty("androidAppPackage"));
				  desiredCapabilities.setCapability("appWaitActivity", properties.getProperty("androidAppActivity"));
				  String appUrl = getClass().getClassLoader().getResource(properties.getProperty("androidAppLocation")).getFile();
				  desiredCapabilities.setCapability("app", appUrl);

				  URL url = new URL(properties.getProperty("appiumUrl"));

				  driver = new AndroidDriver(url,desiredCapabilities);


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
	        }

    }

	  public void waitForVisibility(WebElement e) {

		  WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
		  wait.until(ExpectedConditions.visibilityOf(e));

	  }

	  public void click(WebElement e) {
		  waitForVisibility(e);
		  e.click();
	  }

	  public void sendKeys(WebElement e, String txt) {
		  waitForVisibility(e);
		  e.sendKeys(txt);
	  }

	  public void getAttribute(WebElement e, String attribute) {
		  waitForVisibility(e);
		  e.getAttribute(attribute);
	  }



	  @AfterTest
	  public void afterTest() {
	  driver.quit();
  }

}
