package Temp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	// 1 //4 //7
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVERS\\chromedriver_from_v64-66.exe");
		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	// 2
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 5
	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() {
		Boolean b = driver
				.findElement(By
						.xpath("//*[@srcset='/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png 1x, /images/branding/googlelogo/2x/googlelogo_color_272x92dp.png 2x']"))
				.isDisplayed();
	}

	// 8
	@Test(priority = 3, groups = "linkText")
	public void linkText() {
		Boolean bool = driver.findElement(By.linkText("Mail")).isDisplayed();
	}

	@Test(priority = 4, groups = "test")
	public void test1() {
		System.out.println("test");
	}

	@Test(priority = 5, groups = "test")
	public void TEST2() {
		System.out.println("Test2");
	}

	// 3 //6 //9
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
