package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//Đường dẫn tới file feature
		features = "src\\test\\java\\facebook\\features",
		//Tìm đến package step def
		glue = "facebook.stepDefinitions",
		//dryRun = true,
		monochrome = true,
		plugin = {"pretty", "html:target/site/cucumber-report-default","json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE,
		tags = {"@parameter"})
public class FacebookTestRunner {

}
