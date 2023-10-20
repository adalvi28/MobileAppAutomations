package com.qa.tests;

import com.qa.pages.HomePage;
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

public class AppIntro extends BaseTest {
    AppEntryPage appEntryPage;
    HomePage homePage;

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        appEntryPage = new AppEntryPage();
        homePage = new HomePage();
        log.info(m.getName());
    }

    @AfterMethod
    public void afterMethod() {
    }

    @Test
    public void appIntroScreens() throws InterruptedException {
        appEntryPage.allowLocation();
        if(properties.getProperty("platformName").equalsIgnoreCase("ios")){
            appEntryPage.permissionModal();
        }
        appEntryPage.allowNotifications();
        if(properties.getProperty("platformName").equalsIgnoreCase("ios")){
            appEntryPage.combineMyData();
        }
        appEntryPage.nextButton();
        Thread.sleep(1000);
        appEntryPage.nextButton();
        Thread.sleep(1000);
        appEntryPage.nextButton();
        Thread.sleep(1000);
        String doneButton = appEntryPage.verifyButtonText();
        log.info(doneButton);
        Assert.assertEquals(doneButton, "DONE", "Done button text not matched");
        appEntryPage.skipButton();

        Thread.sleep(1000);
        log.info(homePage.getTitle());
        Assert.assertEquals(homePage.getTitle(), "Welcome", "Home Page Title not matched");

//		  Thread.sleep(3000);

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
////		  log.info("Rate course Modal Not available");
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