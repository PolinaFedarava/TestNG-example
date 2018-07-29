package by.htp.test.simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestNgExample 
{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("1 - @BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("1 - @AfterSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("1 - @BeforeTest");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("1 - @AfterTest");
	}
	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("1 - @BeforeGroups");
	}
	
	@AfterGroups
	public void afterGroups()
	{
		System.out.println("1 - @AfterGroups");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("1 - @BeforeClass");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("1 - @AfterClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("1 - @BeforeGroups");
	}
	@AfterMethod 
	public void afterMethod()
	{
		System.out.println("1 - @AfterMethod");
	}
	
	@Test (groups = "simple")
	public void testOne () {
		System.out.println("1 Test");
	}
	
	@Test 
	public void testTwo () {
		System.out.println("2 Test");
	}
	
	@Test 
	public void testThree () {
		System.out.println("3 Test");
	}
}
