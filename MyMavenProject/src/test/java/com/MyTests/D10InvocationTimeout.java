package com.MyTests;

import org.testng.annotations.Test;

public class D10InvocationTimeout {
  @Test(invocationTimeOut = 3000)
  public void myTest() throws InterruptedException {
	  System.out.println("This is my test");
	  Thread.sleep(4000);
  }
}
