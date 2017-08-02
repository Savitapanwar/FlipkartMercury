package com.Flipkart.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Flipkart.Baseclass.Flipkart;
import com.Flipkart.Pages.Homepage;

public class Testcase_001 extends Flipkart
{
	@BeforeClass
	public void beforeclass()
	{
		 browsername="chrome";
	}
	@Test
	public void gotohomepage()
	{
		new Homepage(driver)
		.gotoSignUppage()
		.enterPhoneNumber("9926060728")
		.clickContinuebtn();
	}

	
}
