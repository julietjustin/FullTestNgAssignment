package com.obsqura.TestNGAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewBase {
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\TestNGAssignment\\src\\main\\java\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
