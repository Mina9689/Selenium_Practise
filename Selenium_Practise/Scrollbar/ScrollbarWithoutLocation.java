package Scrollbar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class ScrollbarWithoutLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		//address of career
		WebElement shorts = driver.findElement(By.xpath("//a[text()='Cotton Shorts Men']"));
		//downcasting for scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", shorts);
		Thread.sleep(2000);
		//career.click();
		js.executeScript("arguments[0].click();", shorts);
}
}
