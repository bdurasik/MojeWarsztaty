import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/pl/coderslab/cucumber/features/",
        plugin = {"pretty" , "html:out"})
public class WikiLoginTest {
}
