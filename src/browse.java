import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.DriverProvider;
import org.w3c.dom.Document;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
public class browse {
	public WebDriver driver;
		public void FireFox()
		
		{
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			WebElement usernameElement=driver.findElement(By.id("identifierId"));
			usernameElement.sendKeys("mamatha0821");
			usernameElement.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("Venky@888");
			password.sendKeys(Keys.ENTER);
			}
		public void chrome() throws Exception
			{
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				DesiredCapabilities capabilities=new DesiredCapabilities();
				capabilities.setCapability("acceptInsecureCerts", true);
				driver= new ChromeDriver();
				driver.get("http://gmail.com");
				driver.manage().window().maximize();
				WebElement usernameElement=driver.findElement(By.id("identifierId"));
				usernameElement.sendKeys("mamatha0821");
				usernameElement.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("Venky@888");
				password.sendKeys(Keys.ENTER);
			}

	public static void main(String[] args)throws Exception {
	browse b=new browse();
	b.FireFox();
	//b.chrome();
	}

}
