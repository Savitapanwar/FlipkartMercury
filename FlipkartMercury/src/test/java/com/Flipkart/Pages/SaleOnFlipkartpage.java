package com.Flipkart.Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.Flipkart.Baseclass.Flipkart;

public class SaleOnFlipkartpage extends Flipkart
{

	public SaleOnFlipkartpage(RemoteWebDriver driver) 
	{
		this.driver=driver;
		if(!verifyTitle("Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce"))
		{
			System.out.println("OOPSs.. You are on wrong page");
		}
	}
	
	public SaleOnFlipkartpage gotoHome()
	{
		
		clickBtnByXpath(prop.getProperty("saleOnFlipkart.Hometab.xpath"));
		
		return this;
		
	}
	


}
