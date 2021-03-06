package com.Balfour.reusablecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Balfour.support.BrowserActions;
import com.Balfour.support.Log;
import com.Balfour.support.StopWatch;
import com.Balfour.support.Utils;

/**
 * Re-Usable methods of Social Sites navigation Functionality for Retail Sites -
 * 
 * FB, Instagram, Pinterest, Twitter, Youtube, Tumblr and GooglePlus
 * 
 * 
 */
public class SocialSitesUtils {

	/**
	 * Navigate to FB Circle/Share on FB - On QV/PDP/CLP/Home
	 * 
	 * @param btnFaceBook
	 *            : WebElement for FB Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToFaceBook(WebElement btnFaceBook, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnFaceBook, driver, "Facebook");
		Log.trace("Clicked FB Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToFaceBook

	/**
	 * Navigate to Instagram Circle/Share on Instagram - On QV/PDP/CLP/Home
	 * 
	 * @param btnInstagram
	 *            : WebElement for Instagram Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToInstagram(WebElement btnInstagram, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnInstagram, driver, "Instagram");
		Log.trace("Clicked Instagram Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToInstagram

	/**
	 * Navigate to Pinterest Circle/Share on Pinterest - On QV/PDP/CLP/Home
	 * 
	 * @param btnPinterest
	 *            : WebElement for Pinterest Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToPinterest(WebElement btnPinterest, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnPinterest, driver, "Pinterest");
		Log.trace("Clicked Pinterest Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToPinterest

	/**
	 * Navigate to Twitter Circle/Share on Twitter - On QV/PDP/CLP/Home
	 * 
	 * @param btnTwitter
	 *            : WebElement for Twitter Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToTwitter(WebElement btnTwitter, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnTwitter, driver, "Twitter");
		Log.trace("Clicked Twitter Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToTwitter

	/**
	 * Navigate to Youtube Circle/Share on Youtube - On QV/PDP/CLP/Home
	 * 
	 * @param btnYoutube
	 *            : WebElement for Youtube Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToYoutube(WebElement btnYoutube, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnYoutube, driver, "YouTube");
		Log.trace("Clicked Youtube Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToYoutube

	/**
	 * Navigate to Tumblr Circle/Share on Tumblr - On QV/PDP/CLP/Home
	 * 
	 * @param btnTumblr
	 *            : WebElement for Tumblr Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToTumblr(WebElement btnTumblr, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnTumblr, driver, "Tumblr");
		Log.trace("Clicked Tumblr Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToTumblr

	/**
	 * Navigate to GooglePlus Circle/Share on GooglePlus - On QV/PDP/CLP/Home
	 * 
	 * @param btnGooglePlus
	 *            : WebElement for GooglePlus Button
	 * @param driver
	 *            : WebDriver instance
	 * @throws Exception 
	 */
	final public static void navigateToGooglePlus(WebElement btnGooglePlus, WebDriver driver) throws Exception {

		final long startTime = StopWatch.startTime();

		BrowserActions.clickOnElement(btnGooglePlus, driver, "Google Plus");
		Log.trace("Clicked GooglePlus Button.", StopWatch.elapsedTime(startTime));

		Utils.waitForPageLoad(driver);

	}// navigateToGooglePlus

}// SocialSites_Util