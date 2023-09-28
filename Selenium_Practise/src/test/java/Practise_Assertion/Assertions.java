package Practise_Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
WebDriver driver;
@Test
public void Facebook()
{
	//opening chrome browser
	driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com");
     String title = driver.getTitle();
     //hard assert-->critical and major test cases
     Assert.assertEquals(title, "Facebook – log in or sign up");//false
   System.out.println(title);
}
@Test
public void closingPurpose()
{
	driver.close();
}
}
