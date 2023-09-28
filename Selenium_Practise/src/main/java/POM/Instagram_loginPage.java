package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram_loginPage {
//Declaration
	//address of  email text field
	@FindBy(xpath="//input[@name='username']")
	private WebElement emailTf;
	//address of password textfield
	@FindBy(xpath="//input[@name='password']")
		private WebElement passwordTf;
	//initalization
	public Instagram_loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, driver);
	}
	//utilization
	public void emailTextField(String name)
	{
		emailTf.sendKeys(name);
	}
	public void passwordTextField(String name)
	{
		emailTf.sendKeys(name);
	}
}
