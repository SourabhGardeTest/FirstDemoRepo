package testscript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		WebDriverManager.chromedriver().setup();  // instead of System.setProperty()
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); 
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File(".//ScreenShots/screenshot1.png"));
		}catch(Exception es) {
			
		}
		
	}

}
