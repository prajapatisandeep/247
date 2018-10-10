package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationUtility.WebUIUtility;

public class SignInPage {

	WebDriver driver;
	
	@FindBy(xpath="(//span[text()='LOGIN'])[1]")
	WebElement login;
	
	@FindBy(xpath="//input[@name='clientEmailLogin']")
	WebElement enterEmailTextBox;
	
	@FindBy(xpath="//input[@name='clientLoginPassword']")
	WebElement enterPasswordTextBox;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	WebElement loginButton;
	
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userSignIn(String userName, String passWord) {
		login.click();
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		enterEmailTextBox.sendKeys(userName);
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		enterPasswordTextBox.sendKeys(passWord);
		loginButton.click();
				
	}
	
	
	
	public void userRegister() {
		
		
		
		
	}
	

}
