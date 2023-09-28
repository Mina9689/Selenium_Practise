package PoPUp;
//not done
//this popup is present for flipkart also
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.redBus.in/");
		driver.manage().window().maximize();
		//identify webelement ie;from
		//driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune",Keys.ENTER);
		//identify webelement ie;to
		//driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Hyderabad",Keys.ENTER);
		//identify date 
		//driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		Thread.sleep(6000);
		//select date
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		Thread.sleep(5000);
	   driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']/descendant::text[text()='17 Sep']")).click();	
	}
}