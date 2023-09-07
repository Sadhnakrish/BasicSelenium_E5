package Locators;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tagName {

	public static void main(String[] args) {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// entering the url
		driver.get("https://www.facebook.com/");
		//addressess of all the links
		 List<WebElement> allLinks=driver.findElements(By.tagName("a"));
      for(WebElement b: allLinks)
      {
    	  System.out.println(b.getText());
      }
	}

}
