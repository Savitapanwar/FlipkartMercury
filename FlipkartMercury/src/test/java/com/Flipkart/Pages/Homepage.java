package com.Flipkart.Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.Flipkart.Baseclass.Flipkart;

public class Homepage extends Flipkart
{

	public Homepage(RemoteWebDriver driver) 
	{
		this.driver=driver;
		if(!verifyTitle("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"))
		{
			System.out.println("OOPSs.. You are on wrong page");
		}
	}
	
	public SignUppage gotoSignUppage()
	{
		clickByLinktext(prop.getProperty("homepage.signupbtn.linktext"));
		switchToLastWindow();
		return new SignUppage(driver);
		
	}
	public SaleOnFlipkartpage gotoSaleOnFlipkart()
	{
		clickByLinktext(prop.getProperty("homepage.sellOnFlipcarttab.linktext"));
		switchToLastWindow();
		return new SaleOnFlipkartpage(driver);
		
	}


}
