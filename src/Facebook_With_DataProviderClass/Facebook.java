package Facebook_With_DataProviderClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/JP NAUDIYAL\\Downloads/latest webdriver gecko/geckodriver-v0.26.0-win64 (1)/geckodriver-v0.24.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
	public void facebookMethod(String username, String password) throws InterruptedException {

		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']/ancestor::table/descendant::tr[2]/td[2]/input"))
				.sendKeys(password);
		driver.findElement(By.xpath("//input[contains(@value,'Log I')]")).click();
		Thread.sleep(50000);

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();

	}

}
