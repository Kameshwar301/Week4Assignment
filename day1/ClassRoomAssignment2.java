package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement mens = driver.findElementByXPath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]");
		WebElement cloth = driver.findElementByXPath("//a[@href='https://www.snapdeal.com/products/men-apparel']");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(mens).moveToElement(cloth).perform();
		

	}

}
