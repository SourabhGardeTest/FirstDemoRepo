package testscript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.apple.com/in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(".//click/screenshot1.png"));

			driver.navigate().to("https://www.apple.com/in/mac/");
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(2000);

		/*
			 * WebElement icon = driver.findElement(By.
			 * xpath("//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"
			 * ));
			 * 
			 * Actions action = new Actions(driver);
			 * action.moveToElement(icon).click().build().perform(); ; Thread.sleep(3000);
			 * 
			 * 
			 * 
			 * WebElement registerLink = driver.findElement(By.className(
			 * "((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
			 * registerLink.click(); Thread.sleep(2000);
			 * 
			 * WebElement firstName = driver.findElement(By.id("FirstName"));
			 * //firstName.click(); firstName.sendKeys("Shreyash"); Thread.sleep(2000);
			 * 
			 * WebElement lastName = driver.findElement(By.id("LastName"));
			 * //firstName.click(); lastName.sendKeys("Wankhede"); Thread.sleep(2000);
			 * 
			 * 
			 * WebElement email = driver.findElement(By.
			 * xpath("(//input[@class = 'disposableEmail validateEmail'])[1]")); //
			 * email.click(); email.sendKeys("shreyashkw31@gmail.com"); Thread.sleep(2000);
			 * 
			 * WebElement confirmEmail = driver.findElement(By.
			 * xpath("(//input[@class = 'disposableEmail validateEmail'])[2]"));
			 * //confirmEmail.click(); confirmEmail.sendKeys("shreyashkw31@gmail.com");
			 * 
			 * 
			 * WebElement userName = driver.findElement(By.id("Username"));
			 * //userName.click(); userName.sendKeys("shreyashkw"); Thread.sleep(2000);
			 * 
			 * WebElement selectCountry = driver.findElement(By.name("CountryId"));
			 * selectCountry.click();
			 * 
			 * Select select = new Select(selectCountry); Thread.sleep(2000);
			 * select.selectByVisibleText("Italy");
			 * 
			 * 
			 * WebElement timeZone = driver.findElement(By.id("TimeZoneId"));
			 * //timeZone.click(); Thread.sleep(2000); select = new Select(timeZone);
			 * select.selectByIndex(3);
			 * 
			 * WebElement newsLetter = driver.findElement(By.id("Newsletter")); if
			 * (!newsLetter.isSelected()) { Thread.sleep(2000); newsLetter.click(); }
			 * 
			 * WebElement pass = driver.findElement(By.id("Password"));
			 * pass.sendKeys("Shreyash@31"); Thread.sleep(2000);
			 * 
			 * WebElement confirmPass = driver.findElement(By.id("ConfirmPassword"));
			 * confirmPass.sendKeys("Shreyash@31"); Thread.sleep(2000);
			 * 
			 * WebElement compPri =
			 * driver.findElement(By.xpath("//select[@id = 'Details_CompanyIndustryId']"));
			 * //compPri.click(); select.selectByIndex(4);Thread.sleep(2000);
			 * 
			 * WebElement compAction =
			 * driver.findElement(By.xpath("//select[@id = 'Details_CompanyRoleId']"));
			 * //.click(); select.selectByIndex(2); Thread.sleep(2000);
			 * 
			 * WebElement compNo =
			 * driver.findElement(By.xpath("//select[@id = 'Details_CompanySizeId']"));
			 * //compNo.click(); select.selectByIndex(1); Thread.sleep(2000);
			 * 
			 * WebElement compWebsite =
			 * driver.findElement(By.xpath("//input[@id = 'Details_CompanyWebsiteUrl']"));
			 * compWebsite.sendKeys("NA"); Thread.sleep(2000);
			 * 
			 * WebElement registerButton = driver.findElement(By.id("register-button"));
			 * Thread.sleep(1000); registerButton.click();
			 */

			// driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
