package steps;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSteps {
	
	private WebDriver driver;
	public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public void setDriver(WebDriver driver) {
		dr.set(driver);
	}
	
	protected void startWebDriver(String browser) {
		System.out.println(browser);
		
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			
			Map<String, Object> prefs=new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", true);
			prefs.put("profile.password_manage_enabled", true);
			
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			String user_agent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.50 Safari/537.36";
			options.addArguments("user-agent={"+ user_agent + "}");
			driver=new ChromeDriver();
		}
		
		setDriver(driver);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	protected void navigate(String url) {
		getDriver().navigate().to(url);
	}
	
	protected void stopWebDriver() {
		getDriver().quit();
		
	}
}
