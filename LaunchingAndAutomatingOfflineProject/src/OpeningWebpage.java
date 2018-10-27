import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningWebpage {
	
	public static void main(String[] args) {
		
WebDriver driver= new FirefoxDriver();
	driver.get("F:\\study material\\JAVA by KIRAN\\selenium1\\project\\index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
	driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span")).click();

//Add new user
	driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
	driver.findElement(By.id("username")).sendKeys("guru"); //name
	driver.findElement(By.id("mobile")).sendKeys("1234567891"); //mobile
	driver.findElement(By.id("email")).sendKeys("ggg@gmail.com"); //email
	driver.findElement(By.id("Male")).click(); //Mail/female radio button
   
}
}
