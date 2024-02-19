package com.testngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest { //Soft assert -Verification
  @Test
  public void f1() {
	  String s="Java123";
	  String s1="java123";
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(s, s1);
			  
  }
  @Test
  public void f2() {
	  String s="Java123";
	  String s1="Java123";
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(s, s1);
  }
}
