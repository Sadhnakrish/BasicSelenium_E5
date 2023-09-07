package Autosuggestions;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable {
		 // chrome driver
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//address of the search text field
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("mobile");
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(4000);
		
		for(WebElement li: list)
		{
			System.out.println(li.getText());
		}
		Thread.sleep(4000);
		driver.close();
		}
		

	}


