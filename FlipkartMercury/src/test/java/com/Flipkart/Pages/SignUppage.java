package com.Flipkart.Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.Flipkart.Baseclass.Flipkart;

public class SignUppage extends Flipkart
{

	public SignUppage(RemoteWebDriver driver) 
	{
		this.driver=driver;
		//if(!verifyTitle("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"))
		//{
		//	System.out.println("OOPSs.. You are on wrong page");
		//}
	}
	
	public SignUppage enterPhoneNumber(String phoneNumber)
	{  
		enterTextByXpath(prop.getProperty("signUp.PhoneTxtbx.xpath"),phoneNumber);
		return this;
		
	}
	
	public SignUppage clickContinuebtn()
	{  
		clickBtnByXpath(prop.getProperty("signUp.Continuebtn.xpath"));
		return this;
		
	}
	
	


}
