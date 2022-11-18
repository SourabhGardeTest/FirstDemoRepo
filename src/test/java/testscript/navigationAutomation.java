package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SG69837\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			Thread.sleep(4000);
			
			driver.navigate().to("https://www.myntra.com/men-tshirts");
			Thread.sleep(3000);
			
			driver.navigate().back();
			Thread.sleep(3000);

			driver.navigate().forward();
			Thread.sleep(3000);

			driver.quit();

			
			
			
		}catch(Exception ex) {
			
		}
	}

}
