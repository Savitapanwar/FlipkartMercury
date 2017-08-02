package com.universal.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UniversalMethodClass implements UniversalMethodsInterface
{   
	public RemoteWebDriver driver;
	public String sUrl,sPort;

	//this prop will be used for objects and should not be used for loading config
	protected static Properties prop;


	public UniversalMethodClass() {
		try {

			Properties prop=new Properties();
			prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
			sUrl=prop.getProperty("URL");
			sPort=prop.getProperty("PORT");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void invokeApp(String browsername) {

		try {
			if(browsername.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32 bit.exe");
				driver = new FirefoxDriver();
			}



			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("The browse "+browsername+"could not be launched");
		}



	}

	public boolean verifyTitle(String title) 
	{ 
		boolean breturn=false;
		try {
			String pagetitle;
			pagetitle=driver.getTitle();
			if(pagetitle.equalsIgnoreCase(title))
				return breturn=true;
			else
				return breturn=false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return breturn;


	}


	public void closeAllbrowser() {

		driver.quit();

	}

	public void clickByLinktext(String linktxt) {

		driver.findElement(By.linkText(linktxt)).click();

	}

	public void loadObjectfile() 
	{
		try {

			prop=new Properties();
			prop.load(new FileInputStream(new File("./src/test/resources/object.properties")));

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}

	public void UnloadObjects() {
		prop=null;

	}

	public void switchToLastWindow() {

		try {
			Set<String> windowhandle=    driver.getWindowHandles();

			for(String lastwindow:windowhandle)
			{
				driver.switchTo().window(lastwindow);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	public void enterTextByXpath(String xpath, String data) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}

	public void clickBtnByXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
