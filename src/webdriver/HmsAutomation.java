package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.server.DriverProvider;

public class HmsAutomation {
	public WebDriver driver;

	public void FireFox()
	{
	System.setProperty("webdriver.gecko.driver","D:\\\\Selenium\\\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://www.seleniumbymahesh.com/");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement loginElement=driver.findElement(By.linkText("HMS"));
	loginElement.click();
	WebElement username=driver.findElement(By.name("username"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("admin");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HmsAutomation v=new HmsAutomation();
		v.FireFox();

	}

}
