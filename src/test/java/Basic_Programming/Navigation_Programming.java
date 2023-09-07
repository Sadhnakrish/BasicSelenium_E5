package Basic_Programming;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Programming {

	public static void main(String[] args) throws InterruptedException {
		        // chrome driver
				WebDriverManager.chromedriver().setup();
				// opening chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				// entering the url
				driver.get("https://www.facebook.com/login");
				Thread.sleep(3000);
				// navigating to other url
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(3000);
				//navigating to back page
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
				driver.quit();
				
				
				

	}

}
