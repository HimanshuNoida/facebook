package Facebook_With_DataProviderClass;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	@DataProvider(name="testData")
	public static Object[][] testData() {
		
		Object[][] data=new Object[1][2];
		data[0][0]="9999459457";
		data[0][1]="Nidhinoida@601";		
		
		return data;
		
		
	}

}
