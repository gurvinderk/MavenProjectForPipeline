import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class PassingParameterValuesUsingDataProviderAnnotation {
	@Test(dataProvider = "dp")
	public void UsingDataProviderArrayValues(Integer n, String s, String t) {
		System.out.println("Hello from PassingParameterValuesUsingDataProviderAnnotation method");
		System.out.println("integer :" + n+ " STRING1 :" +s + " STRING2 :" + t);	  
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			{ 1, "29888754544848" ,"sdd"},
			{ 2, "348888888888888888888" ,"fdf"},
			{ 3, "4844444444444444444444444444444444444444444444" ,"dsfdfd"},
		};
	}
}
