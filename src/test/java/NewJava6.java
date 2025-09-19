
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		glue={"com.steps","com.hooks"},
		features="src/test/respurce/features",
		plugin={"Pretty", "html:./test-output/reports"},
		tags="@smoke or @regression",
		monochrome=true
		
		)

public class NewJava6 extends AbstractTestNGCucumberTests{

	
}