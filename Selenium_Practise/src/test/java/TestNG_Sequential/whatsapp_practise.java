package TestNG_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class whatsapp_practise {
@Test 
public void whatsapp() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
}
}
