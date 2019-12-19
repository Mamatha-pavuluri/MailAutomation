package webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class trainer implements person
{
	public  void drinkneat()
	{
	System.out.println("food");

}

public void work()
{
	System.out.println("write");
}

	public static void main(String[] args) {
		person p= new trainer ();
		p.drinkneat();
		p.work();

	}

}
