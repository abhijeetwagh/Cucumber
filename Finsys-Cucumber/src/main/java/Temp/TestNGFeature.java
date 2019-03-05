package Temp;

import org.testng.annotations.Test;

public class TestNGFeature {

	@Test
	public void LoginTest() {
		System.out.println("Login Test");
		int i = 9 / 0;
	}

	@Test(dependsOnMethods = "LoginTest")
	public void HomePageTest() {
		System.out.println("Home Test");
	}
	
	@Test(dependsOnMethods = "LoginTest")
	public void SearchPage(){
		System.out.println("SearchPage");
	}
}
