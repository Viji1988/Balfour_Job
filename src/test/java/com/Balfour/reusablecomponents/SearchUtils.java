package com.Balfour.reusablecomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Balfour.support.BrowserActions;
import com.Balfour.support.Log;
import com.Balfour.support.Utils;

/**
 * Re-Usable methods of Search Functionality for Retail Sites
 * 
 * Also created re-usable methods for DemandWare business flows
 * 
 * Some of the DW methods can be optimized and use for other platform based retail site also
 * 
 * 
 */
public class SearchUtils {

	/**
	 * Searches keyword in Retail Search Box
	 * 
	 * @param txtSrch
	 *            : WebElement for Search Box
	 * @param btnSrch
	 *            : WebElement for Search Button
	 * @param txtToSearch
	 *            : Keyword to search
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void doSearch(WebElement txtSrch, WebElement btnSrch, String txtToSearch, WebDriver driver) throws Exception {

		//final long startTime = StopWatch.startTime();

		BrowserActions.typeOnTextField(txtSrch, txtToSearch, driver, "Search Box");
		Log.trace("Text entered in Search Box.");
		//Log.trace("Text entered in Search Box.", StopWatch.elapsedTime(startTime));

		BrowserActions.clickOnElement(btnSrch, driver, "Search");
		//Log.trace("Clicked Search button.", StopWatch.elapsedTime(startTime));
		Log.trace("Clicked Search button.");

		Utils.waitForPageLoad(driver);

	}// doSearch

	/**
	 * Select the search product from result - DW and Non-DW application can use this
	 * 
	 * @param srchRsltLoc
	 *            : String format - ul[class=''] li:nth-child($) a
	 * @param whichRsltToClick
	 *            : $ symbol in srchRsltLoc param will be replaced with this string. Ex: "1" - ul[class=''] li:nth-child(1) a
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static void selectFromSearchProductResult(String srchRsltLoc, String whichRsltToClick, WebDriver driver) throws Exception {

		//final long startTime = StopWatch.startTime();
		String replacedString = srchRsltLoc.replace("$", whichRsltToClick);

		BrowserActions.clickOnElement(replacedString, driver, "Search Result");
		//Log.trace("Clicked '" + whichRsltToClick + "' Search product from result.", StopWatch.elapsedTime(startTime));
		Log.trace("Clicked '" + whichRsltToClick + "' Search product from result.");

		Utils.waitForPageLoad(driver);

	}// selectFromSearchProductResult

	/**
	 * Select the search suggestion from result - DW application can use this
	 * 
	 * @param srchSuggstnRslt
	 *            : String format - ul[class=''] li:nth-child($) a
	 * @param whichSuggstnToClick
	 *            : $ symbol in srchRsltLoc param will be replaced with this string. Ex: "1" - ul[class=''] li:nth-child(1) a
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static void selectFromSearchProductSuggestion(String srchSuggstnRslt, String whichSuggstnToClick, WebDriver driver) throws Exception {

	//	final long startTime = StopWatch.startTime();
		String replacedString = srchSuggstnRslt.replace("$", whichSuggstnToClick);

		BrowserActions.clickOnElement(replacedString, driver, "Search Suggestion");
		//Log.trace("Clicked '" + whichSuggstnToClick + "' Search product from result.", StopWatch.elapsedTime(startTime));
		Log.trace("Clicked '" + whichSuggstnToClick + "' Search product from result.");

		Utils.waitForPageLoad(driver);

	}// selectFromSearchProductSuggestion
	
	
	
	/**
	 * Select the search suggestion from result - DW application can use this
	 * 
	 * @param txtSrch
	 * 			:  WebElement txtSrch
	 * @param srchText
	 *            : String Jean
	 * @param whichSuggstnToClick
	 *            :WebElement for SuggstnToClick 
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static String selectFromSearchAutoProductSuggestion(WebElement txtSrch,String srchText, String whichSuggstnToClick, WebDriver driver) throws Exception {
		
		BrowserActions.typeOnTextField(txtSrch, srchText, driver, "Enter text in the search box ");
		BrowserActions.nap(5);
		WebElement element= driver.findElement(By.xpath(whichSuggstnToClick));
		Utils.waitForElement(driver, element, 10);
		String autoSuggestionText = BrowserActions.getText(driver, element, "Suggestion text");
		BrowserActions.clickOnElement(element, driver, "Search Suggestion");
		
		Log.trace("Clicked '" + element + "' Search product from result.");
		
		Utils.waitForPageLoad(driver);
		return autoSuggestionText;

	}// selectFromSearchAutoProductSuggestion	
	
	/**
	 * select first Refinements (Example : i need to select first color in the list so am passing list element in the param )
	 * 
	 * @param whichSuggstnToClick
	 *            : List WebElement for whichSuggstnToClick
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	
	@SuppressWarnings("unused")
	public static String selectRefinementFirstValue (List <WebElement> whichSuggstnToClick, WebDriver driver) throws Exception{		
		String txtSelected = null;
		for (int sz = 0; sz < whichSuggstnToClick.size(); sz++) {	 
        	   whichSuggstnToClick.get(sz).click();
        	   txtSelected = BrowserActions.getText(driver, whichSuggstnToClick.get(sz), "Fetching selected value in the refinement");
        	   break;
           }
         
       Utils.waitForPageLoad(driver);
       WebElement selectedRefinement = BrowserActions.checkLocator(driver, whichSuggstnToClick + " i[class='toggle-check toggle-check-active']");
       Utils.waitForElement(driver, selectedRefinement);
       return txtSelected;
	} //selectOptionRefinementsRandomly
	
	/**
	 * un select first Refinements (Example : i need to Unselect first color in the list so am passing list element in the param )
	 * 
	 * @param whichSuggstnToClick
	 *            : List WebElement for whichSuggstnToClick
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	public static boolean unSelectRefinementFirstValue (List <WebElement> whichSuggstnToClick, WebDriver driver) throws Exception{		
		boolean returnvalue = false;
		for (int sz = 0; sz < whichSuggstnToClick.size(); sz++) {	 
       	   whichSuggstnToClick.get(sz).click();
        }
      Utils.waitForPageLoad(driver);
      WebElement selectedRefinement = BrowserActions.checkLocator(driver, whichSuggstnToClick + " i[class='toggle-check toggle-check-active']");
      
      if(!Utils.waitForElement(driver, selectedRefinement)){
    	   returnvalue=true;
      }
      return returnvalue;
      
	} //unSelectRefinementFirstValue

	/**
	 * 
	 * @param element : webelement
	 * @return to text based on the passing parameter
	 * @throws Exception
	 */
	public String getTextFromBreadcrumbRefinementText(WebDriver driver, WebElement element) throws Exception{
		String txtRefinement=BrowserActions.getText(driver, element, "Fetching text from the bread crumb after filtering the product");
		return txtRefinement;
	}
	

}// Search_Util