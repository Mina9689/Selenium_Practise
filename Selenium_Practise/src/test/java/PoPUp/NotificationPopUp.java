//16-9-23---->not done
package PoPUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  WebDriver driver = new ChromeDriver(options);
 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Online_Selenium\\Selenium_Practise\\src\\main\\resources\\chromedriver.exe");

  
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  //use of get method
  driver.get("https://www.quikr.com/bangalore");
  driver.manage().window().maximize();
}
}
