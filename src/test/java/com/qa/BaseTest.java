package com.qa;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import com.mobile.auto.Utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

@Listeners(ExtentITestListenerAdapter.class)

public class BaseTest {

    protected static AppiumDriver driver;
    protected static Properties properties;
    public static Logger log = LoggerFactory.getLogger(BaseTest.class);
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
            DesiredCapabilities caps = new DesiredCapabilities();
            if (properties.getProperty("environment").equalsIgnoreCase("local") && properties.getProperty("platformName").equalsIgnoreCase("android")) {
                caps.setCapability("deviceName", properties.getProperty("deviceName"));
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("platformName", properties.getProperty("platformName"));
                caps.setCapability("platformVersion", properties.getProperty("platformVersion"));
                caps.setCapability("appPackage", properties.getProperty("androidAppPackage"));
                caps.setCapability("appWaitActivity", properties.getProperty("androidAppActivity"));
                caps.setCapability("app", System.getProperty("user.dir") + properties.getProperty("appPath"));
                caps.setCapability("autoGrantPermissions", "true");
                caps.setCapability("noReset", false);
                driver = new AndroidDriver(new URL(properties.getProperty("appiumUrl")), caps);
            } else if (properties.getProperty("environment").equalsIgnoreCase("local") && properties.getProperty("platformName").equalsIgnoreCase("ios")) {
                caps.setCapability("platformVersion", properties.getProperty("platformVersion"));
                caps.setCapability("deviceName", properties.getProperty("deviceName"));
                caps.setCapability("platformName", properties.getProperty("platformName"));
                caps.setCapability("udid", properties.getProperty("udid"));
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("autoAcceptAlerts", "true");
                caps.setCapability("noReset", false);
                caps.setCapability("app", System.getProperty("user.dir") + properties.getProperty("appPath"));
                driver = new IOSDriver(new URL(properties.getProperty("appiumUrl")), caps);
            } else if (properties.getProperty("environment").equalsIgnoreCase("remote") && properties.getProperty("platformName").equalsIgnoreCase("android")) {
                MutableCapabilities capabilities = new UiAutomator2Options();
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            } else {
                MutableCapabilities capabilities = new XCUITestOptions();
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            }
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

    public void waitForClickable(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        waitForClickable(e);
        e.click();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
