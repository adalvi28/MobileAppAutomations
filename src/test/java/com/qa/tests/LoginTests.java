package com.qa.tests;


import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.NavigationTab;
import com.qa.pages.NotLoggedInMenu;
import org.testng.annotations.Test;

import com.qa.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTests extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    NavigationTab navigationTab;
    NotLoggedInMenu notLoggedInMenu;

    @BeforeMethod
    public void beforeMethod() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        navigationTab = new NavigationTab();
        notLoggedInMenu = new NotLoggedInMenu();
    }

    @AfterMethod
    public void afterMethod() {

    }

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {

    }

    @Test
    public void LoginTest() throws InterruptedException {
        navigationTab.clickMoreTab();
        loginPage.clickOnLoginCTAButton();
        loginPage.enterUserName("reg@f1.com");
        loginPage.enterPassword("test1234");
        notLoggedInMenu.pressLogInBtn();
        Thread.sleep(1000);
        homePage.getExploreText();
        Assert.assertEquals(homePage.getExploreText().toLowerCase(), "explore", "Explore Tab not visible on Home Page");
    }

    @Test
    public void invalidUserName() {
        homePage.getExploreText();
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
