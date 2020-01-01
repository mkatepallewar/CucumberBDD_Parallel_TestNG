package steps;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import extentReports.ExtentManager;
import extentReports.ExtentTestManager;

public class GoogleSteps extends BaseSteps {
	
	protected Scenario scenario;
	static String scenarioName;
	static int x=0;
	@Before
	public void before(Scenario scenario) {
		x=x+1;
		this.scenario=scenario;
		scenarioName=scenario.getName();
		ExtentTestManager.starttest("Scenatio No: "+x+ " : " +scenario.getName());
		ExtentTestManager.getTest().log(Status.INFO, "Scenario Started :- "+scenario.getName());
	}
	
	@After
	public void after(Scenario scenario) {
		if (scenario.isFailed()) {
			ExtentTestManager.logFail("Scenario Failed");
			ExtentTestManager.addScreenShotsOnFailure();
		}else {
			ExtentTestManager.logPass("Scanrio Passed");
		}
		ExtentManager.getManager().getReporter().flush();
//		ExtentManager.getReporter().flush();
		stopWebDriver();
	}
	
	@Given("^Launch browser \"([^\"]*)\"$")
	public void launch_browser(String browserName) throws Throwable {
		ExtentTestManager.logInfo("Launching Browser : " +browserName);
		System.out.println("Inside steps");
		startWebDriver(browserName);
	}

	@When("^User navigate to \"([^\"]*)\"$")
	public void user_navigate_to(String url) throws Throwable {
		ExtentTestManager.logInfo("Navigating URL : " +url);
		navigate(url);
	}

	@Then("^User enters search term \"([^\"]*)\"$")
	public void user_enters_search_term(String search) throws Throwable {
		ExtentTestManager.logInfo("Entering Value in Search box : " +search);
		getDriver().findElement(By.name("q")).sendKeys(search);
		Thread.sleep(1000);
	}

	@And("^click on search button$")
	public void click_on_search_button() throws Throwable {
		ExtentTestManager.logInfo("Clicking on Search button : ");
		getDriver().findElement(By.name("btnK")).click();
	}


}
