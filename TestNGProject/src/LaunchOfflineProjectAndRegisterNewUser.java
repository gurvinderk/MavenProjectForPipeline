import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class LaunchOfflineProjectAndRegisterNewUser {

	WebDriver Driver;
	WebElement EmailID;
	WebElement PassID;
	WebElement SignINButton;
	WebElement RegisterLink1;
	WebElement NewName;
	WebElement NewMobile;
	WebElement NewEmail;
	WebElement NewPass;
	WebElement NewSignIn;

	@BeforeSuite
	public void EnvironmentalSetUp() throws InterruptedException  {
		Driver =new FirefoxDriver();
		Driver.get("file:///F:/studyMaterial/JAVA%20by%20KIRAN/Selenium%20and%20Java%20batch%20repeat/All%20files%20and%20projects/Offline%20project/index.html");
		Driver.manage().window().maximize();
		System.out.println(" Before suite code executed");
		Thread.sleep(2000);
	}

/*
	@BeforeTest
	public void IdentifyAllWebElementsOnRegisterNewUserPage() throws InterruptedException  {

	}

	@BeforeMethod
	public void beforeMethod() {

	}
*/	

	@Test (priority=0)
	public void test() 
	{
		System.out.println("Test code executed");
		RegisterLink1.findElement(By.xpath("html/body/div[1]/div[2]/a")); 
		RegisterLink1.click();
//		NewName.findElement(By.xpath(".//*[@id='name']"));
//		NewMobile.findElement(By.xpath(".//*[@id='mobile']"));
//		NewEmail.findElement(By.xpath(".//*[@id='email']"));
//		NewPass.findElement(By.xpath(".//*[@id='password']"));
//		NewSignIn.findElement(By.xpath(".//*[@id='form']/div[5]/div/button"));
	}

/*
	@Test(dataProvider = "dp" , priority=1)
	public void f(String name,String phone,String Email, String Pass) throws InterruptedException {
		NewName.sendKeys(name);
		NewMobile.sendKeys(phone);
		NewEmail.sendKeys(Email);
		NewPass.sendKeys(Pass);
		Thread.sleep(2000);
		NewSignIn.click();
		Thread.sleep(2000);
		Alert obj=Driver.switchTo().alert();
		obj.accept();	
	}


	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			{ "1","5998566542","d@gmail.com","d555"},
		};
	}



	@AfterSuite
	public void afterSuite() {
	}
*/
}
