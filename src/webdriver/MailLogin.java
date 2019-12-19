package webdriver;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import com.google.common.util.concurrent.Service.State;

public class MailLogin {

	public static WebDriver driver;
	public static void openUrl() throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}
		public  static void verifyLogin() throws Exception
		{
		driver.findElement(By.id("identifierId")).sendKeys("enterusername");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
	
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("enter pwd");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);		}
	
	
	public static void main(String[] args)throws Exception {
		openUrl();
		verifyLogin();
	}

}
