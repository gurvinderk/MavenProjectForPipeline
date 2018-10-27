
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsingPropertyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream inStream = new FileInputStream("C:\\Users\\gurvinderk\\Selenium workspace\\Java Practise1\\Selenium Automation\\src\\login.properties");
		Properties properties = new Properties();
		properties.load(inStream);
		System.out.println(properties.getProperty("userid"));
		System.out.println(properties.getProperty("password"));
	}
}
