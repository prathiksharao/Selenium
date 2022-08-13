/* This class performs Google search in MS Edge browser using Selenium
 * 
 */
package Sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class SeleniumQuery {
	public static void main (String args[])
	{
		// Set the path of the edge driver and create an object
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edgedriver = new EdgeDriver();
		//Maximize the window size
		edgedriver.manage().window().maximize();
		// Open google website
		edgedriver.get("https://www.google.com");
		// Type the query string in the search engine 
		edgedriver.findElement(By.xpath("//input[@class= \"gLFyf gsfi\"]")).sendKeys("Selenium with Edge");
		edgedriver.findElement(By.xpath("//input[@class= \"gNO89b\"]")).submit();
		System.out.println("Google search completed!");
		
	}
}
