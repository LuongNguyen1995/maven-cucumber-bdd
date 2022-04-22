package nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserHomePageObject;

public class HomePageSteps {

	WebDriver driver;
	UserHomePageObject homePage;
	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getUserHomePage(driver);
	}
	
	@Given("^Open register page$")
	public void openRegisterPage()  {
		homePage.openRegisterPage();
	}
	

}
