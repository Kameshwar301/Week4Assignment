package week4.day2.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		// To get the link
		
		driver.get("https://dev68594.service-now.com/");
		
		driver.switchTo().frame(0);
		
		WebElement userName = driver.findElementByName("user_name");
		
		userName.sendKeys("admin");
		
		WebElement passWord = driver.findElementByName("user_password");
		passWord.sendKeys("India@123");
		
		driver.findElementById("sysverb_login").click();
		
		//Search filter 
		
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident");
		
		
		Thread.sleep(1000);
		//Need to click "All" first we need to come out frame
		
		driver.switchTo().defaultContent();

//now it will click "All"
		driver.findElementByXPath("(//div[text()='All'])[2]").click();

		/*
		 * driver.
		 * findElementByXPath("//button[contains(@class,'selected_action action_context')]"
		 * ).click();
		 */		
		driver.switchTo().frame(0);
		driver.findElementById("sysverb_new").click();
//		driver.switchTo().frame(0);
//		WebElement ele = driver.findElementByXPath("//button[@type='submit']");
//		
//		ele.click();
		
		driver.findElementByXPath("//div[@class='input-group ref-container']/input").click();
		
		
		  Set<String> windowHandles = driver.getWindowHandles(); 
		  List<String> arrayList = new ArrayList<String>(windowHandles); 
		  String secondWindRef = arrayList.get(1);
		  
		  
		  driver.switchTo().window(secondWindRef);
		  driver.findElementByXPath("//a[@class='glide_ref_item_link']").click();
		 	
		
	}

}
