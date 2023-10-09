package com.qa.tests;


import org.testng.annotations.Test;

import com.qa.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTests extends BaseTest{
  
	//LoginPage loginPage;
	
	//HomePage homePage;
	
	
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  
	  //loginPage = new LoginPage();
	  //homePage = new HomePage();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  
   }
  
  
  
  
    @Test
    public void LoginTest() throws InterruptedException { 
    	
      WebElement moreTab = driver.findElement(new By.ByXPath("//android.widget.FrameLayout[@content-desc=\"More\"]"));
	  waitForVisibility(moreTab);
	  moreTab.click();
	  Thread.sleep(1000);
	  //---------------------------------------------------
	  
	  
	
	  WebElement logInBtn = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/loginCTA"));
	  waitForVisibility(logInBtn);
	  logInBtn.click();
	  Thread.sleep(1000);
	  
	  

	  WebElement emailAddress = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/email_address_ed"));
	  waitForVisibility(emailAddress);
	  emailAddress.sendKeys("reg@f1.com");
	  Thread.sleep(1000);
	  
	  
	 
	  WebElement password = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/password_ed"));
	  waitForVisibility(password);
	  password.sendKeys("test1234");
	  Thread.sleep(1000);
	  
	  
	  WebElement logIn = driver.findElement(new By.ById("com.golfnow.android.teetimes.qa:id/logInBtn"));
	  waitForVisibility(logIn);
	  logIn.click();
	  
	  Thread.sleep(6000);
	  
	 
//	  if (driver.findElement(new By.ById("android:id/button2")).isEnabled())
//       {
//      	 driver.findElement(new By.ById("android:id/button2")).click();
//	  }
//	  else {
//		  System.out.println("Rate course Modal Not available");
//	  }
//	  
//	  Thread.sleep(3000);
	  
	  WebElement ExploreTab = driver.findElement(new By.ByXPath("//android.widget.LinearLayout[@content-desc=\"EXPLORE\"]"));
	  waitForVisibility(ExploreTab);
    	
	  
	  Assert.assertEquals(ExploreTab.getAttribute("content-desc"), "EXPLORE");
    }
    
    @Test
    public void invalidUserName() {
    	 WebElement ExploreTab = driver.findElement(new By.ByXPath("//android.widget.LinearLayout[@content-desc=\"EXPLORE\"]"));
   	  waitForVisibility(ExploreTab);
   }
    
//    @Test
//    public void invalidPassword() {
//    	 WebElement ExploreTab = driver.findElement(new By.ByXPath("//android.widget.LinearLayout[@content-desc=\"EXPLORE\"]"));
//   	  waitForVisibility(ExploreTab);
//   	  Assert.assertEquals(ExploreTab, "Fail");
//   	  
//   }
}



//  public void invalidUserName() {
//	  loginPage.enterUserName("aa1.com");
//	  loginPage.enterPassword("test1234");
//	  loginPage.pressLogInBtn();
//	  
//	  
//	  String actualErrTxt = loginPage.getErrTxt();
//	  String expectedErrTxt = ("Invalid Login");
//	  
//	  Assert.assertEquals(actualErrTxt, expectedErrTxt);
//  }
//  
//  @Test
//  public void invalidPassword() {
//	  
//	  loginPage.enterUserName("aa@aa.com");
//	  loginPage.enterPassword("test12234");
//	  loginPage.pressLogInBtn();
//	  
//	  String actualErrTxt = loginPage.getErrTxt();
//	  String expectedErrTxt = ("Invalid Login");
//	  
//	  Assert.assertEquals(actualErrTxt, expectedErrTxt);
//	  
//	  Assert.assertEquals(actualErrTxt, expectedErrTxt);
//  }
//  
//  @Test
//  public void successfulLogin() {
//	  
//	  loginPage.enterUserName("aa@aa.com");
//	  loginPage.enterPassword("test12234");
//	  loginPage.pressLogInBtn();
//	  
//	  		  
//	  String actualProductTitle = homePage.getTitle();		  
//	  String expectedProductTitle = ("Welcome TestTest");
//	  
//	  Assert.assertEquals(actualProductTitle, expectedProductTitle);
////  }
//
//}
