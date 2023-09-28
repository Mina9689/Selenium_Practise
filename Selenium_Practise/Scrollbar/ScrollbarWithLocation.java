package Scrollbar;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class ScrollbarWithLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		//address of career
		WebElement career = driver.findElement(By.xpath("//a[.='Careers']"));
     Point coordinates = career.getLocation();
     int x=coordinates.getX();
     int y=coordinates.getY();
     //downcasting
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("", args)
	}
	}
