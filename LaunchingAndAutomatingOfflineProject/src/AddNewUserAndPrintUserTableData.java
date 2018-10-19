import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewUserAndPrintUserTableData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
			
			//Click on User button
			WebElement User=Driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
			User.click();
			
			//Click on Add new user
			WebElement Addnew=Driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
			Addnew.click();
			
			//Fill Adduser form details
			//Adduser name
			WebElement username=Driver.findElement(By.xpath(".//*[@id='username']"));
			username.sendKeys("user1");
			Thread.sleep(2000);
			//add mobile number
			WebElement MobNum=Driver.findElement(By.xpath(".//*[@id='mobile']"));
			MobNum.sendKeys("9970113757");
			//add email
			WebElement Uemail=Driver.findElement(By.xpath(".//*[@id='email']"));
			Uemail.sendKeys("123@gmail.com");
			//select gender
			WebElement gender=Driver.findElement(By.xpath(".//*[@id='Male']"));
			gender.click();
			//select state from dropdown
			WebElement state=Driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select"));
			Select S=new Select(state);
			S.selectByVisibleText("HP");
			//Add password
			WebElement userpass=Driver.findElement(By.xpath(".//*[@id='password']"));
			userpass.sendKeys("123456");
			//click on submit button
			WebElement submit=Driver.findElement(By.xpath(".//*[@id='submit']"));
			submit.click();
			
			//Click ok on alert
			Alert al=Driver.switchTo().alert();
			al.accept();
		
			
			//Click on User button
			WebElement User1=Driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
			User1.click();
			Thread.sleep(2000);
			
			//To print the table displayed on screen
			//logic for table printing
			//locate table element
			WebElement table1=Driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div"));
			
			for (int i=2;i<=5;i++) //for table row tr
			{
				//System.out.println("Valus of i in for loop  is "+i);
				for (int j=1 ;j<=7;j++)  //for table data td
				{
					//System.out.println("Valus of J in for loop  is "+j);
					WebElement table2= Driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
					System.out.print(table2.getText() + " , "); // will print first value of a row then next on same line and so on seperated by a comma
				}
				System.out.println(); // will move to next line after printing all values of a row
			}
				
			
	}

}
