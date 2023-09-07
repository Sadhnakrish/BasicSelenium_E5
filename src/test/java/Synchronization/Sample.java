package Synchronization;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		        // chrome driver
				WebDriverManager.chromedriver().setup();
				// opening chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//explicit
				WebDriverWait wait = new WebDriverWait(driver,10);
				// entering the url
				driver.get("https://www.facebook.com/");
				//address of email text field
				WebElement ele=driver.findElement(By.id("email"));
				//condition
				wait.until(ExpectedConditions.visibilityOf(ele));
				ele.sendKeys("sadhns");
				//address of link
				WebElement cli=driver.findElement(By.linkText("Forgotten password?"));
				//condition
				wait.until(ExpectedConditions.elementToBeClickable(cli));
				cli.click();
				
				

	}

}
