package TestNG_Annotation;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Amazon {
WebDriver driver;
@Test
public void amazon()
{
	driver.get("https://www.amazon.com/");
System.out.println("amazon");
}
@Test
public void facebook()
{
	driver.get("https://www.facebook.com/");
System.out.println("facebook");
}
@BeforeMethod
public void basicSteps()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("Basic steps");
}
@AfterMethod
public void closing() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
	System.out.println("AFTER METHOD");
}
}
