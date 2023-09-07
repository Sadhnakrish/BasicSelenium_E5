package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {

	public static void main(String[] args) {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		//address of course web element
		WebElement course = driver.findElement(By.xpath("//a[@id='course']"));
		//create an object of Actions class
		Actions a= new Actions(driver);
		a.moveToElement(course).perform();
		//address of selenium training
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		//address of + icon
		 WebElement plus = driver.findElement(By.xpath("//button[@id='add']"));
		 a.doubleClick(plus).perform();

	}

}
