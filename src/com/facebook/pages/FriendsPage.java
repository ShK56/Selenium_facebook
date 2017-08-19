package com.facebook.pages;

import java.io.IOException;

import com.facebook.Page.Page;

public class FriendsPage extends Page {
	
	public FriendsPage() throws IOException {
		super();
		
	}

	public boolean findFriend(String friendName)
	{
		click("lnk_Profile_Bipin_thakare");
		click("tab_Friends");
		
		input("input_box_search_for_ur_friends", friendName);
		
		return(isElementPresent("Friend_Iva_Coutinho"));
		
	}
	
	

}
