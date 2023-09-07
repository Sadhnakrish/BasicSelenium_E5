package Basic_Programming;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// entering the url
		driver.get("https://www.facebook.com/login");
		// using getTitle method
		System.out.println(driver.getTitle());
		// using currentUrl
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		//closing the program
		driver.close();

	}

}
