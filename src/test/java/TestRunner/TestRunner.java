package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefenations"},

monochrome=true,
plugin= {"pretty","html:target/HtmlReports"},
tags="@smoketest"
)
public class TestRunner {

}
