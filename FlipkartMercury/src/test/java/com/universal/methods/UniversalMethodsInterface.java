package com.universal.methods;

public interface UniversalMethodsInterface 
{
	public void invokeApp(String browsername);
	public boolean verifyTitle(String title);
    
    public void closeAllbrowser();
    public void clickByLinktext(String linktxt);
    public void loadObjectfile();
    public void UnloadObjects();
    
    
    /** 
     * @author savita
     * This method will switch control to the last window opened 
     */
    public void switchToLastWindow();
    
    /**
     * @param xpath
     * @author savita
     * This method will enter data in text box which is detected byxpath
     */
    public void enterTextByXpath(String xpath,String data);
    
    /**
     * @param xpath
     * This method will click the element by xpath
     */
    public void clickBtnByXpath(String xpath);
}
