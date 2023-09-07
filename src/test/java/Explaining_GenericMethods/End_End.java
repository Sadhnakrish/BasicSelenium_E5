package Explaining_GenericMethods;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Libraries.WebDriver_Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class End_End {

	public static void main(String[] args) {
		WebDriver_Utilities utilities = new WebDriver_Utilities();
		// chrome driver
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		utilities.implicitWait1(driver, 10);
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		utilities.childWindow(driver);
		WebElement course = driver.findElement(By.id("course"));
		utilities.mouseOvering(driver, course);
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement plus = driver.findElement(By.id("add"));
		utilities.doubleClicking(driver, plus);
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		utilities.alterPopupOk(driver);
		
		
		
		
		
		

	}
	

}
