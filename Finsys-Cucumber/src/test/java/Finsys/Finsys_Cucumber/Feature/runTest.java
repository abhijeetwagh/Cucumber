package Finsys.Finsys_Cucumber.Feature;

import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features = {"E:\\WSABHI_CUCUMBER\\Finsys-Cucumber\\src\\test\\resources\\feature\\CreateCompany.feature"},
tags={"@CreateCompany"}
)
public class runTest{
}
/*
@RunWith(Cucumber.class) 
@CucumberOptions.Options(format = {"pretty", "html:target/html"},
features = {"FeatureCollections"},
tags={"@SmokeTest"}
	) 
public class runTest {

} 
*/
