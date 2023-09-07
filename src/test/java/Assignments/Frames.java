package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Throwable {
		// chrome driver
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		
		//shifting control to frame1
		driver.switchTo().frame("packageListFrame");// enter iframe in cntrl+f text field
		//click on org.openqa.selenium
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//shifting control to frame2
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		//shift our control back to normal web page
		driver.switchTo().defaultContent();
		//shifting control to frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
		driver.close();


	}

}
