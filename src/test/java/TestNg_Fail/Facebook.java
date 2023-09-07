package TestNg_Fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
@Test
public void facebook()
{
	WebDriverManager.edgedriver().setup();
	// opening chrome browser
	WebDriver driver = new EdgeDriver();
	// maximizing the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// entering the url
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("fdres");
	}
}
