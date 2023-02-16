package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends BaseCheckBox{
	@Test(description="Check CheckBox Are Already Selected")
	public void checkBoxSelect() {
		boolean flag=false;
		WebElement manualCheckBox = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		WebElement automationCheckBox = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		WebElement rcRadioCheckBox = driver.findElement(By.xpath("//input[@value='RC']"));
		WebElement seleniumIDECheckBox = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		WebElement seleniumCheckBox = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		boolean checkBox=manualCheckBox.isSelected()&&automationCheckBox.isSelected()&&rcRadioCheckBox.isSelected()&&seleniumIDECheckBox.isSelected()&&seleniumCheckBox.isSelected();
		if(checkBox==false) {
			flag=true;
		}
		Assert.assertTrue(checkBox==false, "CheckBox Are Already Selected");
	}
	@Test(description="Check Box of tutorialspoint page")
	public void checkBox() {
		boolean flag=false;
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		checkBox.click();
		boolean manualCheckBox = driver.findElement(By.xpath("//input[@value='Manual Tester']")).isSelected();
		boolean automationCheckBox = driver.findElement(By.xpath("//input[@value='Automation Tester']")).isSelected();
		boolean rcRadioCheckBox = driver.findElement(By.xpath("//input[@value='RC']")).isSelected();
		boolean seleniumIDECheckBox = driver.findElement(By.xpath("//input[@value='Selenium IDE']")).isSelected();
		boolean seleniumWebDriverCheckBox = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).isSelected();
		if(manualCheckBox==false&&automationCheckBox==false&&rcRadioCheckBox==false&&seleniumIDECheckBox==false&&seleniumWebDriverCheckBox==true) {
			flag=true;
		}
		Assert.assertTrue(seleniumWebDriverCheckBox==true, "Selenium WebDriver CheckBox Is Not Selected");
	}

}
