package nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserLoginPageObject;

public class LoginPageSteps {


	WebDriver driver;
	static String loginPageUrl;
	UserLoginPageObject loginPage;
	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		loginPage = PageGeneratorManager.getUserLoginPage(driver);
	}
	
	@Given("^Get login page Url$")
	public void getLoginPageUrl()  {
		loginPageUrl = loginPage.getLoginPageUrl();
	}
	

}
