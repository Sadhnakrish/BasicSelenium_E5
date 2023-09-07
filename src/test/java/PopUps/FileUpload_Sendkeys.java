package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Sendkeys {

	public static void main(String[] args) {
		// chrome driver
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver();
				// maximizing the browser
				driver.manage().window().maximize();
				//implicit statement
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.foundit.in/");
				//address of upload resume
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Resumes\\sadhana resume.pdf");


	}

}
