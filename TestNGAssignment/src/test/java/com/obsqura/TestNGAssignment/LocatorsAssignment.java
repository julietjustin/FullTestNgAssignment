package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsAssignment extends Base {
	@Test(description="LocatingById for amazon site")
	public void locatingById() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();	
	}
	
}
