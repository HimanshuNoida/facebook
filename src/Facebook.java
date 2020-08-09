import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username="9999459457";
		String password="Nidhinoida@601";
		System.setProperty("webdriver.gecko.driver","C:/Users/JP NAUDIYAL\\Downloads/latest webdriver gecko/geckodriver-v0.26.0-win64 (1)/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']/ancestor::table/descendant::tr[2]/td[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//input[contains(@value,'Log I')]")).click();
		
		
		
	}

}
