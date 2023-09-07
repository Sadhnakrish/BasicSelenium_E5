package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_coursesPage {
	//Declaration
		//address of course
		@FindBy(id="course")
		private WebElement courseBtn;
		
		//address of selenium training
		@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
		private WebElement SeleniumTrainingBtn;
		
		//Initialization
		public Skillrary_coursesPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Utilization
		
		public void CourseButton()
		{
	      courseBtn.click();
		}
		
		public void SeleniumTrainingButton()
		{
	      courseBtn.click();
		}
		//generate getter and setter method

		public WebElement getCourseBtn() {
			return courseBtn;
		}

		public void setCourseBtn(WebElement courseBtn) {
			this.courseBtn = courseBtn;
		}
	}


