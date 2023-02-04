package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
 @Parameters({"Browser"})
  @BeforeMethod
  public void beforeMethod(String b) {
	 if(b.equals("chrome")) {
	  System.out.println("Lunch chrome driver....");
 }
 else if(b.equals("firefox")) {
	 System.out.println("Lunch firefox driver....");
 }
	 System.out.println("BM");
 }
  @AfterMethod(alwaysRun=true)
  public void afterMethod(ITestResult result) {
	  System.out.println("AM");
	  switch(result.getStatus()) {
	  case ITestResult.FAILURE:{
		  System.out.println(result.getName()+ "Is Pass..");
		  ScreenShots.takeScreenShots();
	  }
	  }
  }


 
  @BeforeClass(enabled=false)
  public void beforeClass() {
	  System.out.println("BC");
	  Reporter.log("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");
  }

  @BeforeTest(groups="frontEnd")
  public void beforeTest() {
	  System.out.println("BT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS");
  }

}
