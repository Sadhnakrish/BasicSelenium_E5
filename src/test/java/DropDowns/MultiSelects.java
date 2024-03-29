package DropDowns;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelects {

	public static void main(String[] args) throws Throwable {

		// chrome driver
				WebDriverManager.chromedriver().setup();
				// opening chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://demoapp.skillrary.com/");
				//address of dropdown
				WebElement dropDown = driver.findElement(By.xpath("//select[@id='cars']"));
				//create an object for select class
				Select s = new Select(dropDown);
				s.selectByIndex(0);
				Thread.sleep(3000);
				s.selectByValue("199");
				Thread.sleep(3000);
				//s.selectByVisibleText("INR 300 - INR 399 ( 1 ) "); // it will not work
				// deselecting the values
				s.deselectByIndex(0);
				Thread.sleep(3000);
				s.deselectByValue("199");
				Thread.sleep(3000);
				//s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
				System.out.println(s.isMultiple());
				List<WebElement> list = s.getAllSelectedOptions();
				for(WebElement b : list)
				{
					System.out.println(b.getText());
				}


				
				
	}

}
