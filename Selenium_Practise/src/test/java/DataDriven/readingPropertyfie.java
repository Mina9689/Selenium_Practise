package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readingPropertyfie {
	public static void main(String[] args) throws IOException {
		//create an object for properties class
		Properties p=new Properties();
		//create an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String urlApp = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		//upcasting statement
		WebDriver  driver=new ChromeDriver();
	//maximize the window
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(urlApp);
		driver.findElement(By.id("email")).sendKeys("minakshi");
		driver.findElement(By.id("pass")).sendKeys("12333");
	}

}
