package com.testngFeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "paramValue")
	public void loginparam(String uname, String pwd) {
		  System.out.println("Enter username is :-"+uname);
		  System.out.println("Enter password is :-"+pwd);
	  }
	@Test
	@DataProvider
	private Object[][] paramValue() {
		
		return new Object[][] {{"user1","123"},{"user2","345"},{"user3","567"}} ; 

	}
}
