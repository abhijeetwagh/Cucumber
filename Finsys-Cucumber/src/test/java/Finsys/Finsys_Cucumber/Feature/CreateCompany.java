package Finsys.Finsys_Cucumber.Feature;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ejagruti.config.Config;
import ejagruti.result.HTMLReportGenerator;

public class CreateCompany {
    static WebDriver driver;
	final static Logger logger = Logger.getLogger(CreateCompany.class);
	 @When("^user launch the \"(.*)\" browser$")
	 public void user_launch_the_browser(String BrowserName) throws IOException{
		 try{
			 System.setProperty(BrowserName, "E:\\DRIVERS\\Firefox Setup 45.0.2_32bit.exe");
			 driver = new FirefoxDriver();
			 System.out.println("Browser will open here" + BrowserName);
			 logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:When user opens the browser"+BrowserName+" browser,Exception:NA");
			 HTMLReportGenerator.StepDetails("pass", "When user opens the "+BrowserName+"browser","Browsername:"+BrowserName+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\opens_browser.PNG",CreateCompany.driver));
			}
			catch(Exception ex)
			{
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:When user opens the browser"+BrowserName+" browser,Exception:"+ex.getMessage());
				HTMLReportGenerator.StepDetails("fail", "When user opens the browser "+BrowserName+"browser","Browsername:"+BrowserName+",Exception:"+ex.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\opens_browser.PNG",CreateCompany.driver));
				ex.printStackTrace();
			}
		}
		
	 @And("^user enters the url \"([^\"]*)\"$")
		public void user_enters_the_url(String url) throws IOException{
			try{
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   System.out.println("Enter Url code here" + url);
			   logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:And user enters the url"+url+" browser,Exception:NA");
			   HTMLReportGenerator.StepDetails("pass", "And user enters the url"+url+"url","Url Link:"+url+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\url.PNG",CreateCompany.driver));
			}
			catch(Exception t){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user enters the url"+url+" browser,Exception:"+t.getMessage());
				HTMLReportGenerator.StepDetails("fail", "And user enters the url"+url+"Url Link","Browsername:"+url+",Exception:"+t.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\url.PNG",CreateCompany.driver));
			}
		}
		
		@Then("^user enter \"([^\"]*)\" as enter username$")
		public void user_enter_as_enter_username(String UN) throws IOException {
			try{
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UN);
			     System.out.println("And user enter as username" + UN);
			     logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:The user enter as username"+UN+" browser,Exception:NA");
			     HTMLReportGenerator.StepDetails("pass", "And user enter as username"+UN+"UN","UserName:"+UN+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\username.PNG",CreateCompany.driver));
			}
			catch(Exception hh){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:UserName"+UN+" browser,Exception:"+hh.getMessage());
				HTMLReportGenerator.StepDetails("fail", "UserName"+UN+"Url Link","UserName:"+UN+",Exception:"+hh.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\username.PNG",CreateCompany.driver));
				hh.printStackTrace();
			}
		}
			
		@Then("^user enter \"([^\"]*)\" as password$")
		public void user_enter_as_password(String Password) throws IOException{
			try{
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
			   System.out.println("Enter password here" + Password);
			   logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:And user enters password"+Password+" browser,Exception:NA");
			   HTMLReportGenerator.StepDetails("pass", "And user enters password"+Password+"Password","Password:"+Password+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\Password.PNG",CreateCompany.driver));
			}
			catch(Exception h){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user enters password"+Password+" browser,Exception:"+h.getMessage());
				HTMLReportGenerator.StepDetails("fail", "UserName"+Password+"Password","Password:"+Password+",Exception:"+h.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\Password.PNG",CreateCompany.driver));
				h.printStackTrace();
			}
		}
			
		@And("^user clicks on login button$")
		public void user_click_on_login_button() throws IOException{
			try{
				driver.findElement(By.xpath("//a[@class=\"easyui-linkbutton l-btn l-btn-small easyui-fluid\"]")).click();
				System.out.println("User Click on Login");
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user clicks on login button");
				HTMLReportGenerator.StepDetails("pass", "And user enters password"+""+"","Login click:"+""+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\click_on_login_button().PNG",CreateCompany.driver));
			}
			catch(Exception y){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user clicks on login button");
				HTMLReportGenerator.StepDetails("fail", "And user enters password"+""+"","Login click:"+""+",Exception:"+y.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\click_on_login_button().PNG",CreateCompany.driver));
			}
		}
		
		@When("^user expand company left hand side accordian pane$")
		public void ExpandTree() throws IOException{
			try{
				driver.findElement(By.xpath(".//*[@id='_easyui_tree_1']")).click();
			     System.out.println("Expand Tree here");
			     logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:When user expand create new company left hand side accordian pane");
			     HTMLReportGenerator.StepDetails("pass", "When user expand create new company left hand side accordian pane"+""+"","Expand pane:"+""+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\ExpandTree.PNG",CreateCompany.driver));
			     
			}
			catch(Exception k){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:When user expand create new company left hand side accordian pane");
				HTMLReportGenerator.StepDetails("fail", "When user expand create new company left hand side accordian pane"+""+"","Expand pane:"+""+",Exception:"+k.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\ExpandTree.PNG",CreateCompany.driver));
				k.printStackTrace();
				}
		}
		
		@When("^user click on Manage company$")
		public void user_click_on_Manage_company() throws IOException{
			try{
				driver.findElement(By.xpath("//a[@title='Manage Company']")).click();
				System.out.println("Create Company form");
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on Manage company");
				HTMLReportGenerator.StepDetails("pass", "user click on Manage company"+""+"","user click on New company:"+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\click_Manage.PNG",CreateCompany.driver));
			}
			catch(Exception n){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on Manage company");
				HTMLReportGenerator.StepDetails("fail", "user click on Manage company"+""+"","Manage company:"+""+""+n.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\click_Manage company.PNG",CreateCompany.driver));
				n.getMessage();
			}
		    
		}
		
		@And("^user click on the New$")
		public void user_click_on_the_New() throws IOException{
			try{
				driver.switchTo().frame(0);
				Actions action=new Actions(driver);
				action.click().build().perform();
				driver.findElement(By.xpath("//a[@onclick='newItem()']")).click();
				System.out.println("Page will Open Here");
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on the New");
				HTMLReportGenerator.StepDetails("pass", "user click on the New"+""+"","New item:"+""+",Exception:NA",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\newItem.PNG",CreateCompany.driver));
			}
			catch(Exception l){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user get the New Create company page details");
				HTMLReportGenerator.StepDetails("fail", "user click on the New"+""+"","New item:"+""+""+l.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\newItem.PNG",CreateCompany.driver));
			}
		}
	  
		@And("^user enter company name \"(.*)\"$")
		public void EnterCmpnyName(String CompanyName) throws IOException{
			try{
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys(CompanyName);
				System.out.println("Enter Company name" + CompanyName);
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:And user enter company name"+""+CompanyName+" browser,Exception:NA");
				HTMLReportGenerator.StepDetails("pass", "user enter company name"+""+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\CompanyName.PNG",CreateCompany.driver));
			}
			catch(Exception j){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user enter company name"+""+CompanyName+" browser,Exception:"+j.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user enter company name"+""+"",""+""+""+j.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\CompanyName.PNG",CreateCompany.driver));
			}
		}
		
		@And("^user select Company type \"(.*)\"$")
		public void user_select_Company_type(String Companytype) throws IOException{
			try{
				Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='companytype']")));
				dropdown.selectByVisibleText(Companytype);
				System.out.println("Enter Company Address" + Companytype);
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user select Company type"+""+Companytype+" browser,Exception:NA");
				HTMLReportGenerator.StepDetails("pass", "user select Company type"+""+"","Companytype"+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\Companytype.PNG",CreateCompany.driver));
			}
			catch(Exception qq){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user enter company Address"+""+Companytype+" browser,Exception:"+qq.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user select Company type"+""+"",""+"Companytype:"+""+qq.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\Companytype.PNG",CreateCompany.driver));
			}	
		}
		
		@And("^user enter company Address \"(.*)\"$")
		public void address(String Address) throws IOException{
			try{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@class='textbox']//textarea")).sendKeys(Address);
				System.out.println("Enter Company Address" + Address);
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:And user enter company Address"+""+Address+" browser,Exception:NA");
				HTMLReportGenerator.StepDetails("pass", "user enter company Address"+""+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\Address.PNG",CreateCompany.driver));
			}
			catch(Exception k){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user enter company Address"+""+Address+" browser,Exception:"+k.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user enter company Address"+""+"",""+""+""+k.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\Address.PNG",CreateCompany.driver));
				k.printStackTrace();
			}	
		}
		
		@And("^user enter Company phone Detail \"(.*)\"$")
		public void EnterContNum(String phone) throws IOException{
			try{
				driver.findElement(By.xpath("//input[@name='phone']/preceding-sibling::*[1]")).sendKeys(phone);
				System.out.println("enter Company contact Number" + phone);
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:And user enter Company phone Number"+phone+" browser,Exception:NA");
				HTMLReportGenerator.StepDetails("pass", "user enter Company contact Number"+""+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\phone.PNG",CreateCompany.driver));
			}
			catch(Exception z){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name::And user enter Company phone Number"+phone+" browser,Exception:"+z.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user enter Company contact Number"+""+"",""+""+""+z.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\phone.PNG",CreateCompany.driver));
				z.printStackTrace();
			}
		}
		
		@When("^user enters all mandatory and required fields$")
		public void EntrMandFields(DataTable details) throws IOException{
			List<List<String>> data = details.raw();
			try{
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(0));
				driver.findElement(By.xpath("//input[@name='pan']")).sendKeys(data.get(0).get(1));
				driver.findElement(By.xpath("//input[@name='tin']")).sendKeys(data.get(0).get(2));
				Select oSelect = new Select(driver.findElement(By.xpath("//*[@id='countryid']")));
				oSelect.selectByVisibleText("INDIA");
				Select state = new Select(driver.findElement(By.xpath("//div[@id='stateid']//select[@name='state']")));
				state.selectByIndex(20);
				Select city = new Select(driver.findElement(By.xpath("//*[@id='cityid']//select[@name='city']")));
				city.selectByIndex(21);
				System.out.println("Enter All Mandatory fields");
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:");
				HTMLReportGenerator.StepDetails("pass", "user enters all mandatory and required fields"+details+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\fields.PNG",CreateCompany.driver));
			}
			catch(Exception l){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:");
				HTMLReportGenerator.StepDetails("fail", "user enters all mandatory and required fields"+details+"",""+""+""+l.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\fields.PNG",CreateCompany.driver));
				l.printStackTrace();
			}
		}
		
		@Then("^user click on save button$")
		public void clkonsave() throws IOException{
			try{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@onclick='save1(this)']")).click();
				System.out.println("Click on Save");
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on save button");
				HTMLReportGenerator.StepDetails("pass", "user click on save button"+""+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\clkonsave.PNG",CreateCompany.driver));
				}
			catch(Exception i){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name: And user click on save button");
				HTMLReportGenerator.StepDetails("fail", "user click on save button"+""+"",""+""+""+i.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\clkonsave.PNG",CreateCompany.driver));
			}
		}
		
		@And("^user gets the message starting with \"(.*)\"$")
		public void getmessage(String Company) throws IOException{
			try{
				driver.switchTo().alert().getText();
				//driver.findElement(By.xpath(Company));
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user gets the message starting with"+Company+" browser,Exception:NA");
				HTMLReportGenerator.StepDetails("pass", "user click on save button"+Company+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\fields.PNG",CreateCompany.driver));
				System.out.println("Company Created Successfull" + Company);
			}
			catch(Exception b){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And user gets the message starting with Company Created Successfully"+Company+" browser,Exception:"+b.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user gets the message starting with"+Company+"",""+""+""+b.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\fields.PNG",CreateCompany.driver));
			} 
		}
		
		
		@And("@user enter Company contact Number \"(.*)\"$")
		public void EnterContnumb(String ContactNumber ){
			System.out.println("Enter contact number" + ContactNumber);
		}
		
		@And("^user enter Company email id \"(.*)\"$")
		public void EntrCmpnyEmail(String EmailId) throws IOException{
			try{
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EmailId);
				System.out.println("Enter Company EmailId" + EmailId);
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enter Comoany email id ");
				HTMLReportGenerator.StepDetails("pass", "user enter Comoany email id "+EmailId+"",""+""+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\email.PNG",CreateCompany.driver));	
			}
			catch(Exception w){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enter Comoany email id "+""+EmailId+" browser,Exception:"+w.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user enter Comoany email id"+EmailId+"",""+""+""+w.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\email.PNG",CreateCompany.driver));
			}
		}
		
		@Then("^user get the message starting with \"(.*)\"$")
		public void getmesg(String getMessage) throws IOException{
			try{
				Alert simpleAlert = driver.switchTo().alert();
				 String alertText = simpleAlert.getText();
				 System.out.println("Company Already Exists.Please Select different Company Name!!!" + alertText);
				 Thread.sleep(3000);
				 simpleAlert.accept();
				System.out.println("User Get The Message" + getMessage);
				logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:Then user get the message"+getMessage+" browser,Exception:NA");
				HTMLReportGenerator.StepDetails("pass", "user get the message starting with"+getMessage+"",""+"getmessage:"+"",Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\message.PNG",CreateCompany.driver));	
				}
			catch(Exception o){
				logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user get the message starting with"+getMessage+" browser,Exception:"+o.getMessage());
				HTMLReportGenerator.StepDetails("fail", "user enter Comoany email id"+getMessage+"",""+""+""+o.getMessage(),Config.TakeScreenShot("E:\\ScreenShot\\CreateCompany\\message.PNG",CreateCompany.driver));
				o.printStackTrace();
			}
		}
		
}
		
