package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseTest {

    @AndroidFindBy(id = "android:id/alertTitle")
    WebElement feedbackAlert;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "android:id/button2")
    WebElement maybeLaterBtn;

    @AndroidFindBy(id = "android:id/button1")
    WebElement sureBtn;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "welcomeLabel")
    @iOSXCUITFindBy(accessibility = "Welcome")
    WebElement welcomeLabel;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "EXPLORE")
    @iOSXCUITFindBy(accessibility = "Explore")
    WebElement exploreTxt;

    public void avoidFeedbackForm() {
        click(maybeLaterBtn);
    }

    public String getTitle() {
        if(properties.getProperty("platformName").equalsIgnoreCase("android")) {
            return getAttribute(welcomeLabel, "text");
        }else {
            return getAttribute(welcomeLabel, "value");
        }
    }

    public String getExploreText() {
        if(properties.getProperty("platformName").equalsIgnoreCase("android")) {
            return getAttribute(exploreTxt, "content-desc");
        }else {
            return getAttribute(exploreTxt, "value");
        }
    }
}