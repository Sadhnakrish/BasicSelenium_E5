package POM_Class_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Fb_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// chrome driver
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// entering the url
		driver.get("https://www.facebook.com/");
		
		//creating an object for pom class
		Fb_LoginPage fbLogin = new Fb_LoginPage(driver);
		fbLogin.emailTextField("sadhna");
		fbLogin.passwordTextField("sadhnaa");
		fbLogin.loginButton();

	}

}
