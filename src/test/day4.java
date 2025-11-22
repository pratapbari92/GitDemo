package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		System.out.println("webloginHomePersonalLoan");
		System.out.println(uname);
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome");
	}
	
	@BeforeTest
	 public void prereqquisite()
	 {
		 System.out.println("I will execute first");
	 }

}
