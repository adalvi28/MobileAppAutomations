package com.qa.pages;


import com.qa.BaseTest;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class AppEntryPage extends BaseTest {

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "primary_action")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    WebElement allowLocation;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    @iOSXCUITFindBy(accessibility = "Allow While Using App")
    WebElement whileUsingApp;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "primary_action")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow Notifications\"]")
    WebElement allowNotifications;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Combine my data\"]")
    WebElement combineMyData;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "next_action")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NEXT\"]")
    WebElement nextAction;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DONE\"]")
    WebElement doneActionBtn;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "skip_action")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SKIP\"]")
    WebElement skipAction;

    @AndroidFindBy(id = "primary_action")
    WebElement searchCourseNearMe;

    @AndroidFindBy(id = "next_action")
    WebElement doneButton;


    public void allowLocation() {
        click(allowLocation);
    }

    public void permissionModal() {
        click(whileUsingApp);
    }

    public void allowNotifications() {
        click(allowNotifications);
    }

    public void combineMyData(){
        click(combineMyData);
    }

    public void nextButton() {
        click(nextAction);
    }

    public void skipButton() {
        click(skipAction);
    }

    public String verifyButtonText() {
        if(properties.getProperty("platformName").equalsIgnoreCase("android")) {
            return getAttribute(nextAction, "text");
        }else {
            return getAttribute(doneActionBtn, "value");
        }
    }
}



