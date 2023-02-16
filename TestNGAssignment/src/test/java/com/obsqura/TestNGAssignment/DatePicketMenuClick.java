package com.obsqura.TestNGAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePicketMenuClick extends BaseDatePicker {
	@Test(description="Headder menu using find elements")
	public void datePickerClick(){
		String outputURL,inputURL="https://selenium.obsqurazone.com/date-picker.php";
		List<WebElement>datePicker=driver.findElements(By.xpath("//div[@class='collapse navbar-collapse']//a"));
		for(WebElement date:datePicker) {
			if(date.getText().equalsIgnoreCase("Date Pickers")) {
				date.click();
				break;
			}
		}
		outputURL=driver.getCurrentUrl();
		Assert.assertEquals(outputURL, inputURL, "Navigated Page Is Not Correct");
	}

}
