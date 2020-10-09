package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		WebElement fra = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(fra);
		driver.findElementById("//button[@onclick='myFunction()']").click();
		
		
Alert alert = driver.switchTo().alert();
		
	
		alert.sendKeys("kameshwar");
		alert.accept();
		String text = alert.getText();
		System.out.println(text);
		
	}

}
