package Scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar_WithCoordinates {

	public static void main(String[] args) throws Throwable {
		// chrome driver
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				//address of careers web element
				 WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
				Point coordinates = career.getLocation();
				int x = coordinates.getX();
				int y = coordinates.getY();
				 //downcasting
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy("+x+","+y+")");
				 Thread.sleep(3000);
				 //career.click();
				 js.executeScript("arguments[0].click();",career);

	}

}
