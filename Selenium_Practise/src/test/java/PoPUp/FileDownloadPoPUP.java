//working
package PoPUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPoPUP {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/download");
	driver.manage().window().maximize();
	//click on that link some-text
	driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
	//some popup will come
}
}
