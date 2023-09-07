package Generic_Libraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utilities {

	//mouseovering
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();;
	}
	//doubleclicking
	public void doubleClicking(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}//drag and drop
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	//right click
	public void RightClicking(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
//implicitWait for visibility of element
	public void implicitWait1(WebDriver driver, int time )
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	//ExplicitWait for visibility of element
	public void ExplicitWait(WebDriver driver,int time, WebElement ele )
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	//ExplicitWait for element to be clickable
	public void ExplicitWait1(WebDriver driver,int time,WebElement ele )
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	//handling parent window
	public void parentWindow(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
	//handling child window
		public void childWindow(WebDriver driver)
		{
			Set<String> child = driver.getWindowHandles();
			for(String b : child) {
			driver.switchTo().window(b);
			}
		}
		//handling Frames
		public void Frames(WebDriver driver, String value)
		{
			driver.switchTo().frame(value);
		}
		//shifting control to normal web page           //achieving method overloading
		public void Frames(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		//clicking on ok in alter popup
		public void alterPopupOk(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		//clicking on cancel in alter popup
				public void alterPopupDismiss(WebDriver driver)
				{
					driver.switchTo().alert().dismiss();
				}
	    //handling dropDowns
				public void dropDowns(WebElement ele, String text)
				{
					Select s = new Select(ele);
					s.selectByVisibleText("text");
				}
			

}
