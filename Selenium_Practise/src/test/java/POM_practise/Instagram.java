package POM_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Instagram_loginPage;

public class Instagram {
public static void main(String[] args) {
	WebDriver driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver1.get("https://www.instagram.com/");
	Instagram_loginPage inlogin=new Instagram_loginPage(driver1);
	inlogin.emailTextField("mina");
	inlogin.passwordTextField("bb");
}
}
