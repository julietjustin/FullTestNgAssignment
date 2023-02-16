package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorUsingContainsTextofAndOr extends BaseLocator {
	@Test(description="Using 'Contains(),and,or' Dynamic XPath To Find Unique Element")
	public void singelInputfield() {
		String actualMessage,expectedMessage="Your Message : Apple";
		boolean inputField=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one'and@class='my-2']")).isDisplayed();
		if(inputField==true) {
			driver.findElement(By.xpath("//input[@id='single-input-field'or@placeholder='Message']")).sendKeys("Apple");
			if(showMessageButton==true) {
				driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
				if(message==true) {
					actualMessage=driver.findElement(By.xpath("//div[@id='message-one'and@class='my-2']")).getText();
					Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed The Given Input");
				}
				Assert.assertTrue(message, "Message Is Not Displayed");
			}
			Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
		}
		Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'Starts-with' Dynamic XPath To Find Unique Element")
	public void startsWith() {
		String actualMessage,expectedMessage="Your Message : 'STARTS-WITH' Dynamic XPath";
		boolean inputField=driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[starts-with(@id,'message-one')]")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")).sendKeys("'STARTS-WITH' Dynamic XPath");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]")).click();
					if(message==true) {
						actualMessage=driver.findElement(By.xpath("//div[starts-with(@id,'message-one')]")).getText();
						Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'Contains()' Dynamic XPath To Find Unique Element")
	public void containss() {
		String actualMessage,expectedMessage="Your Message : 'Contains()' Dynamic XPath";
		boolean inputField=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[contains(@id,'message-one')]")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]")).sendKeys("'Contains()' Dynamic XPath");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
					if(message==true) {
						actualMessage=driver.findElement(By.xpath("//div[contains(@id,'message-one')]")).getText();
						Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'AND' Dynamic XPath To Find Unique Element")
	public void and() {
		String actualMessage,expectedMessage="Your Message : 'AND' Dynamic XPath";
		boolean inputField=driver.findElement(By.xpath("//input[@id='single-input-field'and@placeholder='Message']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[@id='button-one'and text()='Show Message']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one'and@class='my-2']")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//input[@id='single-input-field'and@placeholder='Message']")).sendKeys("'AND' Dynamic XPath");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//button[@id='button-one'and text()='Show Message']")).click();
					if(message==true) {
						actualMessage=driver.findElement(By.xpath("//div[@id='message-one'and@class='my-2']")).getText();
						Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'OR' Dynamic XPath To Find Unique Element")
	public void or() {
		String actualMessage,expectedMessage="Your Message : 'OR' Dynamic XPath";
		boolean inputField=driver.findElement(By.xpath("//input[@id='single-input-field'or@placeholder='Message']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[@id='button-one'or text()='Show Message']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one'or text()='Your Message']")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//input[@id='single-input-field'or@placeholder='Message']")).sendKeys("'OR' Dynamic XPath");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//button[@id='button-one'or text()='Show Message']")).click();
					if(message==true) {
						actualMessage=driver.findElement(By.xpath("//div[@id='message-one'or text()='Your Message']")).getText();
						Assert.assertEquals(actualMessage, expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'text()' Dynamic XPath To Find Unique Element")
	public void textOf() {
		String actualMessage,expectedMessage="Your Message : 'text()' Dynamic XPath";
		boolean inputField=driver.findElement(By.xpath("//label[text()='Enter Message']//following-sibling::input[@id='single-input-field']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//button[text()='Show Message']//following-sibling::div[@id='message-one']")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//label[text()='Enter Message']//following-sibling::input[@id='single-input-field']")).sendKeys("'text()' Dynamic XPath");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//button[text()='Show Message']")).click();
					if(message==true) {
						actualMessage=driver.findElement(By.xpath("//button[text()='Show Message']//following-sibling::div[@id='message-one']")).getText();
						Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'parent' XPath axes method To Find Unique Element")
	public void parentAxesMethod() {
		String actualMessage,expectedMessage="Your Message : 'parent' XPath axes method";
		boolean inputField=driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']//child::input[@id='single-input-field']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']//parent::form[@method='POST']//child::button[@id='button-one']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one']//parent::form[@method='POST']//child::div[@id='message-one']")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']//child::input[@id='single-input-field']")).sendKeys("'parent' XPath axes method");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//button[@id='button-one']//parent::form[@method='POST']//child::button[@id='button-one']")).click();
					if(message) {
					actualMessage=driver.findElement(By.xpath("//div[@id='message-one']//parent::form[@method='POST']//child::div[@id='message-one']")).getText();
					Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
		}
	
	@Test(description="Using 'child' XPath axes method To Find Unique Element")
	public void child() {
		String actualMessage,expectedMessage="Your Message : 'child' XPath axes method";
		boolean inputField=driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//form[@method='POST']//child::div[@id='message-one']")).isDisplayed();
		if(inputField==true) {
			driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']")).sendKeys("'child' XPath axes method");
			if(showMessageButton==true) {
				driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']")).click();
				if(message==true) {
					actualMessage=driver.findElement(By.xpath("//form[@method='POST']//child::div[@id='message-one']")).getText();
					Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
				}
				Assert.assertTrue(message, "Message Is Not Displayed");
			}
			Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
		}
		Assert.assertTrue(inputField, "Input Field Is Disabled");
	} 
	@Test(description="Using 'ancestor' XPath axes method To Find Unique Element")
	public void ancestor() {
	String actualMessage,expectedMessage="Your Message : 'ancestor' XPath axes method";
		boolean inputField=driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div[@class='container page']//child::input[@id='single-input-field']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']//child::button[@id='button-one']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one']//ancestor::div[@class='container page']//child::div[@id='message-one']")).isDisplayed();
		if(inputField==true) {
			driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div[@class='container page']//child::input[@id='single-input-field']")).sendKeys("'ancestor' XPath axes method");
			if(showMessageButton==true) {
				driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']//child::button[@id='button-one']")).click();
				if(message==true) {
					actualMessage=driver.findElement(By.xpath("//div[@id='message-one']//ancestor::div[@class='container page']//child::div[@id='message-one']")).getText();
					Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
				}
				Assert.assertTrue(message, "Message Is Not Displayed");
			}
			Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
		}
		Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'following' XPath axes method To Find Unique Element")
	public void following() {
		String actualMessage,expectedMessage="Your Message : 'following' XPath axes method";
		boolean inputField=driver.findElement(By.xpath("//label[@for='inputEmail4']//following::input[@id='single-input-field']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//input[@id='single-input-field']//following::button[@id='button-one']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']")).isDisplayed();
			if(inputField==true) {
				driver.findElement(By.xpath("//label[@for='inputEmail4']//following::input[@id='single-input-field']")).sendKeys("'following' XPath axes method");
				if(showMessageButton==true) {
					driver.findElement(By.xpath("//input[@id='single-input-field']//following::button[@id='button-one']")).click();
					if(message==true) {
						actualMessage=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']")).getText();
						Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
					}
					Assert.assertTrue(message, "Message Is Not Displayed");
				}
				Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
			}
			Assert.assertTrue(inputField, "Input Field Is Disabled");
		
	}
	@Test(description="Using 'preceding' XPath axes method To Find Unique Element")
	public void preceding() {
		String actualMessage,expectedMessage="Your Message : 'preceding' XPath axes method";
		boolean inputField=driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::div[@class='header-top']//following::input[@id='single-input-field']")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']//following::button[@id='button-one']")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one']//preceding::div[@class='header-top']//following::div[@id='message-one']")).isDisplayed();
		if(inputField==true) {
			driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::div[@class='header-top']//following::input[@id='single-input-field']")).sendKeys("'preceding' XPath axes method");
			if(showMessageButton==true) {
				driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']//following::button[@id='button-one']")).click();
				if(message==true) {
					actualMessage=driver.findElement(By.xpath("//div[@id='message-one']//preceding::div[@class='header-top']//following::div[@id='message-one']")).getText();
					Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
				}
				Assert.assertTrue(message, "Message Is Not Displayed");
			}
			Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
		}
		Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	@Test(description="Using 'self' XPath axes method To Find Unique Element")
	public void self() {
		String actualMessage,expectedMessage="Your Message : 'self' XPath axes method";
		boolean inputField=driver.findElement(By.xpath("//input[@id='single-input-field']//self::input")).isEnabled();
		boolean showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']//self::button")).isEnabled();
		boolean message=driver.findElement(By.xpath("//div[@id='message-one']//self::div")).isDisplayed();
		if(inputField==true) {
			driver.findElement(By.xpath("//input[@id='single-input-field']//self::input")).sendKeys("'self' XPath axes method");
			if(showMessageButton==true) {
				driver.findElement(By.xpath("//button[@id='button-one']//self::button")).click();
				if(message==true) {
					actualMessage=driver.findElement(By.xpath("//div[@id='message-one']//self::div")).getText();
					Assert.assertEquals(actualMessage,expectedMessage, "Not Displayed The Given Input");
				}
				Assert.assertTrue(message, "Message Is Not Displayed");
			}
			Assert.assertTrue(showMessageButton, "Show Message Button Is Disabled");
		}
		Assert.assertTrue(inputField, "Input Field Is Disabled");
	}
	

}
