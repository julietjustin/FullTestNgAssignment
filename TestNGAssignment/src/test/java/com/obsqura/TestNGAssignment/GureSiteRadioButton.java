package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GureSiteRadioButton extends RadioButtonBase {
	@Test
	public void clickRadioButton() {
		String actualMessage,expectedMessage="Radio button is checked and it's value is No";
		WebElement radioButton1=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement radioButton2=driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		WebElement checkButton=driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		WebElement message=driver.findElement(By.xpath("//p[@class='radiobutton']"));
		boolean selectRadioButton=radioButton1.isSelected()&&radioButton2.isSelected();
			if(selectRadioButton==false) {
				radioButton2.click();
				if(checkButton.isEnabled()) {
					checkButton.click();
					if(message.isDisplayed()) {
						actualMessage=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
						Assert.assertEquals(actualMessage, expectedMessage, "Message Is Not Correct");
					}
					Assert.assertTrue(checkButton.isEnabled(), "Check Button Is Not Enabled");
				}
				SoftAssert softAssert=new SoftAssert();
				softAssert.assertTrue(radioButton2.isSelected(), "Radio Button 'No' Is Not Selected");	
			}
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertTrue(selectRadioButton==false, "Radio Button Is Already Selected");
					
			
	}

}
