package com.testngFeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
  @Test
  @Parameters({"uname","pwd"})
  public void loginparam(String uname, String pwd) {
	  System.out.println("Enter username is :-"+uname);
	  System.out.println("Enter password is :-"+pwd);
  }
}
