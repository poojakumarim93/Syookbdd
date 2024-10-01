package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\Syook\\Syook\\src\\test\\resources\\featurefile\\login.feature",glue={"StepDefinition"},
plugin= {"pretty","html:C:\\Users\\DELL\\eclipse-workspace\\Syook\\Syook\\target\\html\\html.reports"}
		)

public class TestRunner {

	
}
