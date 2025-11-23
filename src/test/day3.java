package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any methods in the class");
	}
@Parameters({ "URL" })
	@Test
	public void WebloginCarLoan(String urlname)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		
	}
@Test
public void NewOne()
{
	System.out.println("newOne");
	
	
}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every test method in day3 class");
	}
	
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will execute After Every test method in day3 class");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("AFter executing all methods in the class");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar");
	}
	@BeforeSuite
	public void  BFsuite()
	{
		System.out.println("I am the first number");
	}
	@Test
	public void MobileSigninCarLoan()
	{
		System.out.println("MobileSigninCar");
	}
	
	@Test
	public void MobileSignOutCarLoan()
	{
		System.out.println("MobileSignOutCar");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPICarLoan()
	{
		System.out.println("APILoginCar");
	}

}
