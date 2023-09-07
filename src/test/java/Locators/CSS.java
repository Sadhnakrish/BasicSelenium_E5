package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS {

	public static void main(String[] args) throws Throwable {
		// chrome driver
				WebDriverManager.chromedriver().setup();
				// opening chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				// entering the url
				driver.get("https://www.facebook.com/");
				//adress of emailtextfield
				driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hi");
				// address of password textfield
				driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Hello");
				Thread.sleep(2000);
				//driver.findElement(By.cssSelector("div[id='u_0_9_h6']")).click();

	}

}
