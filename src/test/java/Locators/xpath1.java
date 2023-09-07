package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath1 {

	public static void main(String[] args) throws Throwable {
		// chrome driver
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// entering the url
		driver.get("https://www.facebook.com/");
		//address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Hi");
		//address of password textfield using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("Hello");
		Thread.sleep(3000);
        //address of forgotten password using xpath text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}

}
