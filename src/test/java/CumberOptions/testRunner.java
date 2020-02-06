package CumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue="StepDefinitions")

public class testRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
