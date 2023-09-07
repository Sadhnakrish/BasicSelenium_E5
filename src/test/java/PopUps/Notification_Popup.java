package PopUps;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup {

	public static void main(String[] args) {
		HashMap<String, Integer> contentStrings = new HashMap<String, Integer>();
		HashMap<String, Object> profiles = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object >();
		
		contentStrings.put("Notification", 2);
		profiles.put("managed_default_content_settings", contentStrings);
		prefs.put("Profile", profiles);
		
		//Handling Notification popup in edge browser
		EdgeOptions options= new EdgeOptions();
		options.setCapability("preferences", prefs);

		// edge driver
		WebDriverManager.edgedriver().setup();
		// opening edge browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
		

	}

	
	}

