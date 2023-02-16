package com.obsqura.TestNGAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Navigation extends Base {
	@Test
	public void firstPageTitle() {
		String actualTitle,expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	@Test
	public void firstPageURL() {
		String actualURL,expectedURL="https://www.amazon.in/";
		actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test
	public void verifyTitle() {
		String actualTitle,expectedTitle="Amazon Sign In";
		actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void verifyURL() {
		String actualURL,expectedURL="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test
	public void getPageSource() {
		String actualPageSource,expectedPageSource="stylesheet";
		//getting page source 
		actualPageSource=driver.getPageSource();
		Assert.assertTrue(actualPageSource.contains(expectedPageSource), "Page Source Is Not Found");
	}
	
	@Test
	public void navigateToLoginPage() {
		String actualURL,expectedURL="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL, "expected url is not correct");
	}
	


}
