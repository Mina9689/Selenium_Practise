package POM_practise;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import POM.Fb_loginPage;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//creating an object for pom class
	Fb_loginPage fblogin = new Fb_loginPage(driver);
	//calling that method from setter method
	fblogin.emailTextField("Minakshi");
	
	Thread.sleep(2000);
	fblogin.passwordTextField("Minakshi");
	Thread.sleep(2000);
	fblogin.loginButton();
	}

}
