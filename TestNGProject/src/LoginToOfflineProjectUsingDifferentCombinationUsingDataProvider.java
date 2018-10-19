import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.chrome.*;

public class LoginToOfflineProjectUsingDifferentCombinationUsingDataProvider {

	WebDriver Driver;
	WebElement EmailID;
	WebElement PasswordID;
	WebElement SignINButton;

	@BeforeSuite
	public void EnvironmentSetupAndLaunchingURL() 
	{
		Driver=new FirefoxDriver();
		Driver.get("file:///F:/studyMaterial/JAVA%20by%20KIRAN/Selenium%20and%20Java%20batch%20repeat/All%20files%20and%20projects/Offline%20project/index.html");
		Driver.manage().window().maximize();
		System.out.println(" Before suite code executed");

	}

	@BeforeTest
	public void IdentifyingWebElementsOnWebPage() 
	{
		EmailID=Driver.findElement(By.xpath(".//*[@id='email']"));
		PasswordID=Driver.findElement(By.xpath(".//*[@id='password']"));
		SignINButton=Driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	}


	@Test(dataProvider = "dp")
	public void f(String n, String s) throws InterruptedException {
		System.out.println("Using input values from data provider");
		EmailID.sendKeys(n);
		PasswordID.sendKeys(s);
		Thread.sleep(1000);
		SignINButton.click();	
	}

	@BeforeMethod
	public void beforeMethod() {
		EmailID.clear();
		PasswordID.clear();
	}



	@DataProvider
	public Object[][] dp() {
		return new Object[][] {						
			{ "Email", "Pass" },				// InValid value
			{ "kiran@gmail.com", "1234" },	// InValid value
			{ "kiran@", "123456" },			// InValid value
			{ " ", " " },    				 // InValid value
			{ "kiran@gmail.com", "123456" }, // Valid value
		};
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}


	@AfterTest
	public void afterTest() {
	}


	@AfterSuite
	public void afterSuite() {
	}

}
