package week4.day2;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandeling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		String title = driver.getWindowHandle();
		System.out.println(title);
		System.out.println("*************************************");
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		WebElement subm = driver.findElementByXPath("//button[@type='submit']");
		
		subm.click();
		driver.findElementByXPath("//a[@href='https://www.air.irctc.co.in']").click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		

	}

}
