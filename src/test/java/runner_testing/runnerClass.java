package runner_testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature_folder/testing05.feature",
                           glue="step_definition",
                           plugin="html:C:\\cucumber-report")
                      //     tags={"@category, @sub-category"})
public class runnerClass {

}
