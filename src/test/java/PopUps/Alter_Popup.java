package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

	public static void main(String[] args) throws Throwable {
		// firefox driver
		WebDriverManager.firefoxdriver().setup();
		// opening Firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		//address of add to cart
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		//shifting the control
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a1.getText());
		a1.accept();
		//a1.dismiss();

	}

}
