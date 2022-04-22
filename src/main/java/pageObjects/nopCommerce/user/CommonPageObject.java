package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.user.CommonPageUI;
import pageUIs.nopCommerce.user.HomePageUI;
import pageUIs.nopCommerce.user.RegisterPageUI;

public class CommonPageObject extends BasePage{

	WebDriver driver;
	
	public CommonPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputToDynamicTextboxByID(WebDriver driver, String fieldID, String inputValue) {
		waitForElementInvisible(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_ID, fieldID);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_ID, inputValue, fieldID);
	}
	
	public UserRegisterPageObject openRegisterPage() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getUserRegisterPage(driver);
	}
	
	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}
	
	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, RegisterPageUI.SUCESS_MESSAGE);
		return getElementText(driver, RegisterPageUI.SUCESS_MESSAGE);
	}

}	
