package com;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest  {

	@Test(groups= {"unit"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(dataProviderClass=DbTest.class,dataProvider = "login")
	 
	 public void f(Integer n, String s) {
	 System.out.println(n);
	 System.out.println(s);
	 }
}
