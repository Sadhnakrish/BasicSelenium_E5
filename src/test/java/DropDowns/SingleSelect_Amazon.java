package DropDowns;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelect_Amazon {

	public static void main(String[] args) throws Throwable {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		// address of dropdown
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//create an object for select class
		Select s = new Select(dropDown);
		s.selectByIndex(4);
		Thread.sleep(4000);
		s.selectByValue("search-alias=stripbooks");
		Thread.sleep(4000);
		s.selectByVisibleText("Furniture");
		//getting all the values from drop down
		List<WebElement> values = s.getOptions();
		System.out.println(values.size());
		
		
		for(WebElement b : values)
		{
			System.out.println(b.getText());
		}
		
		driver.quit();
		
		
		
	}

}
