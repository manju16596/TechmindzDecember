package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.page.HomePage;

	public class HomePageTestCases extends Testbase {
		HomePage homepage;
		public HomePageTestCases() {
			super();
		}
		@BeforeClass
		public void setUp() {
			initialization();
			homepage =new HomePage();
		}
	
		 @Test
		public void clickOnsignUpButton() {
			homepage.clickSignUpButton();
			homepage.clickSignUpCloseButton();
			
			
			
		}
		 @Test
		 public void  clickOnLoginButton() {
			 homepage.clickLoginButton();
			 homepage.clickLoginCloseButton();
			 public void clickOnLoginButton() throws  InterruptedException {

				 homepage.clickLoginButton();

				 homepage.clickLoginUsername("test@12345678@");

				 homepage.clickLoginPassword("Password");

				 homepage.clickLoginCreateButton();

				 //homePage.clearUsername();

				 //homePage.clearPassword();

				 //homePage.clickLoginCloseButton();

				 }
		 }
			 
			 
			 public void AboutUsButton() {
				 homepage.clickAboutUsButton();
				 homepage.clickAboutUsCloseButton();
			 }
				 
				 public void clickOnContact()  {
					 homepage.clickContactButton();
					 homepage.contactEmailEnterText("Test email");
					 homepage.contactNameEnterText("manju");
					 homepage.contactMessageEnterText("Hi");
					 homepage.clickSendMessage();
					 
					 
				 }
				 public void clickSignButton() {
					 homepage.clickSignUpButton();
					 homepage.signUpUserNameEnterText("sree");
					 homepage.signUpPasswordEnterText("sree123");
					 homepage.clickSignUp();
					 
					 
					 
					 
				 
			 }
			 
			
		 }
		

	



