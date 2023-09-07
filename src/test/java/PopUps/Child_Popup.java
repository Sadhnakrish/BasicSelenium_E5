package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup {

	public static void main(String[] args) throws Throwable {
		// chrome driver
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://skillrary.com/");
				String parent = driver.getWindowHandle();
				
				driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
				driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
				 Set<String> child = driver.getWindowHandles();
				 //shifting our control to child browser
				 for(String b: child)
				 {
					 driver.switchTo().window(b);
				 }
				 driver.findElement(By.id("mytext")).sendKeys("sadhna");
				 Thread.sleep(3000);
				 //shifting our control to parent browser
				 driver.switchTo().window(parent);
				 driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
				 
	}

}
