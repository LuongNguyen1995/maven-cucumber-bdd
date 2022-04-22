package nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import pageObjects.nopCommerce.user.CommonPageObject;
import utilities.DataUtil;

public class CommonPageSteps extends BasePage{

	WebDriver driver;
	CommonPageObject commonPage;
	DataUtil dataTest;
	//Contructor
	public CommonPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPage(driver);
		dataTest = DataUtil.getData();
	}
	@Given("^Open \"([^\"]*)\" Page$")
	public void openPage(String pageName)  {
		commonPage.openRegisterPage();
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldName, String inputValue)  {
		commonPage.inputToDynamicTextboxByID(driver, fieldName, inputValue);
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonValue)  {
		commonPage.clickToRegisterButton();
	}

	@Then("^Verify Register successfully \"([^\"]*)\"$")
	public void verifyRegisterSuccessfully(String expectedMessage) {
		Assert.assertEquals(commonPage.getRegisterSuccessMessage(), expectedMessage);
	}

}
