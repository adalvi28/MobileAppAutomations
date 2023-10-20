package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class NotLoggedInMenu extends BaseTest {

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "logInBtn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
	WebElement loginCTABtn;

	public void pressLogInBtn() {  // its going to a different page after LogIn
		click(loginCTABtn);
	}

}
