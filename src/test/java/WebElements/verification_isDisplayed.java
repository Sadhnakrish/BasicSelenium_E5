package WebElements;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_isDisplayed {

	public static void main(String[] args) {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//address of email text field
		 WebElement ele = driver.findElement(By.id("email"));
         if(ele.isDisplayed()) {
        	 ele.sendKeys("sadhnaaaa");
         }
        	 else
        	 {
        	System.out.println("else block");
            }

	}

}
