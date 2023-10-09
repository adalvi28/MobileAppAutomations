package com.qa.tests;

import org.testng.annotations.Test;


import com.qa.BaseTest;
import com.qa.pages.AppEntryPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AppIntro extends BaseTest{
	
	
	AppEntryPage appEntryPage; 

	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method m) {
		  
		 appEntryPage = new AppEntryPage();
		 System.out.println(m.getName());
		 
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }
  
//
// 
//  
  @Test
  public void appIntroScreens() throws InterruptedException {
	  	  
	  
	  	 
  	  Thread.sleep(2000);
	  WebElement allowLocation = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/primary_action"));
      waitForVisibility(allowLocation);
  	  allowLocation.click();
	  
  	 
  	  Thread.sleep(2000);
  	  WebElement whileUsingApp = driver.findElement(new By.ById("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));  
  	  waitForVisibility(whileUsingApp);
  	  whileUsingApp.click();
	  
  	 Thread.sleep(1000);
	  WebElement allowNotifications = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/primary_action"));  //com.golfnow.android.teetimes.qa:id/primary_action
	  waitForVisibility(allowNotifications);
	  allowNotifications.click();
	  
	  Thread.sleep(1000);
	  WebElement nextAction = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/next_action"));  
	  waitForVisibility(nextAction);
	  nextAction.click();
	  
	  Thread.sleep(1000);
	  WebElement skipAction = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/skip_action"));  
	  Thread.sleep(1000);
	  nextAction.click();
	  Thread.sleep(1000);
	  nextAction.click();
	  Thread.sleep(1000);
	    
		//	 do {
		//		 nextAction.click();
		//	 } while (nextAction.isDisplayed());
			
	  WebElement searchCourseNearMe = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/primary_action"));
	  WebElement doneButton = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/next_action"));  
	 
	  System.out.println(doneButton.getAttribute("text"));
	  Assert.assertEquals(doneButton.getAttribute("text"), "DONE");
	  doneButton.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement welcomeLabelHomepage = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/welcomeLabel"));
	  waitForVisibility(welcomeLabelHomepage);
	  Assert.assertEquals(welcomeLabelHomepage.getAttribute("text"), "Welcome");
	  System.out.println(welcomeLabelHomepage.getAttribute("text"));
	  
	  Thread.sleep(3000);
	  
	 // ---------------------------------------------
//	  WebElement searchTab = driver.findElement(new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"Search\"]"));
//	  waitForVisibility(searchTab);
//	  searchTab.click();
//	  Thread.sleep(3000);
//	  
//	  WebElement inviteTab = driver.findElement(new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"Invites\"]"));
//	  waitForVisibility(inviteTab);
//	  inviteTab.click();
//	  Thread.sleep(3000);
//	  
//	  WebElement dealsTab = driver.findElement(new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"Deals\"]"));
//	  waitForVisibility(dealsTab);
//	  dealsTab.click();
//	 
//	  WebElement moreTab = driver.findElement(new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"More\"]"));
//	  waitForVisibility(moreTab);
//	  moreTab.click();
//	  Thread.sleep(1000);
//	  //---------------------------------------------------
//	  
//	  
//	
//	  WebElement logInBtn = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/loginCTA"));
//	  waitForVisibility(logInBtn);
//	  logInBtn.click();
//	  Thread.sleep(1000);
//	  
//	  
//
//	  WebElement emailAddress = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/email_address_ed"));
//	  waitForVisibility(emailAddress);
//	  emailAddress.sendKeys("reg@f1.com");
//	  Thread.sleep(1000);
//	  
//	  
//	 
//	  WebElement password = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/password_ed"));
//	  waitForVisibility(password);
//	  password.sendKeys("test1234");
//	  Thread.sleep(1000);
//	  
//	  
//	  WebElement logIn = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/logInBtn"));
//	  waitForVisibility(logIn);
//	  logIn.click();
//	  
//	  Thread.sleep(6000);
//	  
//	 
////	  if (driver.findElement(new By.ById("android:id/button2")).isEnabled())
////         {
////        	 driver.findElement(new By.ById("android:id/button2")).click();
////	  }
////	  else {
////		  System.out.println("Rate course Modal Not available");
////	  }
////	  
////	  Thread.sleep(3000);
//	  
//	  WebElement ExploreTab = driver.findElement(new By.ByXPath("//android.widget.LinearLayout[@content-desc=\"EXPLORE\"]"));
//	  waitForVisibility(ExploreTab);
//      	
//	  
//	  Assert.assertEquals(ExploreTab.getAttribute("content-desc"), "EXPLORE");

	
  }
}
;