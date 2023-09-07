package Frames;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_Frames {

	public static void main(String[] args) throws Throwable {
		// chrome driver
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.snapdeal.com//");
				//address of sign in
				WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
				Actions a= new Actions(driver);
				a.moveToElement(signIn).perform();
				//address of Register
				driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
				//shifting control to frame
				driver.switchTo().frame("loginIframe");// enter iframe in cntrl+f text field
				//address of mobile text field
				driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("986532258");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='close-pop']")).click();
				//shift our control back to normal web page
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("kurthis");
		

	}
}
