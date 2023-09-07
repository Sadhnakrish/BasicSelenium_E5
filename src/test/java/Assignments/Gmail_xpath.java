package Assignments;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_xpath {

	public static void main(String[] args) throws Throwable {
		// chrome driver
				WebDriverManager.edgedriver().setup();
				// opening chrome browser
				WebDriver driver = new EdgeDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				// entering the url
				driver.get("https://accounts.google.com/");
				//driver.get("https://accounts.google.com/InteractiveLogin/identifier?hl=en-GB&ifkv=AXo7B7XcP2hVzrSIIxqmiqkyUmXH2LIZKX41PxpwGRoM46KjQPoomR8sZBARv4GaEMtUyBCi2saE\r\n");	
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8971024575");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
               Thread.sleep(3000);
                driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Sadhna");
                driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                Thread.sleep(3000);
                driver.close();
                
	}

}
