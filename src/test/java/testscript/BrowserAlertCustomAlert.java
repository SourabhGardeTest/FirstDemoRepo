package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAlertCustomAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\SG69837\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sweetalert2.github.io");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javscript:window.scrollBy(0,380)");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		Thread.sleep(1000);
		
		System.out.println("Scroll by 450");
		WebElement custombutton = driver.findElement(By.xpath("//button[@aria-label='Show SweetAlert2 success message']"));
		
		
		custombutton.click();
		Thread.sleep(1000);
		
		WebElement customOkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		customOkBtn.click();
		Thread.sleep(1000);
		
		WebElement browserAlertButton = driver.findElement(By.xpath("//div[@class='showcase normal']/button"));
		browserAlertButton.click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javscript:window.scrollBy(380,760)");
		Thread.sleep(1000);
		WebElement tryMe1 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A basic message']"));
		tryMe1.click();
		Thread.sleep(500);
		
		WebElement try1OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try1OkBtn.click();
		Thread.sleep(500);

		WebElement tryMe2 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A title with a text under']"));
		tryMe2.click();
		Thread.sleep(500);

		WebElement try2OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try2OkBtn.click();
		Thread.sleep(500);

		WebElement tryMe3 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A modal with a title, an error icon, a text, and a footer']"));
		tryMe3.click();
		Thread.sleep(500);

		WebElement try3OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try3OkBtn.click();
		Thread.sleep(500);
		
		js.executeScript("javscript:window.scrollBy(500,700)");
		Thread.sleep(1000);
		
		WebElement tryMe4 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A modal window with a long content inside']"));
		tryMe4.click();
		Thread.sleep(500);

		WebElement try4OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try4OkBtn.click();
		Thread.sleep(500);
		
		WebElement tryMe5 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: Custom HTML description and buttons']"));
		tryMe5.click();
		Thread.sleep(500);

		WebElement try5OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try5OkBtn.click();
		Thread.sleep(500);
		
		WebElement tryMe6 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A dialog with three buttons']"));
		tryMe6.click();
		Thread.sleep(500);

		WebElement try6DontSaveBtn = driver.findElement(By.xpath("//button[@class='swal2-deny swal2-styled']"));
		try6DontSaveBtn.click();
		Thread.sleep(500);
		
		WebElement try6OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try6OkBtn.click();
		Thread.sleep(500);
		
		js.executeScript("javscript:window.scrollBy(680,900)");
		Thread.sleep(1000);

		WebElement tryMe7 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A custom positioned dialog']"));
		tryMe7.click();
		Thread.sleep(2000);
		
		WebElement tryMe8 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: jQuery HTML with custom animation']"));
		tryMe8.click();
		Thread.sleep(1500);
		
		WebElement try8OkBtn = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		try8OkBtn.click();
		Thread.sleep(500);
		
		
		driver.quit();
		}catch(Exception e) {
			
		}
		
	}

}
