package File_Upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Sendkeys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Online_Selenium\\Selenium_Practise\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.foundit.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
}
}
