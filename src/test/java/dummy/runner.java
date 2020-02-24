package dummy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","json:Cucumber-reports.json"})
public class runner {

}
