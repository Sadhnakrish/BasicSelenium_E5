package DataDrivenTesting;

import java.io.FileInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Excelsheet {

	public static void main(String[] args) throws Throwable {
		//creating an object for the physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx"); //first enter .\\
		 Workbook wb = WorkbookFactory.create(fis);
		 String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 
		// chrome driver
			WebDriverManager.firefoxdriver().setup();
			// opening chrome browser
			WebDriver driver = new FirefoxDriver();
			// maximizing the browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// entering the url
			driver.get(url);
			//System.out.println(driver.getTitle());
			String title = driver.getTitle();
			wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
			FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
			wb.write(fos);
			

	}

}


