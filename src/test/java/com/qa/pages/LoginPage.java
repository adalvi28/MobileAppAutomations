package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest{

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "loginCTA")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
    WebElement logInBtn;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "email_address_ed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    WebElement emailAddress;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "password_ed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    WebElement password;

    @AndroidFindBy(id = "createAccountBtn")
    WebElement createAccount;

    @AndroidFindBy(id = "resetPassword")
    WebElement forgotPassword;

    @AndroidFindBy(id = "android:id/alertTitle")
    WebElement errorModal;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    WebElement errMessage;


    public void clickOnLoginCTAButton(){
        click(logInBtn);
    }

    public void enterUserName(String username) {
        sendKeys(emailAddress, username);
    }

    public void enterPassword(String passwordStr) {
        sendKeys(password, passwordStr);
    }

    public String getErrTxt() {
        return getAttribute(errMessage, "text");
    }
}
