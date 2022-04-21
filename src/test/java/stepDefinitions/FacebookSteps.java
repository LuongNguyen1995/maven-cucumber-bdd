package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {

	WebDriver driver;
	
	@Before("@parameter")
	public void openFacebookApplication()  {
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After("@parameter")
	public void closeApplication()  {
	   driver.quit();
	}
	
	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("automationfc@gmail.com");
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123123");
	}
	
	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
	}
	
	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password)  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	

	@When("^Input to Username textbox with ([^\"]*)$")
	public void inputToUsernameTextbox(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
	}

	@When("^Input to Password textbox ([^\"]*)$")
	public void inputToPasswordTextbox(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^Input to Username textbox with \"([^\"]*)\" and Password with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWithAndPasswordWith(String email, String password)  {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable table)  {
		List<Map<String,String>> customer = table.asMaps(String.class, String.class);
		
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys(customer.get(0).get("Username"));
//		
//		driver.findElement(By.id("pass")).clear();
//		driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("Password"));

		//Thường dùng để verify data
		for (Map<String, String> loginInfor : table.asMaps(String.class, String.class)) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(loginInfor.get("Username"));
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(loginInfor.get("Password"));
		}
	}

	@When("^Click to Submit button$")
	public void clickToSubmitButton() {
		driver.findElement(By.name("login")).click();
	}

	

}
