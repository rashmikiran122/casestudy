package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="loginusername")
	WebElement txtun;
	
	@FindBy(id="loginpassword")
	WebElement txtpass;
	
	@FindBy(id="login2")
	WebElement txtlogin1;
	
	@FindBy(xpath="//button[contains(text(), 'Log in')]")
	WebElement txtLogin;
	
	
	public void setUserName(String uname) {
		txtun.sendKeys(uname);
	}
	

	public void setPassword(String pwd) {
		txtpass.sendKeys(pwd);
	}
	

	public void login1() {
		txtlogin1.click();
	}
	
	public void clickLogin() {
		txtLogin.click();
	}
}

