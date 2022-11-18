package testscript;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class MyntraAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SG69837\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			
			
			Thread.sleep(10000);
			////ul[@class='navigation-top-menu navigation-top-menu-user-actions']
			
			 WebElement Men = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[1]/div/a"));
			
			 
			 Actions actions = new Actions(driver);
			 actions.moveToElement(Men);
			 Thread.sleep(3000);
			 
			 WebElement phonecase = driver.findElement(By.xpath("((//ul[@class='desktop-navBlock'])[5]/li)[11]"));

			 actions.click(phonecase).build().perform();
			 
			 Thread.sleep(4000);
			 
			WebElement ThirdRowThirdProduct = driver.findElement(By.xpath("(//li[@class='product-base'])[11]"));
			ThirdRowThirdProduct.click();
			 
			ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(tab.get(1));
			 System.out.println("page title of active tab:"+driver.getTitle());
			
			 
			driver.quit();
			
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	}

}
