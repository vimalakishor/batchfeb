package com.testngFeatures;

import org.testng.annotations.Test;

public class GroupTest {
  @Test(groups = "Emp")
  public void f1() {
	  System.out.println("Employee1");
  }@Test(groups = "Emp")
  public void f2() {
	  System.out.println("Employee1");
  }
  @Test(groups = "Cus")
  public void f3() {
	  System.out.println("Customer1");
  }
  @Test(groups = "Cus")
  public void f4() {
	  System.out.println("Customer1");
  }
  @Test(groups = "Admin")
  public void f5() {
	  System.out.println("Admin1");
  }
  @Test(groups = "Admin")
  public void f6() {
	  System.out.println("Admin1");
  }
}
