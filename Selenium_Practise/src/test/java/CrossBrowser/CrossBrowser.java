//cross browser testing in various browsers
package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
@Parameters({"browsername"})
@Test
public void fb(String browser)
{
WebDriver driver;
if(browser.equals("edge"))
{
	driver=new EdgeDriver();
}
else
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Online_Selenium\\Selenium_Practise\\src\\main\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
}
}
