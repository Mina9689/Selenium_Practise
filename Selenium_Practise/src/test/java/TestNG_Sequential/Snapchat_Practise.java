package TestNG_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Snapchat_Practise {
@Test
public void snapchat() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.snapchat.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
}
}
