package Temp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	/*
	 * Setup system property for chrome 1
	 * Login to app 2 
	 * Launch chrome Browser 3
	 * enter URL 4 
	 * Google title test 5 
	 * logout from app 6 
	 * Close Browser 7
	 * deleteAllCookies 8
	 * generateTestReport 9
	 * 
	 */
	
	//Pre-Conditions Annotations --- starting with @Before
	
	@BeforeSuite //1
	public void SetUp(){
		System.out.println("Setup system property for chrome "+ "1");
	} 
	
	@BeforeTest //2
	public void launchBrowser(){
		System.out.println("Launch Browser "+ "2");
	}
	
	@BeforeClass //3
	public void login(){
		System.out.println("Login to app "+ "3");
	}
	
	@BeforeMethod //4
	public void enterURL(){
		System.out.println("enter URL "+ "4");
	}
	
	
	//test-case --- Starting with @Test
	@Test //5
	public void googleTitleTest(){
		System.out.println("Google title test "+ "5");
	}
	
	//Post-Conditions Annotations --- starting with @After
	
	@AfterMethod //6
	public void logout(){
		System.out.println("logout from app "+ "6");
	}
	
	@AfterTest //8
	public void deleteCookies(){
		System.out.println("deleteAllCookies "+ "8");
	}
	
	@AfterClass //7
	public void classBrowser(){
		System.out.println("Close Browser "+ "7");
	}
	
	@AfterSuite //9
	public void generateTestReport(){
		System.out.println("generateTestReport "+ "9");
	}
}
