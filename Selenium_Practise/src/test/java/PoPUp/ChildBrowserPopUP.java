//16-09-23(DONE)
package PoPUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.skillrary.com/");
driver.manage().window().maximize();
//window handle
String parent = driver.getWindowHandle();
//click on gears
driver.findElement(By.xpath("//a[contains(text(),' GEARS ')]")).click();
//click on skillary essay
driver.findElement(By.xpath("(//a[.=' SkillRary Essay'])[2]")).click();
Set<String> child = driver.getWindowHandles();
for(String b:child)
{
	driver.switchTo().window(b);

}
driver.findElement(By.id("mytext")).sendKeys("Mina");
Thread.sleep(2000);
//move the control from child window to parent 
driver.switchTo().window(parent);
driver.findElement(By.xpath("//a[.='CATEGORIES']")).click();
}
}
