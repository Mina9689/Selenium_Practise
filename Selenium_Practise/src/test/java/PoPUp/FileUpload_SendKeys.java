//16-9-23(done)
package PoPUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_SendKeys {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.foundit.in/");
driver.manage().window().maximize();
//click on upload resume
driver.findElement(By.xpath("//div[contains(text(),'Upload')]")).click();
//click on file upload
driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Public\\Downloads");

}
}
