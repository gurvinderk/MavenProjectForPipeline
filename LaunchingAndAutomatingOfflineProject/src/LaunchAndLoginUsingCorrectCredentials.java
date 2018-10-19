import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAndLoginUsingCorrectCredentials {

	public static void main(String[] args) {
		// Create webdriver object for firefox to launch firefox and give url
		WebDriver Driver=new FirefoxDriver();
		Driver.get("file:///F:/studyMaterial/JAVA%20by%20KIRAN/Selenium%20and%20Java%20batch%20repeat/All%20files%20and%20projects/Offline%20project/index.html");
		
		//Locate title using xpath of tile and print it
		WebElement ele =Driver.findElement(By.xpath("html/body/div[1]/div[1]"));
		System.out.println("Login Logo of webpage is: " + ele.getText());
	
		//Identify the Email textbox element and provide Email in it
		WebElement email=Driver.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("kiran@gmail.com");

		//Identify the Password textbox element and provide Email in it
		WebElement pass=Driver.findElement(By.xpath(".//*[@id='password']"));
		pass.sendKeys("123456");

		//Identify the Sign in button element and click on it
		WebElement clickButton=Driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		clickButton.click();
		
//Identify if any error was displayed for wrong email or password and print it
		/*WebElement WrongEmail=Driver.findElement(By.xpath(".//*[@id='email_error']"));
		System.out.println("Email address is wrong. Error Message Description: " + WrongEmail.getText());
		WebElement WrongPass=Driver.findElement(By.xpath(".//*[@id='password_error']"));
		System.out.println("Password address is wrong. Error Message Description: " +  WrongPass.getText());
	*/
		}

}
