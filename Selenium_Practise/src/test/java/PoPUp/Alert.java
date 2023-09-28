//working
//alert handling in selenium
//Imp->Same as confirmation popup or javascript popup
package PoPUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
driver.manage().window().maximize();
WebElement value = driver.findElement(By.xpath("//button[@id='add']"));
Actions a=new Actions(driver);
a.doubleClick(value).perform();
driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
//shifting control to poup
org.openqa.selenium.Alert popup=driver.switchTo().alert();
Thread.sleep(2000);
System.out.println(popup.getText());
//popup.dismiss();--->Handling popup
popup.accept();
}
}
