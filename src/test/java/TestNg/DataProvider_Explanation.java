package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Explanation {
@DataProvider
	public Object[][] getData(){
			Object[][] a= new Object[3][2];
			a[0][0] ="adsfre";
			a[0][1]="aswed";
			
			a[1][0] ="acfde";
			a[1][1]="1234";
			
			a[2][0] ="aVGDFCe";
			a[2][1]="647899";
			return a;	
}
	@Test(dataProvider="getData")
	public void demo(String username, String pwd) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// entering the url
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
}
