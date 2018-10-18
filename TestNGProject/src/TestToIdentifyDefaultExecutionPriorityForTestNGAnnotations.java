import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

// Default priority is 
// Before Suite >> Before Test >> Before Class 
// >> Before Method >> TestCase 1 >>  After Method
// >> Before Method >> TestCase 2 >>  After Method
// >> After Class >> After Test >> After Suite
public class TestToIdentifyDefaultExecutionPriorityForTestNGAnnotations {
	@Test (priority=1	)
	public void Blankuser() {
		System.out.println("Blank user:  test case 1");
	}

	@Test (priority=2)
	public void ASplCharUser() {
		System.out.println("Special char user  :  test case 2");
	}

	@Test (priority=0)
	public void ZSplCharUser2() {
		System.out.println("Special char user  :  test case 3");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("before Method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("after Method");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("before Class");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("after Class");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("before Test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("after Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");

	}

}
