package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//Flipkart With location

public class FlipkartWithScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement FAQ = driver.findElement(By.xpath("//a[.='FAQ']"));
	Point coordinates = FAQ.getLocation();
	int x=coordinates.getX();
	int y=coordinates.getY();
	//downcasting for scrolling
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", FAQ);
	
	}

}
