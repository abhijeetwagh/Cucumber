/*package Finsys.Finsys_Cucumber.Feature;

import ejagruti.config.Config;
import ejagruti.result.HTMLReportGenerator;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	static WebDriver driver;
	final static Logger logger = Logger.getLogger(Login.class);

	@When("^user opens the \"(.*)\" browser$")
	public void OpenBrowser(String browsername) throws IOException {
		try {
			System.setProperty(browsername, "E:\\DRIVERS\\Firefox Setup 46.0.1.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Browser will open" + browsername);
			logger.info("Step Number:" + (Config.counter++) + "Step Status:PASS,Step Name:When user opens the "
					+ browsername + " browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "When user opens the " + browsername + "browser",
					"Browsername:" + browsername + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\OpenBrowser.PNG", Login.driver));
		} catch (Exception ex) {
			logger.info("Step Number:" + (Config.counter++) + "Step Status:FAIL,Step Name:When user opens the"
					+ browsername + " browser,Exception:" + ex.getMessage());
			HTMLReportGenerator.StepDetails("fail", "When user opens the " + browsername + "browser",
					"Browsername:" + browsername + ",Exception:" + ex.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\OpenBrowser.PNG", Login.driver));
			ex.printStackTrace();

		}
	}

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String Url1) throws IOException {
		try {
			driver.get(Url1);
			driver.manage().window().maximize();
			System.out.println("Enter Url" + Url1);
			logger.info("Step Number:" + (Config.counter++) + "Step Status:PASS,Step Name:And user enters the url "
					+ Url1 + " browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "And user enters the url " + Url1 + "URL",
					"" + Url1 + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\enters the url.PNG", Login.driver));

		} catch (Exception j) {
			logger.info("Step Number:" + (Config.counter++) + "Step Status:FAIL,Step Name:And user enters the url "
					+ Url1 + " browser,Exception:" + j.getMessage());
			HTMLReportGenerator.StepDetails("fail", "And user enters the url " + Url1 + "URL",
					"Browsername:" + Url1 + ",Exception:" + j.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\enters the url.PNG", Login.driver));
			j.printStackTrace();
		}
	}

	@Given("^user is on the application login page$")
	public void user_is_on_the_application_login_page() throws IOException {
		try {
			String title = driver.getTitle();
			System.out.println("login page title::" + title);
			System.out.println("User is on the HomePage");
			Assert.assertEquals("SBDC - Small Business Development Co.", title);
			System.out.println("User Is on the Login Page");
			logger.info("Step Number:" + (Config.counter++)
					+ "Step Status:PASS,Step Name:Given user is on the application login page");
			HTMLReportGenerator.StepDetails("pass", "Given user is on the application login page " + "LoginPage" + "",
					"" + "" + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\application login page.PNG", Login.driver));
		} catch (Exception z) {
			logger.info("Step Number:" + (Config.counter++)
					+ "Step Status:FAIL,Step Name:Given user is on the application login page");
			HTMLReportGenerator.StepDetails("fail",
					"Given user is on the application login page" + "LoginPage" + "browser",
					"" + " " + ",Exception:" + z.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\application login page.PNG", Login.driver));
			z.printStackTrace();
		}
	}

	@When("^user enters \"(.*)\" as username$")
	public void USSER_ENTER_username(String UserName) throws IOException {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName);
			System.out.println("Enter username here" + UserName);
			logger.info("Step Number:" + (Config.counter++) + "Step Status:PASS,Step Name:When user enters username"
					+ UserName + " browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "And user enter as username" + UserName + "UN",
					"UserName:" + UserName + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\username.PNG", Login.driver));
		} catch (Exception r) {
			logger.info("Step Number:" + (Config.counter++) + "Step Status:FAIL,Step Name:When user enters username "
					+ UserName + " browser,Exception:" + r.getMessage());
			HTMLReportGenerator.StepDetails("fail", "UserName" + UserName + "Url Link",
					"UserName:" + UserName + ",Exception:" + r.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\username.PNG", Login.driver));
			r.printStackTrace();
		}
	}

	@And("^user enters \"(.*)\" as password$")
	public void EnterPassword(String Password) throws IOException {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
			System.out.println("Enter password here" + Password);
			logger.info("Step Number:" + (Config.counter++) + "Step Status:PASS,Step Name:And user enters password"
					+ Password + " browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "And user enter as username" + Password + "UN",
					"UserName:" + Password + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\username.PNG", Login.driver));

		} catch (Exception t) {
			logger.info("Step Number:" + (Config.counter++) + "Step Status:FAIL,Step Name:And user enters password"
					+ Password + " browser,Exception:" + t.getMessage());
			HTMLReportGenerator.StepDetails("fail", "UserName" + Password + "Url Link",
					"UserName:" + Password + ",Exception:" + t.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\username.PNG", Login.driver));
			t.printStackTrace();
		}
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws IOException {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class=\"easyui-linkbutton l-btn l-btn-small easyui-fluid\"]")).click();
			System.out.println("Click on login");
			logger.info(
					"Step Number:" + (Config.counter++) + "Step Status:FAIL,Step Name:And user clicks on login button");
			HTMLReportGenerator.StepDetails("pass", "user clicks on login button" + "" + "", "" + "" + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\clicks on login.PNG", Login.driver));

		} catch (Exception w) {
			logger.info(
					"Step Number:" + (Config.counter++) + "Step Status:FAIL,Step Name:And user clicks on login button");
			HTMLReportGenerator.StepDetails("fail", "user clicks on login button" + " " + " ",
					" " + "" + ",Exception:" + w.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\clicks on login.PNG", Login.driver));
		}
	}

	@Given("^user is on the application home page$")
	public void HmPage() throws IOException {
		try {
			Thread.sleep(2000);
			String title = driver.getTitle();
			System.out.println("Home page title::" + title);
			System.out.println("User on the HomePage");
			Assert.assertEquals("FinSys (SBDC) - eJagruti Educational Services", title);
			logger.info("Step Number:" + (Config.counter++)
					+ "Step Status:PASS,Step Name:Then user is on the application home page");
			HTMLReportGenerator.StepDetails("pass", "Then user is on the application home page" + "" + "",
					"" + "HomePage" + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\HmPage.PNG", Login.driver));
		} catch (Exception q) {
			logger.info("Step Number:" + (Config.counter++)
					+ "Step Status:FAIL,Step Name:Then user is on the application home page");
			HTMLReportGenerator.StepDetails("fail", "Then user is on the application home page" + "" + "",
					"" + "HomePage" + ",Exception:" + q.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\HmPage.PNG", Login.driver));
			q.printStackTrace();
		}
	}

	@Then("^user is on the same login page$")
	public void user_is_on_the_same_login_page() throws IOException {
		try {
			Thread.sleep(2000);
			String actual_error = driver.findElement(By.xpath("//div[@id='error']")).getText();
			String Expected_error = "Please Enter Valid Username or Password!!!";
			if (actual_error.equals(Expected_error)) {
				System.out.println("Test Case Passed");
			} else {
				System.out.println("Test Case Failed");
			}
			;
			System.out.println("User is on the same login page");
			logger.info("Step Number:" + (Config.counter++)
					+ "Step Status:PASS,Step Name:Then user is on the same login page");
			HTMLReportGenerator.StepDetails("pass", "Then user is on the same login page" + "" + "",
					"" + "User Is On The Application page" + ",Exception:NA",
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\user_is_on_the_same_login_page.PNG", Login.driver));
		} catch (Exception f) {
			logger.info("Step Number:" + (Config.counter++)
					+ "Step Status:FAIL,Step Name:Then user is on the same login page");
			HTMLReportGenerator.StepDetails("fail", "Then user is on the same login page" + "" + "",
					"" + "User Is On Application page" + ",Exception:" + f.getMessage(),
					Config.TakeScreenShot("E:\\ScreenShot\\Test\\user_is_on_the_same_login_page.PNG", Login.driver));
			f.printStackTrace();
		}
	}
}
*/