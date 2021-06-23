package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement Bank_and_Cash_Button;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement New_Account_Button;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement Account_Title_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement Initial_Balance_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement Account_Number_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement Contact_Person_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement Phone_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement Internet_Banking_Url_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit_Button;

// Interactive method
	public void enterUserName(String username) {
		User_Name.sendKeys(username);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void enterCredentials(String username, String password) {
		User_Name.sendKeys(username);
		Password.sendKeys(password);
	}
	public void clickOnSignInButton() {
		SignIn.click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickOnBankandCashButton() {
		Bank_and_Cash_Button.click();
	}
	public void clickonNewAccountButton() {
		New_Account_Button.click();
	}
	public void enterAccountTitle(String AccountTitle) {
		Account_Title_Field.sendKeys(AccountTitle);
	}
	public void enterDescription(String Description) {
		Description_Field.sendKeys(Description);
	}
	public void enterInitialBalance(String InitialBalance) {
		Initial_Balance_Field.sendKeys(InitialBalance);
	}
	public void enterAccountNumber(String AccountNumber) {
		Account_Number_Field.sendKeys(AccountNumber);
	}
	public void enterContactPerson(String ContactPerson) {
		Contact_Person_Field.sendKeys(ContactPerson);
	}
	public void enterPhone(String Phone) {
		Phone_Field.sendKeys(Phone);
	}
	public void enterInternetBankingUrl(String internetBankingUrl) {
		Internet_Banking_Url_Field.sendKeys(internetBankingUrl);
	}
	public void clickOnSubmitButtonn() {
		Submit_Button.click();
	}
	public void takeScreenShotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshots/" + label + ".png"));
	}

}
