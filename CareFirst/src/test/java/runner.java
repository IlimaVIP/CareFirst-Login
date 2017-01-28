

import cucumber.api.CucumberOptions;

@CucumberOptions(features={"feature"}, glue="CareFirst", plugin={"html:target/cucumber-html-report"})
public class runner {

}
