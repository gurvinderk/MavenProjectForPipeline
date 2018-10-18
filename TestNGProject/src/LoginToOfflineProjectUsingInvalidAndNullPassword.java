import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginToOfflineProjectUsingInvalidAndNullPassword {

	WebDriver Driver; // Webdriver object defined outside annotations hence global and can be used anywhere
	WebElement ele; //title of page
	WebElement email; // for email
	WebElement pass; // for password
	WebElement SignInButton; //for sign in click button
	WebElement EmailError; //webelement of Nullemail error message
	WebElement PassError; //webelement of Null password error message


	@BeforeSuite
	public void EnvironmentSetup()
	{
		Driver=new FirefoxDriver();
		Driver.get("file:///F:/studyMaterial/JAVA%20by%20KIRAN/Selenium%20and%20Java%20batch%20repeat/All%20files%20and%20projects/Offline%20project/index.html");
		Driver.manage().window().maximize();
		System.out.println("before suite code executed");
	}

	@BeforeMethod
	public void FindingWebElementsOnLoginPage()
	{
		//Locate title using xpath of tile and print it
		ele =Driver.findElement(By.xpath("html/body/div[1]/div[1]"));
		System.out.println("Login Logo of webpage is: " + ele.getText());

		//Identify the Email textbox element and provide Email in it
		email=Driver.findElement(By.xpath(".//*[@id='email']"));

		//Identify the Password textbox element and provide Email in it
		pass=Driver.findElement(By.xpath(".//*[@id='password']"));

		//Identify the Sign in button element and click on it
		SignInButton=Driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));

		//identify the email not found and password not found error message and print
		EmailError= Driver.findElement(By.xpath(".//*[@id='email_error']"));
		PassError= Driver.findElement(By.xpath(".//*[@id='password_error']"));

		System.out.println("BeforeMethod FindingEmailAndPAsswordElements executed===============================++++++++++");
		email.clear();  //To clear textbox
		pass.clear(); //To clear textbox

		try {  // To stop for few seconds
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Test using NULL password
	@Test (priority=0)
	public void NullUser() 
	{
		email.sendKeys("");//pass null to email
		pass.sendKeys("");  //pass null to password
		SignInButton.click(); // click on signin button
		System.out.println("NullUser testcase executed:  Error message : " + EmailError.getText() + " , " + PassError.getText() );
	}


	// Test using INVALID password	
	@Test (priority=1)
	public void PasswordInvalid()
	{
		email.sendKeys("d45fs4vfv4");
		pass.sendKeys("4d8c4d8cv");
		SignInButton.click();
		System.out.println("PasswordInvalid testcase executed:  Error message : " + EmailError.getText() + " , " + PassError.getText() );	
	}

	// Test using Valid email and password
	@Test (priority=2)
	public void ValidEmailAndPassword()
	{
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		SignInButton.click();
		System.out.println("Password valid testcase executed: " );	
	}
}
