package steps;


import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DatabasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDefinitions {
	WebDriver driver;
	LoginPage loginPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given ("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page () throws Exception {
		driver.get("https://techfios.com/billing/?ng=admin/");
		Thread.sleep(2000);
		}
	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)  {
		loginPage.enterUserName(username);
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password)  {
		loginPage.enterPassword(password);    
	}

	@When("^User clicks on SignIn Button$")
	public void user_clicks_on_SignIn_Button()  {
		loginPage.clickOnSignInButton();
	}
	
	@When ("^User enters username from database$")
	public void User_enters_username_from_database() throws ClassNotFoundException, SQLException {
		loginPage.enterUserName(DatabasePage.getData("userName"));
	}
	
	@When ("^User enters password from database$")
	public void User_enters_password_from_database() throws ClassNotFoundException, SQLException {
		loginPage.enterPassword(DatabasePage.getData("password"));
	}
	    
	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable  {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenShotAtEndOfTest(driver);
	    
	}
	
	@When ("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String username, String password) {
		loginPage.enterCredentials(username, password);
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();		
	}	
	}
	
	
	
	

