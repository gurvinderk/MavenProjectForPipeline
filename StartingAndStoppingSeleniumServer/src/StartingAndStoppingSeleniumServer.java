import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

public class StartingAndStoppingSeleniumServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RemoteControlConfiguration r=new RemoteControlConfiguration();	
		SeleniumServer s = new SeleniumServer(r);
		
r.setPort(1234);
		System.out.println("post code executed");		
		r.setLogOutFileName("selenium1.log");
		s.start();
		s.stop();
	
		
	}

}
