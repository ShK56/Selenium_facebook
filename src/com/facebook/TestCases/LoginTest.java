package com.facebook.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReadTestCaseData.CheckRunMode;
import ReadTestCaseData.ReadTestData;

import com.facebook.pages.LoginPage;

public class LoginTest {

	@Test(dataProvider="SendData")
	public void login(String UserName , String Password) throws IOException
	{	
		if(CheckRunMode.isRunable("LoginTest"))
		{
		LoginPage lp = new LoginPage();
		Assert.assertTrue(lp.doLogin(UserName, Password), "LoginTest failed");
		}
		
		else
		{
			System.out.println( " test case not found ");
		}
		

	}

	@DataProvider
	public Object[][] SendData() throws IOException
	{
		return(ReadTestData.ReadData("LoginTest"));
		
		//Object data[][]= new Object[][];		
		//return data;
	}
}
