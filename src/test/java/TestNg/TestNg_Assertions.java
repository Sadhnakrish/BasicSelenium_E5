package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Assertions {
	@Test
	public void assertions()
	{
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// entering the url
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		//Hard assert or Assert
		//Assert.assertEquals(title, "asdfsrd");
		//softassert
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "asdfsrd");
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void demo()
	{
		System.out.println("hi");
	}

}
