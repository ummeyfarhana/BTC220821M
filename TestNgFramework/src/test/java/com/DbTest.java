package com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DbTest {
	 @Test(dataProvider = "login")
	 
	 public void f(Integer n, String s) {
	 System.out.println(n);
	 System.out.println(s);
	 }
	 @DataProvider(name="login")
	  public Object dp() {
	    Object [][]o=new Object[2][2];
	    o[0][0]="user1";
	    o[0][1]="pass1";
	    o[1][0]="user2";
	    o[1][0]="pass2";
	    return o;
	  }
}
