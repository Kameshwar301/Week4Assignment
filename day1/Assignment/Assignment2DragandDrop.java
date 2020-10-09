package week4.day1.Assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement drags = driver.findElementByXPath("//p[text()='Drag me to my target']");
		
		WebElement drops = driver.findElementById("droppable");
		
		 driver.switchTo().frame(0); 

		
		 
		 //getting x and y location

		
		
		  int x = drags.getLocation().getX(); 
		  System.out.println(x); 
		  int y = drags.getLocation().getY(); 
		  System.out.println(y);
		  int x1 = drops.getLocation().getX();
		  int y1=drops.getLocation().getY();
		 
		  
		Actions builder = new Actions(driver);
		builder.doubleClick(drags).dragAndDropBy(drops, x1, y1).release().perform();
		
		

	}

}
