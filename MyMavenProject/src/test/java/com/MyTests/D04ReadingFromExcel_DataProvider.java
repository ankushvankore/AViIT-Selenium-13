package com.MyTests;

import org.testng.annotations.Test;

public class D04ReadingFromExcel_DataProvider {
  @Test(dataProvider = "readData", dataProviderClass = com.MyTests.D03ReadingFromExcel.class)
  public void showData(String s, String fn, String mn, String ln, String un, String ps, String eid, String em, String am, String res) {
	  
	  System.out.println(s);
	  System.out.println(fn);
	  System.out.println(mn);
	  System.out.println(ln);
	  System.out.println(un);
	  System.out.println(ps);
	  System.out.println(eid);
	  System.out.println(em);
	  System.out.println(am);
	  System.out.println(res);
  }
}
