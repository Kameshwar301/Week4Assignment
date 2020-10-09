package week4.day2.Assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getWindowHandle();
		System.out.println(title);
		System.out.println("*************************************");
		
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByPartialLinkText("CRM").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		 
		/* driver.switchTo().newWindow(); */
/*		driver.findElementByXPath("//div[@class='x-form-element']/input").sendKeys("10020");
*/	}
}