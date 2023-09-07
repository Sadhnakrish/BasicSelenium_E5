package Basic_Programming;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		// using getTitle method
		System.out.println(driver.getTitle());
		// using currentUrl
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//closing the program
		driver.close();

	}

}
