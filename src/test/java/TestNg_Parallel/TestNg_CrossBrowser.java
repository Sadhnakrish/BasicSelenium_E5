package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_CrossBrowser {
	@Parameters({"browsername"})//once after converting into suite file come back and then give this line
@Test
public void facebook(String browser)
{
	WebDriver driver;
	if(browser.equals("edge"))
	{
	WebDriverManager.edgedriver().setup();
	// opening chrome browser
	 driver = new EdgeDriver();
	}
	else
	{
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		 driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// entering the url
	driver.get("https://www.facebook.com/");
	}
}
