package com.facebook.pages;

import java.io.IOException;

import com.facebook.Page.Page;

public class LoginPage extends Page {
	/*
	public WebDriver driver =null; 
	public LoginPage()
	{
	  driver = new FirefoxDriver();
	}
	*/
	
	public LoginPage() throws IOException {
		super();
		
	}

	public boolean doLogin(String UserName, String Password)
	{
		
		
		driver.get("http://www.facebook.com");
		 //login code follows
		/*
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("SeleniumForSure@gmail.com"); //userName field
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password_123"); //password field		
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); //login button		
		*/
		input("input_box_userName",UserName); //user Name
		input("input_box_password",Password); //password
		click("btn_LogIn");
		return(isElementPresent("lnk_find_friends"));
	}

	public void forgotPassword()
	{
		
	}
}
