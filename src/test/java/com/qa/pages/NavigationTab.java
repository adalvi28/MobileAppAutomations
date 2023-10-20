package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class NavigationTab extends BaseTest {

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "More")
    @iOSXCUITFindBy(accessibility = "More")
    WebElement moreBtn;

	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Deals\"]/android.widget.ImageView")
	private WebElement deals;

	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Invites\"]/android.widget.ImageView")
	private WebElement invites;

	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.ImageView")
	private WebElement search;

	@AndroidFindBy (xpath ="//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView")
	private WebElement home;

    public void clickMoreTab(){
        click(moreBtn);
    }
}
