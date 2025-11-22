package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void CloseConnection()
	{
		System.out.println("I will execite last");
	}
	
	@AfterSuite
	public void  AFsuite()
	{
		System.out.println("I am the last number");
	}
	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("Hello");
		
		Assert.assertTrue(false);
	}
	
	@Test
	public void demo2()
	{
		System.out.println("bye");
	
	}
	
}
