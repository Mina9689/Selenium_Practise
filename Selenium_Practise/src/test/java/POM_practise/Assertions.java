//not done
package POM_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {
WebDriver driver;
public void Facebook()
{
	//opening chrome browser
	driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com");
     String title = driver.getTitle();
     //hard assert-->critical and major test cases
     Assert.assertEquals(title, "Minakshi");//false
}
}
