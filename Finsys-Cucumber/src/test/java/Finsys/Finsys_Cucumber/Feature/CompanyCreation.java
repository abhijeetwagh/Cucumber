/*package Finsys.Finsys_Cucumber.Feature;

import org.apache.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ejagruti.config.Config;
import ejagruti.result.HTMLReportGenerator;

public class CompanyCreation {
	final static Logger logger = Logger.getLogger(CompanyCreation.class);
	@When("^user launch the \"([^\"]*)\" browser$")
	public void Launch_the_browser(String Browser){
    try{
    	System.out.println("Enter Browser" + Browser);
    	logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:When user opens the "+Browser+" browser,Exception:NA");
    	HTMLReportGenerator.StepDetails("pass", "When user opens the "+Browser+"browser","Browsername:"+Browser+",Exception:NA","");
    }
    catch(Exception o){
    	logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:When user opens the"+Browser+" browser,Exception:"+o.getMessage());
    	HTMLReportGenerator.StepDetails("fail", "When user opens the "+Browser+"browser","Browsername:"+Browser+",Exception:"+o.getMessage(),"");
    }
}
	
	@When("^user enters the url \"(.*)\"$")
	public void url(String URL){
		try{
			System.out.println("Enter Url" + URL);
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:When user enters the "+URL+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "When user enters the"+URL+"",""+URL+",Exception:NA","");
		}
		catch(Exception m){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:When user opens the"+URL+" browser,Exception:"+m.getMessage());
			HTMLReportGenerator.StepDetails("fail", "When user enters the"+URL+"",""+URL+",Exception:"+m.getMessage(),"");
		}
	}

	@Then("^user enter \"([^\"]*)\" as enter username$")
	public void user_enter_as_enter_username(String UN){
	  try{
		  System.out.println("Enter Username" + UN);
		  logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enter username"+UN+" browser,Exception:NA");
		  HTMLReportGenerator.StepDetails("pass", "When user enters the"+UN+"","UserName:"+UN+",Exception:NA","");
	  }
	  catch(Exception n){
		  logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enter username"+UN+" browser,Exception:"+n.getMessage());
		  HTMLReportGenerator.StepDetails("fail", "When user enters the"+UN+"","UserName:"+UN+",Exception:"+n.getMessage(),"");
	  }
	}

	@Then("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String PW){
		try{
		System.out.println("Enter Username" + PW);
		  logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enter paasword"+PW+" browser,Exception:NA");
		  HTMLReportGenerator.StepDetails("pass", "user enter paasword"+PW+"","Password:"+PW+",Exception:NA","");
	  }
	  catch(Exception h){
		  logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enter paasword"+PW+" browser,Exception:"+h.getMessage());
		  HTMLReportGenerator.StepDetails("fail", "user enter paasword"+PW+"","Password:"+PW+",Exception:"+h.getMessage(),"");
	  }   
	}

	@And("^user click on login button$")
	public void i_clicks_on_login_button(){
		try{
			  logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:And I clicks on login button"+""+" browser,Exception:NA");
			  HTMLReportGenerator.StepDetails("pass", "And I clicks on login button"+""+"","Login Button:"+""+",Exception:NA","");
		  }
		  catch(Exception p){
			  logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:And I clicks on login button"+""+" browser,Exception:"+p.getMessage());
			  HTMLReportGenerator.StepDetails("fail", "user enter paasword"+""+"",""+""+",Exception:"+p.getMessage(),"");
		  }   
	}
	
	@When("^user expand create new company left hand side accordian pane$")
	public void Expandpane(){
		try{
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user expand create new company left hand side accordian pane"+""+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user expand create new company left hand side accordian pane"+""+"","Expandpane"+""+",Exception:NA","");

		}
		catch(Exception v){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user expand create new company left hand side accordian pane"+""+"browser,Exception:"+v.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user expand create new company left hand side accordian pane"+""+"",""+""+",Exception:"+v.getMessage(),"");
		}
	}
	
	@And("^user click on New company option which is at the Top$")
	public void ClickOnNewCompany(){
		try{
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on New company option which is at the Top"+""+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user click on New company option which is at the Top"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception m){
			logger.info("Step number:"+(Config.counter++)+"Step Status:FAIL,Step Status:FAIL,Step Name:user click on New company option which is at the Top"+""+"browser,Exception:"+m.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user click on New company option which is at the Top"+""+"",""+""+",Exception:"+m.getMessage(),"");
		}
	}
	
	@And("^user get the New Create company page details$")
	public void PageNewCreateCompany(){
		try{
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user get the New Create company page details"+""+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user get the New Create company page details"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception b){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user get the New Create company page details"+""+"browser,Exception:"+b.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user get the New Create company page details"+""+"",""+""+",Exception:"+b.getMessage(),"");
		}
	}
	
	@And("^user enter name\"(.*)\"$")
	public void EnterCompanyName(String CompanyName){
		try{
			System.out.println("Enter Company name"+CompanyName);
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:Enter Company name"+CompanyName+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "When user opens the "+CompanyName+"CompanyName","CompanyName:"+"CompanyName"+",Exception:NA","");
		}
		catch(Exception v){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enter paasword"+CompanyName+" browser,Exception:"+v.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user get the New Create company page details"+"CompanyName"+"CompanyName:","CompanyName"+""+",Exception:"+v.getMessage(),"");
		}
		
	}
	
	@And("^user enter \"(.*)\"$")
	public void CompanyAddress(String Address){
		try{
			System.out.println("Enter company Address" + Address);
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enter Company Address"+Address+" browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "When user opens the "+Address+"Address","company Address:"+Address+",Exception:NA","");
		}
		catch(Exception g){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enter Company Address"+Address+" browser,Exception:"+g.getMessage());
			HTMLReportGenerator.StepDetails("fail", "When user opens the "+Address+"browser","company Address:"+Address+",Exception:"+g.getMessage(),"");
		}
	}
	
	@When("^user enters all mandatory and required fields$")
	public void enterfields(){
		try{
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enters all mandatory and required fields"+""+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user enters all mandatory and required fields"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception o){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enters all mandatory and required fields"+""+" browser,Exception:"+o.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user enters all mandatory and required fields"+""+"browser","Filling fields:"+""+",Exception:"+o.getMessage(),"");
		}
	}
	
	@Then("^user click on save button$")
	public void clickSave(){
		try{
			
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on save button"+""+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user click on save button"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception a){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on save button"+""+"browser,Exception:"+a.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user click on save button"+""+"browser",":"+""+",Exception:"+a.getMessage(),"");
		}
	}
	
	@And("^user gets the \"(.*)\" starting with$")
	public void Message(String Msg){
		try{
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user gets the message starting with"+Msg+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user gets the message starting with"+Msg+"Message","Message:"+Msg+",Exception:NA","");
		}
		catch(Exception d){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user gets the message starting with"+Msg+"browser,Exception:"+d.getMessage());
			HTMLReportGenerator.StepDetails("pass", "user gets the message starting with"+Msg+"Message","Message:"+Msg+",Exception:NA"+d.getMessage(),"");
			
		}
	}
		
	@And("^user click on search button$")
	public void GetMsg(){
      try{
		   logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user click on search button"+""+"browser,Exception:NA");
		   HTMLReportGenerator.StepDetails("pass", "user click on search button"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception c){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user click on search button"+""+"browser,Exception:"+c.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user click on search button"+""+"",":"+""+","+c.getMessage(),"");
		}
	}
		
	@And("^user on the search page$")
	public void user_on_the_search_page(){
       try{
			
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user on the search page"+""+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user on the search page"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception p){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user on the search page"+""+"browser,Exception:"+p.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user on the search page"+""+"",""+""+""+p.getMessage(),"");
		}
	}

	@Then("^user enter newly created user detail in search bar and click on search button$")
	public void user_enter_newly_created_user_detail_in_search_bar_and_click_on_search_button(){
	 try{
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user enter newly created user detail in search bar and click on search button"+""+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user enter newly created user detail in search bar and click on search button"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception z){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user enter newly created user detail in search bar and click on search button"+""+"browser,Exception:"+z.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user enter newly created user detail in search bar and click on search button"+""+"",""+""+""+z.getMessage(),"");
		}   
	}

	@Then("^user is on the search page with new created company$")
	public void user_is_on_the_search_page_with_new_created_company(){
       try{
			
			logger.info("Step Number:"+(Config.counter++)+"Step Status:PASS,Step Name:user is on the search page with new created company"+""+"browser,Exception:NA");
			HTMLReportGenerator.StepDetails("pass", "user is on the search page with new created company"+""+"",""+""+",Exception:NA","");
		}
		catch(Exception l){
			logger.info("Step Number:"+(Config.counter++)+"Step Status:FAIL,Step Name:user is on the search page with new created company"+""+"browser,Exception:"+l.getMessage());
			HTMLReportGenerator.StepDetails("fail", "user is on the search page with new created company"+""+"",""+""+""+l.getMessage(),"");
		}
	 }

	
}*/