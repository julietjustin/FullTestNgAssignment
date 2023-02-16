package com.obsqura.TestNGAssignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method Annotation");
	}
	@AfterClass
	public void annotationAfterClass() {
		System.out.println("After Class Annotation");
	}
	@AfterSuite
	public void annotationAfterSuit() {
		System.out.println("After Suite Annotation");
	}
	@AfterTest
	public void annotationAfterTest() {
		System.out.println("After Test Annotation");
	}
	@Test
	public void annotationTest() {
		System.out.println("Test Annotation");
	}
	@BeforeTest
	public void annotationBeforeTest() {
		System.out.println("Before Test Annotation");
	}
	@Test
	public void annotationTest2() {
		System.out.println("2nd TestCase");
	}
	@BeforeMethod
	public void annotationBeforeMethod() {
		System.out.println("Before Method Annotation");
	}
	@BeforeSuite
	public void annotationBeforeSuite() {
		System.out.println("Before Suite Annotation");
	}
	@BeforeClass
	public void annotationBeforeClass() {
		System.out.println("Before Class Annotation");
	}
	@Test
	public void annotationTest3() {
		System.out.println("3rd TestCase");
	}

}
