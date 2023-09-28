package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PropertyBrowser {
	public static void main(String[] args) throws IOException {
		//create an object for properties class
	Properties p = new Properties();
	//create an object for physical fie
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
p.load(fis);
String urlApp = p.getProperty("url");
String username = p.getProperty("username");
String password=p.getProperty("password");
String browser=p.getProperty("browser");
WebDriver driver;
driver=new ChromeDriver();
if(browser.equals("chrome"))
{
	driver=new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get(urlApp);
driver.findElement(By.id("email")).sendKeys(username);
driver.findElement(By.id("pass")).sendKeys(password);

	}
}