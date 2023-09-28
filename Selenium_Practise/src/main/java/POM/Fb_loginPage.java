package POM;
//this class is to save locators
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Fb_loginPage {
//Declaration
	//address of email text field
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTf;
	//ADDRESS OF PASSWPRD TEXTFIELD
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement passwordTf;
	//address of login button
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginBtn;
	//initalization  -->getter
	public Fb_loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization  -->setter because here is void
	public void emailTextField(String name)
	{
		emailTf.sendKeys(name);
	}
	public void passwordTextField(String name)
	{
		
		passwordTf.sendKeys(name);
	}
	public void loginButton()
	{
		loginBtn.click();
	}
	
	
}
