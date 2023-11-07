package StepDefenations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;

//	@Given("^user lauch chrome browser$")
//	public void user_lauch_chrome_browser() {
//		WebDriver driver=new ChromeDriver();
//		//driver.get(null);
//		//System.setProperty("Webdriver.chrome.driver", sysetem));
//	 //  lp=new LoginPage(driver);
//	}

	@Given ("^user open URL \"(.*?)\"$")
	public void user_open_URL(String url)  {
		WebDriver driver=new ChromeDriver();
	   driver.get(url);
	   lp=new LoginPage(driver);
	}

	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
	  lp.login1();
	}

	@Then("^user enter username \"(.*?)\" and password \"(.*?)\"$")
	public void user_enter_username_and_password(String uname, String pwd) throws Throwable {
	   lp.setUserName(uname);
	   lp.setUserName(pwd);
	}
	@Then("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		lp.clickLogin();
	}

//	@Then("^user navigat to home page$")
//	public void user_navigat_to_home_page() throws Throwable {
//	  
//	}


}
