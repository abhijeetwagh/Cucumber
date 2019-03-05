package Finsys.Finsys_Cucumber.Feature;

import java.io.IOException;

import org.apache.log4j.Logger;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ejagruti.config.Config;
import ejagruti.result.HTMLReportGenerator;

public class Hooks {
	public boolean isfirstscenario = true;
	Logger log = Logger.getLogger(Hooks.class);

	@Before
	public void beforeScenario(Scenario obj) throws IOException {
		System.out.println("Starting - " + obj.getName() + obj.getId());
		log.info("Scenario Number: "+(Config.count++) + "Scenario Name= " + obj.getName());
		try {
			HTMLReportGenerator.TestSuiteStart("E:\\CreateCompany.html", "Abhijeet");
		} catch (Exception e) {
			System.out.println("Error Message" + e.getMessage());

		}
		HTMLReportGenerator.TestCaseStart(obj.getName(), obj.getId() + " " + obj.getSourceTagNames().toString());
	}

	@After
	public void afterScenario(Scenario scenario) throws IOException {
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		System.out.println("This will run after the Scenario");
		Config.counter = 1;
		Config.TakeScreenShot("E:\\ScreenShot\\Test\\Snap.PNG", CreateCompany.driver);
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
