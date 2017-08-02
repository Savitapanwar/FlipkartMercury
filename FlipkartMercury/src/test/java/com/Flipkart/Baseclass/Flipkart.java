package com.Flipkart.Baseclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.universal.methods.UniversalMethodClass;

public class Flipkart extends UniversalMethodClass
{

	public String browsername;
	@BeforeTest
	public void beforeTest()
	{  
		loadObjectfile();
	}

	@BeforeMethod
	public void beforemethod()
	{  
		invokeApp(browsername);
	}
	@AfterTest
	public void afterTest()
	{
		UnloadObjects();
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		//closeAllbrowser();
	}

}
