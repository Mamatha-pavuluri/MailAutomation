package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class FacebookLogin {
public static WebDriver driver;
public static void LoginUrl()
{
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
	
	driver=new FirefoxDriver();
	driver.get("http://Facebook.com");
	driver.manage().window().maximize();
}
public static void VerifyLogin() {
	driver.findElement(By.id("email")).sendKeys("enter your email");
	driver.findElement(By.id("pass")).sendKeys("enter password");
	driver.findElement(By.id("u_0_b")).click();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoginUrl();
VerifyLogin();
	}

}
