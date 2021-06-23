package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

/*public class NewAccntStepDefinitions {
	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() throws Exception{
		driver.get("https://techfios.com/billing/?ng=admin/");
		Thread.sleep(2000);
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("^User clicks on SignIn Button$")
	public void user_clicks_on_SignIn_Button() {
		loginPage.clickOnSignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenShotAtEndOfTest(driver);

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String username, String password) {
		loginPage.enterCredentials(username, password);

	}
	
	@Then ("^User clicks on Bank and Cash Button$")
	public void User_clicks_on_Bank_and_Cash_Button() {
		loginPage.clickOnBankandCashButton();
	}
	
	@Then ("^User clicks on New Account Button$")
	public void User_clicks_on_New_Account_Button() {
		loginPage.clickonNewAccountButton();
	}
		
	@Then ("^User should land on Add New Account page$")
	public void user_should_land_on_New_Account_page() throws Throwable {
		String expectedTitle = "";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenShotAtEndOfTest(driver);
	}
	
	//Then User should fill out the form by entering "<AccountTitle>" and "<Description>" and "<InitialBalance>" and "<AccountNumber>" and "<ContactPerson>" and "<Phone>" and "<InternetBankingUrl>";
	

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	      }
	}
*/