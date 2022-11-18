package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
		        System.setProperty("webdriver.chrome.webdriver","C:\\Users\\SG69837\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
		        
		        WebDriver driver = new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        driver.get("https://www.orangehrm.com/");
		        driver.manage().window().maximize();
		        Thread.sleep(1000);
		        
		        WebElement bookDemo= driver.findElement(By.xpath("(//div[@class='d-flex web-menu-btn']/ul/li)[1]/a/button"));
		        
		        
		        WebElement FullName = driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']"));
		        WebElement Email = driver.findElement(By.xpath("//input[@id='Form_getForm_Email']"));
		        Select Country = new Select (driver.findElement((By.xpath("//select[@id='Form_getForm_Country']"))));
		        WebElement Contact = driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));



		        bookDemo.click();
		        Thread.sleep(4000);
		       
		        FullName.sendKeys("Sourav Garje");
		        Thread.sleep(1500);
		        
		        Email.sendKeys("gyuath@gmail.com");
		        Thread.sleep(1500);
		        
		        Country.selectByVisibleText("India");
		        Thread.sleep(1500);
		        
		        Contact.sendKeys("9648238736");
		        Thread.sleep(1500);
		        
		        driver.quit();
		        }catch(Exception ex){
		            ex.printStackTrace();
		        }
	}

}
