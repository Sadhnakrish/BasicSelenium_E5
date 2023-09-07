package PopUps;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_RobotClass {

	public static void main(String[] args) throws Throwable {
		// chrome driver
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//creating an object for robot class
		Robot r = new Robot(); // Cntrl V
		StringSelection str  = new StringSelection("C:\\Resumes\\sadhana resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null); // cntrl C
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
