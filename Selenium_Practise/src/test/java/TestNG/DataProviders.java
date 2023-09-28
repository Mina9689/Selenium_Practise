package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
@DataProvider
public Object[][] getData()
{
	Object[][] a=new Object[3][2];
	a[0][0]="minakshi";
	a[0][1]="patil";
	
	a[1][0]="Hi";
	a[1][1]="Hello";
	
	a[2][0]="java";
	a[2][1]="selenium";
	return a;
	
}
@Test(dataProvider="getData")
public void demo(String username,String password)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	
}
}
