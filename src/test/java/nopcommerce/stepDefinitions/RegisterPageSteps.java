package nopcommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import utilities.DataUtil;

public class RegisterPageSteps extends BasePage{

	WebDriver driver;
	UserRegisterPageObject registerPage;
	String registerSuccessfullyMessage;
	static String firstName,lastName,email,password,confirmPassword;
	DataUtil dataTest;
	//Contructor
	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getUserRegisterPage(driver);
		dataTest = DataUtil.getData();
	}
	@Given("^Input Fistname and Lastname and Email and Password$")
	public void inputFistnameAndLastnameAndEmailAndPassword() {
		password = dataTest.getPassword();
		registerPage.inputToFirstnameTextbox(dataTest.getFirstName());
		registerPage.inputToLastnameTextbox(dataTest.getLastName());
		registerPage.inputToEmailTextbox(dataTest.getEmailAddress());
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);
	}

	@When("^Click to Register button$")
	public void clickToRegisterButton() {
		registerPage.clickToRegisterButton();
	}
	
	@Then("^Register successfully$")
	public void registerSuccessfully()  {
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}

}
