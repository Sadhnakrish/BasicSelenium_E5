package Locators;

import org.openqa.selenium.By
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_Partial {

	public static void main(String[] args) throws Throwable {
		        // chrome driver
				WebDriverManager.chromedriver().setup();
				// opening chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				// entering the url
				driver.get("https://www.facebook.com/");
				// address of email textfield
				driver.findElement(By.id("email")).sendKeys("Sadhna");
				//address of password textfield
				driver.findElement(By.name("pass")).sendKeys("Sadhnabk");
				Thread.sleep(3000);
				//address of link using linktextmethod
				driver.findElement(By.linkText("Forgotten password?")).click();
				//address of link by using partial link text
				//driver.findElement(By.partiallinkText("Forgotten")).click();
				Thread.sleep(3000);
				driver.close();

	}

}
