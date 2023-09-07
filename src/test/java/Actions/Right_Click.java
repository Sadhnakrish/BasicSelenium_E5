package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click {

	public static void main(String[] args) {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// entering the url
		driver.get("https://www.amazon.in/");
//address of search text field
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

}
