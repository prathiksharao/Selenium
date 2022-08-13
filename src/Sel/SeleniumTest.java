/* This is a test class written to launch Microsoft Edge browser from Selenium.
 * This class opens the Google website in MS Edge and checks the webpage title.
 * 
 */

package Sel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class SeleniumTest {
	public static void main(String args[]) {
	
	System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	String baseURL = "https://www.google.com";
	String expectedTitle = "Google";
	String actualTitle = "";
	driver.get(baseURL);
	actualTitle = driver.getTitle();
	if (expectedTitle.equals(actualTitle))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	driver.close();
}
}
