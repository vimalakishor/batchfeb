package com.testngFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTest { // ExpectedException
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void f1() throws InterruptedException {
		int a=10;
		System.out.println(a/0);
	}

}
