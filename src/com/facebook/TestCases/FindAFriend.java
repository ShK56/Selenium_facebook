package com.facebook.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.Page.Page;
import com.facebook.pages.FriendsPage;
import com.facebook.pages.LoginPage;

public class FindAFriend {
	
	@Test
	public void findMyFriend() throws IOException
	{
		//login
		LoginPage lp = new LoginPage();
		lp.doLogin(Page.config.getProperty("DefaultUserName"),Page.config.getProperty("DefaultPassword"));
		
		
		//finding a friend from friends list
		FriendsPage fp = new FriendsPage();
		Assert.assertTrue(fp.findFriend(Page.config.getProperty("name")),"friend not found"+Page.config.getProperty("name"));
		
	}

}
