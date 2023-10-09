package com.qa.pages;
//package com.mobile.auto.pages;
//
//import org.openqa.selenium.WebElement;
//
//import com.mobile.auto.base.BaseTest;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//
//public class LoginPage extends BaseTest{
//	
//AndroidDriver driver;
//
//	@AndroidFindBy (id ="com.golfnow.android.teetimes.qa:id/logInBtn")
//	private WebElement logInBtn;
//	
//	@AndroidFindBy (id ="com.golfnow.android.teetimes.qa:id/email_address_ed")
//	private WebElement emailAddress;
//	
//	
//	@AndroidFindBy (id ="com.golfnow.android.teetimes.qa:id/password_ed")
//	private WebElement password;
//	
//	
//	@AndroidFindBy (id ="com.golfnow.android.teetimes.qa:id/createAccountBtn")
//	private WebElement createAccount;
//	
//	
//	@AndroidFindBy (id ="com.golfnow.android.teetimes.qa:id/resetPassword")
//	private WebElement forgotPassword;
//	
//	@AndroidFindBy (id ="android:id/alertTitle")
//	private WebElement errorModal;
//	
//	@AndroidFindBy (id ="android:id/message")
//	private WebElement errMessage;
//	
//	
//	
//	
//	
//	
//   public LoginPage enterUserName(String username) {
//	   sendKeys(emailAddress, username);
//	   return this;
//   }
//   
//   public LoginPage enterPassword(String password) {
//	   sendKeys(emailAddress, password);
//	   return this;
//   }
//   
//   public HomePage pressLogInBtn(){  // its going to a different page after LogIn
//	   click(logInBtn);
//	   return new HomePage();
//   }
//
//   public String getErrTxt() {
//		
//	   return getAttribute(errMessage,"text");
//   
//   }
//	
//	
//	
//	
//	
//}
//    