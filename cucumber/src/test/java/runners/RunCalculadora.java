package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:src/test/resources/relatorios/index.html",
		"json:src/test/resources/relatorios/cucumber.json",
		"junit:src/test/resources/relatorios/cucumber.xml" }, 
		features = "src/test/resources/features/calculadora.feature",
		// tags = {“@smoke”},
		monochrome = true, 
		glue = { "steps" }, 
		dryRun = false, 
		//strict = false,
		snippets = SnippetType.CAMELCASE)

public class RunCalculadora {

}
