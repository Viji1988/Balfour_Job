package com.Balfour.reusablecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Balfour.support.BrowserActions;
import com.Balfour.support.Log;
import com.Balfour.support.StopWatch;
import com.Balfour.support.Utils;

/**
 * Re-Usable methods of QV for Retail Sites
 * 
 * 
 */
public class QuickViewUtils {

	/**
	 * Select Size in QV - DW and Non DW site
	 * 
	 * @param btnSize
	 *            : Size Button WebElement
	 * @param optToSelect
	 *            : Option to select from combobox
	 * @param driver
	 *            : WebDriver Instance
	 */
	final public static void selectSize(WebElement btnSize, String optToSelect, WebDriver driver) {

		final long startTime = StopWatch.startTime();

		BrowserActions.selectFromComboBox(btnSize, optToSelect, driver, "Size -  - " + optToSelect);
		Log.trace("Selected " + "Size - " + optToSelect + ".", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// selectSize

	/**
	 * Select Quantity in QV - DW and Non DW site
	 * 
	 * @param btnQty
	 *            : Quantity Button WebElement
	 * @param optToSelect
	 *            : Option to select from combobox
	 * @param driver
	 *            : WebDriver Instance
	 */
	final public static void selectQty(WebElement btnQty, String optToSelect, WebDriver driver) {

		final long startTime = StopWatch.startTime();

		BrowserActions.selectFromComboBox(btnQty, optToSelect, driver, "Quantity - " + optToSelect);
		Log.trace("Selected " + "Quantity - " + optToSelect + ".", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// selectQty

	/**
	 * Select Color in QV - DW and Non DW site
	 * 
	 * @param btnColor
	 *            : Color Button WebElement
	 * @param optToSelect
	 *            : Option to select from combobox
	 * @param driver
	 *            : WebDriver Instance
	 */
	final public static void selectColor(WebElement btnColor, String optToSelect, WebDriver driver) {

		final long startTime = StopWatch.startTime();

		BrowserActions.selectFromComboBox(btnColor, optToSelect, driver, "Color - " + optToSelect);
		Log.trace("Selected " + "Color - " + optToSelect + ".", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// selectColor

	/**
	 * Click on Product Thumbnail in QV - DW and Non DW site
	 * 
	 * @param linkPrdThumbnail
	 *            : Product Thumbnail WebElement
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static void clickProductThumbnail(WebElement linkPrdThumbnail, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(linkPrdThumbnail, driver, "Product Thumbnail");
		Log.trace("Clicked Product Thumbnail button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// clickProductThumbnail

	/**
	 * Expand Product Details Tab - DW site
	 * 
	 * @param tabPrdDetails
	 *            : Product Details Tab WebElement
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static void expandProductDetailsTab(WebElement tabPrdDetails, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(tabPrdDetails, driver, "Product Details Tab");
		Log.trace("Clicked Product Details Tab button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// expandProductDetailsTab

	/**
	 * Expand Product Size Guide Tab - DW site
	 * 
	 * @param tabPrdSizeGuide
	 *            : Product Size Guide Tab WebElement
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static void expandProductSizeGuideTab(WebElement tabPrdSizeGuide, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(tabPrdSizeGuide, driver, "Product Size Guide Tab");
		Log.trace("Clicked Product Size Guide Tab button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// expandProductSizeGuideTab

	/**
	 * Expand Product Shipping Returns Tab - DW site
	 * 
	 * @param tabPrdShippingReturns
	 *            : Product Shipping Returns Tab WebElement
	 * @param driver
	 *            : WebDriver Instance
	 * @throws Exception 
	 */
	final public static void expandProductShippingReturnsTab(WebElement tabPrdShippingReturns, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(tabPrdShippingReturns, driver, "Product Shipping Returns Tab");
		Log.trace("Clicked Product Shipping Returns Tab button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// expandProductShippingReturnsTab

}// QV_Util