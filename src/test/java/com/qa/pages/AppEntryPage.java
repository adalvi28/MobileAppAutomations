package com.qa.pages;


import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class AppEntryPage   {

	AndroidDriver driver;


	@AndroidFindBy (id="com.golfnow.android.teetimes.qa:id/primary_action")
	private WebElement allowLocation;

	@AndroidFindBy (id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement whileUsingApp;

	@AndroidFindBy (id="com.golfnow.android.teetimes.qa:id/primary_action")
	private WebElement allowNotifications;

	@AndroidFindBy (id="com.golfnow.android.teetimes.qa:id/next_action")
	private WebElement nextAction;

	@AndroidFindBy (id="com.golfnow.android.teetimes.qa:id/skip_action")
	private WebElement skipAction;
	
	@AndroidFindBy (id="com.golfnow.android.teetimes.qa:id/primary_action")
	private WebElement searchCourseNearMe;
	
	@AndroidFindBy (id="com.golfnow.android.teetimes.qa:id/next_action")
	private WebElement doneButton;
	
	
	
	public AppEntryPage allowLocation(WebElement allowLocation) {
		//click(allowLocation);
		return this;
		
	}
	
	public AppEntryPage permissionModal(WebElement whileUsingApp) {
		//click(whileUsingApp);
		return this;
		
	}
	public AppEntryPage allowNotifcations(WebElement allowNotifications) {
		///click(allowNotifications);
		return this;
		
	}
	
	public AppEntryPage nextButton(WebElement nextAction) {
		//click(nextAction);
		return this;
		
	}

}



