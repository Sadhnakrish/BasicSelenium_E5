package DataDrivenTesting;

import java.io.FileInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_PropertyFile {

	public static void main(String[] args) throws Throwable {
		// Creating an object for properties class
		Properties p = new Properties();
		//creating an object for the physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties"); //first enter .\\
		p.load(fis);
		String appURL = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		
		       // chrome driver
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// entering the url
				driver.get(appURL);
				driver.findElement(By.id("email")).sendKeys(user);
				driver.findElement(By.id("pass")).sendKeys(password);

	}

}
