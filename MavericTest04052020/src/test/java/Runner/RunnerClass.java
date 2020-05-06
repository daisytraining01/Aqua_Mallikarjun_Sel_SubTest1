package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\MavenProject\\MavericTest04052020\\FeatureFile\\samples.feature",
	glue = "StepDef" , 
	tags = "@Scenario1,@Scenario2,@Scenario3"
		
		)
public class RunnerClass
{
	
}
