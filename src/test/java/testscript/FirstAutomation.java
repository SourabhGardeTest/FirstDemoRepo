package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class FirstAutomation {
	
	
	/*
	 * public static String VerifyTitle() { WebDriver driver = new ChromeDriver();
	 * String Mtitle = driver.getTitle();
	 * System.out.println("The Title is ="+Mtitle); return Mtitle; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SG69837\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);

		
		
		//Thread.sleep(10000);
		////ul[@class='navigation-top-menu navigation-top-menu-user-actions']
		
		 WebElement userIcon = driver.findElement(By.xpath("//span[@class='user-actions-ico']"));
		
		 WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(userIcon);
		// Thread.sleep(1000);
		 actions.click(registerLink).build().perform();
		 
	//	 Thread.sleep(8000);
		 
		 WebElement RegisterHeading = driver.findElement(By.xpath("//h1[text()='Register']"));

		 
		 WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		 WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));

		 WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		 WebElement cnfrmemail = driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
		 
		 WebElement usrnme = driver.findElement(By.xpath("//input[@id='Username']"));


		 WebElement checkavailability = driver.findElement(By.xpath("//input[@id='check-availability-button']"));
		 WebElement country = driver.findElement(By.xpath("//select[@id='CountryId']"));
		 
		 Select countryselector= new Select(country);
		 WebElement timeZone = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
		 Select timezoneSelector= new Select(timeZone);

		 WebElement newscheckbox = driver.findElement(By.xpath("//label[@for='Newsletter']"));
		 
		 WebElement passwrd = driver.findElement(By.xpath("//input[@id='Password']"));
		 WebElement confirmpasswrd = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		 
		 WebElement MyCompanyPrimarily = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
		 WebElement MyMainActivityInCompany = driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']"));
		 WebElement CompanyWebsite = driver.findElement(By.xpath("//select[@id='Details_WebsitesDevelopmentPeriodId']"));

		 WebElement MyCompanyPeople = driver.findElement(By.xpath("//select[@id='Details_CompanySizeId']"));
		 WebElement companyNopCommerceradio = driver.findElement(By.xpath("//label[@for='is-nop-commerce-srores-false']"));
		 WebElement register = driver.findElement(By.xpath("//input[@id='register-button']"));
		 
		 Select companyselector = new Select(MyCompanyPrimarily);
		 Select activityselector = new Select(MyMainActivityInCompany);
		 Select companyWebsiteselector = new Select(CompanyWebsite);

		 Select peopleselector = new Select(MyCompanyPeople);

		 
		 Assert.assertEquals(true, RegisterHeading.isDisplayed());
		 
		 firstname.sendKeys("Sourabh");
		 //Thread.sleep(2000);
		 lastname.sendKeys("Ghatge");
		 //Thread.sleep(2000);
		 
		 
		 email.sendKeys("abc.de.f.hij.kl@gmail.com");
		 //Thread.sleep(2000);
		 cnfrmemail.sendKeys("abc.de.f.hij.kl@gmail.com");
		 //Thread.sleep(2000);
		 
		 usrnme.sendKeys("abcdedstwafhudshff");
		 checkavailability.click();
		// Thread.sleep(4000);
		 
		 countryselector.selectByVisibleText("India");
		 //Thread.sleep(2000);
		 timezoneSelector.selectByVisibleText("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
		 //Thread.sleep(2000);
		 
		 if(newscheckbox.isEnabled()) {
			 newscheckbox.click();
		 }
		 
	//	 Thread.sleep(2000);
		 
		 passwrd.sendKeys("abc@Pass123");
		// Thread.sleep(2000);
		 confirmpasswrd.sendKeys("abc@Pass123");
		 //Thread.sleep(2000);
		 
		 companyselector.selectByVisibleText("Provides deployment, customization and integration services to merchants");
		 //Thread.sleep(2000);
		 activityselector.selectByVisibleText("Technical developer");
		 //Thread.sleep(2000);
		 companyWebsiteselector.selectByVisibleText("Over 6 years");
		 //Thread.sleep(2000);
		 peopleselector.selectByVisibleText("More than 15");
		 //Thread.sleep(2000);
		 
		 companyNopCommerceradio.click();
		 //Thread.sleep(2000);
		 register.click();
		 //Thread.sleep(5000);

		 Assert.assertEquals(true, RegisterHeading.isDisplayed());
		 
		 driver.quit();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
