package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleVerification extends NewBase {
	@Test
	public void title() {
		String actualTitle,expectedTitle="Grocerystore";
		actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void drivernull() {
		Assert.assertNotNull(driver, "Driver Is Null");
		
	}
}
